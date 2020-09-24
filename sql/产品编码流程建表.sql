


CREATE TABLE [dbo].[IBDS_PRODUCT_CODE_PROCESS] (
  [ID] int NOT NULL identity(1,1),
  [APPLY_CODE] nvarchar(255) NULL,
  [STATUS] nvarchar(255) NULL,
  [HANDLER] nvarchar(255) NULL,
  [APPLY_DEPT] nvarchar(50) NOT NULL,
  [APPLY_TYPE] nvarchar(50) NOT NULL,
  [APPLY_COUNT] nvarchar(50) NOT NULL,
  [SUB_SIGN] nvarchar(255) NULL,
  [CHECK_OPINION] nvarchar(255) NULL,
  [CHECK_SIGN] nvarchar(255) NULL,
  [CHECK_RESULT] nvarchar(255) NULL,
  [PDT_SIGN] nvarchar(255) NULL,
  [PDT_OPINION] nvarchar(255) NULL,
  [PDT_RESULT] nvarchar(255) NULL,
  [FPROD_SIGN] nvarchar(255) NULL,
  [FPROD_OPINION] nvarchar(255) NULL,
  [FPROD_RESULT] nvarchar(255) NULL,
  [CW_SIGN] nvarchar(255) NULL,
  [CW_OPINION] nvarchar(255) NULL,
  [CW_RESULT] nvarchar(50) NULL,
  [PROCESSMGN_SIGN] nvarchar(255) NULL,
  [PROCESSMGN_RESULT] varchar(255) NULL,
  [ORDER_BY] int NULL,
  [CREATE_DATE] datetime2 NULL,
  [CREATE_USER] nvarchar(255) NULL,
  [MODIFY_DATE] datetime2 NULL,
  [MODIFY_USER] nvarchar(255) NULL,
  PRIMARY KEY CLUSTERED ([ID])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)
GO

EXEC sp_addextendedproperty
'MS_Description', N'主键',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'申请编号',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'APPLY_CODE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'当前状态',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'STATUS'
GO

EXEC sp_addextendedproperty
'MS_Description', N'当前处理者',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'HANDLER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属PDT编码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'APPLY_DEPT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'变动类型',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'APPLY_TYPE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'申请产品编码数目',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'APPLY_COUNT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'子表单签名',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'SUB_SIGN'
GO

EXEC sp_addextendedproperty
'MS_Description', N'审核者意见',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'CHECK_OPINION'
GO

EXEC sp_addextendedproperty
'MS_Description', N'审核者签名',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'CHECK_SIGN'
GO

EXEC sp_addextendedproperty
'MS_Description', N'审核者审核结果',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'CHECK_RESULT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'PDT签名',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'PDT_SIGN'
GO

EXEC sp_addextendedproperty
'MS_Description', N'PDT意见',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'PDT_OPINION'
GO

EXEC sp_addextendedproperty
'MS_Description', N'PDT审核结果',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'PDT_RESULT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品财务接口人签名',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'FPROD_SIGN'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品财务接口人意见',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'FPROD_OPINION'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品财务接口人审核结果',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'FPROD_RESULT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'财务签名',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'CW_SIGN'
GO

EXEC sp_addextendedproperty
'MS_Description', N'财务意见',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'CW_OPINION'
GO

EXEC sp_addextendedproperty
'MS_Description', N'财务审核结果',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'CW_RESULT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'流程管理签名',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'PROCESSMGN_SIGN'
GO

EXEC sp_addextendedproperty
'MS_Description', N'流程管理结果',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'PROCESSMGN_RESULT'
GO

EXEC sp_addextendedproperty
'MS_Description', N'排序号',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'ORDER_BY'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'CREATE_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'CREATE_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'MODIFY_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRODUCT_CODE_PROCESS',
'COLUMN', N'MODIFY_USER'