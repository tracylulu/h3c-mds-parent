
--部门
set identity_insert tbl_2_9_EN on
insert into tbl_2_9_EN
([Version_ID],ID
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
select [Version_ID],ID
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
           ,[uda_9_506] from IBDSDB.DBO.tbl_2_9_EN 
set identity_insert tbl_2_9_EN off

--人员
set identity_insert tbl_2_10_EN on
insert into tbl_2_10_EN
([Version_ID],ID
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
           ,[uda_10_507]
           ,[uda_10_508]
           ,[uda_10_509]
           ,[uda_10_510]
           ,[uda_10_511]
           ,[uda_10_512]
           ,[uda_10_513]
           ,[uda_10_514]
           ,[uda_10_515])
select u.[Version_ID],u.ID
           ,u.[Status_ID]
           ,u.[ValidationStatus_ID]
           ,u.[Name]
           ,u.[Code]
           ,u.[ChangeTrackingMask]
           ,u.[EnterDTM]
           ,u.[EnterUserID]
           ,u.[EnterVersionID]
           ,u.[LastChgDTM]
           ,u.[LastChgUserID]
           ,u.[LastChgVersionID]
           ,u.[AsOf_ID]
           ,u.[MUID]
           --,u.[uda_10_507]
		   ,nd.id as uda_10_507
           ,u.[uda_10_508]
           ,u.[uda_10_509]
           ,u.[uda_10_510]
           ,u.[uda_10_511]
           ,u.[uda_10_512]
           ,u.[uda_10_513]
           ,u.[uda_10_514]
           ,u.[uda_10_515] 
		   from IBDSDB.DBO.tbl_2_10_EN u left join IBDSDB.dbo.tbl_2_9_EN d on u.[uda_10_507]=d.id
		   left join tbl_2_9_EN nd on d.code=nd.code
set identity_insert tbl_2_10_EN off



--菜单
set identity_insert IBDS_resource on
insert into IBDS_resource(
[HRES_ID],[HRES_PCODE]
           ,[HRES_NAME]
           ,[HRES_CODE]
           ,[HRES_CONTENT]
           ,[HRES_CREATE_USER]
           ,[HRES_CREATE_DATE]
           ,[HRES_MODIFY_USER]
           ,[HRES_MODIFY_DATE]
           ,[HRES_SORT]
           ,[RESOURCE_TYPE]
           ,[FLAG]
           ,[REMARK]
           ,[IsShow]
           ,[HRES_TYPE]
)
select [HRES_ID],[HRES_PCODE]
           ,[HRES_NAME]
           ,[HRES_CODE]
           ,[HRES_CONTENT]
           ,[HRES_CREATE_USER]
           ,[HRES_CREATE_DATE]
           ,[HRES_MODIFY_USER]
           ,[HRES_MODIFY_DATE]
           ,[HRES_SORT]
           ,[RESOURCE_TYPE]
           ,[FLAG]
           ,[REMARK]
           ,[IsShow]
           ,[HRES_TYPE] from IBDSDB.dbo.IBDS_resource
set identity_insert IBDS_resource off




--角色
set identity_insert IBDS_role on
insert into IBDS_role(
[HRL_ID],[HRL_NAME]
           ,[HRL_CODE]
           ,[HRL_CREATE_USER]
           ,[HRL_CREATE_DATE]
           ,[HRL_MODIFY_USER]
           ,[HRL_MODIFY_DATE]
           ,[FLAG]
           ,[REMARK]
)
select [HRL_ID],[HRL_NAME]
           ,[HRL_CODE]
           ,[HRL_CREATE_USER]
           ,[HRL_CREATE_DATE]
           ,[HRL_MODIFY_USER]
           ,[HRL_MODIFY_DATE]
           ,[FLAG]
           ,[REMARK] from IBDSDB.dbo.IBDS_role
set identity_insert IBDS_role off



--角色资源
set identity_insert IBDS_Role_Resource on
insert into [IBDS_Role_Resource](
[HRRR_ID],[HRRR_HRL_CODE] ,[HRRR_HRES_CODE]
)
select [HRRR_ID],[HRRR_HRL_CODE] ,[HRRR_HRES_CODE] from IBDSDB.[dbo].[IBDS_Role_Resource]
set identity_insert IBDS_Role_Resource off


--用户角色
SET IDENTITY_INSERT IBDS_User_Role ON 
insert into [IBDS_User_Role](
[HURR_ID],[HURR_HUL_CODE]
           ,[HURR_HRL_CODE]
)
select [HURR_ID],[HURR_HUL_CODE]
           ,[HURR_HRL_CODE] from IBDSDB.[dbo].[IBDS_User_Role]
SET IDENTITY_INSERT IBDS_User_Role OFF



--用户资源
SET IDENTITY_INSERT IBDS_User_Resource ON
insert into [IBDS_User_Resource](
[ID],[HRRR_HUL_CODE]
           ,[HRRR_HRES_CODE]
)
select [ID],[HRRR_HUL_CODE]
           ,[HRRR_HRES_CODE] from IBDSDB.[dbo].[IBDS_User_Resource]
SET IDENTITY_INSERT IBDS_User_Resource OFF



--字典表
SET IDENTITY_INSERT IBDS_DIC ON
insert into IBDS_DIC(
ID,[DIC_NAME]
           ,[DIC_VALUE]
           ,[DIC_TypeCode]
           ,[DIC_TypeName]
           ,[FLAG]
           ,[Remark]
           ,[Creator]
           ,[CreateTime]
           ,[Modifier]
           ,[ModifyTime]
)
select ID,[DIC_NAME]
           ,[DIC_VALUE]
           ,[DIC_TypeCode]
           ,[DIC_TypeName]
           ,[FLAG]
           ,[Remark]
           ,[Creator]
           ,[CreateTime]
           ,[Modifier]
           ,[ModifyTime] from IBDSDB.[dbo].IBDS_DIC
SET IDENTITY_INSERT IBDS_DIC OFF



--流程配置
SET IDENTITY_INSERT IBDS_PROCESS_CONFIG ON
insert into IBDS_PROCESS_CONFIG(
ID,[CODE]
           ,[NAME]
           ,[TYPE]
           ,[NOTE]
           ,[ORDER_BY]
           ,[CREATE_DATE]
           ,[CREATE_USER]
           ,[MODIFY_DATE]
           ,[MODIFY_USER]
)
SELECT ID,[CODE]
           ,[NAME]
           ,[TYPE]
           ,[NOTE]
           ,[ORDER_BY]
           ,[CREATE_DATE]
           ,[CREATE_USER]
           ,[MODIFY_DATE]
           ,[MODIFY_USER] FROM IBDSDB.dbo.IBDS_PROCESS_CONFIG
SET IDENTITY_INSERT IBDS_PROCESS_CONFIG OFF

SET IDENTITY_INSERT IBDS_PROCESS_CONFIG_ITEM ON
insert into IBDS_PROCESS_CONFIG_ITEM(
ID,[CODE]
           ,[CONFIG_CODE]
           ,[CONTENT]
           ,[TYPE]
           ,[NOTE]
           ,[PDT_CODE]
           ,[FPROD_PERSON]
           ,[PDT_MGN]
           ,[ORDER_BY]
           ,[CREATE_DATE]
           ,[CREATE_USER]
           ,[MODIFY_DATE]
           ,[MODIFY_USER]
           ,[State]
)
SELECT ID,[CODE]
           ,[CONFIG_CODE]
           ,[CONTENT]
           ,[TYPE]
           ,[NOTE]
           ,[PDT_CODE]
           ,[FPROD_PERSON]
           ,[PDT_MGN]
           ,[ORDER_BY]
           ,[CREATE_DATE]
           ,[CREATE_USER]
           ,[MODIFY_DATE]
           ,[MODIFY_USER]
           ,[State] FROM IBDSDB.dbo.IBDS_PROCESS_CONFIG_ITEM
SET IDENTITY_INSERT IBDS_PROCESS_CONFIG_ITEM OFF



SET IDENTITY_INSERT IBDS_PROCESS_PERSON ON
insert into IBDS_PROCESS_PERSON(
ID,[CODE]
           ,[CHECKER_ID]
           ,[CHECKER_NAME]
           ,[TYPE]
           ,[NOTE]
           ,[PROCESS_CODE]
           ,[PROCESS_ROLE_CODE]
           ,[DEPT_CODE]
           ,[ORDER_BY]
           ,[CREATE_DATE]
           ,[CREATE_USER]
           ,[MODIFY_DATE]
           ,[MODIFY_USER]
)
SELECT ID,[CODE]
           ,[CHECKER_ID]
           ,[CHECKER_NAME]
           ,[TYPE]
           ,[NOTE]
           ,[PROCESS_CODE]
           ,[PROCESS_ROLE_CODE]
           ,[DEPT_CODE]
           ,[ORDER_BY]
           ,[CREATE_DATE]
           ,[CREATE_USER]
           ,[MODIFY_DATE]
           ,[MODIFY_USER] FROM  IBDSDB.dbo.IBDS_PROCESS_PERSON
SET IDENTITY_INSERT IBDS_PROCESS_PERSON OFF

SET IDENTITY_INSERT IBDS_MAXCODE ON
insert into IBDS_MAXCODE(
[project_name]
           ,[prefix]
           ,[code],ID
)
select [project_name]
           ,[prefix]
           ,[code],ID FROM  IBDSDB.dbo.IBDS_MAXCODE
SET IDENTITY_INSERT IBDS_MAXCODE OFF




--字段配置表
SET IDENTITY_INSERT IBDS_ColunmConfig ON
insert into [IBDS_ColunmConfig](
ID,[ColumnCode]
           ,[ColumnName]
           ,[ColumnGroup]
           ,[GroupOrder]
           ,[QueryOrder]
           ,[AddOrder]
           ,[EditOrder]
           ,[ColumnOrder]
           ,[Type]
           ,[AddFlag]
           ,[EditFlag]
           ,[Flag]
           ,[QueryFlag]
           ,[ColumnFlag]
           ,[EditStatus]
           ,[IPMTCheck]
           ,[CreateUser]
           ,[CreateDate]
           ,[ModifyUser]
           ,[ModifyDate]
           ,[Remark]
           ,[ColumnClass]
           ,[ColumnType]
           ,[ColumnValidate]
           ,[ColumnMessage]
           ,[ValidateLength]
           ,[IsReferenceShow]
)
select ID,[ColumnCode]
           ,[ColumnName]
           ,[ColumnGroup]
           ,[GroupOrder]
           ,[QueryOrder]
           ,[AddOrder]
           ,[EditOrder]
           ,[ColumnOrder]
           ,[Type]
           ,[AddFlag]
           ,[EditFlag]
           ,[Flag]
           ,[QueryFlag]
           ,[ColumnFlag]
           ,[EditStatus]
           ,[IPMTCheck]
           ,[CreateUser]
           ,[CreateDate]
           ,[ModifyUser]
           ,[ModifyDate]
           ,[Remark]
           ,[ColumnClass]
           ,[ColumnType]
           ,[ColumnValidate]
           ,[ColumnMessage]
           ,[ValidateLength]
           ,[IsReferenceShow] from IBDSDB.[dbo].[IBDS_ColunmConfig]
SET IDENTITY_INSERT IBDS_ColunmConfig OFF




--域群组
SET IDENTITY_INSERT tbDomainGroup ON
insert into tbDomainGroup(
DGID,[ID]
           ,[GroupName]
           ,[AdminName]
           ,[GroupDesc]
           ,[Member]
           ,[SyncTime]
) 
select DGID,[ID]
           ,[GroupName]
           ,[AdminName]
           ,[GroupDesc]
           ,[Member]
           ,[SyncTime] from IBDSDB.[dbo].tbDomainGroup
SET IDENTITY_INSERT tbDomainGroup OFF
--域群组关系
SET IDENTITY_INSERT IBDS_UserGroup ON
insert into [dbo].IBDS_UserGroup(
ID,[NotesGroup]
           ,[AdmpGroup]
           ,[GroupUserCode]
           ,[CreateUser]
           ,[CreateDate]
           ,[ModifyUser]
           ,[ModifyDate]
           ,[Status]
)
select ID,[NotesGroup]
           ,[AdmpGroup]
           ,[GroupUserCode]
           ,[CreateUser]
           ,[CreateDate]
           ,[ModifyUser]
           ,[ModifyDate]
           ,[Status] from IBDSDB.[dbo].IBDS_UserGroup
SET IDENTITY_INSERT IBDS_UserGroup OFF



--域账户
SET IDENTITY_INSERT tbDomainAccount ON
insert into tbDomainAccount(
DAID,[SamAccount]
           ,[DisplayName]
           ,[IsActive]
)
select DAID,[SamAccount]
           ,[DisplayName]
           ,[IsActive] from IBDSDB.[dbo].tbDomainAccount
SET IDENTITY_INSERT tbDomainAccount OFF


--select * from tbl_2_9_EN
--select * from tbl_2_10_EN
--select * from IBDS_resource
--select * from IBDS_role
--select * from IBDS_Role_Resource
--SELECT * FROM IBDS_User_Role
--SELECT * FROM IBDS_User_Resource
--SELECT * FROM IBDS_DIC
--SELECT * FROM IBDS_PROCESS_CONFIG
--SELECT * FROM IBDS_PROCESS_CONFIG_ITEM
--SELECT * FROM IBDS_PROCESS_PERSON
--SELECT * FROM IBDS_MAXCODE
--SELECT * FROM IBDS_ColunmConfig
--SELECT * FROM tbDomainGroup
--SELECT * FROM IBDS_UserGroup
--SELECT * FROM tbDomainAccount



