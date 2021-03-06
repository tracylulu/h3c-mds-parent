USE [IBDSDB_test]
GO
/****** Object:  StoredProcedure [dbo].[p_DifficultyCoefficient]    Script Date: 2019/8/12 8:47:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


---难度系数处理

if((select count(1) from IBDS_Notes_ReleaseTemp)>0)
begin
truncate table IBDS_DifficultyCoefficient;
truncate table IBDS_release;

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
select  r.[RELEASENo]
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
      ,[ProductNO] from IBDS_Notes_ReleaseTemp r left join [dbo].[IBDS_DifficultyCoefficient] d on r.RELEASENo=d.RELEASENo and Bversion='R';


	  update ibds_bversion set bversioncname='B01',bversionename='B01' where ID in  (
SELECT id FROM dbo.IBDS_bversion WHERE RELEASENo IN (
select  a.RELEASENo from (
select * from IBDS_RELEASE where releaseno in (SELECT  ReleaseNo FROM dbo.IBDS_DifficultyCoefficient WHERE Bversion='R')
) a left join IBDS_Product b on a.ProductNO=b.ProductNo where ProductType!='0301'  ) and bversioncname=''); 

	
	--初始化B版本之后
	--更新B版本难度系数
	   update IBDS_bversion set proDifficult=t.DifficultyCoefficient,harddiffcult=t.DifficultyCoefficient_1
	  from  (select b.*,d.DifficultyCoefficient,d.DifficultyCoefficient_1 from IBDS_bversion b left join [dbo].[IBDS_DifficultyCoefficient] d on b.RELEASENo=d.RELEASENo and (d.Bversion=b.bversioncname or (b.bversioncname='' and d.Bversion='B01'))) t
	  where IBDS_bversion.ID=t.ID



end


	  


	  

