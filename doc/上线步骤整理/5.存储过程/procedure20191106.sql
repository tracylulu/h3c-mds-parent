USE [IBDSDB]
GO
/****** Object:  StoredProcedure [dbo].[p_BversionFromIPMP]    Script Date: 2019/11/6 17:12:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

---增量从iplan同步B版本
CREATE PROCEDURE [dbo].[p_BversionFromIPMP]
as




--同步iplan PDCP/PCR合同书在IPLAN中审批归档生效后，自动刷新B版本信息
insert into Bversion_IPMP
select ReleaseCode,ReleaseName,BVersion,BornDate from IPMP.[IPMP].dbo.V_GetSucFileContractR_B b where  BVersion<>'B01' and  BVersion<>'' and  DateDiff(dd,BornDate,getdate())=0
and not exists (select Bversion from Bversion_IPMP i where i.ReleaseCode=b.ReleaseCode and i.Bversion=b.BVersion) 



if((select count(1) from Bversion_IPMP)>0)
begin


--不存在iplan的，删除
delete from Bversion_IPMP where
not exists (select BVersion from IPMP.[IPMP].dbo.V_GetSucFileContractR_B b where ReleaseCode=b.ReleaseCode and Bversion=b.BVersion) 



--读取临时表数据
--后续B版本从iplan中创建时（确认实现有没有问题），自动带上个B01的角色 by2019-10-31
select distinct tmp.*,rp.RELEASE,rp.PLIPMTNo,rp.PRODLINENo,rp.ProductNO,rp.VersionNo,rp.PDTNo,b.[POP_ID],b.[RNDPDT_ID],b.[Quality_Mnger],b.[CMO_ID],b.[se] into #tmpBversion from Bversion_IPMP tmp left join IBDS_RELEASE rp on tmp.ReleaseCode=rp.RELEASENo
left join (select RELEASENo,[POP_ID],[RNDPDT_ID],[Quality_Mnger],[CMO_ID],[se] from IBDS_bversion where bversioncname='B01') b on rp.RELEASENo=b.RELEASENo
where 
not exists (
select bversionno from IBDS_bversion where bversioncname=tmp.BVersion and RELEASENo=tmp.ReleaseCode
 )

 
 declare @count int;

--判断是否有新增数据
select @count=count(bversion) from #tmpBversion


if(@count>0)
begin
truncate table bversionTmp;

Declare @i int=1;
Declare @bversionID Varchar(500)
DECLARE My_Cursor CURSOR --定义游标
FOR (SELECT ReleaseName+' '+BVersion FROM #tmpBversion) --查出需要的集合放到游标中
OPEN My_Cursor; --打开游标
FETCH NEXT FROM My_Cursor into @bversionID ; --读取第一行数据
WHILE @@FETCH_STATUS = 0
    BEGIN
insert into bversionTmp	
select ('PB'+right('000000'+Convert(varchar(6),substring(isnull((select max(bversionno) from IBDS_bversion WHERE bversionno LIKE 'PB%'),'000000'),3,6)+@i),6)) as bversionno,BVersion,null,BVersion,rp.PLIPMTNo,rp.PRODLINENo,rp.ProductNO,rp.VersionNo,ReleaseCode,null as readers,null as remark,null as match,null as bversionMatch,null as prodDataID,POP_ID,
RNDPDT_ID,Quality_Mnger,CMO_ID,se,null as proDifficult,null as harddifficult,1 as status,'sysadmin' as created_user,GETDATE() as created_date,null as modift_User,null as modify_Data,null as standby1,null as standby2,null as standby3,null as standby4,null as standby5,null as standby6,null as standby7,null as standby8,null as standby9,null as standby10,PDTNo,null as projectno,null as projectStatus,null as pack  from 
#tmpBversion rp  where  ReleaseName+' '+BVersion=@bversionID     


        FETCH NEXT FROM My_Cursor into @bversionID; --读取下一行数据
		set @i=@i+1;
    END
CLOSE My_Cursor; --关闭游标
DEALLOCATE My_Cursor; --释放游标


end



if((select count(1) from bversionTmp)>0)
begin

insert into IBDS_bversion([bversionno]
           ,[bversioncname]
           ,[bversionold]
           ,[bversionename]
           ,[PLIPMTNo]
           ,[PRODLINENo]
           ,[PRODUCTNo]
           ,[VERSIONNo]
           ,[RELEASENo]
           ,[Readers]
           ,[Remark]
           ,[Match]
           ,[bversionMatch]
           ,[ProdDataID]
           ,[POP_ID]
           ,[RNDPDT_ID]
           ,[Quality_Mnger]
           ,[CMO_ID]
           ,[se]
           ,[proDifficult]
           ,[harddiffcult]
           ,[Status]
           ,[CREATED_USER]
           ,[CREATED_DATE]
           ,[MODIFY_USER]
           ,[MODIFY_DATA]
           ,[STANDBY1]
           ,[STANDBY2]
           ,[STANDBY3]
           ,[STANDBY4]
           ,[STANDBY5]
           ,[STANDBY6]
           ,[STANDBY7]
           ,[STANDBY8]
           ,[STANDBY9]
           ,[STANDBY10]
           ,[PDTNo]
           ,[PROJECTNo]
           ,[ProjectStatus]
           ,[Pack])
select distinct [bversionno]
           ,[bversioncname]
           ,[bversionold]
           ,[bversionename]
           ,[PLIPMTNo]
           ,[PRODLINENo]
           ,[PRODUCTNo]
           ,[VERSIONNo]
           ,[RELEASENo]
           ,[Readers]
           ,[Remark]
           ,[Match]
           ,[bversionMatch]
           ,[ProdDataID]
           ,[POP_ID]
           ,[RNDPDT_ID]
           ,[Quality_Mnger]
           ,[CMO_ID]
           ,[se]
           ,[proDifficult]
           ,[harddiffcult]
           ,[Status]
           ,[CREATED_USER]
           ,[CREATED_DATE]
           ,[MODIFY_USER]
           ,[MODIFY_DATA]
           ,[STANDBY1]
           ,[STANDBY2]
           ,[STANDBY3]
           ,[STANDBY4]
           ,[STANDBY5]
           ,[STANDBY6]
           ,[STANDBY7]
           ,[STANDBY8]
           ,[STANDBY9]
           ,[STANDBY10]
           ,[PDTNo]
           ,[PROJECTNo]
           ,[ProjectStatus]
           ,[Pack] from  bversionTmp rp where not exists (select 1 from IBDS_bversion where RELEASENo=rp.RELEASENo and bversioncname=rp.bversioncname);
end
--如果已删除 则改为异常终止状态
--update IBDS_bversion set projectStatus='异常终止' from IBDS_bversion a where not exists (select BVersion from #tmpBversion b where a.bversioncname=b.BVersion and a.RELEASENo=b.ReleaseCode);


--V_GetBversionState  --iplan删除或异常终止的都刷新为异常终止
update IBDS_bversion set projectStatus='异常终止' from (select * from IBDS_bversion) b inner join (select * from IPMP.[IPMP].dbo.V_GetBversionState where deleteFlag=1 or SuspendType='Suspend_Abnormal') v on b.bversioncname+b.RELEASENo=v.bversion+v.releasecode
where IBDS_bversion.ID=b.ID



end

drop table #tmpBversion;



GO
/****** Object:  StoredProcedure [dbo].[p_DeptFromRDMDS]    Script Date: 2019/11/6 17:12:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--同步RDMDS部门表
create PROCEDURE [dbo].[p_DeptFromRDMDS]
as
begin
select * into #tbl_2_9_EN_temp from [rdmds_lnk].RD_MDS.mdm.tbl_2_9_EN;



declare @EXCEPTION nvarchar(500);
	if((select COUNT(*) from #tbl_2_9_EN_temp) = 0)
	begin
		print 'select COUNT(*) from [rdmds_lnk].IBDSDB.mdm.tbl_2_9_EN'		
		SET @EXCEPTION='admp_lnk.[addb].[dbo].[t_sync_GroupMember]数据量为0'
		RAISERROR(@EXCEPTION,16,1) WITH NOWAIT;
	end
    else
	begin
		TRUNCATE TABLE tbl_2_9_EN
	end

SET IDENTITY_INSERT tbl_2_9_EN ON 
insert into tbl_2_9_EN
([Version_ID]
		   ,ID
           ,[Status_ID]
           ,[ValidationStatus_ID]
           ,[Name]
           ,[Code]
           ,[ChangeTrackingMask]
           ,[EnterDTM]
           ,[EnterUserID]
           ,[EnterVersionID]
           ,[LastChgDTM]
           ,[LastChgUserID]
           ,[LastChgVersionID]
           ,[AsOf_ID]
           ,[MUID]
           ,[uda_9_499]
           ,[uda_9_500]
           ,[uda_9_501]
           ,[uda_9_502]
           ,[uda_9_503]
           ,[uda_9_504]
           ,[uda_9_505]
           ,[uda_9_506])
select [Version_ID]
		   ,[ID]
           ,[Status_ID]
           ,[ValidationStatus_ID]
           ,[Name]
           ,[Code]
           ,[ChangeTrackingMask]
           ,[EnterDTM]
           ,[EnterUserID]
           ,[EnterVersionID]
           ,[LastChgDTM]
           ,[LastChgUserID]
           ,[LastChgVersionID]
           ,[AsOf_ID]
           ,[MUID]
           ,[uda_9_499]
           ,[uda_9_500]
           ,[uda_9_501]
           ,[uda_9_502]
           ,[uda_9_503]
           ,[uda_9_504]
           ,[uda_9_505]
           ,[uda_9_506] from #tbl_2_9_EN_temp
SET IDENTITY_INSERT tbl_2_9_EN off


drop table #tbl_2_9_EN_temp;

end
GO
/****** Object:  StoredProcedure [dbo].[p_DifficultyCoefficient]    Script Date: 2019/11/6 17:12:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


---难度系数处理
CREATE PROCEDURE [dbo].[p_DifficultyCoefficient]
as


--产品难度系数列转行
SELECT p.RELEASENo,P.RELEASE,P.Supplier,P.SupplyNum into #IBDS_DifficultyCoefficientTemp
FROM 
(
    SELECT RELEASE,RELEASENo
	  ,DifficultyCoefficient   as 'B01'
	  ,DifficultyCoefficient_2 as 'B02'
	  ,DifficultyCoefficient_3 as 'B03'
	  ,DifficultyCoefficient_4 as 'B04'
	  ,DifficultyCoefficient_5 as 'B05'
	  ,DifficultyCoefficient_6 as 'B06'
	  ,DifficultyCoefficient_7 as 'B07'
	  ,DifficultyCoefficient_8 as 'B08' 
	  ,DifficultyCoefficient_9 as 'B09'
      ,[DifficultyCoefficient_10] as 'B10'
      ,[DifficultyCoefficient_11] as 'B11'
      ,[DifficultyCoefficient_12] as 'B12'
      ,[DifficultyCoefficient_13] as 'B13'
      ,[DifficultyCoefficient_14] as 'B14'
      ,[DifficultyCoefficient_15] as 'B15'
      ,[DifficultyCoefficient_16] as 'B16'
      ,[DifficultyCoefficient_17] as 'B17'
      ,[DifficultyCoefficient_18] as 'B18'
      ,[DifficultyCoefficient_19] as 'B19'
      ,[DifficultyCoefficient_20] as 'B20' 
	 
     FROM IBDS_Notes_ReleaseTemp
)T
UNPIVOT 
(
    SupplyNum FOR Supplier IN
    (B01, B02,B03, B04,B05, B06,
      B07, B08 ,B09
      ,B10
      ,B11
      ,B12
      ,B13
      ,B14
      ,B15
      ,B16
      ,B17
      ,B18
      ,B19
      ,B20 
	  )
) P where SupplyNum<>''


--产品难度系数列转行
SELECT p.RELEASENo,P.RELEASE,P.Supplier,P.SupplyNum into #IBDS_DifficultyCoefficient_1Temp
FROM 
(
    SELECT RELEASE,RELEASENo
	  ,[DifficultyCoefficient_1]   as 'B01'
      ,[DifficultyCoefficient_1_2] as 'B02'
      ,[DifficultyCoefficient_1_3] as 'B03'
      ,[DifficultyCoefficient_1_4] as 'B04'
      ,[DifficultyCoefficient_1_5] as 'B05'
      ,[DifficultyCoefficient_1_6] as 'B06'
      ,[DifficultyCoefficient_1_7] as 'B07'
      ,[DifficultyCoefficient_1_8] as 'B08'
      ,[DifficultyCoefficient_1_9] as 'B09'
      ,[DifficultyCoefficient_1_10] as 'B10'
      ,[DifficultyCoefficient_1_11] as 'B11'
      ,[DifficultyCoefficient_1_12] as 'B12'
      ,[DifficultyCoefficient_1_13] as 'B13'
      ,[DifficultyCoefficient_1_14] as 'B14'
      ,[DifficultyCoefficient_1_15] as 'B15'
      ,[DifficultyCoefficient_1_16] as 'B16'
      ,[DifficultyCoefficient_1_17] as 'B17'
      ,[DifficultyCoefficient_1_18] as 'B18'
      ,[DifficultyCoefficient_1_19] as 'B19'
      ,[DifficultyCoefficient_1_20] as 'B20'
     FROM IBDS_Notes_ReleaseTemp
)T
UNPIVOT 
(
    SupplyNum FOR Supplier IN
    (B01, B02,B03, B04,B05, B06,
      B07, B08 ,B09
      ,B10
      ,B11
      ,B12
      ,B13
      ,B14
      ,B15
      ,B16
      ,B17
      ,B18
      ,B19
      ,B20  )
) P where SupplyNum<>''


--有且只有第一个字段有值的  R 有且仅有B01 难度系数刷新到R
--select * from #IBDS_DifficultyCoefficientTemp--产品
--select * from #IBDS_DifficultyCoefficient_1Temp--硬件

--select * from IBDS_RELEASE 
--select d.RELEASENo,count(*) from #IBDS_DifficultyCoefficientTemp d inner join IBDS_RELEASE r on d.RELEASENo=r.RELEASENo where SupplyNum<>'' group by d.RELEASENo,count(*) having count(*)>1

--R --产品
insert into IBDS_DifficultyCoefficient
select RELEASENo,RELEASE,'R',SupplyNum as DifficultyCoefficient,null from #IBDS_DifficultyCoefficientTemp where RELEASENo  in (
select RELEASENo from  #IBDS_DifficultyCoefficientTemp where SupplyNum<>''  group by RELEASENo having count(RELEASENo)=1 
) and Supplier='B01'

--R--硬件
insert into IBDS_DifficultyCoefficient
select RELEASENo,RELEASE,'R',null,SupplyNum as DifficultyCoefficient from #IBDS_DifficultyCoefficient_1Temp tmp where RELEASENo  in (
select RELEASENo  from  #IBDS_DifficultyCoefficient_1Temp where SupplyNum<>''  group by RELEASENo having count(RELEASENo)=1 
)   and Supplier='B01' and not exists (select RELEASENo from IBDS_DifficultyCoefficient t where t.releaseno=tmp.RELEASENo)

--存在R产品，则更新R硬件
update IBDS_DifficultyCoefficient set DifficultyCoefficient_1=tmp.SupplyNum from #IBDS_DifficultyCoefficient_1Temp tmp where tmp.RELEASENo  in (
select RELEASENo  from  #IBDS_DifficultyCoefficient_1Temp where SupplyNum<>''  group by RELEASENo having count(RELEASENo)=1 
)   and Supplier='B01' and IBDS_DifficultyCoefficient.RELEASENo=tmp.RELEASENo




--除了第一个字段 其他任何一个字段有值 B  
--B--产品
insert into IBDS_DifficultyCoefficient
select *,null from #IBDS_DifficultyCoefficientTemp where  RELEASENo  in (
select RELEASENo from  #IBDS_DifficultyCoefficientTemp where SupplyNum<>''  group by RELEASENo having count(RELEASENo)>1 
) 
union all
select *,null from #IBDS_DifficultyCoefficientTemp tmp where RELEASENo  in (
select RELEASENo from  #IBDS_DifficultyCoefficientTemp where SupplyNum<>''  group by RELEASENo having count(RELEASENo)=1 
) and Supplier<>'B01'

--B--硬件
insert into IBDS_DifficultyCoefficient
select * from (select RELEASENo,RELEASE,Supplier,null as DifficultyCoefficient,SupplyNum from #IBDS_DifficultyCoefficient_1Temp where  RELEASENo in (
select RELEASENo from  #IBDS_DifficultyCoefficient_1Temp where SupplyNum<>''  group by RELEASENo having count(RELEASENo)>1 
)
union all
select RELEASENo,RELEASE,Supplier,null as DifficultyCoefficient,SupplyNum from #IBDS_DifficultyCoefficient_1Temp tmp where RELEASENo  in (
select RELEASENo from  #IBDS_DifficultyCoefficient_1Temp where SupplyNum<>''  group by RELEASENo having count(RELEASENo)=1 
) and Supplier<>'B01'
) t where not exists (select RELEASENo from IBDS_DifficultyCoefficient r where r.releaseno=t.RELEASENo and r.bversion =t.Supplier)


--存在B--硬件，则更新B硬件
update IBDS_DifficultyCoefficient set DifficultyCoefficient_1=t.SupplyNum from (select RELEASENo,RELEASE,Supplier,null as DifficultyCoefficient,SupplyNum from #IBDS_DifficultyCoefficient_1Temp where  RELEASENo in (
select RELEASENo from  #IBDS_DifficultyCoefficient_1Temp where SupplyNum<>''  group by RELEASENo having count(RELEASENo)>1 
)
union all
select RELEASENo,RELEASE,Supplier,null as DifficultyCoefficient,SupplyNum from #IBDS_DifficultyCoefficient_1Temp tmp where RELEASENo  in (
select RELEASENo from  #IBDS_DifficultyCoefficient_1Temp where SupplyNum<>''  group by RELEASENo having count(RELEASENo)=1 
) and Supplier<>'B01'
) t where IBDS_DifficultyCoefficient.RELEASENo=t.RELEASENo and IBDS_DifficultyCoefficient.bversion=t.Supplier



drop table #IBDS_DifficultyCoefficientTemp;
drop table #IBDS_DifficultyCoefficient_1Temp;

truncate table IBDS_RELEASE;

--R版本数据初始化
insert into IBDS_RELEASE
([RELEASENo]
      ,[RELEASE]
      ,[P]
      ,[V]
      ,[R]
      ,[RELEASEOld]
      ,[engRELEASE]
      ,[PLIPMTNo]
      ,[PRODLINENo]
      ,[Status]
      ,[VersionNo]
      ,[PDTNo]
      ,[projectno]
      ,[RELEASENo_Software]
      ,[PROJECTStatus]
      ,[Match]
      ,[RELEASEMatch]
      ,[ProdDataID]
      ,[POP_ID]
      ,[CMO_ID]
      ,[Testing_Mnger]
      ,[TechSupport_Mnger]
      ,[Product_Mnger]
      ,[MarketTM]
      ,[softmg]
      ,[hardmg]
      ,[fldPDE]
      ,[RNDPDT_ID]
      ,[Oversea_Mnger]
      ,[PilotProduction_Mnger]
      ,[OMC_Mnger]
      ,[System_Mnger]
      ,[Quality_Mnger]
      ,[Equipment_Mnger]
      ,[Documents_Mnger]
      ,[Purchase_Mnger]
      ,[Sales_Mnger]
      ,[PPPDT_ID]
      ,[Manufacture_Mnger]
      ,[FF_ID]
	  ,proDifficult--产品难度系数
	  ,harddiffcult--硬件难度系数    
      ,[Readers]
      ,[Remark]
      ,[ProductNO])
select distinct r.[RELEASENo]
      ,[RELEASE]
      ,[P]
      ,[V]
      ,[R]
      ,[RELEASEOld]
      ,[engRELEASE]
      ,[PLIPMTNo]
      ,[PRODLINENo]
      ,[Status]
      ,[VersionNo]
      ,[PDTNo]
      ,[projectno]
      ,[RELEASENo_Software]
      ,[PROJECTStatus]
      ,[Match]
      ,[RELEASEMatch]
      ,[ProdDataID]
      ,[POP_ID]
      ,[CMO_ID]
      ,[Testing_Mnger]
      ,[TechSupport_Mnger]
      ,[Product_Mnger]
      ,[MarketTM]
      ,[softmg]
      ,[hardmg]
      ,[fldPDE]
      ,[RNDPDT_ID]
      ,[Oversea_Mnger]
      ,[PilotProduction_Mnger]
      ,[OMC_Mnger]
      ,[System_Mnger]
      ,[Quality_Mnger]
      ,[Equipment_Mnger]
      ,[Documents_Mnger]
      ,[Purchase_Mnger]
      ,[Sales_Mnger]
      ,[PPPDT_ID]
      ,[Manufacture_Mnger]
      ,[FF_ID]
	  ,d.DifficultyCoefficient--产品难度系数
	  ,d.DifficultyCoefficient_1--硬件难度系数    
      ,[Readers]
      ,[Remark]
      ,[ProductNO]  from IBDS_Notes_ReleaseTemp r left join [dbo].[IBDS_DifficultyCoefficient] d on r.RELEASENo=d.RELEASENo and Bversion='R'

	

	--更新B版本难度系数
	   update IBDS_bversion set proDifficult=t.DifficultyCoefficient,harddiffcult=t.DifficultyCoefficient_1
	  from  (select b.*,d.DifficultyCoefficient,d.DifficultyCoefficient_1 from IBDS_bversion b left join [dbo].[IBDS_DifficultyCoefficient] d on b.RELEASENo=d.RELEASENo and d.Bversion=b.bversioncname) t
	  where IBDS_bversion.ID=t.ID

	  


	  



GO
/****** Object:  StoredProcedure [dbo].[p_DomainGroupFromRDMDS]    Script Date: 2019/11/6 17:12:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--同步RDMDS域群组人员表
create PROCEDURE [dbo].[p_DomainGroupFromRDMDS]
as
begin
select * into #tbDomainGroup_temp from [rdmds_lnk].RD_MDS.dbo.tbDomainGroup;



declare @EXCEPTION nvarchar(500);
	if((select COUNT(*) from #tbDomainGroup_temp) = 0)
	begin
		print 'select COUNT(*) from [rdmds_lnk].RD_MDS.tbDomainGroup'		
		SET @EXCEPTION='[rdmds_lnk].RD_MDS.tbDomainGroup数据量为0'
		RAISERROR(@EXCEPTION,16,1) WITH NOWAIT;
	end
    else
	begin
		TRUNCATE TABLE tbDomainGroup
	end


insert into tbDomainGroup
select [ID]
           ,[GroupName]
           ,[AdminName]
           ,[GroupDesc]
           ,[Member]
           ,[SyncTime] from #tbDomainGroup_temp



drop table #tbDomainGroup_temp;

end
GO
/****** Object:  StoredProcedure [dbo].[P_H3CPDMBom]    Script Date: 2019/11/6 17:12:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create PROCEDURE [dbo].[P_H3CPDMBom]
as
insert into IBDS_H3CPDM_Bom
SELECT *  FROM openquery(PDM,'SELECT PUID AS OBID, --主键，唯一标识 
       S1PARTNUMBER, --PART编码
       s1PartRevision,--Part版本
       s1PartTemplate,--PART模板
       THHXH_List.ph3c_characvalue as  THHXH, --图号或型号  
       S1PARTDESCELEMENTS, --项目描述
       S1EXTCHINESEDESC, --对外中文描述
       S1INTENGLISHDESC, --对内英文描述
       S1EXTENGLISHDESC, --对外英文描述
       S1INTERNALMODEL, --对内型号
       S1EXTERNALMODEL, --对外型号
       DEFAULTUNITOFMEASURE, --计量单位    
       S1PARTSTATUS, --Part状态
       H3PRODUCTLINE, --产品线
       s2ProductPDT,--PDT
       H3PRODUCT, --产品
       PROJECTNAME, --产品V版本
       H3PRODUCTRREVISION,--R版本
       H3PRODUCTBREVISION,--B版本   
       S2ISALLOWSEND, -- 是否允许直发  
      (SELECT trunc(ActualRelDate+8/24)  FROM infodba.VV_H3C_Part WHERE s1partnumber=PARTALL.s1partnumber AND revision=PARTALL.MINREVISION AND ROWNUM<2 ) AS TZ_ActualRelDate--图纸归档发布时间
  FROM (SELECT           
             H3CPart.PUID, --主键，唯一标识 
             H3CPart.S1PARTNUMBER, --PART编码
             H3CPart.s1PartRevision,--Part版本
             substr(H3CPart.s1PartTemplate,
              instr(H3CPart.s1PartTemplate,''('',1,1)+1,
              instr(H3CPart.s1PartTemplate,'')'',1,1)-instr(H3CPart.s1PartTemplate,''('',1,1)-1
             ) as s1PartTemplate,-- 截取后的Part模板
             H3CPart.S1PARTDESCELEMENTS, --项目描述
             H3CPart.S1EXTCHINESEDESC, --对外中文描述
             H3CPart.S1INTENGLISHDESC, --对内英文描述
             H3CPart.S1EXTENGLISHDESC, --对外英文描述
             H3CPart.S1INTERNALMODEL, --对内型号
             H3CPart.S1EXTERNALMODEL, --对外型号      
             H3CPart.UOM_TAG AS DEFAULTUNITOFMEASURE, --计量单位          
             H3CPart.S1PARTSTATUS, --Part状态
             H3CPart.S1PARTFAMILYCODE, --getfulltableValueByAttr 调用
             --''sum50a.s1assem'' AS TABKIND, ----getfulltableValueByAttr 调用 
             H3CPart.H3PRODUCTLINE, --产品线 
             nvl2(H3CPart.h3productrrevision,
                  (SELECT H3prdcfg.s2ProductPDT
                    FROM (  SELECT *  FROM infodba.VV_H3prdcfg ORDER BY H3ProductRRevision, H3isdisable,creationdate desc) H3prdcfg --取创建时间晚的 
                   WHERE H3prdcfg.H3ProductRRevision = H3CPart.H3PRODUCTRREVISION AND ROWNUM < 2),
                 (SELECT H3prdcfg.s2ProductPDT 
                    FROM (  SELECT *  FROM infodba.VV_H3prdcfg ORDER BY Projectname, H3isdisable,creationdate desc) H3prdcfg --取创建时间晚的
                   WHERE  H3prdcfg.Projectname = H3CPart.ProjectName AND ROWNUM < 2))
             AS s2ProductPDT ,                      --PDT,有R版本按照R版本匹配,没有R版本的按照V版本匹配
             H3CPart.H3PRODUCT, --产品      
             H3CPart.PROJECTNAME, --产品V版本 
             H3CPart.H3PRODUCTRREVISION,
             H3CPart.H3PRODUCTBREVISION,
             H3CPart.S2ISALLOWSEND,
             H3CPart.CREATIONDATE, --创建日期
             SUBSTR((  SELECT
                       Min(LENGTH(REVISION) || REVISION) AS REVISION --最低版本   
                  FROM infodba.VV_H3C_Part Part1
                 WHERE 
                       Part1.S1PARTNUMBER=H3CPart.S1PARTNUMBER
                       AND Part1.s1PartRevision=H3CPart.s1PartRevision 
                       AND UPPER(Part1.LIFECYCLESTATE) = UPPER(''LcsReleased'') --已发布版本 
                 GROUP BY Part1.S1PARTNUMBER
               ), 2, 100) AS MINREVISION --相同业务对象版本对应的Part系统版本最小的
          FROM infodba.VV_H3C_Part H3CPart,
               (SELECT                
                 H3CPart1.S1PARTNUMBER,
                 MAX(LENGTH(REVISION) || REVISION) AS REVISION --最高版本   
                  FROM infodba.VV_H3C_Part H3CPart1
                 WHERE UPPER(H3CPart1.LIFECYCLESTATE) = UPPER(''LcsReleased'') --已发布版本                           
                 GROUP BY H3CPart1.S1PARTNUMBER) H3CPart1
        
         WHERE 1 = 1
           AND H3CPart.S1PARTNUMBER = H3CPart1.S1PARTNUMBER
           AND H3CPart.REVISION = SUBSTR(H3CPart1.REVISION, 2, 100)
        
        UNION ALL    
        
        SELECT
            /*  器件表-- Part版本是A版本，且未发布的Part也提取*/
             H3CPart.PUID, --主键，唯一标识    
             H3CPart.S1PARTNUMBER, --PART编码
             H3CPart.s1PartRevision,
             substr(H3CPart.s1PartTemplate,
              instr(H3CPart.s1PartTemplate,''('',1,1)+1,
              instr(H3CPart.s1PartTemplate,'')'',1,1)-instr(H3CPart.s1PartTemplate,''('',1,1)-1
             ) as s1PartTemplate,-- 截取后的Part模板
             H3CPart.S1PARTDESCELEMENTS, --项目描述
             H3CPart.S1EXTCHINESEDESC, --对外中文描述
             H3CPart.S1INTENGLISHDESC, --对内英文描述
             H3CPart.S1EXTENGLISHDESC, --对外英文描述
             H3CPart.S1INTERNALMODEL, --对内型号
             H3CPart.S1EXTERNALMODEL, --对外型号         
             H3CPart.UOM_TAG AS DEFAULTUNITOFMEASURE, --计量单位      
             H3CPart.S1PARTSTATUS, --Part状态          
             H3CPart.S1PARTFAMILYCODE, --getfulltableValueByAttr 调用
             --''sum50a.commpart'' AS TABKIND, ----getfulltableValueByAttr 调用   
             H3CPart.H3PRODUCTLINE, --产品线 
             nvl2(H3CPart.h3productrrevision,
       (SELECT H3prdcfg.s2ProductPDT
          FROM (  SELECT *
                    FROM infodba.VV_H3prdcfg
                ORDER BY H3ProductRRevision, H3isdisable,creationdate desc) H3prdcfg --取创建时间晚的
                WHERE H3prdcfg.H3ProductRRevision = H3CPart.H3PRODUCTRREVISION
               AND ROWNUM < 2),
       (SELECT H3prdcfg.s2ProductPDT
          FROM (  SELECT *
                    FROM infodba.VV_H3prdcfg
                ORDER BY Projectname, H3isdisable,creationdate desc) H3prdcfg --取创建时间晚的
                WHERE  H3prdcfg.Projectname = H3CPart.ProjectName
               AND ROWNUM < 2))
          AS s2ProductPDT ,                                           --PDT,有R版本按照R版本匹配,没有R版本的按照V版本匹配
             H3CPart.H3PRODUCT, --产品      
             H3CPart.PROJECTNAME, --产品V版本 
             H3CPart.H3PRODUCTRREVISION,
             H3CPart.H3PRODUCTBREVISION,
             H3CPart.S2ISALLOWSEND,
             H3CPart.CREATIONDATE, --创建日期
             H3CPart.Revision      
          FROM infodba.VV_H3C_Part H3CPart,
               (SELECT
                /*  商用件表*/
                 H3CPart1.S1PARTNUMBER, MAX(lastupdate) AS lastupdate --最新版本
                  FROM infodba.VV_H3C_Part H3CPart1
                 WHERE UPPER(H3CPart1.LIFECYCLESTATE) <> UPPER(''LcsReleased'') --未发布
                   AND H3CPart1.REVISION = ''A''
                   AND LENGTHB(H3CPart1.S1PARTNUMBER) = 8
                 GROUP BY H3CPart1.S1PARTNUMBER --PART编码                                                      
                
                ) H3CPart1
         WHERE 1 = 1
           AND H3CPart.lastupdate = H3CPart1.lastupdate
           AND H3CPart.REVISION = ''A''
           AND H3CPart.S1PARTNUMBER = H3CPart1.S1PARTNUMBER
)PARTALL,
(SELECT ph3c_partuid,pobject_name ,PH3C_CHARACDSNAME,ph3c_characvalue
  FROM infodba.pworkspaceobject,
       infodba.pH3CPartFamilyV 
 WHERE pH3CPartFamilyV.ph3c_characid=pworkspaceobject.pobject_name 
       AND pworkspaceobject.pobject_desc=''图号或型号''
) THHXH_List
where PARTALL.puid = THHXH_List.ph3c_partuid(+)
') tmp where not exists (select S1PARTNUMBER from IBDS_H3CPDM_Bom where S1PARTNUMBER=tmp.S1PARTNUMBER);



GO
/****** Object:  StoredProcedure [dbo].[p_MemberGroupFromRDMDS]    Script Date: 2019/11/6 17:12:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--同步RDMDS域账户表
create PROCEDURE [dbo].[p_MemberGroupFromRDMDS]
as
begin
select * into #ADMP_MemberGroup_temp from [rdmds_lnk].RD_MDS.dbo.ADMP_MemberGroup;



declare @EXCEPTION nvarchar(500);
	if((select COUNT(*) from #tbDomainAccount_temp) = 0)
	begin
		print 'select COUNT(*) from [rdmds_lnk].RD_MDS.ADMP_MemberGroup'		
		SET @EXCEPTION='[rdmds_lnk].RD_MDS.ADMP_MemberGroup数据量为0'
		RAISERROR(@EXCEPTION,16,1) WITH NOWAIT;
	end
    else
	begin
		TRUNCATE TABLE ADMP_MemberGroup
	end

SET IDENTITY_INSERT ADMP_MemberGroup ON 
insert into ADMP_MemberGroup(
[Serial]
      ,[UserCode]
      ,[GroupName])
select [Serial]
      ,[UserCode]
      ,[GroupName] from #ADMP_MemberGroup_temp
SET IDENTITY_INSERT ADMP_MemberGroup off 


drop table #ADMP_MemberGroup_temp;

end
GO
/****** Object:  StoredProcedure [dbo].[p_UserGroupFromRDMDS]    Script Date: 2019/11/6 17:12:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--同步RDMDS域群组和notes群组关系表
CREATE PROCEDURE [dbo].[p_UserGroupFromRDMDS]
as
begin
select * into #IBDS_UserGroup_temp from [rdmds_lnk].RD_MDS.dbo.IBDS_UserGroup;



declare @EXCEPTION nvarchar(500);
	if((select COUNT(*) from #IBDS_UserGroup_temp) = 0)
	begin
		print 'select COUNT(*) from [rdmds_lnk].RD_MDS.IBDS_UserGroup'		
		SET @EXCEPTION='[rdmds_lnk].RD_MDS.IBDS_UserGroup数据量为0'
		RAISERROR(@EXCEPTION,16,1) WITH NOWAIT;
	end
    else
	begin
		TRUNCATE TABLE IBDS_UserGroup
	end

SET IDENTITY_INSERT IBDS_UserGroup ON 
insert into IBDS_UserGroup(
[ID]
      ,[NotesGroup]
      ,[AdmpGroup]
      ,[GroupUserCode]
      ,[CreateUser]
      ,[CreateDate]
      ,[ModifyUser]
      ,[ModifyDate]
      ,[Status])
select [ID]
      ,[NotesGroup]
      ,[AdmpGroup]
      ,[GroupUserCode]
      ,[CreateUser]
      ,[CreateDate]
      ,[ModifyUser]
      ,[ModifyDate]
      ,[Status] from #IBDS_UserGroup_temp
SET IDENTITY_INSERT IBDS_UserGroup off 


drop table #IBDS_UserGroup_temp;

end
GO
/****** Object:  StoredProcedure [dbo].[p_UsersFromRDMDS]    Script Date: 2019/11/6 17:12:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--同步RDMDS人员表
create PROCEDURE [dbo].[p_UsersFromRDMDS]
as
begin
select * into #tbl_2_10_EN_temp from [rdmds_lnk].RD_MDS.mdm.tbl_2_10_EN;



declare @EXCEPTION nvarchar(500);
	if((select COUNT(*) from #tbl_2_10_EN_temp) = 0)
	begin
		print 'select COUNT(*) from [rdmds_lnk].IBDSDB.mdm.tbl_2_10_EN'		
		SET @EXCEPTION='[rdmds_lnk].IBDSDB.mdm.tbl_2_10_EN数据量为0'
		RAISERROR(@EXCEPTION,16,1) WITH NOWAIT;
	end
    else
	begin
		TRUNCATE TABLE tbl_2_10_EN
	end

SET IDENTITY_INSERT tbl_2_10_EN ON 
insert into tbl_2_10_EN
([Version_ID]
      ,[ID]
      ,[Status_ID]
      ,[ValidationStatus_ID]
      ,[Name]
      ,[Code]
      ,[ChangeTrackingMask]
      ,[EnterDTM]
      ,[EnterUserID]
      ,[EnterVersionID]
      ,[LastChgDTM]
      ,[LastChgUserID]
      ,[LastChgVersionID]
     -- ,[LastChgTS]
      ,[AsOf_ID]
      ,[MUID]
      ,[uda_10_507]
      ,[uda_10_508]
      ,[uda_10_509]
      ,[uda_10_510]
      ,[uda_10_511]
      ,[uda_10_512]
      ,[uda_10_513]
      ,[uda_10_514]
      ,[uda_10_515])
select [Version_ID]
      ,[ID]
      ,[Status_ID]
      ,[ValidationStatus_ID]
      ,[Name]
      ,[Code]
      ,[ChangeTrackingMask]
      ,[EnterDTM]
      ,[EnterUserID]
      ,[EnterVersionID]
      ,[LastChgDTM]
      ,[LastChgUserID]
      ,[LastChgVersionID]
     -- ,[LastChgTS]
      ,[AsOf_ID]
      ,[MUID]
      ,[uda_10_507]
      ,[uda_10_508]
      ,[uda_10_509]
      ,[uda_10_510]
      ,[uda_10_511]
      ,[uda_10_512]
      ,[uda_10_513]
      ,[uda_10_514]
      ,[uda_10_515] from #tbl_2_10_EN_temp
SET IDENTITY_INSERT tbl_2_10_EN off


drop table #tbl_2_10_EN_temp;

end
GO
