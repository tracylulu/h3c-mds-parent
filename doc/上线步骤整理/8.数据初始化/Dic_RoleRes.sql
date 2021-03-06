USE [IBDSDB_Test]
GO
/****** Object:  Table [dbo].[IBDS_Dic]    Script Date: 2019/12/27 17:38:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_Dic](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[DIC_NAME] [nvarchar](500) NULL,
	[DIC_VALUE] [nvarchar](100) NULL,
	[DIC_TypeCode] [nvarchar](100) NULL,
	[DIC_TypeName] [nvarchar](100) NULL,
	[FLAG] [int] NULL,
	[Remark] [nvarchar](500) NULL,
	[Creator] [nvarchar](200) NULL,
	[CreateTime] [datetime] NULL,
	[Modifier] [nvarchar](200) NULL,
	[ModifyTime] [datetime] NULL,
 CONSTRAINT [PK_IBDS_Dic] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_Role_Resource]    Script Date: 2019/12/27 17:38:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_Role_Resource](
	[HRRR_ID] [int] IDENTITY(1,1) NOT NULL,
	[HRRR_HRL_CODE] [varchar](100) NOT NULL,
	[HRRR_HRES_CODE] [varchar](100) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[HRRR_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'隐藏值' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Dic', @level2type=N'COLUMN',@level2name=N'DIC_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'实际值' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Dic', @level2type=N'COLUMN',@level2name=N'DIC_VALUE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Dic', @level2type=N'COLUMN',@level2name=N'DIC_TypeCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Dic', @level2type=N'COLUMN',@level2name=N'DIC_TypeName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态 0可用 1不可用' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Dic', @level2type=N'COLUMN',@level2name=N'FLAG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Dic', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Dic', @level2type=N'COLUMN',@level2name=N'Creator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Dic', @level2type=N'COLUMN',@level2name=N'CreateTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Dic', @level2type=N'COLUMN',@level2name=N'Modifier'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Dic', @level2type=N'COLUMN',@level2name=N'ModifyTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role_Resource', @level2type=N'COLUMN',@level2name=N'HRRR_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色code' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role_Resource', @level2type=N'COLUMN',@level2name=N'HRRR_HRL_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资源code' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role_Resource', @level2type=N'COLUMN',@level2name=N'HRRR_HRES_CODE'
GO
