--部门
insert into tbl_2_9_EN
([Version_ID]
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
           ,[uda_9_506] from [H3CMDS02-VS].IBDSDB.mdm.tbl_2_9_EN

--人员
insert into tbl_2_10_EN
([Version_ID]
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
select u.[Version_ID]
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
		   from [H3CMDS02-VS].IBDSDB.mdm.tbl_2_10_EN u left join [H3CMDS02-VS].IBDSDB.mdm.tbl_2_9_EN d on u.[uda_10_507]=d.id
		   left join tbl_2_9_EN nd on d.code=nd.code


--菜单
insert into IBDS_resource
select [HRES_PCODE]
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
           ,[HRES_TYPE] from [H3CMDS02-VS].IBDSDB.dbo.IBDS_resource

--角色
insert into IBDS_role
select [HRL_NAME]
           ,[HRL_CODE]
           ,[HRL_CREATE_USER]
           ,[HRL_CREATE_DATE]
           ,[HRL_MODIFY_USER]
           ,[HRL_MODIFY_DATE]
           ,[FLAG]
           ,[REMARK] from [H3CMDS02-VS].IBDSDB.dbo.IBDS_role

--角色资源
insert into [IBDS_Role_Resource]
select [HRRR_HRL_CODE] ,[HRRR_HRES_CODE] from [H3CMDS02-VS].IBDSDB.[dbo].[IBDS_Role_Resource]

--用户角色
insert into [IBDS_User_Role]
select [HURR_HUL_CODE]
           ,[HURR_HRL_CODE] from [H3CMDS02-VS].IBDSDB.[dbo].[IBDS_User_Role]

--用户资源
insert into [IBDS_User_Resource]
select [HRRR_HUL_CODE]
           ,[HRRR_HRES_CODE] from [H3CMDS02-VS].IBDSDB.[dbo].[IBDS_User_Resource]

--字典表
insert into IBDS_DIC
select [DIC_NAME]
           ,[DIC_VALUE]
           ,[DIC_TypeCode]
           ,[DIC_TypeName]
           ,[FLAG]
           ,[Remark]
           ,[Creator]
           ,[CreateTime]
           ,[Modifier]
           ,[ModifyTime] from [H3CMDS02-VS].IBDSDB.[dbo].IBDS_DIC


--流程配置
insert into IBDS_PROCESS_CONFIG
SELECT [CODE]
           ,[NAME]
           ,[TYPE]
           ,[NOTE]
           ,[ORDER_BY]
           ,[CREATE_DATE]
           ,[CREATE_USER]
           ,[MODIFY_DATE]
           ,[MODIFY_USER] FROM [H3CMDS02-VS].IBDSDB.dbo.IBDS_PROCESS_CONFIG

insert into IBDS_PROCESS_CONFIG_ITEM
SELECT [CODE]
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
           ,[State] FROM [H3CMDS02-VS].IBDSDB.dbo.IBDS_PROCESS_CONFIG_ITEM

insert into IBDS_PROCESS_PERSON
SELECT [CODE]
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
           ,[MODIFY_USER] FROM  [H3CMDS02-VS].IBDSDB.dbo.IBDS_PROCESS_PERSON

insert into IBDS_MAXCODE
select [project_name]
           ,[prefix]
           ,[code] FROM  [H3CMDS02-VS].IBDSDB.dbo.IBDS_MAXCODE


--字段配置表
insert into [IBDS_ColunmConfig]
select [ColumnCode]
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
           ,[IsReferenceShow] from [H3CMDS02-VS].IBDSDB.[dbo].[IBDS_ColunmConfig]


--域群组
insert into tbDomainGroup 
select [ID]
           ,[GroupName]
           ,[AdminName]
           ,[GroupDesc]
           ,[Member]
           ,[SyncTime] from [H3CMDS02-VS].IBDSDB.[dbo].tbDomainGroup

--域群组关系
insert into [dbo].IBDS_UserGroup
select [NotesGroup]
           ,[AdmpGroup]
           ,[GroupUserCode]
           ,[CreateUser]
           ,[CreateDate]
           ,[ModifyUser]
           ,[ModifyDate]
           ,[Status] from [H3CMDS02-VS].IBDSDB.[dbo].IBDS_UserGroup

--域账户
insert into tbDomainAccount
select [SamAccount]
           ,[DisplayName]
           ,[IsActive] from [H3CMDS02-VS].IBDSDB.[dbo].tbDomainAccount

