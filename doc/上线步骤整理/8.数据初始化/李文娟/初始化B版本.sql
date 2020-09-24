USE [IBDSDB]
GO
/****** Object:  StoredProcedure [dbo].[p_BversionFromIPMP]    Script Date: 2019/5/25 8:45:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

delete from ibds_bversion;

select * into #ibds_product from ibds_product

--初始化研发产品内码为空的

update IBDS_Product set ProductType='0301' where productTypeName='销售产品' and ProductType='';

--销售产品更改为平台产品
select * from IBDS_Product where ProductNo in (
'PP000667',
'PP000533',
'PP000490',
'PP000463'
)

update IBDS_Product set ProductType='0303' where ProductNo in (
'PP000667',
'PP000533',
'PP000490',
'PP000463'
)

--更改为销售产品
select * from IBDS_Product where ProductNo in (
'PP000506',
'PP000535'
)
update IBDS_Product set ProductType='0301' where ProductNo in (
'PP000506',
'PP000535'
)


--1、	版本名称中含有”生命周期“的，特殊处理，不加B01
--select * from IBDS_RELEASE where release like '%生命周期%'
--select * from IBDS_bversion where RELEASENo in (select RELEASENo from IBDS_RELEASE where release like '%生命周期%')
update IBDS_bversion set bversioncname='',bversionename='' where RELEASENo in (select RELEASENo from IBDS_RELEASE where release like '%生命周期%')


--特殊处理的研发产品
update IBDS_Product set ProductType='0301' where productno='PP000659';

--读取数据放入临时表
 select 'B01' as bversion,null as bversionold,'B01' as engbversion,PLIPMTNo,PRODLINENo,ProductNO,VersionNo,RELEASENo,PDTNo,POP_ID,CMO_ID,Quality_Mnger,RNDPDT_ID,System_Mnger,PROJECTStatus,ROW_NUMBER() over(order by RELEASENo) as ID into #tmpBversion from IBDS_Notes_ReleaseTemp tmp where 
 not exists (
select bversionno from IBDS_Bversion where bversioncname='B01' and RELEASENo=tmp.RELEASENo
) and 
 RELEASE is not null and RELEASE<>''
 and  exists (select 1 from IBDS_Product where ProductType ='0301' and ProductNo=tmp.ProductNO)--销售类产品加B01

 
 insert into #tmpBversion
  select '' as bversion,null as bversionold,'' as engbversion,PLIPMTNo,PRODLINENo,ProductNO,VersionNo,RELEASENo,PDTNo,POP_ID,CMO_ID,Quality_Mnger,RNDPDT_ID,System_Mnger,PROJECTStatus,ROW_NUMBER() over(order by RELEASENo) as ID  from IBDS_Notes_ReleaseTemp tmp where 
 not exists (
select bversionno from IBDS_Bversion where bversioncname='' and RELEASENo=tmp.RELEASENo
) and
 RELEASE is not null and RELEASE<>''
 and  exists (select 1 from IBDS_Product where ProductType <>'0301' and ProductNo=tmp.ProductNO)--非销售类产品不加B01



select * from #tmpBversion

drop table #tmpBversion
 

 declare @count int;
--判断是否有新增数据
select @count=count(bversion) from #tmpBversion


if(@count>0)
begin

	insert into IBDS_Bversion
select ('PB'+right('000000'+Convert(varchar(6),substring(isnull((select max(bversionno) from IBDS_Bversion WHERE bversionno LIKE 'PB%'),'000000'),3,6)+ROW_NUMBER() over(order by ID) ),6)) as bversionno,bversion,null,engbversion,rp.PLIPMTNo,rp.PRODLINENo,rp.ProductNO,rp.VersionNo,RELEASENo,null as readers,null as remark,null as match,null as bversionMatch,null as prodDataID,POP_ID,
RNDPDT_ID,Quality_Mnger,CMO_ID,System_Mnger as se,null as proDifficult,null as harddifficult,1 as status,'sysadmin' as created_user,GETDATE() as created_date,null as modift_User,null as modify_Data,null as standby1,null as standby2,null as standby3,null as standby4,null as standby5,null as standby6,null as standby7,null as standby8,null as standby9,null as standby10,PDTNo,null as projectno,null as projectStatus,null as pack,null from 
#tmpBversion rp ;

end
drop table #tmpBversion;





--刷新B版本 ProjectNo编码
update IBDS_Bversion set PROJECTNo=t.PROJECTNo from  (
select bv.ID,bv.bversioncname,bv.RELEASENo,p.PROJECTNo from bversion_view bv left join IBDS_PROJECT p on  bv.bversioncname = p.PROJECT where exists  (
select 1 from IBDS_PROJECT  pj where  bv.bversioncname = pj.PROJECT
)) t where IBDS_Bversion.ID=t.ID



--初始化readers数据
update IBDS_bversion set Readers='*/huawei-3com,*/h3c' 
update IBDS_PROJECT set Readers='*/huawei-3com,*/h3c' where Readers is null


select * from ibds_bversion

--刷项目状态
---刷B版本状态
update IBDS_bversion set ProjectStatus=t.prStatus from (
select a.*,b.SuspendType as prStatus from IBDS_bversion  a inner join Bversion_IPMP b on (a.bversioncname=b.BVersion or a.bversioncname='') and a.RELEASENo=b.ReleaseCode) t
where IBDS_bversion.ID=t.ID



update ibds_bversion set ProjectStatus='终止' where ProjectStatus in ('Suspend_Normal','Suspend_Abnormal')
update ibds_bversion set ProjectStatus='挂起' where ProjectStatus in ('Suspend_VersionHung')
update ibds_bversion set ProjectStatus='在研' where ProjectStatus is null

--只刷对应的版本  不根据产品刷

--特殊处理的
update IBDS_bversion set bversioncname='B01',bversionename='B01' where id in (
select ID from IBDS_bversion where RELEASENo in (select distinct releaseno from IBDS_RELEASE where ProductNO in ('PP000659')) and bversioncname=''
)

update ibds_bversion set bversioncname='B01',bversionename='B01' where ID in  (
SELECT id FROM dbo.IBDS_bversion WHERE RELEASENo IN (
select  a.RELEASENo from (
select * from IBDS_RELEASE where releaseno in (SELECT  ReleaseNo FROM dbo.IBDS_DifficultyCoefficient WHERE Bversion='R')
) a left join IBDS_Product b on a.ProductNO=b.ProductNo where ProductType!='0301'  ) and bversioncname='') 

