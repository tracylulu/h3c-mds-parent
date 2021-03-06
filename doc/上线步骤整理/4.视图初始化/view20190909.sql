USE [IBDSDB]
GO
/****** Object:  View [dbo].[BaseLineView]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO





CREATE view   [dbo].[BaseLineView]  as 


SELECT
	bline.*,
	line.PRODLINE,
	pd.product,
	r.release,
	v.version,
	(case when release.RELEASENo<>'' and release.RELEASENo is not null then release.RELEASE
	else baseline.BASELINE end )as ParentItem,
	ware.BASELINE as BASELINE_1Name
FROM
	ibds_base_line bline
	left join IBDS_PRODLINE line on line.PRODLINENo=bline.PRODLINENo
	left join IBDS_Product  pd on pd.ProductNo = bline.ProductNo
	left join IBDS_RELEASE  r  on r.RELEASENo = bline.RELEASENo
	left join IBDS_VERSION v on v.VERSIONNo = bline.VERSIONNo
	left join (select distinct BASELINENo,BASELINE from IBDS_BASE_LINE where Status=1) baseline on  bline.ParentItemNo=baseline.BASELINENo
	left join (select distinct RELEASENo,RELEASE from IBDS_RELEASE where Status=1 ) release on release.RELEASENo=bline.ParentItemNo
	left join (select BASELINENo,BASELINE from ibds_base_line where PRODLINENo='PL000024') ware on bline.BASELINE_1=ware.BASELINENo
	
	










GO
/****** Object:  View [dbo].[bversion_view]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE view [dbo].[bversion_view] as 

select b.[ID]
      ,b.[bversionno]
      ,r.RELEASE+isnull(b.[bversioncname],'') as bversioncname
      ,b.[bversionold]
      ,r.engRELEASE +isnull(b.[bversionename],'') as bversionename
      ,b.[PLIPMTNo]
      ,b.[PRODLINENo]
      ,b.[PRODUCTNo]
      ,b.[VERSIONNo]
      ,b.[RELEASENo]
      ,b.[Readers]
      ,b.[Remark]
      ,b.[Match]
      ,b.[bversionMatch]
      ,b.[ProdDataID]
      ,b.[POP_ID]
      ,b.[RNDPDT_ID]
      ,b.[Quality_Mnger]
      ,b.[CMO_ID]
      ,b.[se]
      ,b.[proDifficult]
      ,b.[harddiffcult]
      ,b.[Status]
      ,b.[CREATED_USER]
      ,b.[CREATED_DATE]
      ,b.[MODIFY_USER]
      ,b.[MODIFY_DATA]
      ,b.[STANDBY1]
      ,b.[STANDBY2]
      ,b.[STANDBY3]
      ,b.[STANDBY4]
      ,b.[STANDBY5]
      ,b.[STANDBY6]
      ,b.[STANDBY7]
      ,b.[STANDBY8]
      ,b.[STANDBY9]
      ,b.[STANDBY10]
      ,b.[PDTNo]
      ,b.[PROJECTNo]
      ,b.[ProjectStatus],
ipmt.PLIPMT,
pline.PRODLINE,
pdt.pdt,
v.version,
r.release,
product.product

from IBDS_bversion  b  
left JOIN     IBDS_PLIPMT  ipmt on b.PLIPMTNo=ipmt.PLIPMTNo
left JOIN     IBDS_PRODLINE  pline on b.PRODLINENo = pline.PRODLINENo
left JOIN		 IBDS_PDT pdt   on b.PDTNo = pdt.PDTNo
left JOIN     IBDS_VERSION   v   on   b.VERSIONNo=v.VERSIONNo
left JOIN		 IBDS_RELEASE   r   on   b.RELEASENo=r.RELEASENo
left JOIN		 IBDS_Product		product   on b.PRODUCTNo=product.ProductNo
left join IBDS_PROJECT k on b.projectno=k.PROJECTNo



GO
/****** Object:  View [dbo].[EmpDeptView]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[EmpDeptView]
as
select emp.*,dept.Name as deptName from tbl_2_10_EN emp left join tbl_2_9_EN dept on  emp.uda_10_507=dept.ID 

GO
/****** Object:  View [dbo].[FeatureAllView]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE VIEW [dbo].[FeatureAllView] AS 
SELECT
	feature.*,
	pline.PRODLINE,
	product.Product,
	release.release,
	ipmt.plipmt
FROM
	(select a.FEATURENo,a.FEATURE,a.FEATUREOld,a.engFEATURE,a.Readers,a.Remark,a.Status,a.RELEASENo,a.VERSIONNo,a.PRODUCTNo,a.PRODLINENo,a.PLIPMTNo from IBDS_FEATRUE a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where not exists(
	select 1 from IBDS_RELEASE c where a.RELEASENo=c.RELEASENo_Software
	) 
	union all
	select b.FEATURENo,b.FEATURE,b.FEATUREOld,b.engFEATURE,b.Readers,b.Remark,b.Status,t.RELEASENo,t.VERSIONNo,t.PRODUCTNo,t.PRODLINENo,t.PLIPMTNo from (select a.*,b.RELEASENo_Software from IBDS_FEATRUE a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where RELEASENo_Software is not null and b.RELEASENo_Software<>'' ) t 
	left join IBDS_FEATRUE b on t.RELEASENo_Software=b.RELEASENo where b.FEATURENo is not null 
	) feature----软件平台下的特性合并到该R版本下 by lys0670 20190904
	left join IBDS_PRODLINE  pline on pline.PRODLINENo=feature.PRODLINENo
	left join IBDS_Product product on product.ProductNo = feature.PRODUCTNo
	left join IBDS_RELEASE  release  on release.RELEASENo = feature.RELEASENo
	left join IBDS_PLIPMT ipmt on ipmt.PLIPMTNo = feature.PLIPMTNo



GO
/****** Object:  View [dbo].[FeatureView]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[FeatureView] AS SELECT
	feature.*,
	pline.PRODLINE,
	product.Product,
	release.release,
	ipmt.plipmt
FROM
	IBDS_FEATRUE feature
	left join IBDS_PRODLINE  pline on pline.PRODLINENo=feature.PRODLINENo
	left join IBDS_Product product on product.ProductNo = feature.PRODUCTNo
	left join IBDS_RELEASE  release  on release.RELEASENo = feature.RELEASENo
	left join IBDS_PLIPMT ipmt on ipmt.PLIPMTNo = feature.PLIPMTNo


GO
/****** Object:  View [dbo].[projectView]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO



CREATE VIEW   [dbo].[projectView] AS 
SELECT
	pj.*,
	ipmt.PLIPMT,
	pdt.pdt,ptype.DIC_NAME AS projecttype
FROM
	ibds_project pj
	LEFT JOIN IBDS_PLIPMT  ipmt  ON pj.PLIPMTNo = ipmt.PLIPMTNo
	LEFT JOIN IBDS_PDT pdt ON  pj.PDTNo = pdt.PDTNo
	LEFT JOIN (SELECT DIC_NAME,DIC_VALUE FROM IBDS_Dic WHERE Flag=1 AND DIC_TypeCode='6') ptype ON pj.PROJECTTypeNo=ptype.DIC_VALUE 








GO
/****** Object:  View [dbo].[ReleaseView]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO



CREATE view [dbo].[ReleaseView]
as
SELECT DISTINCT a.ID,f.PLIPMTNo,f.PLIPMT,e.PRODLINENo,e.PRODLINE,b.PDTNo,b.PDT,c.VERSIONNo,c.VERSION,
d.PRODUCTNo,d.PRODUCT,a.projectno,k.PROJECT,
a.[RELEASENo]
           ,a.[RELEASE]
           ,a.[RELEASEOld]
           ,a.[engRELEASE]
           ,a.[Status]
           ,a.[RELEASENo_Software]
           ,a.[PROJECTStatus]
           ,a.[Match]
           ,a.[RELEASEMatch]
           ,a.[ProdDataID]
           ,a.[POP_ID]
           ,a.[CMO_ID]
           ,a.[Testing_Mnger]
           ,a.[TechSupport_Mnger]
           ,a.[Product_Mnger]
           ,a.[MarketTM]
           ,a.[softmg]
           ,a.[hardmg]
           ,a.[fldPDE]
           ,a.[RNDPDT_ID]
           ,a.[Oversea_Mnger]
           ,a.[PilotProduction_Mnger]
           ,a.[OMC_Mnger]
           ,a.[System_Mnger]
           ,a.[Quality_Mnger]
           ,a.[Equipment_Mnger]
           ,a.[Documents_Mnger]
           ,a.[Purchase_Mnger]
           ,a.[Sales_Mnger]
           ,a.[PPPDT_ID]
           ,a.[Manufacture_Mnger]
           ,a.[FF_ID]
           ,a.[proDifficult]
           ,a.[harddiffcult]
           ,a.[Readers]
           ,a.[FINPDT_ID]
           ,a.[Remark]
           ,a.[fdr]
           ,a.[outnetparter]
           ,a.[SQA_ID]
           ,a.[HQA_ID]
           ,a.[TQA_ID]
           ,a.[SOFTTESTMNG]
           ,a.[HARDTESTMNG]
           ,a.[SOFTPLAT_ID]
           ,a.[NETMGPERSON_ID]
           ,a.[NETMGNET]
           ,a.[bom]
		   ,plrelease.RELEASE as RELEASE_Software
		   ,a.Column01
		   ,a.Column02
		   ,a.Column03
		   ,a.Column04
		   ,a.Column05
		   ,a.Column06
		   ,a.Column07
		   ,a.Column08
		   ,a.Column09
		   ,a.Column10
       from IBDS_RELEASE a left join IBDS_VERSION c on a.VersionNo=c.VERSIONNo 
left join IBDS_Product d on a.ProductNO=d.PRODUCTNo
left join IBDS_PDT b on a.PDTNo=b.PDTNo 
left join IBDS_PRODLINE e on a.PRODLINENo=e.PRODLINENo
left join IBDS_PLIPMT f on a.PLIPMTNo=f.PLIPMTNo
left join IBDS_PROJECT k on a.projectno=k.PROJECTNo
left join (select RELEASENo,RELEASE from IBDS_RELEASE where PRODLINENo='PL000024') plrelease on a.RELEASENo_Software=plrelease.RELEASENo--对应的软件平台版本







GO
/****** Object:  View [dbo].[SubFeatureView]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[SubFeatureView] AS 
SELECT
	sfeature.*,
	pline.PRODLINE,
	product.Product,
	release.release,
	feature.feature,
	ipmt.plipmt
FROM
	IBDS_SUB_FEATRUE sfeature
	left join IBDS_FEATRUE feature on feature.featureno =sfeature.featureno
	left join IBDS_PRODLINE  pline on pline.PRODLINENo=sfeature.PRODLINENo
	left join IBDS_Product product on product.ProductNo = sfeature.PRODUCTNo
	left join IBDS_RELEASE  release  on release.RELEASENo = sfeature.RELEASENo
	left join IBDS_PLIPMT  ipmt on ipmt.PLIPMTNo = sfeature.PLIPMTNo

GO
/****** Object:  View [dbo].[TeamView]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[TeamView] AS SELECT
	team.*,
	line.PRODLINE,
	pd.product,
	r.release,
	ipmt.plipmt
FROM
	IBDS_TEAM team
	left join IBDS_PRODLINE line on line.PRODLINENo=team.PRODLINENo
	left join IBDS_Product  pd on pd.ProductNo = team.ProductNo
	left join IBDS_RELEASE  r  on r.RELEASENo = team.RELEASENo
	left join IBDS_PLIPMT ipmt on ipmt.PLIPMTNo = team.PLIPMTNo

GO
/****** Object:  View [dbo].[V_AdmpNotesRelation]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[V_AdmpNotesRelation]
AS
SELECT   NotesGroup, AdmpGroup as DomainGroup, CreateUser
FROM      dbo.IBDS_UserGroup



GO
/****** Object:  View [dbo].[V_DomainGroup]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[V_DomainGroup] AS
SELECT [DGID],[GroupName],[AdminName],[GroupDesc],[Member],[SyncTime] FROM tbDomainGroup


GO
/****** Object:  View [dbo].[V_MODULE_VERSION_VIEW]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[V_MODULE_VERSION_VIEW] AS		
	SELECT
	pl.PRODLINE,
	p.Product,
	i.PLIPMT,
	v.VERSION,
	s.SUBSYSTEM,
	m.MODULE,
	r.release,
	mv.* 
FROM
	IBDS_MODULE_VERSION mv
	LEFT JOIN IBDS_Product p ON p.ProductNo = mv.ProductNo
	LEFT JOIN IBDS_RELEASE r ON mv.RELEASENo = r.RELEASENo
	LEFT JOIN IBDS_SUB_SYSTEM s ON s.SUBSYSTEMNo= mv.SUBSYSTEMNo
	LEFT JOIN IBDS_VERSION v ON mv.VERSIONNo= v.VERSIONNo
	LEFT JOIN IBDS_PRODLINE pl ON mv.PRODLINENo= pl.PRODLINENo
	LEFT JOIN IBDS_PLIPMT i ON i.PLIPMTNo= mv.PLIPMTNo
	LEFT JOIN IBDS_MODULE m ON mv.MODULENo = m.MODULENo


GO
/****** Object:  View [dbo].[V_MODULE_VIEW]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[V_MODULE_VIEW] AS	
	SELECT
	pl.PRODLINE,
	p.Product,
	i.PLIPMT,
	v.VERSION,
	r.release,
	s.SUBSYSTEM,
	m.* 
FROM
	IBDS_MODULE m
	LEFT JOIN IBDS_Product p ON p.ProductNo = m.ProductNo
	LEFT JOIN IBDS_RELEASE r ON m.RELEASENo = r.RELEASENo
	LEFT JOIN IBDS_SUB_SYSTEM s ON s.SUBSYSTEMNo= m.SUBSYSTEMNo
	LEFT JOIN IBDS_VERSION v ON m.VERSIONNo= v.VERSIONNo
	LEFT JOIN IBDS_PRODLINE pl ON m.PRODLINENo= pl.PRODLINENo
	LEFT JOIN IBDS_PLIPMT i ON i.PLIPMTNo= m.PLIPMTNo


GO
/****** Object:  View [dbo].[V_PDT_VIEW]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO



CREATE VIEW [dbo].[V_PDT_VIEW] AS
SELECT

	f.PLIPMT,

	e.PRODLINE,
	t.*
FROM
	IBDS_PDT t
	LEFT JOIN IBDS_PRODLINE e ON t.PRODLINENo= e.PRODLINENo
	LEFT JOIN IBDS_PLIPMT f ON f.PLIPMTNo= t.PLIPMTNo




GO
/****** Object:  View [dbo].[V_PRODLINE_VIEW]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[V_PRODLINE_VIEW] AS
SELECT
	f.PLIPMT,
	e.* 
FROM
	IBDS_PRODLINE e
	LEFT JOIN IBDS_PLIPMT f ON e.PLIPMTNo= f.PLIPMTNo


GO
/****** Object:  View [dbo].[V_PRODUCT_VIEW]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO



CREATE VIEW [dbo].[V_PRODUCT_VIEW] AS	
SELECT
	f.PLIPMT,
	e.PRODLINE,
	t.* ,d.DIC_NAME AS producttypeName
	,k.DIC_NAME AS ifplanName
FROM
	IBDS_PRODUCT t  
	LEFT JOIN IBDS_PRODLINE e  ON t.PRODLINENo= e.PRODLINENo
	LEFT JOIN IBDS_PLIPMT f ON t.PLIPMTNo= f.PLIPMTNo
	LEFT JOIN (SELECT * FROM IBDS_Dic WHERE DIC_TypeCode='4') d ON t.ProductType=d.DIC_VALUE 
	LEFT JOIN (SELECT * FROM IBDS_Dic WHERE DIC_TypeCode='5') k ON t.ifplan=k.DIC_VALUE 






GO
/****** Object:  View [dbo].[V_SUB_SYSTEM_VIEW]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[V_SUB_SYSTEM_VIEW] AS		
SELECT
	pl.PRODLINE,
	p.Product,
	i.PLIPMT,
	v.VERSION,
	r.release,
	s.* 
FROM
	IBDS_SUB_SYSTEM s
	LEFT JOIN IBDS_Product p ON s.ProductNo= p.ProductNo
	LEFT JOIN IBDS_RELEASE r ON s.RELEASENo = r.RELEASENo
	LEFT JOIN IBDS_PRODLINE pl ON s.PRODLINENo= pl.PRODLINENo
	LEFT JOIN IBDS_PLIPMT i ON i.PLIPMTNo= s.PLIPMTNo
	LEFT JOIN IBDS_VERSION v ON s.VERSIONNo= v.VERSIONNo


GO
/****** Object:  View [dbo].[VersionView]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE view [dbo].[VersionView] as 
SELECT
	v.*,
	p.Product,--产品中文名称
	--p.PRODUCTNo,
	pLine.PRODLINE,
	--pline.PRODLINENo,
	--ipmt.PLIPMTNo,
	ipmt.PLIPMT
FROM
	IBDS_VERSION v    
	left JOIN   IBDS_Product  p  on v.PRODUCTNo = p.ProductNo
	
	left join IBDS_PRODLINE  pLine on v.PRODLINENo = pLine.PRODLINENo
	left join IBDS_PLIPMT ipmt  on ipmt.PLIPMTNo = v.PLIPMTNo


GO
/****** Object:  View [dbo].[view_ApproveList]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO




CREATE  VIEW [dbo].[view_ApproveList]
	AS
		SELECT ROW_NUMBER() OVER( ORDER BY k.ApplypId,k.ID,k.code,k.ApplyType) rowNum,k.ApplypId,k.ID,k.code,k.ApplyType ,
			k.CREATE_DATE,l.uda_10_509+' '+l.code AS  CREATE_USER,m.uda_10_509+' '+m.code Responsible,k.StatusName,CONVERT(NVARCHAR,k.OPT_Type)OPT_Type FROM (
		--产品
		SELECT DISTINCT c.ID ApplypId,c.ID,a.PROCESS_CODE AS code,CONVERT(NVARCHAR,'产品信息修改') ApplyType,a.CREATE_DATE,a.CREATE_USER,c.Responsible,c.StatusName,'修改' OPT_Type 
			FROM IBDS_Product_Apply a 
			LEFT JOIN IBDS_Product_PROCESS c ON a.PROCESS_CODE=c.ApplyCode  
		UNION ALL
		--VR
		SELECT DISTINCT c.ID ApplypId,c.ID,a.Process_Code AS code,CONVERT(NVARCHAR,'产品V-R信息修改') ApplyType,a.CreateTime AS CREATE_DATE,a.Creator CREATE_USER,c.Handler AS Responsible,c.STATUS_DESC AS StatusName, '修改' OPT_Type 
			FROM IBDS_VR_APPLY a 
			LEFT JOIN IBDS_VR_PROCESS c ON a.Process_Code=c.APPLY_CODE 
		UNION ALL
		--R以下  基线
		SELECT DISTINCT c.ID ApplypId,c.ID,a.PROCESS_CODE AS code,CONVERT(NVARCHAR,'产品R级以下信息修改')  ApplyType,a.CREATE_DATE,a.CREATE_USER CREATE_USER,c.Responsible Responsible,c.StatusName,CASE a.ApplyType WHEN '1' THEN '新增' WHEN '2' THEN '修改' WHEN '3' THEN '删除' END  OPT_Type 
			FROM 	IBDS_BaseLine_Apply a 
			LEFT JOIN IBDS_BaseObject_PROCESS c ON a.PROCESS_CODE=c.ApplyCode --where c.Status<>0

		UNION ALL
		--R以下  基线以下
		SELECT  DISTINCT c.id ApplypId,c.ID,a.PROCESS_CODE AS code,CONVERT(NVARCHAR,'产品R级以下信息修改') ApplyType,a.CREATE_DATE,a.CREATE_USER CREATE_USER,c.Responsible Responsible,c.StatusName,CASE a.ApplyType WHEN '1' THEN '新增' WHEN '2' THEN '修改' WHEN '3' THEN '删除' END   OPT_Type 
			FROM IBDS_BaseObject_Apply a 
			LEFT JOIN IBDS_BaseObject_PROCESS c ON a.PROCESS_CODE=c.ApplyCode
			WHERE NOT EXISTS (SELECT 1 FROM  IBDS_BaseLine_Apply WHERE PROCESS_CODE= a.PROCESS_CODE)
		UNION ALL
		SELECT 0 ApplypId,0 ID,a.apply_no code,CONVERT(NVARCHAR,'项目编码') ApplyType,a.create_time CREATE_DATE,a.applyer CREATE_USER,a.cur_deal Responsible,a.cur_status StatusName,CASE a.opt_type WHEN '1' THEN '新增' WHEN '2' THEN '修改' WHEN '3' THEN '停用' END   OPT_Type
			 FROM IBDS_PROJECT_CODE_PROCESS a
		UNION ALL
		SELECT 0 ApplypId,a.ID,a.APPLY_CODE code,CONVERT(NVARCHAR,'产品编码')ApplyType,a.CREATE_DATE,a.CREATE_USER,a.HANDLER  Responsible,a.STATUS_DESC StatusName,CASE a.APPLY_TYPE WHEN '1' THEN '新增' WHEN '2' THEN '修改' WHEN '3' THEN '停用' END   OPT_Type 
			FROM dbo.IBDS_PRODUCT_CODE_PROCESS a
		UNION ALL
		SELECT 0 ApplypId,a.ID,a.APPLY_CODE code,CONVERT(NVARCHAR,'Part编码') ApplyType,a.CREATE_DATE,a.CREATE_USER,a.HANDLER  Responsible,a.STATUS_DESC StatusName,'新增' OPT_Type 
			FROM dbo.IBDS_PART_CODE_PROCESS a
		UNION ALL
		SELECT a.ID AS applyID,a.ID,a.Process_Code code ,CONVERT(NVARCHAR,'难度系数') ApplyType,a.CreateTime  CREATE_DATE, a.Creator  CREATE_USER,c.Handler Responsible,c.STATUS_DESC AS StatusName,'修改' OPT_Type 
			FROM IBDS_DifficultyCoefficient_APPLY a 
			LEFT JOIN IBDS_DifficultyCoefficient_PROCESS c ON a.PROCESS_CODE=c.APPLY_CODE
		UNION ALL
		SELECT a.ID applyID,a.ID,a.PROCESS_CODE  code,CONVERT(NVARCHAR,'人员信息修改')ApplyType ,a.CreateTime  CREATE_DATE,a.Creator CREATE_USER,c.Handler Responsible,c.STATUS_DESC AS StatusName,'修改' OPT_Type 
			 FROM IBDS_People_APPLY a 
			LEFT JOIN ibds_people_process c ON a.PROCESS_CODE=c.APPLY_CODE
			) k
		 LEFT JOIN dbo.tbl_2_10_EN l ON k.CREATE_USER=l.uda_10_511
		 LEFT JOIN dbo.tbl_2_10_EN m ON k.Responsible=m.uda_10_511

		--SELECT ROW_NUMBER() OVER( ORDER BY k.ApplypId,k.ID,k.code,k.ApplyType) rowNum,k.* FROM (
		--	SELECT DISTINCT a.ApplypId ,a.ID,a.code,a.CREATE_DATE,a.CREATE_USER, AppyType ApplyType,a.StatusName,a.Responsible,SUBSTRING(AppyType,LEN(AppyType)-1,2) OPT_Type FROM dbo.view_ProductApplyList a
		--	UNION ALL
		--	SELECT DISTINCT a.ID ApplypId,a.ID,a.code,a.CREATE_DATE,a.CREATE_USER,'人员信息修改' ApplyType,a.StatusName,a.Responsible,'修改' OPT_Type  FROM dbo.view_PeopleApplyList a
		--	UNION ALL
		--	SELECT a.applyID ApplypId,a.ID,a.code,a.CREATE_DATE,a.CREATE_USER,'难度系数' ApplyType,a.StatusName ,a.Responsible,'修改' OPT_Type FROM dbo.view_DifficultyCoefficientApplyList a
		--	UNION ALL
		--	SELECT e.* FROM (SELECT	b.ApplypId,b.ID,b.code,b.CREATE_DATE,c.uda_10_509+' '+c.Code CREATE_USER,b.ApplyType,b.StatusName,d.uda_10_509+' '+d.Code Responsible,b.OPT_Type FROM (		
			
		--		SELECT 0 ApplypId,0 ID,a.apply_no code,a.create_time CREATE_DATE,a.applyer CREATE_USER,'项目编码' ApplyType,a.cur_status StatusName,a.cur_deal Responsible,CASE a.opt_type WHEN '1' THEN '新增' WHEN '2' THEN '修改' WHEN '3' THEN '停用' END   OPT_Type FROM IBDS_PROJECT_CODE_PROCESS a
		--		UNION ALL
		--		SELECT 0 ApplypId,a.ID,a.APPLY_CODE code,a.CREATE_DATE,a.CREATE_USER,'产品编码'ApplyType,a.STATUS_DESC StatusName,a.HANDLER  Responsible,CASE a.APPLY_TYPE WHEN '1' THEN '新增' WHEN '2' THEN '修改' WHEN '3' THEN '停用' END   OPT_Type FROM dbo.IBDS_PRODUCT_CODE_PROCESS a
		--		UNION ALL
		--		SELECT 0 ApplypId,a.ID,a.APPLY_CODE code,a.CREATE_DATE,a.CREATE_USER,'Part编码' ApplyType,a.STATUS_DESC StatusName,a.HANDLER  Responsible,'新增' OPT_Type FROM dbo.IBDS_PART_CODE_PROCESS a
		--		) b
		--		LEFT JOIN mdm.tbl_2_10_EN c ON b.CREATE_USER=c.uda_10_511
		--		LEFT JOIN mdm.tbl_2_10_EN d ON b.Responsible=d.uda_10_511) e
		--) k
		







GO
/****** Object:  View [dbo].[view_BaseLine_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO













CREATE VIEW [dbo].[view_BaseLine_Notes]
AS
    SELECT
		   'BASELINE' AS FormName ,
            'BL' AS Mark ,
            'AA000000' AS AANo ,
            bline.BASELINENo ,
            bline.BASELINE ,
			bline.P		 ,
			bline.V		 ,
			bline.R		 ,
			bline.L		 ,
			bline.C		 ,
			bline.B		 ,
			bline.D		 ,
			bline.SP	 ,
            bline.BASELINEOld ,
            bline.engBASELINE ,
            bline.BASELINE_1 ,
            ware.BASELINE AS BASELINE_Name ,
            bline.BASELINEOut ,
            bline.engBASELINEOut ,
            bline.PLIPMTNo ,
            IPMT.PLIPMT ,
            IPMT.engPLIPMT ,
            bline.PRODLINENo ,
            line.PRODLINE ,
            line.engPRODLINE ,
            bline.PRODUCTNo ,
            pd.PRODUCT ,
            pd.engPRODUCT ,
            bline.VERSIONNo ,
            v.VERSION ,
            v.engVERSION ,
            bline.RELEASENo ,
            r.RELEASE ,
            r.engRELEASE ,
            ( CASE WHEN release.RELEASENo <> ''
                        AND release.RELEASENo IS NOT NULL
                   THEN release.engRELEASE
                   ELSE baseline.engBASELINE
              END ) AS engParentItem ,
            bline.ParentItemNo ,
            ( CASE WHEN release.RELEASENo <> ''
                        AND release.RELEASENo IS NOT NULL THEN release.RELEASE
                   ELSE baseline.BASELINE
              END ) AS ParentItem ,
            bline.BASELINEStatus ,
            bline.BASELINEType ,
            bline.BASELINE_IssueTime ,
            bline.BASELINE_DisableTime ,
            bline.BASELINE_usingLimitWhether ,
            bline.BASELINE_UrgencyIssue ,
            bline.BASELINE_UsingRange ,
            bline.BASELINE_IssueRange ,
            bline.BASELINE_IssueStyle ,
            bline.Readers ,
            bline.ProdDataID ,
            bline.Remark ,
            bline.Status ,
            bline.BASELINENo AS No ,
            bline.BASELINE AS Name ,
            bline.engBASELINE AS engName ,
            '' AS COACode ,
            bline.BASELINENo + '%' + bline.BASELINE + '%' + bline.engBASELINE AS Info_No ,
            '' AS Info_NoCOA ,
            '' AS Name_COACode ,
            '' AS engName_COACode ,
            '' AS SuperMan ,
            '' AS SuperReaders ,
            '' AS SuperWriters ,
            '' AS Writers
    FROM    (select a.BASELINE,a.BASELINENo,a.engBASELINE,b.P,a.V,a.R,a.L,a.C,a.B,a.D,a.SP,a.BASELINEOld,a.BASELINE_1,a.BASELINEOut,a.engBASELINEOut,a.BASELINEStatus,a.BASELINEType,a.BASELINE_IssueTime,
	a.BASELINE_DisableTime,a.BASELINE_usingLimitWhether,a.BASELINE_UrgencyIssue,a.BASELINE_UsingRange,a.BASELINE_IssueRange,a.BASELINE_IssueStyle,a.Readers,a.ProdDataID,a.Remark,a.Status,a.ParentItemNo,a.RELEASENo,a.VERSIONNo,a.PRODUCTNo,a.PRODLINENo,a.PLIPMTNo from IBDS_BASE_LINE a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where not exists(
	select 1 from IBDS_RELEASE c where a.RELEASENo=c.RELEASENo_Software
	) --and isnull(MODIFY_DATA,CREATED_DATE) between GETDATE()-1 and GETDATE()
	union all
	select b.BASELINE,b.BASELINENo,b.engBASELINE,b.P,b.V,b.R,b.L,b.C,b.B,b.D,b.SP,b.BASELINEOld,b.BASELINE_1,b.BASELINEOut,b.engBASELINEOut,b.BASELINEStatus,b.BASELINEType,b.BASELINE_IssueTime,
	b.BASELINE_DisableTime,b.BASELINE_usingLimitWhether,b.BASELINE_UrgencyIssue,b.BASELINE_UsingRange,b.BASELINE_IssueRange,b.BASELINE_IssueStyle,b.Readers,b.ProdDataID,b.Remark,b.Status,b.ParentItemNo,t.RELEASENo,t.VERSIONNo,t.PRODUCTNo,t.PRODLINENo,t.PLIPMTNo from (select a.*,b.RELEASENo_Software from IBDS_BASE_LINE a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where RELEASENo_Software is not null and b.RELEASENo_Software<>'' ) t 
	left join IBDS_BASE_LINE b on t.RELEASENo_Software=b.RELEASENo where b.BASELINENo is not null --and isnull(b.MODIFY_DATA,b.CREATED_DATE) between GETDATE()-1 and GETDATE()
	) bline----软件平台下的基线合并到该R版本下 by lys0670 20190904
            LEFT JOIN dbo.IBDS_PLIPMT IPMT ON IPMT.PLIPMTNo = bline.PLIPMTNo
            LEFT JOIN IBDS_PRODLINE line ON line.PRODLINENo = bline.PRODLINENo
            LEFT JOIN IBDS_Product pd ON pd.ProductNo = bline.PRODUCTNo
            LEFT JOIN IBDS_RELEASE r ON (r.RELEASENo = bline.RELEASENo)
            LEFT JOIN IBDS_VERSION v ON v.VERSIONNo = bline.VERSIONNo
            LEFT JOIN ( SELECT DISTINCT
                                BASELINENo ,
                                BASELINE ,
                                engBASELINE
                        FROM    IBDS_BASE_LINE
                        WHERE   Status = 1
                      ) baseline ON bline.ParentItemNo = baseline.BASELINENo
            LEFT JOIN ( SELECT DISTINCT
                                RELEASENo ,
                                RELEASE ,
                                engRELEASE
                        FROM    IBDS_RELEASE
                        WHERE   Status = 1
                      ) release ON release.RELEASENo = bline.ParentItemNo
            LEFT JOIN ( SELECT  BASELINENo ,
                                BASELINE
                        FROM    IBDS_BASE_LINE
                        WHERE   PRODLINENo = 'PL000024'
                      ) ware ON bline.BASELINE_1 = ware.BASELINENo;













GO
/****** Object:  View [dbo].[view_DifficultyCoefficient]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
 CREATE  VIEW [dbo].[view_DifficultyCoefficient]
    AS
        SELECT  a.[ID] ,
                a.[Process_Code] ,
                a.[PLIPMTNo] ,
                a.[ProdLineNo] ,
                a.[ProductNo] ,
                a.[VersionNo] ,
                a.[ReleaseNo] ,
                a.[IPMTSecretary] ,
                a.[BversionNo] ,
                a.[Bversion] ,
				a.isPack,
                a.[ProSnRemark] ,
                a.[HardSnRemark] ,
				a.Prod_BasisMaterial,
				a.Prod_BasisMaterialId,
				a.Hard_BasisMaterial,
				a.Hard_BasisMaterialId,
				a.copyto,
				a.Remark,
                b.[ID] ProcessID ,
                b.[APPLY_CODE] ,
                b.[Status] ,
                b.[Handler] ,
                b.[Instanse_ID] ,
                b.[CurrentNode] ,
                b.[STATUS_DESC] ,
                b.[First_Sign] ,
                b.[First_Date] ,
                b.[MGN_Sign] ,
                b.[MGN_Date] ,
                b.[MGN_Opinion] ,
                b.[MGN_Result] ,
                b.[Quality_Sign] ,
                b.[Quality_Date] ,
                b.[Quality_Opinion] ,
                b.[Quality_Result] ,
                b.[IPMT_Sign] ,
                b.[IPMT_Date] ,
                b.[IPMT_Opinion] ,
                b.[IPMT_Result]
        FROM    [dbo].[IBDS_DifficultyCoefficient_APPLY] a
                LEFT JOIN [dbo].[IBDS_DifficultyCoefficient_PROCESS] b ON a.Process_Code = b.APPLY_CODE


GO
/****** Object:  View [dbo].[view_DifficultyCoefficientApplyList]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO















CREATE VIEW [dbo].[view_DifficultyCoefficientApplyList]
AS

SELECT distinct (isnull(i.ID,a.ID)) as applyID,a.ID,a.PROCESS_CODE AS code,a.PRODLINENo,b.PRODLINE,a.PRODUCTNo,d.Product,a.ReleaseNo AS VersionNo,v.Release AS VERSION,a.CreateTime AS CREATE_DATE,Convert(nvarchar,isnull(u.DisplayName,'')) as  CREATE_USER,Convert(nvarchar,isnull(h.DisplayName,'')) AS Responsible,c.Status,c.STATUS_DESC AS StatusName,
REPLACE(i.BVersion+':'+CONVERT(NVARCHAR,i.ProDifficult),',','&') ProDifficult,REPLACE(i.BVersion+':'+CONVERT(NVARCHAR,i.HardDifficult),',','&') AS HardDifficult FROM 
IBDS_DifficultyCoefficient_APPLY a LEFT JOIN IBDS_PRODLINE b ON a.PRODLINENo=b.PRODLINENo
LEFT JOIN IBDS_Product d ON a.ProductNo=d.ProductNo
LEFT JOIN IBDS_RELEASE v ON a.ReleaseNo=v.ReleaseNo
LEFT JOIN IBDS_DifficultyCoefficient_PROCESS c ON a.PROCESS_CODE=c.APPLY_CODE
LEFT JOIN IBDS_DifficultyCoefficient_Item_APPLY i ON a.ID=i.Diff_ID
left join tbDomainAccount u on a.Creator=u.SamAccount
left join tbDomainAccount h on c.Handler=h.SamAccount
--where i.Status=1










GO
/****** Object:  View [dbo].[view_DomainGroupMember]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO




CREATE view [dbo].[view_DomainGroupMember]
as
--select domain.*,notes.Name,uda_10_509,uda_10_512,notes.Code,uda_10_509+' '+uda_10_512 as showName,dept.Code as deptCode,dept.Name as deptName from ADMP_MemberGroup domain left join mdm.tbl_2_10_EN notes on domain.UserCode=notes.uda_10_511
--left join mdm.tbl_2_9_EN dept on notes.uda_10_507=dept.ID 


select domain.DAID as Serial,Convert(nvarchar,isnull(domain.SamAccount,'')) as UserCode,convert(nvarchar,isnull(domain.DisplayName,'')) as GroupName,isnull(notes.Name,'') Name,isnull(uda_10_509,'') uda_10_509,isnull(uda_10_512,'') uda_10_512,isnull(notes.Code,'') Code,isnull(uda_10_509,'')+' '+isnull(uda_10_512,'') as showName,isnull(dept.Code,'') as deptCode,isnull(dept.Name,'') as deptName from tbDomainAccount  domain left join tbl_2_10_EN notes on domain.SamAccount=notes.uda_10_511
left join tbl_2_9_EN dept on notes.uda_10_507=dept.ID 





GO
/****** Object:  View [dbo].[VIEW_F_PROD]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[VIEW_F_PROD] AS 

SELECT
	L.ID AS PRODLINE_ID,
	L.PRODLINE_NO,
	L.PRODLINE_DESC,
	P.PROD_NO,
	P.PROD_NAME,
	P.ID
FROM
	IBDS_F_PRODLINE L
LEFT JOIN IBDS_F_PROD P ON L.ID = P.PRODLINE_ID


GO
/****** Object:  View [dbo].[view_F_PROD_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE  VIEW [dbo].[view_F_PROD_Notes] AS
SELECT
	'产品维护' AS f_author,
	B.PRODLINE_DESC AS ProLineCN,
	B.PRODLINE_NO AS ProLineCode,
	A.PROD_NAME AS ProRaceCN,
	A.PROD_NO AS ProRaceCode,
	'' AS ProRaceEN,
	--NULL AS ProRaceCread,
	Convert(datetime,CAST(NULL AS DATETIME2)) AS ProRaceCread,
	'' AS ProLineEN
FROM
	IBDS_F_PROD A
LEFT JOIN IBDS_F_PRODLINE B ON A.PRODLINE_ID = B.ID
where isnull(A.MODIFY_DATE,A.CREATE_DATE) between GETDATE()-1 and GETDATE()


GO
/****** Object:  View [dbo].[view_F_PRODLINE_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE  VIEW [dbo].[view_F_PRODLINE_Notes] AS
SELECT
	'产品维护' AS f_author,
	PRODLINE_DESC AS ProLineCN,
	PRODLINE_NO AS ProLineCode,
	--NULL AS ProlineCread,
	Convert(datetime,CAST(NULL AS DATETIME2)) AS ProlineCread,
	'' AS ProLineEN
FROM
	IBDS_F_PRODLINE
where isnull(MODIFY_DATE,CREATE_DATE) between GETDATE()-1 and GETDATE()


GO
/****** Object:  View [dbo].[view_F_PRODUCT_CODE_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE  VIEW [dbo].[view_F_PRODUCT_CODE_Notes] AS
SELECT
	BOM_DESC AS f_bomReadme,
	'' AS WF_ORUNID,
	'产品维护' AS f_author,
	CASE A.STATUS
WHEN '1' THEN
	'新增'
WHEN '2' THEN
	'改变'
WHEN '3' THEN
	'停用'
ELSE
	NULL
END AS f_status,
 '1' AS mark,
 B.PRODLINE_DESC AS f_class,
C.CONTENT AS f_PDT,
A.PRODUCT_CODE AS f_prodno,
A.PRODUCT_CODE AS f_prodno_1,
A.PRODUCT_NAME_CN AS f_prodname,
A.PRODUCT_NAME_CN AS f_prodname_1,
'' AS f_prodcode,
A.BOM_CODE AS f_bomno,
ISNULL(B.PRODLINE_DESC, '')+'\'+ISNULL(D.PROD_NAME, '')+'\'+ISNULL(A.PRODUCT_NAME_CN, '') AS f_ProdAll,
A.PRODUCT_NAME_EN AS EnglishDepict,
--CONVERT(varchar(100), A.EFFECT_DATE, 111) AS BeginTime,
Convert(datetime,A.EFFECT_DATE) AS BeginTime,
A.NOTE AS f_explain,
CASE APPLY_DEPT WHEN 'D0001' THEN '研发' WHEN 'D0002' THEN '专业服务部' WHEN 'D0003' THEN '其他' ELSE NULL END AS f_bumen,
E.PRODLINE_DESC AS f_class_1,
F.CONTENT AS f_PDT_1,
A.OLD_PRODUCT_CODE AS f_prodno_old,
A.OLD_PRODUCT_CODE AS f_prodno_old_1,
A.OLD_PRODUCT_NAME_CN AS f_prodname_old,
A.OLD_PRODUCT_NAME_CN AS f_prodname_old_1,
'' AS f_prodcode_1,
A.OLD_BOM_CODE AS f_bomno_1,
A.OLD_PRODUCT_NAME_EN AS EnglishDepict_1,
'' AS f_projno,
'' AS f_projname,
NULL AS f_bili,
'' AS f_projcode,
'' AS f_jingli
FROM
	IBDS_F_PRODUCT_CODE A
LEFT JOIN IBDS_F_PRODLINE B ON A.PRODLINE_ID = B.ID
LEFT JOIN IBDS_PROCESS_CONFIG_ITEM C ON A.PDT_ID = C.ID AND C.CONFIG_CODE='processPDT'
LEFT JOIN IBDS_F_PROD D ON A.PRODUCT_ID = D.ID
LEFT JOIN IBDS_F_PRODLINE E ON A.OLD_PRODLINE_ID = E.ID
LEFT JOIN IBDS_PROCESS_CONFIG_ITEM F ON A.OLD_PDT_ID = F.ID AND F.CONFIG_CODE='processPDT'
where isnull(A.MODIFY_DATE,A.CREATE_DATE) between GETDATE()-1 and GETDATE()


GO
/****** Object:  View [dbo].[VIEW_F_PRODUCT_CODE_VIEW]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[VIEW_F_PRODUCT_CODE_VIEW] AS
SELECT
	A.ID,
	'' AS CODE,
	'' AS NAME,
	A.PRODLINE_ID AS PRODLINE_NO,
	B.PRODLINE_DESC AS PRODLINE_NAME,
	A.PDT_ID AS PDT_NO,
	C.CONTENT AS PDT_NAME,
	A.PRODUCT_CODE,
	A.PRODUCT_NAME_CN,
	A.PRODUCT_NAME_EN,
	A.BOM_CODE,
	A.STATUS,
	A.EFFECT_DATE
FROM
	IBDS_F_PRODUCT_CODE A
LEFT JOIN IBDS_F_PRODLINE B ON A.PRODLINE_ID = B.ID
LEFT JOIN IBDS_PROCESS_CONFIG_ITEM C ON A.PDT_ID = C.ID AND C.CONFIG_CODE='processPDT'


GO
/****** Object:  View [dbo].[view_Featrue_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO







CREATE VIEW [dbo].[view_Featrue_Notes]
AS
    SELECT
    'FEATURE' AS FormName ,
            'FT' AS Mark ,
            'AA000000' AS AANo ,
            feature.FEATURENo ,
            feature.FEATURE ,
            feature.FEATUREOld ,
            feature.engFEATURE ,
            feature.PLIPMTNo ,
            ipmt.PLIPMT ,
            ipmt.engPLIPMT ,
            feature.PRODLINENo ,
            pline.PRODLINE ,
            pline.engPRODLINE ,
            feature.PRODUCTNo ,
            product.Product ,
            product.engProduct ,
            feature.VERSIONNo ,
            v.VERSION ,
            v.engVERSION ,
            feature.RELEASENo ,
            release.RELEASE ,
            release.engRELEASE ,
            feature.Readers ,
            feature.Remark ,
            feature.Status ,
            feature.FEATURENo AS No ,
            feature.FEATURE AS Name ,
            feature.engFEATURE AS engName ,
            '' AS COACode ,
            feature.FEATURENo + '%' + feature.FEATURE + '%'
            + feature.engFEATURE AS Info_No ,
            '' AS Info_NoCOA ,
            '' AS Name_COACode ,
            '' AS engName_COACode ,
            '' AS SuperMan ,
            '' AS SuperReaders ,
            '' AS SuperWriters ,
            '' AS Writers
    FROM    
	(select a.FEATURENo,a.FEATURE,a.FEATUREOld,a.engFEATURE,a.Readers,a.Remark,a.Status,a.RELEASENo,a.VERSIONNo,a.PRODUCTNo,a.PRODLINENo,a.PLIPMTNo from IBDS_FEATRUE a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where not exists(
	select 1 from IBDS_RELEASE c where a.RELEASENo=c.RELEASENo_Software
	) and isnull(MODIFY_DATA,CREATED_DATE) between GETDATE()-1 and GETDATE()
	union all
	select b.FEATURENo,b.FEATURE,b.FEATUREOld,b.engFEATURE,b.Readers,b.Remark,b.Status,t.RELEASENo,t.VERSIONNo,t.PRODUCTNo,t.PRODLINENo,t.PLIPMTNo from (select a.*,b.RELEASENo_Software from IBDS_FEATRUE a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where RELEASENo_Software is not null and b.RELEASENo_Software<>'' ) t 
	left join IBDS_FEATRUE b on t.RELEASENo_Software=b.RELEASENo where b.FEATURENo is not null and isnull(b.MODIFY_DATA,b.CREATED_DATE) between GETDATE()-1 and GETDATE()
	)----软件平台下的特性合并到该R版本下 by lys0670 20190904
	 feature
            LEFT JOIN IBDS_PRODLINE pline ON pline.PRODLINENo = feature.PRODLINENo
            LEFT JOIN IBDS_Product product ON product.ProductNo = feature.PRODUCTNo
            LEFT JOIN IBDS_RELEASE release ON (release.RELEASENo = feature.RELEASENo or feature.RELEASENo=release.RELEASENo_Software)--软件平台下的特性新增到该R版本下
            LEFT JOIN IBDS_PLIPMT ipmt ON ipmt.PLIPMTNo = feature.PLIPMTNo
            LEFT JOIN dbo.IBDS_VERSION v ON v.VERSIONNo = feature.VERSIONNo
			--where isnull(feature.MODIFY_DATA,feature.CREATED_DATE) between GETDATE()-1 and GETDATE()
			;





GO
/****** Object:  View [dbo].[view_FPRODUCT_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO



CREATE VIEW [dbo].[view_FPRODUCT_Notes]
AS
SELECT   'FPRODUCT' FormName,'FP' Mark,'AA000000' AANo,a.type,FPRODUCTNo, FPRODUCT, FPRODUCTOld, engFPRODUCT, IfPlan, FPRODUCTCOACode, a.PLIPMTNo,b.PLIPMT,b.engPLIPMT,
a.PRODLINENo,c.PRODLINE,c.engPRODLINE, 
BOM, a.Readers, a.Remark, Match, FPRODUCTMatch, a.Status,
  a.FPRODUCTNo AS No ,
a.FPRODUCT AS Name ,
a.engFPRODUCT AS engName ,
            FPRODUCTCOACode AS COACode ,
            a.FPRODUCTNo + '%' + a.FPRODUCT + '%' + a.engFPRODUCT AS Info_No ,
            a.FPRODUCTNo + '%'+ FPRODUCTCOACode+'%' + a.FPRODUCT + '%' + a.engFPRODUCT AS Info_NoCOA ,
            FPRODUCTCOACode+'%' + a.FPRODUCT AS Name_COACode ,
             FPRODUCTCOACode+'%' +a.engFPRODUCT  AS engName_COACode ,
            '' AS SuperMan ,
            '' AS SuperReaders ,
            '' AS SuperWriters ,
            '' AS Writers
FROM      dbo.IBDS_FPRODUCT a left join IBDS_PLIPMT b on a.PLIPMTNo=b.PLIPMTNo
left join IBDS_PRODLINE c on a.PRODLINENo=c.PRODLINENo
where isnull(a.MODIFY_DATE,a.CREATE_DATE) between GETDATE()-1 and GETDATE()






GO
/****** Object:  View [dbo].[view_fprojectCode]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[view_fprojectCode] AS 
select distinct
				CONVERT(varchar(100),projectcode.id) as id,
				--projectcode.f_projno as id,
				projectcode.f_projno, --项目编码
				projectcode.f_projname,--项目名称
				projectcode.f_projcode,--项目代号
				projectcode.f_objca,
				--projectcode.f_objca_name,--项目类别
				(select dic_Name from IBDS_Dic where dic_typecode='6' and DIC_VALUE=projectcode.f_objca) as f_objca_name,
				projectcode.f_projMng,--项目经理
				--productcode.PRODLINE_ID as f_productlineno,
				CONVERT(varchar(100),line.id) as f_productlineno,
				line.PRODLINE_DESC as f_productline_name,--所属产品线
				rel.f_product_code, --服务的产品编码
				--productcode.PRODUCT_NAME_CN, --服务的产品名称
				productcode.PRODUCT_NAME_CN, --服务的产品名称
				rel.rate,--分摊
				projectcode.BeginTime,--编码生效日期
				projectcode.f_dept,--部门
				projectcode.f_start_project_time,--立项时间
				projectcode.f_releaseno,--R级内码
				projectcode.f_version,--对应的版本
				--productcode.PDT_ID  as  f_pdtno,
				item.id as f_pdtno,
				--productcode.PDT_name as f_pdt_name,--所属pdt
				item.CONTENT   as f_pdt_name,--所属pdt
				projectcode.f_assign_point,
				--projectcode.f_assign_point_name,--对应评审点
				(select dic_Name from IBDS_Dic where dic_typecode='21' and DIC_VALUE=projectcode.f_assign_point) as f_assign_point_name,--对应评审点
				projectcode.f_bizhong,--费用分摊运营商比重
				projectcode.f_fbizhong,--费用分摊非运营商比重
				projectcode.remark,--备注
				projectcode.f_old_objca,
				projectcode.f_old_objca_name,
				projectcode.f_old_pdtno,
				projectcode.f_old_pdt_name,
				projectcode.f_old_projno,
				projectcode.f_old_projname,
				projectcode.f_old_projcode,
				projectcode.f_old_productlineno,
				projectcode.f_old_productline_name,
				projectcode.f_old_releaseno,
				rel.f_old_product_code  as f_old_productno,
				--projectcode.f_old_productname,
				--(SELECT PRODUCT_NAME_CN from IBDS_F_PRODUCT_CODE where rel.f_old_product_code=PRODUCT_CODE) as f_old_productname,
				(SELECT top 1 PRODUCT_NAME_CN from IBDS_F_PRODUCT_CODE product where rel.f_old_product_code=product.PRODUCT_CODE and product.status='1') as f_old_productname,
				projectcode.f_old_bizhong,
				projectcode.f_old_fbizhong,
				rel.f_old_rate as f_old_rate,
				projectcode.f_old_version
from IBDS_F_PROJECT_CODE  projectcode
left JOIN IBDS_F_PROJECT_PRODUCT_REL rel on rel.f_projno = projectcode.f_projno
 left JOIN IBDS_F_PRODUCT_CODE productcode on productcode.PRODUCT_CODE = rel.f_product_code-- and productcode.status='1'
left JOIN   IBDS_F_PRODLINE  line  on  line.ID = productcode.PRODLINE_ID
left JOIN   IBDS_PROCESS_CONFIG_ITEM  item on item.ID = productcode.PDT_ID
--LEFT JOIN   IBDS_RELEASE   release on    release.RELEASENo = projectcode.f_releaseno


where projectcode.status='1'  --and f_productlineno is not null

GO
/****** Object:  View [dbo].[view_hz_part]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[view_hz_part] as 

SELECT
	*
FROM
	OPENQUERY (
		HZ,
		'
		SELECT NULL obid,
msb.segment1 s1partnumber,
NULL s1partrevision,
msb.item_type s1parttemplate,
NULL thhxh,
msit.description s1partdescelements,
msb.attribute2 s1extchinesedesc,
msb.attribute6 s1intenglishdesc,
msb.attribute3 s1extenglishdesc,
NULL s1internalmodel,
msb.attribute1 s1externalmodel,
''PCS'' defaultunitofmeasure,
msb.inventory_item_status_code s1partstatus,
NULL h3productline,
 '''' s2productpdt,
NULL h3product,
NULL projectname,
NULL h3productrrevision,
NULL h3productbrevision,
NULL s2isallowsend,
NULL tz_actualreldate
FROM inv.mtl_system_items_b msb, apps.mtl_system_items_tl msit
WHERE msit.inventory_item_id = msb.inventory_item_id
AND msit.organization_id = msb.organization_id
AND msit.language = ''US''
AND msb.organization_id = 83
AND substrb(msb.segment1,5,1) = ''H''

'
	)

GO
/****** Object:  View [dbo].[view_MODULE_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO






CREATE VIEW [dbo].[view_MODULE_Notes]
AS
    SELECT 
            'MODULE' AS FormName ,
            'MD' AS Mark ,
            'AA000000' AS AANo ,
            m.MODULENo ,
            m.MODULE ,
            m.MODULEOld ,
            m.engMODULE ,
            m.PLIPMTNo ,
            i.PLIPMT ,
            i.engPLIPMT ,
            m.PRODLINENo ,
            pl.PRODLINE ,
            pl.engPRODLINE ,
            m.PRODUCTNo ,
            p.Product ,
            p.engProduct ,
            m.VERSIONNo ,
            v.VERSION ,
            v.engVERSION ,
            m.RELEASENo ,
            r.RELEASE ,
            r.engRELEASE ,
            m.SUBSYSTEMNo ,
            s.SUBSYSTEM ,
            s.engSUBSYSTEM ,
            m.Readers ,
            m.Remark ,
            m.Status ,
            m.MODULENo AS No ,
            m.MODULE AS Name ,
            m.engMODULE AS engName ,
            '' AS COACode ,
            m.MODULENo + '%' + m.MODULE + '%' + m.engMODULE AS Info_No ,
            '' AS Info_NoCOA ,
            '' AS Name_COACode ,
            '' AS engName_COACode ,
            '' AS SuperMan ,
            '' AS SuperReaders ,
            '' AS SuperWriters ,
            '' AS Writers
    FROM     
	(select a.SUBSYSTEMNo,a.MODULENo,a.MODULE,a.MODULEOld,a.engMODULE,a.Readers,a.Remark,a.Status,a.RELEASENo,a.VERSIONNo,a.PRODUCTNo,a.PRODLINENo,a.PLIPMTNo from IBDS_MODULE a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where not exists(
	select 1 from IBDS_RELEASE c where a.RELEASENo=c.RELEASENo_Software
	) and isnull(MODIFY_DATA,CREATED_DATE) between GETDATE()-1 and GETDATE()
	union all
	select b.SUBSYSTEMNo,b.MODULENo,b.MODULE,b.MODULEOld,b.engMODULE,b.Readers,b.Remark,b.Status,t.RELEASENo,t.VERSIONNo,t.PRODUCTNo,t.PRODLINENo,t.PLIPMTNo from (select a.*,b.RELEASENo_Software from IBDS_MODULE a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where RELEASENo_Software is not null and b.RELEASENo_Software<>'' ) t 
	left join IBDS_MODULE b on t.RELEASENo_Software=b.RELEASENo where b.SUBSYSTEMNo is not null and isnull(b.MODIFY_DATA,b.CREATED_DATE) between GETDATE()-1 and GETDATE()
	)----软件平台下的模块合并到该R版本下 by lys0670 20190904
	m
            LEFT JOIN IBDS_SUB_SYSTEM s ON s.SUBSYSTEMNo = m.SUBSYSTEMNo
            LEFT JOIN IBDS_RELEASE r ON m.RELEASENo = r.RELEASENo
            LEFT JOIN IBDS_VERSION v ON m.VERSIONNo = v.VERSIONNo
            LEFT JOIN IBDS_Product p ON p.ProductNo = m.PRODUCTNo
            LEFT JOIN IBDS_PRODLINE pl ON m.PRODLINENo = pl.PRODLINENo
            LEFT JOIN IBDS_PLIPMT i ON i.PLIPMTNo = m.PLIPMTNo
			--where isnull(m.MODIFY_DATA,m.CREATED_DATE) between GETDATE()-1 and GETDATE()
			;







GO
/****** Object:  View [dbo].[view_MODULE_VERSION_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO







CREATE VIEW [dbo].[view_MODULE_VERSION_Notes]
AS
    SELECT 
            'MDLVSN' AS FormName ,
            'MV' AS Mark ,
            'AA000000' AS AANo ,
            mv.MDLVSNNo ,
            mv.MDLVSN ,
            mv.MDLVSNOld ,
            mv.engMDLVSN ,
            mv.PLIPMTNo ,
            i.PLIPMT ,
            i.engPLIPMT ,
            mv.PRODLINENo ,
            pl.PRODLINE ,
            pl.engPRODLINE ,
            mv.PRODUCTNo ,
            p.Product ,
            p.engProduct ,
            mv.VERSIONNo ,
            v.VERSION ,
            v.engVERSION ,
            mv.RELEASENo ,
            r.RELEASE ,
            r.engRELEASE ,
            mv.SUBSYSTEMNo ,
            s.SUBSYSTEM ,
            s.engSUBSYSTEM ,
            mv.MODULENo ,
            m.MODULE ,
            m.engMODULE ,
            mv.Readers ,
            mv.Remark ,
            mv.Status ,
            mv.MDLVSNNo AS No ,
            mv.MDLVSN AS Name ,
            mv.engMDLVSN AS engName ,
            '' AS COACode ,
            mv.MDLVSNNo + '%' + mv.MDLVSN + '%' + mv.engMDLVSN AS Info_No ,
            '' AS Info_NoCOA ,
            '' AS Name_COACode ,
            '' AS engName_COACode ,
            '' AS SuperMan ,
            '' AS SuperReaders ,
            '' AS SuperWriters ,
            '' AS Writers
    FROM    
	(select a.SUBSYSTEMNo,a.MODULENo,a.MDLVSNNo,a.MDLVSN,a.MDLVSNOld,a.engMDLVSN,a.Readers,a.Remark,a.Status,a.RELEASENo,a.VERSIONNo,a.PRODUCTNo,a.PRODLINENo,a.PLIPMTNo from IBDS_MODULE_VERSION a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where not exists(
	select 1 from IBDS_RELEASE c where a.RELEASENo=c.RELEASENo_Software
	) and isnull(MODIFY_DATA,CREATED_DATE) between GETDATE()-1 and GETDATE()
	union all
	select b.SUBSYSTEMNo,b.MODULENo,b.MDLVSNNo,b.MDLVSN,b.MDLVSNOld,b.engMDLVSN,b.Readers,b.Remark,b.Status,t.RELEASENo,t.VERSIONNo,t.PRODUCTNo,t.PRODLINENo,t.PLIPMTNo from (select a.*,b.RELEASENo_Software from IBDS_MODULE_VERSION a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where RELEASENo_Software is not null and b.RELEASENo_Software<>'' ) t 
	left join IBDS_MODULE_VERSION b on t.RELEASENo_Software=b.RELEASENo where b.SUBSYSTEMNo is not null and isnull(b.MODIFY_DATA,b.CREATED_DATE) between GETDATE()-1 and GETDATE()
	)----软件平台下的模块版本合并到该R版本下 by lys0670 20190904
	 mv
            LEFT JOIN IBDS_MODULE m ON mv.MODULENo = m.MODULENo
            LEFT JOIN IBDS_SUB_SYSTEM s ON s.SUBSYSTEMNo = mv.SUBSYSTEMNo
            LEFT JOIN IBDS_RELEASE r ON mv.RELEASENo = r.RELEASENo
            LEFT JOIN IBDS_VERSION v ON mv.VERSIONNo = v.VERSIONNo
            LEFT JOIN IBDS_Product p ON p.ProductNo = mv.PRODUCTNo
            LEFT JOIN IBDS_PRODLINE pl ON mv.PRODLINENo = pl.PRODLINENo
            LEFT JOIN IBDS_PLIPMT i ON i.PLIPMTNo = mv.PLIPMTNo
			--where isnull(mv.MODIFY_DATA,mv.CREATED_DATE) between GETDATE()-1 and GETDATE()
			;
	








GO
/****** Object:  View [dbo].[view_OperationLog]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE view [dbo].[view_OperationLog]
as
select distinct [ID]
      ,[Code]
      ,[OptType]
      ,[OldValue]
      ,[NewValue]
      ,[Operator]
      ,[OptTime]
      ,[Name],
	  (case when OptType='ADD' then '新增' when OptType='MODIFY' then '修改' end ) as OptTypeName from (
	select distinct a.*,b.PLIPMT as Name from IBDS_OperationLog a inner join IBDS_PLIPMT b on a.Code=b.PLIPMTNo
	union all
	select distinct a.*,b.PRODLINE as Name from IBDS_OperationLog a inner join IBDS_PRODLINE b on a.Code=b.PRODLINENo
	union all
	select distinct a.*,b.PDT as Name from IBDS_OperationLog a inner join IBDS_PDT b on a.Code=b.PDTNo
	union all
	select distinct a.*,b.Product as Name from IBDS_OperationLog a inner join IBDS_Product b on a.Code=b.ProductNo
	union all
	select distinct a.*,b.PROJECT as Name from IBDS_OperationLog a inner join IBDS_PROJECT b on a.Code=b.PROJECTNo
	union all
	select distinct a.*,b.VERSION as Name from IBDS_OperationLog a inner join IBDS_VERSION b on a.Code=b.VERSIONNo
	union all
	select distinct a.*,b.RELEASE as Name from IBDS_OperationLog a inner join IBDS_RELEASE b on a.Code=b.RELEASENo
	union all
	select distinct a.*,b.bversioncname as Name from IBDS_OperationLog a inner join IBDS_bversion b on a.Code=b.bversionNo
	union all
	select distinct a.*,b.BASELINE as Name from IBDS_OperationLog a inner join IBDS_BASE_LINE b on a.Code=b.BASELINENo
	union all
	select distinct a.*,b.FEATURE as Name from IBDS_OperationLog a inner join IBDS_FEATRUE b on a.Code=b.FEATURENo
	union all
	select distinct a.*,b.SUBFEATURE as Name from IBDS_OperationLog a inner join IBDS_SUB_FEATRUE b on a.Code=b.SUBFEATURENo
	union all
	select distinct a.*,b.SUBSYSTEM as Name from IBDS_OperationLog a inner join IBDS_SUB_SYSTEM b on a.Code=b.SUBSYSTEMNo
	union all
	select distinct a.*,b.TEAM as Name from IBDS_OperationLog a inner join IBDS_TEAM b on a.Code=b.TEAMNo
	union all
	select distinct a.*,b.MODULE as Name from IBDS_OperationLog a inner join IBDS_MODULE b on a.Code=b.MODULENo
	union all
	select distinct a.*,b.MDLVSN as Name from IBDS_OperationLog a inner join IBDS_MODULE_VERSION b on a.Code=b.MDLVSNNo
	) t


GO
/****** Object:  View [dbo].[view_pdm_part]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create view   [dbo].[view_pdm_part] as 

SELECT
	*
FROM
	OPENQUERY (
		PDM,
		'SELECT PART_REQ.RESPPARTY, --责任人
       PART_REQ.H3SECONDLEVELDEPT, --二级部门
       PART_REQ.S1CONTACTPHONENUM, --联系电话
       PART_REQ.item_id AS DOCUMENTNAME, --申请单流水号    
       PART.S1PARTNUMBER, --PART编码     
       PART.S1PARTDESCELEMENTS, --项目描述 
       PART.S1EXTERNALMODEL AS S1INTERNALMODEL, --对外型号,主要是NOTES表单设计字段名称错误，在此进行匹配
       PART.S1INTENGLISHDESC, --对内英文描述
       PART.S1EXTCHINESEDESC, --对外中文描述
       PART.S1EXTENGLISHDESC --对外英文描述   
  FROM infodba.VV_H3C_Part PART,
       (SELECT S1ZZJREQ.PUID,
               S1ZZJREQ.item_id,
               S1ZZJREQ.RESPPARTY,
               S1ZZJREQ.H3SECONDLEVELDEPT,
              S1ZZJREQ.S1CONTACTPHONENUM,
               S1ZZJREQ.LASTUPDATE,
               S1ZZJREQ.LIFECYCLESTATE
          FROM infodba.VV_s1ZZJReq S1ZZJREQ
        UNION ALL
        SELECT S1CGJREQ.PUID,
               S1CGJREQ.item_id,
               S1CGJREQ.RESPPARTY,
               S1CGJREQ.H3SECONDLEVELDEPT,
               S1CGJREQ.S1CONTACTPHONENUM,
               S1CGJREQ.LASTUPDATE,
               S1CGJREQ.LIFECYCLESTATE
          FROM infodba.VV_s1CGJReq S1CGJREQ
        UNION ALL
        SELECT S1XQJREQ.PUID,
               S1XQJREQ.item_id,
               S1XQJREQ.RESPPARTY,
               S1XQJREQ.H3SECONDLEVELDEPT,
               S1XQJREQ.S1CONTACTPHONENUM,
               S1XQJREQ.LASTUPDATE,
               S1XQJREQ.LIFECYCLESTATE
          FROM infodba.VV_s1XQJReq  S1XQJREQ) PART_REQ,
               infodba.pimanrelation H3PRT
WHERE 1 = 1
   AND PART_REQ.puid = H3PRT.RPRIMARY_OBJECTU
   AND PART.puid = H3PRT.RSECONDARY_OBJECTU
   AND PART.S1EXTERNALMODEL IS NOT NULL --更改前产品代码非空
   AND UPPER(PART_REQ.LIFECYCLESTATE) = UPPER(''LcsReleased'')
   AND SUBSTR(PART.S1PARTNUMBER, 1, 4) <> ''0150''
   AND SUBSTR(PART.S1PARTNUMBER, 1, 2) <> ''04''
   AND SYSDATE - PART_REQ.LASTUPDATE <= 3
--Part维护部分
UNION ALL
SELECT S1PRTECO.RESPPARTY, --责任人
       S1PRTECO.H3SECONDLEVELDEPT, --二级部门
       S1PRTECO.S1CONTACTPHONENUM, --联系电话
       S1PRTECO.item_id as DOCUMENTNAME, --申请单流水号    
       PART.S1PARTNUMBER, --PART编码     
       PART.S1PARTDESCELEMENTS, --项目描述 
       PART.S1EXTERNALMODEL AS S1INTERNALMODEL, --对外型号,主要是NOTES表单设计字段名称错误，在此进行匹配
       PART.S1INTENGLISHDESC, --对内英文描述
       PART.S1EXTCHINESEDESC, --对外中文描述
       PART.S1EXTENGLISHDESC --对外英文描述   
  FROM infodba.VV_H3C_Part PART,
       infodba.VV_H3C_Part PART_PRE, --前版本
       infodba.VV_s1PrtEco S1PRTECO,
       infodba.pimanrelation  H3PRT
WHERE 1 = 1
   AND S1PRTECO.PUID = H3PRT.RPRIMARY_OBJECTU
   AND PART.PUID = H3PRT.RSECONDARY_OBJECTU
   AND PART.S1PARTNUMBER = PART_PRE.S1PARTNUMBER
   AND (SELECT Num FROM INFODBA.ZZZ_REVISIONLIST WHERE Rev=PART.REVISION )=(SELECT Num+1 FROM INFODBA.ZZZ_REVISIONLIST WHERE Rev=PART_PRE.REVISION )
   AND UPPER(S1PRTECO.LIFECYCLESTATE) = UPPER(''LcsReleased'')
   AND S1PRTECO.s1ChangeType LIKE ''%产品代码%''  
   AND PART_PRE.S1EXTERNALMODEL IS NULL --更改前产品代码为空
   AND PART.S1EXTERNALMODEL IS NOT NULL --更改前产品代码非空
   AND SUBSTR(PART.S1PARTNUMBER, 1, 4) <> ''0150''
   AND SUBSTR(PART.S1PARTNUMBER, 1, 2) <> ''04''
  -- AND SYSDATE - S1PRTECO.LASTUPDATE<= 3

'
	)


GO
/****** Object:  View [dbo].[view_PDT_FPROD_PERSON_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE  VIEW [dbo].[view_PDT_FPROD_PERSON_Notes] AS
SELECT
	'[Supervisor]' AS writer,
	'PDT信息' AS info_type,
	CONTENT AS PdtName,
	--FPROD_PERSON AS PdtPerson,
	(SELECT 'CN='+UDA_10_509+' '+UDA_10_512+'/O=h3c' FROM tbl_2_10_EN WHERE UDA_10_511=FPROD_PERSON) AS PdtPerson
FROM
	IBDS_PROCESS_CONFIG_ITEM
WHERE
	CONFIG_CODE = 'processPDT' AND FPROD_PERSON IS NOT NULL AND FPROD_PERSON !=''
AND isnull(IBDS_PROCESS_CONFIG_ITEM.MODIFY_DATE,IBDS_PROCESS_CONFIG_ITEM.CREATE_DATE) between GETDATE()-1 and GETDATE()


GO
/****** Object:  View [dbo].[view_PDT_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO








CREATE VIEW [dbo].[view_PDT_Notes] AS
SELECT DISTINCT
	  'PDT' AS FormName
	  ,'PT' AS Mark
	  ,'AA000000' AS AANo
	  , t.[PDTNo]
      ,t.[PDT]
      ,t.[PDTOld]
      ,t.[engPDT]
	  ,f.PLIPMTNo
	  ,f.PLIPMT
	  ,f.engPLIPMT
	  ,e.PRODLINENo
	  ,e.PRODLINE
	  ,e.engPRODLINE
	  ,dbo.F_ReplaceUser(t.[PDT_Manager]) PDT_Manager
	  ,dbo.F_ReplaceUser(t.[POP_ID]) POP_ID
      ,dbo.F_ReplaceUser(t.[LPDT_ID]) LPDT_ID
      ,dbo.F_ReplaceUser(t.[RNDPDT_ID])RNDPDT_ID
      ,dbo.F_ReplaceUser(t.[MKTPDT_ID]) MKTPDT_ID
      ,dbo.F_ReplaceUser(t.[FINPDT_ID])FINPDT_ID
      ,dbo.F_ReplaceUser(t.[PROPDT_ID]) PROPDT_ID
      ,dbo.F_ReplaceUser(t.[PPPDT_ID]) PPPDT_ID
      ,dbo.F_ReplaceUser(t.[MFGPDT_ID]) MFGPDT_ID
      ,dbo.F_ReplaceUser(t.[TSPDT_ID]) TSPDT_ID
      ,dbo.F_ReplaceUser(t.[PQA_ID]) PQA_ID
      ,dbo.F_ReplaceUser(t.[TE_ID]) TE_ID
      ,dbo.F_ReplaceUser(t.[TD_ID])TD_ID
	  ,'' FA_ID --遗漏字段
	  ,dbo.F_ReplaceUser(t.[SE_ID]) SE_ID
	  ,dbo.F_ReplaceUser(t.[OrderDecom]) OrderDecom
	  ,dbo.F_ReplaceUser(t.[NMJKR_ID])NMJKR_ID
	  ,dbo.F_ReplaceUser(t.[CMJKR_ID])CMJKR_ID
      ,dbo.F_ReplaceUser(t.[SCJKR_ID])SCJKR_ID
      ,dbo.F_ReplaceUser(t.[HCJKR_ID])HCJKR_ID
      ,dbo.F_ReplaceUser(t.[AbroadJKR_ID])AbroadJKR_ID
	  ,dbo.F_ReplaceUser(t.[CMO_ID])CMO_ID
	  ,dbo.F_RepalceGroup(t.[PDT_GROUP],1) PDT_GROUP
      ,dbo.F_RepalceGroup(t.[RND_GROUP],1) RND_GROUP
	   ,t.Readers AS Readers
      ,t.[Remark]
	  ,t.[Status]
	  ,t.[PDTNo] AS No
      ,t.[PDT] AS Name
      ,t.[engPDT] AS engName
	  ,'' AS COACode
	  ,t.[PDTNo]+'%'+t.[PDT]+'%'+t.[engPDT] AS Info_No
	  ,'' AS Info_NoCOA
	  ,'' AS Name_COACode
	  ,'' AS engName_COACode
	 
	  ,'' AS SuperMan
	  ,'' AS SuperReaders
	  ,'' AS SuperWriters
	  ,'' AS Writers
FROM
	IBDS_PDT t
	LEFT JOIN IBDS_PRODLINE e ON t.PRODLINENo= e.PRODLINENo
	LEFT JOIN IBDS_PLIPMT f ON f.PLIPMTNo= t.PLIPMTNo
	 where (convert(varchar(10),t.CREATE_DATE,120) between convert(varchar(10),Getdate(),120) and convert(varchar(10),Getdate(),120)) 
			or (convert(varchar(10),t.MODIFY_DATE,120) between  convert(varchar(10),Getdate(),120) and convert(varchar(10),Getdate(),120))








GO
/****** Object:  View [dbo].[view_PDT_PDT_MGN_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE  VIEW [dbo].[view_PDT_PDT_MGN_Notes] AS
SELECT
	CONTENT AS fldpdt,
	--PDT_MGN AS fldpdtmanager,
(SELECT 'CN='+UDA_10_509+' '+UDA_10_512+'/O=h3c' FROM tbl_2_10_EN WHERE UDA_10_511=PDT_MGN) AS fldpdtmanager,
	dbo.F_ReplaceUser(POP_ID) AS fldpop
FROM
	IBDS_PROCESS_CONFIG_ITEM JOIN IBDS_PDT ON CONTENT=PDT
WHERE
	CONFIG_CODE = 'processPDT' AND PDT_MGN IS NOT NULL AND PDT_MGN !='' 
AND isnull(IBDS_PROCESS_CONFIG_ITEM.MODIFY_DATE,IBDS_PROCESS_CONFIG_ITEM.CREATE_DATE) between GETDATE()-1 and GETDATE()

UNION 

SELECT
	fldpdt,
(SELECT 'CN='+UDA_10_509+' '+UDA_10_512+'/O=h3c' FROM tbl_2_10_EN WHERE UDA_10_511=PDT_MGN) AS fldpdtmanager,
	
fldpop
FROM
	IBDS_PROCESS_CONFIG_ITEM
JOIN PDT_PDT_MGN_Temp ON CONTENT = fldpdt
AND CONFIG_CODE = 'processPDT'
WHERE
	PDT_MGN IS NOT NULL
AND PDT_MGN != ''
AND CONTENT NOT IN (
	SELECT
		CONTENT
	FROM
		IBDS_PROCESS_CONFIG_ITEM
	JOIN IBDS_PDT ON CONTENT = PDT
)
AND isnull(IBDS_PROCESS_CONFIG_ITEM.MODIFY_DATE,IBDS_PROCESS_CONFIG_ITEM.CREATE_DATE) between GETDATE()-1 and GETDATE()


GO
/****** Object:  View [dbo].[view_PeopleApply]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[view_PeopleApply]
AS 
SELECT  a.ID ,
        a.[Process_Code] ,
        a.[PInfoType] ,
        a.[PLIPMTNo] ,
        a.[PLIPMT] ,
        a.[EngPLIPMT] ,
        a.[PRODLINENo] ,
        a.[PRODLINE] ,
        a.[EngPRODLINE] ,
        a.[PDTNo] ,
        a.[PDT] ,
        a.[EngPDT] ,
        a.[VersionNo] ,
        a.[Version] ,
        a.[EngVersion] ,
        a.[ReleaseNo] ,
        a.[Release] ,
        a.[EngRelease] ,
        a.[IPMTSecretary] ,
        a.[IsIPMTCheck] ,
        a.[Remark] ,
        b.[ID] ProcessID,
        b.[APPLY_CODE] ,
        b.[Status] ,
        b.[Handler] ,
        b.[Instanse_ID] ,
        b.[CurrentNode] ,
        b.[STATUS_DESC] ,
        b.[First_Sign] ,
        b.[First_Date] ,
        b.[IPMT_Sign] ,
        b.[IPMT_Date] ,
        b.[IPMT_Opinion] ,
        b.[IPMT_Result]
FROM    dbo.IBDS_People_APPLY a
        LEFT JOIN dbo.IBDS_People_PROCESS b ON a.Process_Code = b.APPLY_CODE;


GO
/****** Object:  View [dbo].[view_PeopleApplyList]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[view_PeopleApplyList]
AS


SELECT a.ID,i.ID item_ID,a.PROCESS_CODE AS code,a.CreateTime AS CREATE_DATE,CAST(DATEPART(YEAR,a.CreateTime) AS
				NVARCHAR(10))+'年'+CAST(DATEPART(MONTH,a.CreateTime) AS
				NVARCHAR(10))+'月' YearAndMonth ,a.Creator AS CREATE_USER,c.Handler AS Responsible,c.Status,c.STATUS_DESC AS StatusName,ProCode,ProName FROM IBDS_People_APPLY a 
LEFT JOIN ibds_people_process c ON a.PROCESS_CODE=c.APPLY_CODE
LEFT JOIN ibds_people_item_apply i ON a.ID=i.P_ID
WHERE i.Status=1 OR i.Status IS NULL


GO
/****** Object:  View [dbo].[view_PLIPMT_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO








CREATE VIEW  [dbo].[view_PLIPMT_Notes]
AS
SELECT 
'PLIPMT' AS FormName,
'PI' AS Mark,
'AA000000' AS AANo,
a.PLIPMTNo,
	   a.PLIPMT,
	   a.PLIPMTOld,
	   a.engPLIPMT,
	   dbo.F_ReplaceUser(a.PLIPMT_Umpire)   PLIPMT_Umpire,
	   dbo.F_ReplaceUser(a.PLIPMT_ViceUmpire) PLIPMT_ViceUmpire,
	   dbo.F_ReplaceUser(a.PLIMPT_Secretary) PLIMPT_Secretary,
	   dbo.F_RepalceGroup(a.PLIPMT_Members,1) PLIPMT_Members,
	   dbo.F_ReplaceUser(a.PLIPMT_PDM_Mnger)  PLIPMT_PDM_Mnger,
	   a.Readers,
	   a.Remark,
	   a.Status,
	   a.PLIPMTNo No,
	   a.PLIPMT Name,
	   a.engPLIPMT engName,
	   '' COACode,
	   a.PLIPMTNo+'%'+a.PLIPMT+'%'+a.engPLIPMT Info_No,
	   '' Info_NoCOA,
	   '' Name_COACode,
	   '' engName_COACode
	  ,'' AS SuperMan
	  ,'' AS SuperReaders
	  ,'' AS SuperWriters
	  ,'' AS Writers
	 FROM dbo.IBDS_PLIPMT a
	 where isnull(a.MODIFY_DATE,a.CREATE_DATE) between GETDATE()-1 and GETDATE()








GO
/****** Object:  View [dbo].[view_ProcessConfigPerson]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE VIEW  [dbo].[view_ProcessConfigPerson]
AS
SELECT a.ID,c.CODE,c.NAME,a.PROCESS_ROLE_CODE RoleCode,a.DEPT_CODE deptCode,d.DIC_NAME deptName,b.NOTE  RoleName,a.CHECKER_ID,a.CHECKER_NAME,a.NOTE 
	 FROM IBDS_PROCESS_PERSON a  
	INNER JOIN  IBDS_PROCESS_CONFIG_ITEM b ON a.PROCESS_ROLE_CODE=b.CODE AND a.PROCESS_CODE=b.CONFIG_CODE
	INNER JOIN  dbo.IBDS_PROCESS_CONFIG c ON a.PROCESS_CODE=c.CODE
	LEFT  JOIN  IBDS_Dic d ON d.DIC_VALUE=a.DEPT_CODE AND d.DIC_TypeCode='20'



GO
/****** Object:  View [dbo].[view_PRODLINE_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO







CREATE VIEW [dbo].[view_PRODLINE_Notes] AS

	SELECT DISTINCT
	  'PRODLINE' AS FormName
	  ,'PL' AS Mark
	  ,'AA000000' AS AANo
	  ,e.[PRODLINENo]
      ,e.[PRODLINE]
      ,e.[PRODLINEOld]
      ,e.[engPRODLINE]
      ,e.[PLIPMTNo]
	  ,f.PLIPMT
	  ,f.engPLIPMT
      ,dbo.F_ReplaceUser(e.[Quality_Director_ID])  Quality_Director_ID
      ,dbo.F_ReplaceUser(e.Quality_Mnger_ID) Quality_Mnger_ID
      ,dbo.F_ReplaceUser(e.Test_Mnger_ID)  Test_Mnger_ID
      ,dbo.F_ReplaceUser(e.CMOLeader_ID)  CMOLeader_ID
      ,dbo.F_RepalceGroup(e.[PL_CCB_GROUP],1) PL_CCB_GROUP
      ,dbo.F_ReplaceUser(e.PrjMarketP) PrjMarketP
      ,dbo.F_ReplaceUser(e.fldcpxzj)  fldcpxzj
	  ,e.Readers
      ,e.[Remark]
      ,e.[Status]
	  ,e.PRODLINENo AS No
      ,e.PRODLINE AS Name
      ,e.engPRODLINE AS engName
	  ,'' AS COACode
	  ,e.PRODLINENo+'%'+e.PRODLINE+'%'+e.engPRODLINE AS Info_No
	  ,'' AS Info_NoCOA
	  ,'' AS Name_COACode
	  ,'' AS engName_COACode
	  ,'' AS SuperMan
	  ,'' AS SuperReaders
	  ,'' AS SuperWriters
	  ,'' AS Writers
FROM
	IBDS_PRODLINE e
	LEFT JOIN IBDS_PLIPMT f ON e.PLIPMTNo= f.PLIPMTNo
	 where isnull(e.MODIFY_DATE,e.CREATE_DATE) between GETDATE()-1 and GETDATE()







GO
/****** Object:  View [dbo].[view_PRODUCT_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO










CREATE VIEW [dbo].[view_PRODUCT_Notes] AS	
SELECT
 'PRODUCT' AS FormName
	  ,'PP' AS Mark
	  ,'AA000000' AS AANo
	 ,t.[ProductNo]
      ,t.[Product]
      ,t.[P]
      ,t.[ProductOld]
      ,t.[engProduct]
      ,t.[IfPlan]
	  ,t.ProductType AS ProductTypeNo
      ,d.DIC_NAME AS ProductType
      ,t.[IfOfficialNaming]
      ,t.[PRODUCTCOACode]
	  ,t.[PLIPMTNo]
	  ,f.PLIPMT,
	  f.engPLIPMT
	  ,t.[PRODLINENo]
	  ,e.PRODLINE
	 ,e.engPRODLINE
      ,t.[Match]
      ,dbo.[F_ReplaceUser](t.[PM_ID]) PM_ID
      ,dbo.[F_ReplaceUser](t.[POP_ID]) POP_ID
      ,dbo.[F_ReplaceUser](t.[CME_ID])CME_ID
      ,dbo.[F_ReplaceUser](t.[CMO_ID])CMO_ID
      ,dbo.[F_ReplaceUser](t.[PDE_ID])PDE_ID
      ,t.[FPRODUCT] AS FPRODUCTNo
	  ,rp.FPRODUCTCOACode
	  ,rp.FPRODUCT
	  ,engFPRODUCT
      ,t.[BOM]
      ,t.[Readers]
      ,t.[REMARK]
      ,t.[Status]
	 ,t.PRODUCTNo AS No
      ,t.PRODUCT AS Name
      ,t.engPRODUCT AS engName
	  ,'' AS COACode
	  ,t.PRODUCTNo+'%'+t.PRODUCT+'%'+t.engPRODUCT AS Info_No
	  ,'' AS Info_NoCOA
	  ,'' AS Name_COACode
	  ,'' AS engName_COACode
	  ,'' AS SuperMan
	  ,'' AS SuperReaders
	  ,'' AS SuperWriters
	  ,'' AS Writers
FROM
	IBDS_PRODUCT t  
	LEFT JOIN IBDS_PRODLINE e  ON t.PRODLINENo= e.PRODLINENo
	LEFT JOIN IBDS_PLIPMT f ON t.PLIPMTNo= f.PLIPMTNo
	LEFT JOIN (SELECT DIC_NAME,DIC_VALUE FROM IBDS_Dic WHERE DIC_TypeCode='4') d ON t.ProductType=d.DIC_VALUE 
	LEFT JOIN (SELECT DIC_NAME,DIC_VALUE FROM IBDS_Dic WHERE DIC_TypeCode='5') k ON t.ifplan=k.DIC_VALUE
	LEFT JOIN IBDS_FPRODUCT rp ON t.FPRODUCT= rp.FPRODUCTNo
	 where isnull(t.MODIFY_DATE,t.CREATE_DATE) between GETDATE()-1 and GETDATE()













GO
/****** Object:  View [dbo].[view_ProductApplyList]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO






















CREATE VIEW [dbo].[view_ProductApplyList]
AS
--产品
SELECT distinct c.ID ApplypId,c.ID,a.PROCESS_CODE AS code,a.PRODLINENo,b.PRODLINE,CONVERT(NVARCHAR,'产品信息修改') AS AppyType,(a.PRODUCTNo+Convert(nvarchar,c.ID)) AS PRODUCTNo,a.PRODUCT,CONVERT(NVARCHAR,'') AS banben,a.CREATE_DATE,u.DisplayName CREATE_USER,r.DisplayName Responsible,c.Status,c.StatusName,CONVERT(NVARCHAR,'') AS softsn,CONVERT(NVARCHAR,'') AS hardsn FROM IBDS_Product_Apply a LEFT JOIN IBDS_PRODLINE b ON a.PRODLINENo=b.PRODLINENo
LEFT JOIN IBDS_Product_PROCESS c ON a.PROCESS_CODE=c.ApplyCode 
 left join tbDomainAccount u on a.CREATE_USER=u.SamAccount
 left join tbDomainAccount r on c.Responsible=r.SamAccount
UNION ALL
--VR
SELECT distinct c.ID ApplypId,c.ID,a.Process_Code AS code,a.ProdLineNo,b.PRODLINE,CONVERT(NVARCHAR,'产品V-R信息修改') AS AppyType,(a.PRODUCTNo+Convert(nvarchar,c.ID)) PRODUCTNo,d.Product Product,CONVERT(NVARCHAR,isnull(ReleaseNew,'')) AS banben,a.CreateTime AS CREATE_DATE,u.DisplayName AS CREATE_USER,r.DisplayName AS Responsible,c.Status,c.STATUS_DESC AS StatusName,CONVERT(NVARCHAR,'') AS softsn,CONVERT(NVARCHAR,'') AS hardsn FROM IBDS_VR_APPLY a LEFT JOIN IBDS_PRODLINE b ON a.PRODLINENo=b.PRODLINENo
LEFT JOIN IBDS_Product d ON a.ProductNo=d.ProductNo
 LEFT JOIN IBDS_VR_PROCESS c ON a.Process_Code=c.APPLY_CODE 
 left join tbDomainAccount u on a.Creator=u.SamAccount
 left join tbDomainAccount r on c.Handler=r.SamAccount
UNION ALL
--R以下  基线
SELECT distinct c.ID ApplypId,c.ID,a.PROCESS_CODE AS code,a.PRODLINENo,b.PRODLINE,CONVERT(NVARCHAR,'产品R级以下信息修改') AS AppyType,(a.PRODUCTNo+Convert(nvarchar,c.ID)) AS PRODUCTNo,d.Product AS Product,CONVERT(NVARCHAR,'') AS banben,a.CREATE_DATE,Convert(nvarchar,u.DisplayName) CREATE_USER,Convert(nvarchar,r.DisplayName) Responsible,c.Status,c.StatusName,CONVERT(NVARCHAR,'') AS softsn,CONVERT(NVARCHAR,'') AS hardsn FROM 
IBDS_BaseLine_Apply a LEFT JOIN IBDS_PRODLINE b ON a.PRODLINENo=b.PRODLINENo
LEFT JOIN IBDS_Product d ON a.ProductNo=d.ProductNo
left join IBDS_RELEASE f on a.RELEASENo=f.RELEASENo
LEFT JOIN IBDS_BaseObject_PROCESS c ON a.PROCESS_CODE=c.ApplyCode --where c.Status<>0
left join tbDomainAccount u on a.CREATE_USER=u.SamAccount
left join tbDomainAccount r on c.Responsible=r.SamAccount
UNION ALL
--R以下  基线以下
SELECT  distinct c.id ApplypId,c.ID,a.PROCESS_CODE AS code,a.PRODLINENo,b.PRODLINE,CONVERT(NVARCHAR,'产品R级以下信息修改') AS AppyType,(a.PRODUCTNo+Convert(nvarchar,c.ID)) AS PRODUCTNo,d.Product Product,CONVERT(NVARCHAR,RELEASE) AS banben,CONVERT(nvarchar(19),a.CREATE_DATE,121) as CREATE_DATE,Convert(nvarchar,u.DisplayName) CREATE_USER,Convert(nvarchar,r.DisplayName) Responsible,c.Status,c.StatusName,CONVERT(NVARCHAR,'') AS softsn,CONVERT(NVARCHAR,'') AS hardsn FROM 
IBDS_BaseObject_Apply a LEFT JOIN IBDS_PRODLINE b ON a.PRODLINENo=b.PRODLINENo
LEFT JOIN IBDS_Product d ON a.ProductNo=d.ProductNo
left join IBDS_RELEASE f on a.RELEASENo=f.RELEASENo
LEFT JOIN IBDS_BaseObject_PROCESS c ON a.PROCESS_CODE=c.ApplyCode
left join tbDomainAccount u on a.CREATE_USER=u.SamAccount
left join tbDomainAccount r on c.Responsible=r.SamAccount where not exists (select 1 from  IBDS_BaseLine_Apply where PROCESS_CODE= a.PROCESS_CODE) --where c.Status<>0

--UNION ALL
----R以下  基线以下草稿
--SELECT a.ID*100 ApplypId,c.ID,a.PROCESS_CODE AS code,a.PRODLINENo,b.PRODLINE,'产品R级以下信息草稿' AS AppyType,Convert(varchar,a.ID) AS PRODUCTNo,d.Product AS Product,CONVERT(NVARCHAR,'') AS banben,a.CREATE_DATE,a.CREATE_USER,c.Responsible,c.Status,c.StatusName,CONVERT(NVARCHAR,f.RELEASE) AS softsn,CONVERT(NVARCHAR,'') AS hardsn FROM IBDS_BaseObject_Apply a LEFT JOIN IBDS_PRODLINE b ON a.PRODLINENo=b.PRODLINENo
--LEFT JOIN IBDS_Product d ON a.ProductNo=d.ProductNo
--left join IBDS_RELEASE f on a.RELEASENo=f.RELEASENo
--LEFT JOIN IBDS_BaseObject_PROCESS c ON a.PROCESS_CODE=c.ApplyCode where c.Status=0
--R以下  基线
--SELECT distinct c.ID ApplypId,c.ID,a.PROCESS_CODE AS code,a.PRODLINENo,b.PRODLINE,'产品R级以下信息修改' AS AppyType,a.PRODUCTNo AS PRODUCTNo,d.Product Product,CONVERT(NVARCHAR,release) AS banben,CONVERT(nvarchar(19),a.CREATE_DATE,121),a.CREATE_USER,c.Responsible,c.Status,c.StatusName,CONVERT(NVARCHAR,'') AS softsn,CONVERT(NVARCHAR,'') AS hardsn FROM IBDS_BaseLine_Apply a LEFT JOIN IBDS_PRODLINE b ON a.PRODLINENo=b.PRODLINENo
--LEFT JOIN IBDS_Product d ON a.ProductNo=d.ProductNo
--left join IBDS_RELEASE f on a.RELEASENo=f.RELEASENo
--LEFT JOIN IBDS_BaseObject_PROCESS c ON a.PROCESS_CODE=c.ApplyCode


--UNION ALL
----R以下  基线以下草稿
--SELECT a.ID*100 ApplypId,c.ID,a.PROCESS_CODE AS code,a.PRODLINENo,b.PRODLINE,'产品R级以下信息草稿' AS AppyType,Convert(varchar,a.ID) AS PRODUCTNo,d.Product AS Product,CONVERT(NVARCHAR,'') AS banben,a.CREATE_DATE,a.CREATE_USER,c.Responsible,c.Status,c.StatusName,CONVERT(NVARCHAR,f.RELEASE) AS softsn,CONVERT(NVARCHAR,'') AS hardsn FROM IBDS_BaseObject_Apply a LEFT JOIN IBDS_PRODLINE b ON a.PRODLINENo=b.PRODLINENo
--LEFT JOIN IBDS_Product d ON a.ProductNo=d.ProductNo
--left join IBDS_RELEASE f on a.RELEASENo=f.RELEASENo
--LEFT JOIN IBDS_BaseObject_PROCESS c ON a.PROCESS_CODE=c.ApplyCode where c.Status=0


--SELECT a.ID*100 ApplypId,c.ID,a.PROCESS_CODE AS code,a.PRODLINENo,b.PRODLINE,'产品R级以下信息修改'AS AppyType, a.PRODUCTNo AS PRODUCTNo,d.Product AS Product,CONVERT(NVARCHAR,RELEASE) AS banben,a.CREATE_DATE,a.CREATE_USER,c.Responsible,c.Status,c.StatusName,CONVERT(NVARCHAR,'') AS softsn,CONVERT(NVARCHAR,'') AS hardsn FROM IBDS_BaseObject_Apply a LEFT JOIN IBDS_PRODLINE b ON a.PRODLINENo=b.PRODLINENo
--LEFT JOIN IBDS_Product d ON a.ProductNo=d.ProductNo
--left join IBDS_RELEASE f on a.RELEASENo=f.RELEASENo
--LEFT JOIN IBDS_BaseObject_PROCESS c ON a.PROCESS_CODE=c.ApplyCode where not exists (select 1 from  IBDS_BaseLine_Apply where PROCESS_CODE= a.PROCESS_CODE)

--union all
--select c.ID,a.PROCESS_CODE as code,a.PRODLINENo,b.PRODLINE,'难度系数申请' as AppyType,a.PRODUCTNo,d.Product,Convert(nvarchar,'') as banben,a.CreateTime as CREATE_DATE,a.Creator as CREATE_USER,c.Handler as Responsible,c.Status,c.STATUS_DESC as StatusName,Convert(nvarchar,'') as softsn,Convert(nvarchar,'') as hardsn from IBDS_DifficultyCoefficient_APPLY a left join IBDS_PRODLINE b on a.PRODLINENo=b.PRODLINENo
--left join IBDS_Product d on a.ProductNo=d.ProductNo
--left join IBDS_DifficultyCoefficient_PROCESS c on a.PROCESS_CODE=c.APPLY_CODE


















GO
/****** Object:  View [dbo].[view_PROJECT_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO







CREATE view   [dbo].[view_PROJECT_Notes] as 
SELECT
distinct
	  'PROJECT' as FormName
	  ,'PJ' as Mark
	  ,'AA000000' as AANo,
	  '' as type
	  ,pj.[PROJECTNo]
      ,pj.[PROJECT]
      ,pj.[PROJECTOld]
      ,pj.[engPROJECT]
      ,pj.[PROJECTAlias]
      ,pj.[IfPlan]
      ,pj.[PROJECTCOACode]
      ,pj.[PROJECTTypeNo],
	ptype.DIC_NAME as PROJECTType
	,'' as engPROJECTType
      ,pj.[PLIPMTNo]
	  ,ipmt.PLIPMT
	  ,ipmt.engPLIPMT
      ,pj.[PRODLINENo]
	  ,pl.PRODLINE
	  ,pl.engPRODLINE
      ,pj.[PDTNo]
	  ,pdt.PDT
	  ,pdt.engPDT
      ,pj.[Readers]
      ,pj.[Remark]
      ,pj.[Match]
      ,pj.[PROJECTMatch]
      ,pj.[Status]
	  ,pj.PROJECTNo as No
      ,pj.PROJECT as Name
      ,pj.engPROJECT as engName
	  ,'' as COACode
	  ,pj.PROJECTNo+'%'+pj.PROJECT+'%'+pj.engPROJECT as Info_No
	  ,'' as Info_NoCOA
	  ,'' as Name_COACode
	  ,'' as engName_COACode
	  ,'' as SuperMan
	  ,'' as SuperReaders
	  ,'' as SuperWriters
	  ,'' as Writers
FROM
	ibds_project pj
	left join IBDS_PLIPMT  ipmt  on pj.PLIPMTNo = ipmt.PLIPMTNo
	left join IBDS_PDT pdt on  pj.PDTNo = pdt.PDTNo
	left join (select DIC_NAME,DIC_VALUE from IBDS_Dic where Flag=1 and DIC_TypeCode='6') ptype on pj.PROJECTTypeNo=ptype.DIC_VALUE 
	left join IBDS_PRODLINE pl on pj.PRODLINENo=pl.PRODLINENo
	 where isnull(pj.MODIFY_DATA,pj.CREATED_DATE) between GETDATE()-1 and GETDATE()









GO
/****** Object:  View [dbo].[view_projectCode_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[view_projectCode_Notes] AS 
select 
null as f_author,
null as WF_ORUNID,
'1' as mark,
null as UpdataFlag,
null as readers,
projectcode.mark as f_zhuangtai,
projectcode.f_objca_name  as   f_zhonglei,--项目类别				
productcode.PDT_name as f_yewubu,--所属pdt
projectcode.f_projno as f_projno, --项目编码
projectcode.f_projname as f_projname,--项目名称
projectcode.f_projcode as f_projcode,--项目代号
line.PRODLINE as f_lingyu,--所属产品线
projectcode.f_version as f_banben,--对应的版本
rel.f_product_code as f_prodno, --服务的产品编码
productcode.PRODUCT_NAME_CN as f_prodname, --服务的产品名称
cast(rel.rate as DECIMAL) /100 as f_bili,--分摊
cast(projectcode.f_bizhong as DECIMAL)/100 as f_bizhong,--费用分摊运营商比重
cast(projectcode.f_fbizhong as DECIMAL)/100 as f_fbizhong,--费用分摊非运营商比重
projectcode.BeginTime,--编码生效日期
dbo.F_ReplaceUser(projectcode.f_projMng) as f_jingli,--项目经理
 
(select dic_name from IBDS_Dic dic where dic.dic_value=projectcode.f_dept) as f_bumen,--部门

projectcode.f_start_project_time as f_lixiang,--立项时间
projectcode.f_assign_point_name as f_pingshendian,--对应评审点
projectcode.remark as f_explain,--备注

projectcode.f_old_objca_name as f_zhonglei_1,
projectcode.f_old_pdt_name as f_yewubu_1,
projectcode.f_old_projno as f_projno_1,
projectcode.f_old_projname as f_projname_1,
projectcode.f_old_projcode as f_projcode_1,

projectcode.f_old_productline_name as f_lingyu_1,
projectcode.f_old_version  as  f_banben_1,
projectcode.f_old_productno as f_prodno_old,

projectcode.f_old_productname as f_prodname_old,
cast (rel.f_old_rate as decimal) /100  as f_bili_1,
cast (projectcode.f_old_bizhong as decimal)/100 as f_bizhong_1,
cast (projectcode.f_old_fbizhong as decimal)/100  as f_fbizhong_1

from IBDS_F_PROJECT_CODE  projectcode
LEFT JOIN IBDS_F_PROJECT_PRODUCT_REL rel on rel.f_projno = projectcode.f_projno
LEFT JOIN IBDS_F_PRODUCT_CODE productcode on productcode.PRODUCT_CODE = rel.f_product_code
LEFT JOIN   IBDS_RELEASE   release on    release.RELEASENo = projectcode.f_releaseno
LEFT JOIN   IBDS_PRODLINE  line  on  line.PRODLINENo = release.PRODLINENo

where isnull(projectcode.create_time, projectcode.modify_date) between GETDATE()-1 and GETDATE()

GO
/****** Object:  View [dbo].[view_projectCodeProduct]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[view_projectCodeProduct] AS 
SELECT
	projectcode.id as f_id,
	projectcode.f_objca,
	productCode.PDT_NO  as f_pdtno,
	projectcode.f_projno,
	projectcode.f_projname,
	projectcode.f_projcode,
	projectcode.f_productlineno,
	projectcode.f_releaseno,
	projectcode.f_releasename,
	projectcode.f_productno,
	projectcode.f_productname,
	projectcode.f_bizhong,
	projectcode.f_fbizhong,
	projectcode.BeginTime,
	projectcode.f_projMng,
	projectcode.f_dept,
	projectcode.f_start_project_time,
	projectcode.f_assign_point,
	projectcode.f_assign_point_name,
	projectcode.remark,
	projectcode.f_profile,
	productCode.PRODUCT_NAME_CN,
	projectcode.f_objca_name,
	productCode.PDT_NAME  as  f_pdt_name,
	projectcode.f_productline_name,
	projectcode.f_bversionno,
	projectcode.f_bversionname,
	projectcode.f_version,
	rel.rate
FROM
	IBDS_F_PROJECT_CODE projectcode
LEFT JOIN IBDS_F_PROJECT_PRODUCT_REL rel ON projectcode.f_projno = rel.f_projno
LEFT JOIN IBDS_F_PRODUCT_CODE productCode ON productCode.PRODUCT_CODE = rel.f_product_code
where projectcode.status='1'

GO
/****** Object:  View [dbo].[view_RELEASE_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO












CREATE VIEW [dbo].[view_RELEASE_Notes]
AS
SELECT 
	 DISTINCT
	  'RELEASE' AS FormName
	  ,'PR' AS Mark
	  ,'AA000000' AS AANo,
	   a.[RELEASENo]
      ,a.[RELEASE]
	  ,a.P
	  ,a.V
	  ,a.R
      ,a.[RELEASEOld]
	  ,a.[engRELEASE]
	  ,f.PLIPMTNo
	  ,f.PLIPMT
	  ,f.engPLIPMT
	  ,e.PRODLINENo
	  ,e.PRODLINE
	  ,e.engPRODLINE
	  ,d.PRODUCTNo
	  ,d.PRODUCT
	  ,d.engPRODUCT
	  ,c.VERSIONNo
	  ,c.VERSION
	  ,c.engVERSION
	  ,b.PDTNo
	  ,b.PDT
	  ,b.engPDT
	  ,p.PROJECTNo
	  ,p.PROJECTCOACode
	  ,p.PROJECT
	  ,p.engPROJECT
	  ,a.RELEASENo_Software--软件平台 RELEASE_Software engRELEASE_Software需确认
	  ,plrelease.RELEASE RELEASE_Software
	  ,plrelease.engRELEASE engRELEASE_Software
	  ,a.[PROJECTStatus]
	  ,a.Match
	  ,a.RELEASEMatch
	  ,a.ProdDataID
	  ,dbo.[F_ReplaceUser](a.[POP_ID]) POP_ID
	  ,dbo.[F_ReplaceUser](a.[CMO_ID]) CMO_ID
	  ,dbo.[F_ReplaceUser](a.[Testing_Mnger])Testing_Mnger
	  ,dbo.[F_ReplaceUser](a.[TechSupport_Mnger]) TechSupport_Mnger
	  ,dbo.[F_ReplaceUser](a.[Product_Mnger]) Product_Mnger
	  ,dbo.[F_ReplaceUser](a.[MarketTM]) MarketTM
	  ,dbo.[F_ReplaceUser](a.[softmg]) softmg
	  ,dbo.[F_ReplaceUser](a.[hardmg]) hardmg
	  ,dbo.[F_ReplaceUser](a.[fldPDE]) fldPDE
	  ,dbo.[F_ReplaceUser](a.[RNDPDT_ID]) RNDPDT_ID
	  ,dbo.[F_ReplaceUser](a.Oversea_Mnger) Oversea_Mnger
	  ,dbo.[F_ReplaceUser](a.[PilotProduction_Mnger]) PilotProduction_Mnger
	  ,dbo.[F_ReplaceUser](a.[OMC_Mnger]) OMC_Mnger
	  ,dbo.[F_ReplaceUser](a.[System_Mnger]) System_Mnger
	  ,dbo.[F_ReplaceUser](a.[Quality_Mnger]) Quality_Mnger
	  ,dbo.[F_ReplaceUser](a.[Equipment_Mnger]) Equipment_Mnger
	  ,dbo.[F_ReplaceUser](a.[Documents_Mnger]) Documents_Mnger
	  ,dbo.[F_ReplaceUser](a.[Purchase_Mnger]) Purchase_Mnger
	  ,dbo.[F_ReplaceUser](a.[Sales_Mnger]) Sales_Mnger
	  ,dbo.[F_ReplaceUser](a.[PPPDT_ID]) PPPDT_ID
	  ,dbo.[F_ReplaceUser](a.[Manufacture_Mnger])Manufacture_Mnger
	  ,dbo.[F_ReplaceUser](a.FF_ID) FF_ID
      ,a.harddiffcult--难度系数待确认
	  ,a.proDifficult
      ,a.Readers
      ,a.[Remark]
      ,a.Status
	  ,a.RELEASENo AS No
	  ,a.RELEASE AS Name
	  ,a.engRELEASE AS engName
	  ,'' AS COACode
	  ,a.RELEASENo+'%'+a.RELEASE+'%'+a.engRELEASE AS Info_No
	  ,'' AS Info_NoCOA
	  ,'' AS Name_COACode
	  ,'' AS engName_COACode
	  ,'' SuperMan
	  ,'' SuperReaders
	  ,'' SuperWriters
	  ,'' Writers FROM IBDS_RELEASE a LEFT JOIN IBDS_VERSION c ON a.VersionNo=c.VERSIONNo 
LEFT JOIN IBDS_RDProduct d ON a.ProductNO=d.PRODUCTNo
LEFT JOIN IBDS_PDT b ON a.PDTNo=b.PDTNo 
LEFT JOIN IBDS_PRODLINE e ON a.PRODLINENo=e.PRODLINENo
LEFT JOIN IBDS_PLIPMT f ON a.PLIPMTNo=f.PLIPMTNo
LEFT JOIN IBDS_PROJECT p ON a.projectno=p.PROJECTNo
LEFT JOIN (SELECT RELEASENo,RELEASE,engRELEASE FROM IBDS_RELEASE WHERE PRODLINENo='PL000024') plrelease ON a.RELEASENo_Software=plrelease.RELEASENo--对应的软件平台版本
where isnull(a.MODIFY_DATE,a.CREATE_DATE) between GETDATE()-1 and GETDATE()














GO
/****** Object:  View [dbo].[view_StopUsingProducts]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[view_StopUsingProducts]
AS
	  --产品线->研发产品->R->R+R以下
	 SELECT a.ID,f.ProdLineNo,f.ProdLine, e.ProductNo,e.Product, b.ReleaseNo+'1' ReleaseNo ,b.Release,a.type,a.Code,a.Name,a.EngName FROM (
		 SELECT ID,'RELEASE' type,ReleaseNo Code,release Name,engRELEASE EngName, ReleaseNo  FROM dbo.IBDS_RELEASE WHERE Status=0
		 UNION ALL
		 SELECT ID,'BVERSION' type,bversionno Code,bversioncname Name,bversionename EngName,ReleaseNo FROM ibds_bversion WHERE status=0
		 UNION ALL
		 SELECT ID,'BASELINE' type,baselineno Code,baseline Name,engbaseline EngName,ReleaseNo FROM ibds_base_line WHERE status=0
		 UNION ALL
		 SELECT ID,'FEATURE' type,featureno Code,feature Name,engFeature EngName,ReleaseNo FROM ibds_featrue WHERE status=0
		 UNION ALL
		 SELECT ID,'SUBFEATURE' type,subfeatureno Code,subfeature Name,engsubfeature EngName,ReleaseNo FROM ibds_sub_featrue WHERE status=0
		 UNION ALL
		 SELECT ID,'TEAM' type,teamno Code,team Name,engteam EngName, ReleaseNo FROM ibds_team WHERE status=0
		 UNION ALL
		 SELECT ID,'SUBSYSTEM' type,subsystemno Code,subsystem Name,engsubsystem engName,ReleaseNo FROM ibds_sub_system WHERE status=0
		 UNION ALL
		 SELECT ID,'MODULE' type,moduleno Code,module Name,engmodule EngName,ReleaseNo FROM ibds_module  WHERE status=0
		 UNION ALL
		 SELECT ID,'MODULEVERSION' type,mdlvsnno Code,mdlvsn Name,engmdlvsn EngName,ReleaseNo FROM ibds_module_version WHERE status =0
	 ) a
	 LEFT JOIN dbo.IBDS_RELEASE b ON a.ReleaseNo=b.ReleaseNo
	 LEFT JOIN dbo.IBDS_VERSION c ON b.VersionNo=c.VERSIONNo 
	 LEFT JOIN  IBDS_Product e ON e.productno=c.productno
	 LEFT JOIN dbo.IBDS_PRODLINE f ON e.PRODLINENo=f.PRODLINENo

	 UNION ALL 
	 --产品线->研发产品->V版本->V
	--	 未分类->	PDT->PDT	
	--	 未分类->	研发产品->研发产品		
	--	 未分类->	研发项目->研发项目
	--	 未分类->	财务产品->财务产品	

	--V
	SELECT a.ID,c.ProdLineNo,c.ProdLine,b.ProductNo,b.Product,'PR'+b.productno+'V版本' ReleaseNo,'V版本' Release,'Version' type,a.VERSIONNo Code,a.VERSION Name,a.engVERSION EngName FROM  dbo.IBDS_VERSION a 
		LEFT JOIN IBDS_Product b ON a.productno=b.productno
		LEFT JOIN dbo.IBDS_PRODLINE c ON b.PRODLINENo=c.PRODLINENo
		WHERE a.Status=0
	UNION ALL
	--PDT
	SELECT a.ID,b.ProdLineNo,b.ProdLine,'PP'+b.PRODLINENo+'PDT' ProductNo,'PDT' Product,'PR'+b.PRODLINENo+'PDT' ReleaseNo,'PDT' Release,'PDT' type,a.PDTNo Code,a.PDT Name,a.engPDT EngName FROM dbo.IBDS_PDT a  
	LEFT JOIN dbo.IBDS_PRODLINE b ON a.PRODLINENo=b.PRODLINENo   WHERE  a.Status=0
	UNION ALL
	--研发产品
	SELECT a.ID, b.ProdLineNo,b.ProdLine,'PP'+b.PRODLINENo+'PRODUCT' ProductNo,'PRODUCT' Product,'PR'+b.PRODLINENo+'PRODUCT' ReleaseNo,'PRODUCT' Release,'PRODUCT' type,a.productno Code,a.product Name,a.engproduct EngName FROM ibds_product a LEFT JOIN dbo.IBDS_PRODLINE b ON a.prodlineno=b.PRODLINENo
	WHERE a.status=0
	UNION ALL
	--研发项目
	SELECT a.ID, b.ProdLineNo,b.ProdLine,'PJ'+b.PRODLINENo+'PROJECT' ProductNo,'PROJECT' Product,'PR'+b.PRODLINENo+'PROJECT' ReleaseNo,'PROJECT' Release,'PROJECT' type,a.projectno Code,a.project Name,a.engproject EngName FROM  ibds_project  a 
		LEFT JOIN  dbo.IBDS_PRODLINE b ON a.prodlineno=b.prodlineno	
		WHERE a.status=0
    
	--财务产品
	--SELECT * FROM IBDS_F_Product WHERE status=0
	UNION ALL
	--IPMT->IPMT
	SELECT ID,'PLYIPMT' ProdLineNo,'IPMT' ProdLine,'PPIPMT' ProductNo,'IPMT' Product,'PRIPMT' ReleaseNo,'IPMT' Release,'PLIPMT' Type,PLIPMTNo Code,PLIPMT Name,engPLIPMT EngName  FROM dbo.IBDS_PLIPMT WHERE  Status=0
	UNION ALL
	--产品线->产品线
	SELECT ID, 'PLYProdLine' ProdLineNo,'产品线' ProdLine,'PPProdLine' ProductNo,'产品线' Product,'PRProdLine' ReleaseNo,'产品线' Release,'PRODUCTLINE' Type,PRODLINENo Code,PRODLINE Name,engPRODLINE EngName  FROM dbo.ibds_prodline WHERE  Status=0




GO
/****** Object:  View [dbo].[view_SubFeatrue_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO






CREATE VIEW [dbo].[view_SubFeatrue_Notes]
AS
    SELECT
    'SUBFEATURE' AS FormName ,
            'SF' AS Mark ,
            'AA000000' AS AANo ,
            sfeature.SUBFEATURENo ,
            sfeature.SUBFEATURE ,
            sfeature.SUBFEATUREOld ,
            sfeature.engSUBFEATURE ,
            sfeature.PLIPMTNo ,
            ipmt.PLIPMT ,
            ipmt.engPLIPMT ,
            sfeature.PRODLINENo ,
            pline.PRODLINE ,
            pline.engPRODLINE ,
            sfeature.PRODUCTNo ,
            product.Product ,
            product.engProduct ,
            sfeature.VERSIONNo ,
            v.VERSION ,
            v.engVERSION ,
            sfeature.RELEASENo ,
            release.RELEASE ,
            release.engRELEASE ,
            sfeature.FEATURENo ,
            feature.FEATURE ,
            feature.engFEATURE ,
            sfeature.Readers ,
            sfeature.Remark ,
            sfeature.Status ,
            sfeature.SUBFEATURENo AS No ,
            sfeature.SUBFEATURE AS Name ,
            sfeature.engSUBFEATURE AS engName ,
            '' AS COACode ,
            sfeature.SUBFEATURENo + '%' + sfeature.SUBFEATURE + '%'
            + sfeature.engSUBFEATURE AS Info_No ,
            '' AS Info_NoCOA ,
            '' AS Name_COACode ,
            '' AS engName_COACode ,
            '' AS SuperMan ,
            '' AS SuperReaders ,
            '' AS SuperWriters ,
            '' AS Writers
    FROM     
	(select a.SUBFEATURENo,a.SUBFEATURE,a.SUBFEATUREOld,a.engSUBFEATURE,a.FEATURENo,a.Readers,a.Remark,a.Status,a.RELEASENo,a.VERSIONNo,a.PRODUCTNo,a.PRODLINENo,a.PLIPMTNo from IBDS_SUB_FEATRUE a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where not exists(
	select 1 from IBDS_RELEASE c where a.RELEASENo=c.RELEASENo_Software
	) and isnull(MODIFY_DATA,CREATED_DATE) between GETDATE()-1 and GETDATE()
	union all
	select b.SUBFEATURENo,b.SUBFEATURE,b.SUBFEATUREOld,b.engSUBFEATURE,b.FEATURENo,b.Readers,b.Remark,b.Status,t.RELEASENo,t.VERSIONNo,t.PRODUCTNo,t.PRODLINENo,t.PLIPMTNo from (select a.*,b.RELEASENo_Software from IBDS_SUB_FEATRUE a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where RELEASENo_Software is not null and b.RELEASENo_Software<>'' ) t 
	left join IBDS_SUB_FEATRUE b on t.RELEASENo_Software=b.RELEASENo where b.FEATURENo is not null and isnull(b.MODIFY_DATA,b.CREATED_DATE) between GETDATE()-1 and GETDATE()
	)----软件平台下的子特性合并到该R版本下 by lys0670 20190904
	sfeature
            LEFT JOIN IBDS_FEATRUE feature ON feature.FEATURENo = sfeature.FEATURENo
            LEFT JOIN IBDS_RELEASE release ON release.RELEASENo = sfeature.RELEASENo
            LEFT JOIN dbo.IBDS_VERSION v ON v.VERSIONNo = sfeature.VERSIONNo
            LEFT JOIN IBDS_Product product ON product.ProductNo = sfeature.PRODUCTNo
            LEFT JOIN IBDS_PRODLINE pline ON pline.PRODLINENo = sfeature.PRODLINENo
            LEFT JOIN IBDS_PLIPMT ipmt ON ipmt.PLIPMTNo = sfeature.PLIPMTNo
			--where isnull(sfeature.MODIFY_DATA,sfeature.CREATED_DATE) between GETDATE()-1 and GETDATE()
			;







GO
/****** Object:  View [dbo].[view_SUBSYSTEM_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO






CREATE VIEW [dbo].[view_SUBSYSTEM_Notes]
AS
    SELECT  
            'SUBSYSTEM' AS FormName ,
            'SS' AS Mark ,
            'AA000000' AS AANo ,
            s.SUBSYSTEMNo ,
            s.SUBSYSTEM ,
            s.SUBSYSTEMOld ,
            s.engSUBSYSTEM ,
            s.PLIPMTNo ,
            i.PLIPMT ,
            i.engPLIPMT ,
            s.PRODLINENo ,
            pl.PRODLINE ,
            pl.engPRODLINE ,
            s.PRODUCTNo ,
            p.Product ,
            p.engProduct ,
            s.VERSIONNo ,
            v.VERSION ,
            v.engVERSION ,
            s.RELEASENo ,
            r.RELEASE ,
            r.engRELEASE ,
            s.Readers ,
            s.Remark ,
            s.Status ,
            s.SUBSYSTEMNo AS No ,
            s.SUBSYSTEM AS Name ,
            s.engSUBSYSTEM AS engName ,
            '' AS COACode ,
            s.SUBSYSTEMNo + '%' + s.SUBSYSTEM + '%' + s.engSUBSYSTEM AS Info_No ,
            '' AS Info_NoCOA ,
            '' AS Name_COACode ,
            '' AS engName_COACode ,
            '' AS SuperMan ,
            '' AS SuperReaders ,
            '' AS SuperWriters ,
            '' AS Writers
    FROM     
	(select a.SUBSYSTEMNo,a.SUBSYSTEM,a.SUBSYSTEMOld,a.engSUBSYSTEM,a.Readers,a.Remark,a.Status,a.RELEASENo,a.VERSIONNo,a.PRODUCTNo,a.PRODLINENo,a.PLIPMTNo from IBDS_SUB_SYSTEM a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where not exists(
	select 1 from IBDS_RELEASE c where a.RELEASENo=c.RELEASENo_Software
	) and isnull(MODIFY_DATA,CREATED_DATE) between GETDATE()-1 and GETDATE()
	union all
	select b.SUBSYSTEMNo,b.SUBSYSTEM,b.SUBSYSTEMOld,b.engSUBSYSTEM,b.Readers,b.Remark,b.Status,t.RELEASENo,t.VERSIONNo,t.PRODUCTNo,t.PRODLINENo,t.PLIPMTNo from (select a.*,b.RELEASENo_Software from IBDS_SUB_SYSTEM a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where RELEASENo_Software is not null and b.RELEASENo_Software<>'' ) t 
	left join IBDS_SUB_SYSTEM b on t.RELEASENo_Software=b.RELEASENo where b.SUBSYSTEMNo is not null and isnull(b.MODIFY_DATA,b.CREATED_DATE) between GETDATE()-1 and GETDATE()
	)----软件平台下的子系统合并到该R版本下 by lys0670 20190904
	s
            LEFT JOIN IBDS_RELEASE r ON s.RELEASENo = r.RELEASENo
            LEFT JOIN IBDS_VERSION v ON s.VERSIONNo = v.VERSIONNo
            LEFT JOIN IBDS_Product p ON s.PRODUCTNo = p.ProductNo
            LEFT JOIN IBDS_PRODLINE pl ON s.PRODLINENo = pl.PRODLINENo
            LEFT JOIN IBDS_PLIPMT i ON i.PLIPMTNo = s.PLIPMTNo
	--where isnull(s.MODIFY_DATA,s.CREATED_DATE) between GETDATE()-1 and GETDATE();







GO
/****** Object:  View [dbo].[view_Team_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO





CREATE VIEW [dbo].[view_Team_Notes]
AS
    SELECT
    'TEAM' AS FormName ,
            'TM' AS Mark ,
            'AA000000' AS AANo ,
            team.TEAMNo ,
            team.TEAM ,
            team.TEAMOld ,
            team.engTEAM ,
            team.PLIPMTNo ,
            ipmt.PLIPMT ,
            ipmt.engPLIPMT ,
            team.PRODLINENo ,
            line.PRODLINE ,
            line.engPRODLINE ,
            team.PRODUCTNo ,
            pd.Product ,
            pd.engProduct ,
            team.VERSIONNo ,
            v.VERSION ,
            v.engVERSION ,
            team.RELEASENo ,
            r.RELEASE ,
            r.engRELEASE ,
            team.Readers ,
            team.Remark ,
            team.Status ,
            team.TEAMNo AS No ,
            team.TEAM AS Name ,
            team.engTEAM AS engName ,
            '' AS COACode ,
            team.TEAMNo + '%' + team.TEAM + '%' + team.engTEAM AS Info_No ,
            '' AS Info_NoCOA ,
            '' AS Name_COACode ,
            '' AS engName_COACode ,
            '' AS SuperMan ,
            '' AS SuperReaders ,
            '' AS SuperWriters ,
            '' AS Writers
    FROM     
	(select a.TEAMNo,a.TEAM,a.TEAMOld,a.engTEAM,a.Readers,a.Remark,a.Status,a.RELEASENo,a.VERSIONNo,a.PRODUCTNo,a.PRODLINENo,a.PLIPMTNo from IBDS_TEAM a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where not exists(
	select 1 from IBDS_RELEASE c where a.RELEASENo=c.RELEASENo_Software
	) and isnull(MODIFY_DATA,CREATED_DATE) between GETDATE()-1 and GETDATE()
	union all
	select b.TEAMNo,b.TEAM,b.TEAMOld,b.engTEAM,b.Readers,b.Remark,b.Status,t.RELEASENo,t.VERSIONNo,t.PRODUCTNo,t.PRODLINENo,t.PLIPMTNo from (select a.*,b.RELEASENo_Software from IBDS_TEAM a left join IBDS_RELEASE b on a.RELEASENo=b.RELEASENo where RELEASENo_Software is not null and b.RELEASENo_Software<>'' ) t 
	left join IBDS_TEAM b on t.RELEASENo_Software=b.RELEASENo where b.TEAMNo is not null and isnull(b.MODIFY_DATA,b.CREATED_DATE) between GETDATE()-1 and GETDATE()
	)----软件平台下的项目组合并到该R版本下 by lys0670 20190904
	team
            LEFT JOIN IBDS_RELEASE r ON r.RELEASENo = team.RELEASENo
            LEFT JOIN dbo.IBDS_VERSION v ON v.VERSIONNo = team.VERSIONNo
            LEFT JOIN IBDS_Product pd ON pd.ProductNo = team.PRODUCTNo
            LEFT JOIN IBDS_PRODLINE line ON line.PRODLINENo = team.PRODLINENo
            LEFT JOIN IBDS_PLIPMT ipmt ON ipmt.PLIPMTNo = team.PLIPMTNo
			--where isnull(team.MODIFY_DATA,team.CREATED_DATE) between GETDATE()-1 and GETDATE()
			;






GO
/****** Object:  View [dbo].[view_Version_Notes]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO






CREATE VIEW [dbo].[view_Version_Notes]
AS
    SELECT DISTINCT 
            'VERSION' AS FormName ,
            'PV' AS Mark ,
            'AA000000' AS AANo ,
            v.[VERSIONNo] ,
            v.[VERSION] ,
            v.[P] ,
            v.[V] ,
            v.[VERSIONOld] ,
            v.[engVERSION] ,
            v.PLIPMTNo ,
            ipmt.PLIPMT ,
            ipmt.engPLIPMT ,
            pLine.PRODLINENo ,
            pLine.PRODLINE ,
            pLine.engPRODLINE ,
            p.ProductNo ,
            p.Product ,--产品中文名称
            p.engProduct ,
            v.[Match] ,
            v.[VersionMatch] ,
            dbo.[F_ReplaceUser](v.[ProdDataID]) ProdDataID ,
            dbo.[F_ReplaceUser](v.[POP_ID])POP_ID ,
            dbo.[F_ReplaceUser](v.[CMO_ID])CMO_ID ,
            dbo.[F_ReplaceUser](v.[PilotProduction_Mnger])PilotProduction_Mnger ,
            dbo.[F_ReplaceUser](v.[TechSupport_Mnger])TechSupport_Mnger ,
            dbo.[F_ReplaceUser](v.[Oversea_Mnger]) Oversea_Mnger,
            v.Readers ,
            v.[Remark] ,
            v.[Status] ,
            pLine.PRODLINENo AS No ,
            pLine.PRODLINE AS Name ,
            pLine.engPRODLINE AS engName ,
            '' AS COACode ,
            pLine.PRODLINENo + '%' + pLine.PRODLINE + '%' + pLine.engPRODLINE AS Info_No ,
            '' AS Info_NoCOA ,
            '' AS Name_COACode ,
            '' AS engName_COACode ,
            '' AS SuperMan ,
            '' AS SuperReaders ,
            '' AS SuperWriters ,
            '' AS Writers
    FROM    IBDS_VERSION v
            LEFT JOIN IBDS_Product p ON v.PRODUCTNo = p.ProductNo
            LEFT JOIN IBDS_PRODLINE pLine ON v.PRODLINENo = pLine.PRODLINENo
            LEFT JOIN IBDS_PLIPMT ipmt ON ipmt.PLIPMTNo = v.PLIPMTNo
			 where isnull(v.MODIFY_DATE,v.CREATE_DATE) between GETDATE()-1 and GETDATE()
			;

			





GO
/****** Object:  View [dbo].[view_VRProcess]    Script Date: 2019/9/9 16:58:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE  VIEW [dbo].[view_VRProcess]
AS 
SELECT  a.ID, 
		a.[Process_Code] ,
        a.[PLIPMTNo] ,
        a.[ProdLineNo] ,
        a.[ProductNo] ,
        a.[IPMTSecretary] ,
        a.[NewPV] ,
        a.[VersionNewNo] ,
        a.[VersionNew] ,
        a.[engVersionNew] ,
        a.[ModPV] ,
        a.[VersionOldNo] ,
        a.[VersionOld] ,
        a.[engVersionOld] ,
        a.[VersionNow] ,
        a.[engVersionNow] ,
        a.[DelPV] ,
        a.[VersionDelNo] ,
        a.[Versiondel] ,
        a.[engVersionDel] ,
        a.[PVIfDelBelow] ,
        a.[VersionNo] ,
        a.[NewPR] ,
        a.[ReleaseNewNo] ,
        a.[ReleaseNew] ,
        a.[engReleaseNew] ,
        a.[PDTNo] ,
        a.[ReleaseNo_Software] ,
		plrelease.RELEASE Release_Software,
        a.[ModPR] ,
        a.[ReleaseOldNo] ,
        a.[ReleaseOld] ,
        a.[engReleaseOld] ,
        a.[ReleaseNow] ,
        a.[engReleaseNow] ,
        a.[ReleaseNo_SoftwareNow] ,
		plreleasenow.RELEASE Release_SoftwareNow,
        a.[DelPR] ,
        a.[ReleaseDelNo] ,
        a.[ReleaseDel] ,
        a.[engReleaseDel] ,
        a.[PRIfDelBelow] ,
        a.[copyto] ,
        a.[Remark] ,
		b.ID processID,
        b.[APPLY_CODE] ,
        b.[Status] ,
        b.[Handler] ,
        b.[Instanse_ID] ,
        b.[CurrentNode] ,
        b.[First_Sign] ,
        b.[First_Date] ,
        b.[IPMT_Sign] ,
        b.[IPMT_Date] ,
        b.[IPMT_Opinion] ,
        b.[IPMT_Result],
		b.Status_Desc
FROM    dbo.IBDS_VR_APPLY a
        LEFT JOIN dbo.IBDS_VR_PROCESS b ON a.Process_Code = b.APPLY_CODE
		left join (select RELEASENo,RELEASE from IBDS_RELEASE where PRODLINENo='PL000024') plrelease on a.RELEASENo_Software=plrelease.RELEASENo--对应的软件平台版本;
		left join (select RELEASENo,RELEASE from IBDS_RELEASE where PRODLINENo='PL000024') plreleasenow ON a.RELEASENo_Software=plrelease.RELEASENo--对应的软件平台版本;




GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "IBDS_UserGroup"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 145
               Right = 222
            End
            DisplayFlags = 280
            TopColumn = 5
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_AdmpNotesRelation'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_AdmpNotesRelation'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "IBDS_FPRODUCT"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 145
               Right = 248
            End
            DisplayFlags = 280
            TopColumn = 11
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'view_FPRODUCT_Notes'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'view_FPRODUCT_Notes'
GO
