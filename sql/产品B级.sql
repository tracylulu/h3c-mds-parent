CREATE TABLE [dbo].[IBDS_bversion] (
  [ID] int NOT NULL identity(1,1),
  [bversionno] nvarchar(100) NULL,
  [bversioncname] nvarchar(100) NULL,
  [bversionold] nvarchar(500) NULL,
  [bversionename] nvarchar(100) NULL,
  [PLIPMTNo] nvarchar(100) NULL,
  [PRODLINENo] nvarchar(100) NULL,
  [PRODUCTNo] nvarchar NULL,
  [VERSIONNo] nvarchar(100) NULL,
  [RELEASENo] nvarchar(100) NULL,
  [Readers] nvarchar(100) NULL,
  [Remark] nvarchar(100) NULL,
  [Match] nvarchar(100) NULL,
  [bversionMatch] nvarchar(100) NULL,
  [ProdDataID] nvarchar(100) NULL,
  [POP_ID] nvarchar(500) NULL,
  [RNDPDT_ID] nvarchar(500) NULL,
  [Quality_Mnger] nvarchar(500) NULL,
  [CMO_ID] nvarchar(500) NULL,
  [se] nvarchar(500) NULL,
  [proDifficult] nvarchar(255) NULL,
  [harddiffcult] nvarchar(255) NULL,
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
'TABLE', N'IBDS_bversion',
'COLUMN', N'ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品B级内码内码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'bversionno'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品B级中文名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'bversioncname'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品B级曾用名',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'bversionold'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品B级英文名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'bversionename'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属IPMT',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'PLIPMTNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属研发产品线',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'PRODLINENo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属产品',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'PRODUCTNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属产品V级',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'VERSIONNo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属产品R级',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'RELEASENo'
GO

EXEC sp_addextendedproperty
'MS_Description', N'能够看到此文档的人员',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'Readers'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备注',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'Remark'
GO

EXEC sp_addextendedproperty
'MS_Description', N'匹配结果',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'Match'
GO

EXEC sp_addextendedproperty
'MS_Description', N'技术文件基础库修改后的产品B级名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'bversionMatch'
GO

EXEC sp_addextendedproperty
'MS_Description', N'数据源的文档ID',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'ProdDataID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'项目操作员POP',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'POP_ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'开发代表',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'RNDPDT_ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'PQA',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'Quality_Mnger'
GO

EXEC sp_addextendedproperty
'MS_Description', N'CMO',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'CMO_ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'SE',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'se'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品难度系数',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'proDifficult'
GO

EXEC sp_addextendedproperty
'MS_Description', N'硬件难度系数',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'harddiffcult'
GO

EXEC sp_addextendedproperty
'MS_Description', N'状态',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'Status'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'CREATED_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'CREATED_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'MODIFY_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'MODIFY_DATA'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段1',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'STANDBY1'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段2',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'STANDBY2'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段3',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'STANDBY3'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段4',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'STANDBY4'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段5',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'STANDBY5'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段6',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'STANDBY6'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段7',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'STANDBY7'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段8',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'STANDBY8'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段9',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'STANDBY9'
GO

EXEC sp_addextendedproperty
'MS_Description', N'备用字段10',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_bversion',
'COLUMN', N'STANDBY10'