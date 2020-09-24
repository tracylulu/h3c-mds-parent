CREATE TABLE [dbo].[IBDS_MODULE] (
  [ID] int NOT NULL identity(1,1),
  [MODULENo] nvarchar(100) NULL,
  [MODULE] nvarchar(100) NULL,
  [MODULEOld] nvarchar(500) NULL,
  [engMODULE] nvarchar(100) NULL,
  [PLIPMTNo] nvarchar(100) NULL,
  [PRODLINENo] nvarchar(100) NULL,
  [PRODUCTNo] nvarchar(100) NULL,
  [VERSIONNo] nvarchar(100) NULL,
  [RELEASENo] nvarchar(100) NULL,
  [SUBSYSTEMNo] nvarchar(100) NULL,
  [Readers] nvarchar(100) NULL,
  [Remark] nvarchar(100) NULL,
  [Status] nvarchar(50) NULL,
  [CREATED_USER] nvarchar(100) NULL,
  [CREATED_DATE] datetime NULL,
  [MODIFY_USER] nvarchar(100) NULL,
  [MODIFY_DATA] datetime  NULL,
	[STANDBY1] nvarchar(255) NULL,
  [STANDBY2] nvarchar(255) NULL,
  [STANDBY3] nvarchar(255) NULL,
  [STANDBY4] nvarchar(255) NULL,
  [STANDBY5] nvarchar(255) NULL,
  [STANDBY6] nvarchar(255) NULL,
  [STANDBY7] nvarchar(255) NULL,
  [STANDBY8] nvarchar(255) NULL,
  [STANDBY9] nvarchar(255) NULL,
  [STANDBY10] nvarchar(255) NULL,
  PRIMARY KEY CLUSTERED ([ID])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)
GO

EXEC sp_addextendedproperty
'MS_Description', N'主键',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'模块内码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'MODULENo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'模块中文名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'MODULE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'模块曾用名',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'MODULEOld'
GO

EXEC sp_addextendedproperty
'MS_Description', N'模块英文名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'engMODULE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属IPMT',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'PLIPMTNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属研发产品线',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'PRODLINENo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属产品',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'PRODUCTNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属产品V级',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'VERSIONNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属产品R级',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'RELEASENo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属子系统',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'SUBSYSTEMNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'能够看到此文档的人员',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'Readers'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备注',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'Remark'
GO

EXEC sp_addextendedproperty
'MS_Description', N'状态',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'Status'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'CREATED_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'CREATED_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'MODIFY_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'MODIFY_DATA'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段1',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'STANDBY1'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段2',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'STANDBY2'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段3',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'STANDBY3'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段4',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'STANDBY4'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段5',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'STANDBY5'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段6',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'STANDBY6'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段7',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'STANDBY7'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段8',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'STANDBY8'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段9',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'STANDBY9'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段10',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_MODULE',
'COLUMN', N'STANDBY10'
