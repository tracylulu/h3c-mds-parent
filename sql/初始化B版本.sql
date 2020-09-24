USE [IBDSDB]
GO
/****** Object:  StoredProcedure [dbo].[p_BversionFromIPMP]    Script Date: 2019/5/25 8:45:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


declare @count int;


--��ȡ���ݷ�����ʱ��
 select 'B01' as bversion,null as bversionold,'B01' as engbversion,PLIPMTNo,PRODLINENo,ProductNO,VersionNo,RELEASENo,PDTNo,ROW_NUMBER() over(order by RELEASENo) as ID into #tmpBversion  from IBDS_Notes_ReleaseTemp tmp where not exists (
select bversionno from IBDS_Bversion where bversioncname='B01' and RELEASENo=tmp.RELEASENo
 ) and RELEASE is not null and RELEASE<>''




--�ж��Ƿ�����������
select @count=count(bversion) from #tmpBversion


if(@count>0)
begin


	insert into IBDS_Bversion
select ('PB'+right('000000'+Convert(varchar(6),substring(isnull((select max(bversionno) from IBDS_Bversion WHERE bversionno LIKE 'PB%'),'000000'),3,6)+ROW_NUMBER() over(order by ID) ),6)) as bversionno,bversion,null,engbversion,rp.PLIPMTNo,rp.PRODLINENo,rp.ProductNO,rp.VersionNo,RELEASENo,null,null,null,null,null,null,
null,null,null,null,null,null,1,'sysadmin',GETDATE(),null,null,null,null,null,null,null,null,null,null,null,null,PDTNo,null,null from 
#tmpBversion rp ;

end
drop table #tmpBversion;



--ˢ��B�汾 ProjectNo����
update IBDS_Bversion set PROJECTNo=t.PROJECTNo from  (
select bv.ID,bv.bversioncname,bv.RELEASENo,p.PROJECTNo from bversion_view bv left join IBDS_PROJECT p on  bv.bversioncname = p.PROJECT where exists  (
select 1 from IBDS_PROJECT  pj where  bv.bversioncname = pj.PROJECT
)) t where IBDS_Bversion.ID=t.ID





