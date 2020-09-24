
--角色表
CREATE TABLE [dbo].[IBDS_Role] (
  [HRL_ID] int NOT NULL identity(1,1),
  [HRL_NAME] nvarchar(255) NULL,
  [HRL_CODE] nvarchar(255) NULL,
  [HRL_CREATE_USER] nvarchar(255) NOT NULL,
  [HRL_CREATE_DATE] datetime NOT NULL,
  [HRL_MODIFY_USER] nvarchar(255) NOT NULL,
  [HRL_MODIFY_DATE] datetime NOT NULL,
  [FLAG] int NULL,
  [REMARK] nvarchar(255) NULL,
  PRIMARY KEY CLUSTERED ([HRL_ID])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)
GO

EXEC sp_addextendedproperty
'MS_Description', N'角色id',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role',
'COLUMN', N'HRL_ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'角色名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role',
'COLUMN', N'HRL_NAME'
GO

EXEC sp_addextendedproperty
'MS_Description', N'角色编码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role',
'COLUMN', N'HRL_CODE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role',
'COLUMN', N'HRL_CREATE_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role',
'COLUMN', N'HRL_CREATE_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'修改人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role',
'COLUMN', N'HRL_MODIFY_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'修改时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role',
'COLUMN', N'HRL_MODIFY_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'状态',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role',
'COLUMN', N'FLAG'
GO

EXEC sp_addextendedproperty
'MS_Description', N'描述',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role',
'COLUMN', N'REMARK'


--资源表
CREATE TABLE [dbo].[IBDS_Resource] (
  [HRES_ID] int NOT NULL identity(1,1),
  [HRES_PCODE] nvarchar(50) NULL,
  [HRES_NAME] nvarchar(100) NULL,
  [HRES_CODE] nvarchar(50) NULL,
  [HRES_CONTENT] nvarchar(255) NULL,
  [HRES_CREATE_USER] nvarchar(255) NOT NULL,
  [HRES_CREATE_DATE] datetime NOT NULL,
  [HRES_MODIFY_USER] nvarchar(255) NOT NULL,
  [HRES_MODIFY_DATE] datetime NOT NULL,
  [HRES_SORT] int NULL,
  [RESOURCE_TYPE] nvarchar(50) NULL,
  [FLAG] nvarchar(50) NULL,
  [REMARK] nvarchar(255) NULL,
  PRIMARY KEY CLUSTERED ([HRES_ID])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)
GO

EXEC sp_addextendedproperty
'MS_Description', N'主键id',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'HRES_ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属父编码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'HRES_PCODE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'资源名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'HRES_NAME'
GO

EXEC sp_addextendedproperty
'MS_Description', N'资源编码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'HRES_CODE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'内容',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'HRES_CONTENT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'HRES_CREATE_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'HRES_CREATE_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'修改人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'HRES_MODIFY_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'修改时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'HRES_MODIFY_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'排序',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'HRES_SORT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'资源类型',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'RESOURCE_TYPE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'状态',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Resource',
'COLUMN', N'FLAG'


--用户角色关联表
CREATE TABLE [dbo].[IBDS_User_Role] (
  [HURR_ID] int NOT NULL identity(1,1),
  [HURR_HUL_CODE] varchar(255) NOT NULL,
  [HURR_HRL_CODE] varchar(255) NOT NULL,
  PRIMARY KEY CLUSTERED ([HURR_ID])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)
GO

EXEC sp_addextendedproperty
'MS_Description', N'主键id',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_User_Role',
'COLUMN', N'HURR_ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'用户code',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_User_Role',
'COLUMN', N'HURR_HUL_CODE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'角色code',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_User_Role',
'COLUMN', N'HURR_HRL_CODE'

--角色资源关联表
CREATE TABLE [dbo].[IBDS_Role_Resource] (
  [HRRR_ID] int NOT NULL identity(1,1),
  [HRRR_HRL_CODE] varchar(100) NOT NULL,
  [HRRR_HRES_CODE] varchar(100) NOT NULL,
  PRIMARY KEY CLUSTERED ([HRRR_ID])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)
GO

EXEC sp_addextendedproperty
'MS_Description', N'主键id',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role_Resource',
'COLUMN', N'HRRR_ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'角色code',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role_Resource',
'COLUMN', N'HRRR_HRL_CODE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'资源code',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_Role_Resource',
'COLUMN', N'HRRR_HRES_CODE'