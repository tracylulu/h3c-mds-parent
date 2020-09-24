CREATE TABLE [dbo].[IBDS_BASE_LINE] (
  [ID] int NOT NULL identity(1,1),
  [BASELINENo] nvarchar(100) NULL,
  [BASELINE] nvarchar(100) NULL,
  [BASELINEOld] nvarchar(500) NULL,
  [engBASELINE] nvarchar(100) NULL,
  [BASELINE_1] nvarchar(100) NULL,
  [BASELINEOut] nvarchar(100) NULL,
  [engBASELINEOut] nvarchar(100) NULL,
  [PLIPMTNo] nvarchar(100) NULL,
  [PRODLINENo] nvarchar(100) NULL,
  [PRODUCTNo] nvarchar(100) NULL,
  [VERSIONNo] nvarchar(100) NULL,
  [RELEASENo] nvarchar(100) NULL,
  [ParentItemNo] nvarchar(100) NULL,
  [BASELINEStatus] nvarchar(100) NULL,
  [BASELINEType] nvarchar(100) NULL,
  [BASELINE_IssueTime] datetime NULL,
  [BASELINE_DisableTime] datetime NULL,
  [BASELINE_usingLimitWhether] nvarchar(100) NULL,
  [BASELINE_UrgencyIssue] nvarchar(100) NULL,
  [BASELINE_UsingRange] nvarchar(100) NULL,
  [BASELINE_IssueRange] nvarchar(100) NULL,
  [BASELINE_IssueStyle] nvarchar(100) NULL,
  [Readers] nvarchar(100) NULL,
  [ProdDataID] nvarchar(100) NULL,
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
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'基线版本内码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINENo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'基线版本中文名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'基线版本曾用名',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINEOld'
GO

EXEC sp_addextendedproperty
'MS_Description', N'基线版本英文名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'engBASELINE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'对于平台基线版本号',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINE_1'
GO

EXEC sp_addextendedproperty
'MS_Description', N'对外版本中文名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINEOut'
GO

EXEC sp_addextendedproperty
'MS_Description', N'对外版本英文名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'engBASELINEOut'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属IPMT',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'PLIPMTNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属研发产品线',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'PRODLINENo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属产品',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'PRODUCTNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属产品V级',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'VERSIONNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属产品R级',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'RELEASENo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属父版本',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'ParentItemNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'状态（是否已发布）',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINEStatus'
GO

EXEC sp_addextendedproperty
'MS_Description', N'版本类别',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINEType'
GO

EXEC sp_addextendedproperty
'MS_Description', N'版本发布日期',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINE_IssueTime'
GO

EXEC sp_addextendedproperty
'MS_Description', N'版本失效日期',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINE_DisableTime'
GO

EXEC sp_addextendedproperty
'MS_Description', N'是否受控',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINE_usingLimitWhether'
GO

EXEC sp_addextendedproperty
'MS_Description', N'是否紧急发布',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINE_UrgencyIssue'
GO

EXEC sp_addextendedproperty
'MS_Description', N'版本使用地域范围',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINE_UsingRange'
GO

EXEC sp_addextendedproperty
'MS_Description', N'版本发布范围',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINE_IssueRange'
GO

EXEC sp_addextendedproperty
'MS_Description', N'版本发布类别',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'BASELINE_IssueStyle'
GO

EXEC sp_addextendedproperty
'MS_Description', N'能够看到此文档的人员',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'Readers'
GO

EXEC sp_addextendedproperty
'MS_Description', N'数据源的文档ID',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'ProdDataID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备注',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'Remark'
GO

EXEC sp_addextendedproperty
'MS_Description', N'状态',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'Status'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'CREATED_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'CREATED_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'MODIFY_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'MODIFY_DATA'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段1',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'STANDBY1'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段2',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'STANDBY2'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段3',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'STANDBY3'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段4',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'STANDBY4'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段5',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'STANDBY5'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段6',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'STANDBY6'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段7',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'STANDBY7'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段8',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'STANDBY8'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段9',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'STANDBY9'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段10',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_BASE_LINE',
'COLUMN', N'STANDBY10'