CREATE TABLE [dbo].[IBDS_PROJECT] (
  [ID] int NOT NULL identity(1,1),
  [PROJECTNo] nvarchar(100) NULL,
  [PROJECT] nvarchar(100) NULL,
  [PROJECTOld] nvarchar(500) NULL,
  [engPROJECT] nvarchar(100) NULL,
  [PROJECTAlias] nvarchar(100) NULL,
  [IfPlan] nvarchar(100) NULL,
  [PROJECTCOACode] nvarchar(100) NULL,
  [PROJECTTypeNo] nvarchar(100) NULL,
  [PLIPMTNo] nvarchar(100) NULL,
  [PRODLINENo] nvarchar(100) NULL,
  [PDTNo] nvarchar(100) NULL,
  [Readers] nvarchar(100) NULL,
  [Remark] nvarchar(100) NULL,
  [Match] nvarchar(100) NULL,
  [PROJECTMatch] nvarchar(100) NULL,
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
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'研发项目内码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'PROJECTNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'研发项目中文名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'PROJECT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'研发项目曾用名',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'PROJECTOld'
GO

EXEC sp_addextendedproperty
'MS_Description', N'研发项目英文名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'engPROJECT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'研发项目代号',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'PROJECTAlias'
GO

EXEC sp_addextendedproperty
'MS_Description', N'是否规划中',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'IfPlan'
GO

EXEC sp_addextendedproperty
'MS_Description', N'研发项目财务编码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'PROJECTCOACode'
GO

EXEC sp_addextendedproperty
'MS_Description', N'项目种类',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'PROJECTTypeNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属IPMT',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'PLIPMTNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属研发产品线',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'PRODLINENo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属PDT',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'PDTNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'能够看到此文档的人员',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'Readers'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备注',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'Remark'
GO

EXEC sp_addextendedproperty
'MS_Description', N'与财务参考信息的匹配结果',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'Match'
GO

EXEC sp_addextendedproperty
'MS_Description', N'财务参考信息修改后的项目名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'PROJECTMatch'
GO

EXEC sp_addextendedproperty
'MS_Description', N'状态',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'Status'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'CREATED_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'CREATED_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'MODIFY_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'MODIFY_DATA'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段1',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'STANDBY1'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段2',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'STANDBY2'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段3',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'STANDBY3'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段4',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'STANDBY4'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段5',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'STANDBY5'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段6',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'STANDBY6'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段7',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'STANDBY7'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段8',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'STANDBY8'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段9',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'STANDBY9'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段10',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PROJECT',
'COLUMN', N'STANDBY10'