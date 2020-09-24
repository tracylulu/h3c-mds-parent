CREATE TABLE [dbo].[IBDS_PRDOUCT_CODE_APPLY] (
  [ID] int NOT NULL identity(1,1),
  [PRODLINE_NAME] nvarchar(255) NULL,
  [PRODUCT_NAME] nvarchar(255) NULL,
  [PDT_NAME] nvarchar(255) NULL,
  [PDT_NO] nvarchar(50) NULL,
  [PDT_MNG] nvarchar(255) NULL,
  [PRODLINE_NO] nvarchar(50) NOT NULL,
  [PRODUCT_NO] nvarchar(50) NULL,
  [PRODUCT_CODE] nvarchar(255) NULL,
  [PRODUCT_NAME_CN] nvarchar(255) NULL,
  [PRODUCT_NAME_EN] nvarchar(255) NULL,
  [BASIS_MATERIAL] nvarchar(255) NULL,
  [BOM_CODE] nvarchar(4000) NULL,
  [BOM_DESC] nvarchar(4000) NULL,
	[PROCESS_CODE] nvarchar(255) NULL,
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
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'ID'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品线名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PRODLINE_NAME'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品族名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PRODUCT_NAME'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属PDT名称',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PDT_NAME'
GO

EXEC sp_addextendedproperty
'MS_Description', N'所属PDT编码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PDT_NO'
GO

EXEC sp_addextendedproperty
'MS_Description', N'PDT经理',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PDT_MNG'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品线内码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PRODLINE_NO'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品内码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PRODUCT_NO'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品编码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PRODUCT_CODE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品中文描述',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PRODUCT_NAME_CN'
GO

EXEC sp_addextendedproperty
'MS_Description', N'产品英文描述',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PRODUCT_NAME_EN'
GO

EXEC sp_addextendedproperty
'MS_Description', N'依据材料',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'BASIS_MATERIAL'
GO

EXEC sp_addextendedproperty
'MS_Description', N'对应BOM编码',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'BOM_CODE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'BOM描述',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'BOM_DESC'
GO

EXEC sp_addextendedproperty
'MS_Description', N'流程编号',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'PROCESS_CODE'


GO

EXEC sp_addextendedproperty
'MS_Description', N'排序号',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'ORDER_BY'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'CREATE_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'创建人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'CREATE_USER'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑时间',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'MODIFY_DATE'
GO

EXEC sp_addextendedproperty
'MS_Description', N'最后编辑人',
'SCHEMA', N'dbo',
'TABLE', N'IBDS_PRDOUCT_CODE_APPLY',
'COLUMN', N'MODIFY_USER'