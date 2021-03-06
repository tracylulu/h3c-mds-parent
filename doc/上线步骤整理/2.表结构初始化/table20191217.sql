
/****** Object:  Table [dbo].[ADMP_MemberGroup]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ADMP_MemberGroup](
	[Serial] [int] NOT NULL,
	[UserCode] [nvarchar](100) NULL,
	[GroupName] [nvarchar](300) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[bak_IBDS_Bversion20191017]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[bak_IBDS_Bversion20191017](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[bversionno] [nvarchar](100) NULL,
	[bversioncname] [nvarchar](100) NULL,
	[bversionold] [nvarchar](500) NULL,
	[bversionename] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Match] [nvarchar](100) NULL,
	[bversionMatch] [nvarchar](100) NULL,
	[ProdDataID] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](500) NULL,
	[RNDPDT_ID] [nvarchar](500) NULL,
	[Quality_Mnger] [varchar](500) NULL,
	[CMO_ID] [nvarchar](500) NULL,
	[se] [nvarchar](500) NULL,
	[proDifficult] [nvarchar](255) NULL,
	[harddiffcult] [nvarchar](255) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[PROJECTNo] [nvarchar](100) NULL,
	[ProjectStatus] [nvarchar](100) NULL,
	[Pack] [nvarchar](200) NULL,
	[HardPack] [nvarchar](200) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Bversion_IPMP]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Bversion_IPMP](
	[ReleaseCode] [nvarchar](50) NULL,
	[ReleaseName] [nvarchar](200) NULL,
	[BVersion] [nvarchar](50) NULL,
	[BVersionModifyDate] [datetime] NULL,
	[deleteFlag] [char](1) NULL,
	[SuspendType] [nvarchar](50) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[bversionTmp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[bversionTmp](
	[bversionno] [nvarchar](100) NULL,
	[bversioncname] [nvarchar](100) NULL,
	[bversionold] [nvarchar](500) NULL,
	[bversionename] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Match] [nvarchar](100) NULL,
	[bversionMatch] [nvarchar](100) NULL,
	[ProdDataID] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](500) NULL,
	[RNDPDT_ID] [nvarchar](500) NULL,
	[Quality_Mnger] [varchar](500) NULL,
	[CMO_ID] [nvarchar](500) NULL,
	[se] [nvarchar](500) NULL,
	[proDifficult] [nvarchar](255) NULL,
	[harddiffcult] [nvarchar](255) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[PROJECTNo] [nvarchar](100) NULL,
	[ProjectStatus] [nvarchar](100) NULL,
	[Pack] [nvarchar](200) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[F_PROD_Temp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[F_PROD_Temp](
	[f_author] [varchar](500) NULL,
	[ProLineCN] [nvarchar](255) NULL,
	[ProLineCode] [nvarchar](500) NULL,
	[ProRaceCN] [nvarchar](255) NULL,
	[ProRaceCode] [nvarchar](500) NULL,
	[ProRaceEN] [nvarchar](255) NULL,
	[ProRaceCread] [datetime] NULL,
	[ProLineEN] [nvarchar](255) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[F_PRODLINE_Temp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[F_PRODLINE_Temp](
	[f_author] [varchar](500) NULL,
	[ProLineCN] [nvarchar](255) NULL,
	[ProLineCode] [nvarchar](500) NULL,
	[ProlineCread] [datetime] NULL,
	[ProLineEN] [nvarchar](255) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[F_PRODUCT_CODE_Temp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[F_PRODUCT_CODE_Temp](
	[f_bomReadme] [nvarchar](4000) NULL,
	[WF_ORUNID] [nvarchar](100) NULL,
	[f_author] [varchar](800) NOT NULL,
	[f_status] [varchar](4) NULL,
	[mark] [varchar](100) NOT NULL,
	[f_class] [nvarchar](255) NULL,
	[f_PDT] [nvarchar](500) NULL,
	[f_prodno] [nvarchar](255) NULL,
	[f_prodno_1] [nvarchar](255) NULL,
	[f_prodname] [nvarchar](255) NULL,
	[f_prodname_1] [nvarchar](255) NULL,
	[f_prodcode] [nvarchar](255) NULL,
	[f_bomno] [nvarchar](max) NULL,
	[f_ProdAll] [nvarchar](767) NULL,
	[EnglishDepict] [nvarchar](255) NULL,
	[BeginTime] [datetime] NULL,
	[f_explain] [nvarchar](max) NULL,
	[f_bumen] [varchar](100) NULL,
	[f_class_1] [nvarchar](255) NULL,
	[f_PDT_1] [nvarchar](500) NULL,
	[f_prodno_old] [nvarchar](255) NULL,
	[f_prodno_old_1] [nvarchar](255) NULL,
	[f_prodname_old] [nvarchar](255) NULL,
	[f_prodname_old_1] [nvarchar](255) NULL,
	[f_prodcode_1] [nvarchar](255) NULL,
	[f_bomno_1] [nvarchar](max) NULL,
	[EnglishDepict_1] [nvarchar](255) NULL,
	[f_projno] [nvarchar](255) NULL,
	[f_projname] [nvarchar](255) NULL,
	[f_bili] [nvarchar](255) NULL,
	[f_projcode] [nvarchar](255) NULL,
	[f_jingli] [nvarchar](255) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_BASE_LINE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_BASE_LINE](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[P] [nvarchar](100) NULL,
	[V] [nvarchar](100) NULL,
	[R] [nvarchar](100) NULL,
	[L] [nvarchar](100) NULL,
	[C] [nvarchar](100) NULL,
	[B] [nvarchar](100) NULL,
	[D] [nvarchar](100) NULL,
	[SP] [nvarchar](100) NULL,
	[BASELINENo] [nvarchar](100) NULL,
	[BASELINE] [nvarchar](200) NULL,
	[BASELINEOld] [nvarchar](500) NULL,
	[engBASELINE] [nvarchar](400) NULL,
	[BASELINE_1] [nvarchar](400) NULL,
	[BASELINEOut] [nvarchar](500) NULL,
	[engBASELINEOut] [nvarchar](400) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[ParentItemNo] [nvarchar](100) NULL,
	[BASELINEStatus] [nvarchar](100) NULL,
	[BASELINEType] [nvarchar](100) NULL,
	[BASELINE_IssueTime] [datetime] NULL,
	[BASELINE_DisableTime] [datetime] NULL,
	[BASELINE_usingLimitWhether] [nvarchar](100) NULL,
	[BASELINE_UrgencyIssue] [nvarchar](100) NULL,
	[BASELINE_UsingRange] [nvarchar](100) NULL,
	[BASELINE_IssueRange] [nvarchar](100) NULL,
	[BASELINE_IssueStyle] [nvarchar](100) NULL,
	[Readers] [nvarchar](500) NULL,
	[ProdDataID] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
 CONSTRAINT [PK__IBDS_BAS__3214EC271392CE8F] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_BaseLine_Apply]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_BaseLine_Apply](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[BVERSIONNo] [nvarchar](100) NULL,
	[BASELINENo] [nvarchar](max) NULL,
	[BASELINE] [nvarchar](max) NULL,
	[engBASELINE] [nvarchar](max) NULL,
	[BASELINEOut] [nvarchar](max) NULL,
	[engBASELINEOut] [nvarchar](max) NULL,
	[ParentItemNo] [nvarchar](max) NULL,
	[BASELINE_1] [nvarchar](max) NULL,
	[BASELINEOldNo] [nvarchar](max) NULL,
	[BASELINEOld] [nvarchar](max) NULL,
	[engBASELINEOld] [nvarchar](max) NULL,
	[BASELINEOutOld] [nvarchar](max) NULL,
	[engBASELINEOutOld] [nvarchar](max) NULL,
	[ParentItemNoOld] [nvarchar](max) NULL,
	[BASELINE_1_Old] [nvarchar](max) NULL,
	[PROCESS_CODE] [nvarchar](100) NULL,
	[ApplyType] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[MODIFY_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
 CONSTRAINT [PK_IBDS_BaseLine_Apply] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_BaseObject_Apply]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_BaseObject_Apply](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[BVERSIONNo] [nvarchar](100) NULL,
	[BASELINENo] [nvarchar](100) NULL,
	[FEATURENo] [nvarchar](500) NULL,
	[SUBSYSTEMNo] [nvarchar](800) NULL,
	[MODULENo] [nvarchar](800) NULL,
	[NumofFEATURENew] [nvarchar](100) NULL,
	[ObjectNo] [nvarchar](max) NULL,
	[ObjectName] [nvarchar](max) NULL,
	[engObject] [nvarchar](max) NULL,
	[ObjectNoOld] [nvarchar](max) NULL,
	[ObjectNameOld] [nvarchar](max) NULL,
	[engObjectOld] [nvarchar](max) NULL,
	[ApplyType] [nvarchar](100) NULL,
	[Type] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[MODIFY_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[PROCESS_CODE] [nvarchar](100) NULL,
 CONSTRAINT [PK_IBDS_BaseObject_Apply] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_BaseObject_PROCESS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_BaseObject_PROCESS](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ApplyCode] [nvarchar](100) NULL,
	[Status] [nvarchar](100) NULL,
	[Responsible] [nvarchar](100) NULL,
	[StatusName] [nvarchar](100) NULL,
	[APPLY_TYPE] [nvarchar](100) NULL,
	[Remark] [nvarchar](500) NULL,
	[Readers] [nvarchar](500) NULL,
	[copyto] [nvarchar](500) NULL,
	[sendto_1] [nvarchar](100) NULL,
	[CMO_FillName] [nvarchar](100) NULL,
	[CMO_FillTime] [datetime] NULL,
	[PDT_Suggestion] [nvarchar](500) NULL,
	[PDT_FillName] [nvarchar](100) NULL,
	[PDT_FillTime] [datetime] NULL,
	[CMOLeader_Suggestion] [nvarchar](500) NULL,
	[CMOLeader_FillName] [nvarchar](100) NULL,
	[CMOLeader_FillTime] [datetime] NULL,
	[INSTANSE_ID] [nvarchar](100) NULL,
	[CheckResult] [nvarchar](100) NULL,
	[EditCurrentUser] [nvarchar](100) NULL,
	[AssignSign] [nvarchar](100) NULL,
	[AssignDate] [datetime] NULL,
	[CREATE_DATE] [datetime] NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[MODIFY_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[CurrentNode] [nvarchar](100) NULL,
 CONSTRAINT [PK_IBDS_BaseObject_PROCESS] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [UQ_IBDS_BaseObject_PROCESS_ApplyCode] UNIQUE NONCLUSTERED 
(
	[ApplyCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_BASIS_MATERIAL]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_BASIS_MATERIAL](
	[ID] [varchar](50) NOT NULL,
	[NAME] [nvarchar](255) NULL,
	[MODULE] [varchar](50) NULL,
	[MODULE_ID] [int] NULL,
	[CONTENT] [nvarchar](max) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_bversion]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_bversion](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[bversionno] [nvarchar](100) NULL,
	[bversioncname] [nvarchar](100) NULL,
	[bversionold] [nvarchar](500) NULL,
	[bversionename] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Match] [nvarchar](100) NULL,
	[bversionMatch] [nvarchar](100) NULL,
	[ProdDataID] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](500) NULL,
	[RNDPDT_ID] [nvarchar](500) NULL,
	[Quality_Mnger] [varchar](500) NULL,
	[CMO_ID] [nvarchar](500) NULL,
	[se] [nvarchar](500) NULL,
	[proDifficult] [nvarchar](255) NULL,
	[harddiffcult] [nvarchar](255) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[PROJECTNo] [nvarchar](100) NULL,
	[ProjectStatus] [nvarchar](100) NULL,
	[Pack] [nvarchar](200) NULL,
	[HardPack] [nvarchar](200) NULL,
 CONSTRAINT [PK_IBDS_bversion] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_bversion_20191115bak]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_bversion_20191115bak](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[bversionno] [nvarchar](100) NULL,
	[bversioncname] [nvarchar](100) NULL,
	[bversionold] [nvarchar](500) NULL,
	[bversionename] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Match] [nvarchar](100) NULL,
	[bversionMatch] [nvarchar](100) NULL,
	[ProdDataID] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](500) NULL,
	[RNDPDT_ID] [nvarchar](500) NULL,
	[Quality_Mnger] [varchar](500) NULL,
	[CMO_ID] [nvarchar](500) NULL,
	[se] [nvarchar](500) NULL,
	[proDifficult] [nvarchar](255) NULL,
	[harddiffcult] [nvarchar](255) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[PROJECTNo] [nvarchar](100) NULL,
	[ProjectStatus] [nvarchar](100) NULL,
	[Pack] [nvarchar](200) NULL,
	[HardPack] [nvarchar](200) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_bversion_20191118]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_bversion_20191118](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[bversionno] [nvarchar](100) NULL,
	[bversioncname] [nvarchar](100) NULL,
	[bversionold] [nvarchar](500) NULL,
	[bversionename] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Match] [nvarchar](100) NULL,
	[bversionMatch] [nvarchar](100) NULL,
	[ProdDataID] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](500) NULL,
	[RNDPDT_ID] [nvarchar](500) NULL,
	[Quality_Mnger] [varchar](500) NULL,
	[CMO_ID] [nvarchar](500) NULL,
	[se] [nvarchar](500) NULL,
	[proDifficult] [nvarchar](255) NULL,
	[harddiffcult] [nvarchar](255) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[PROJECTNo] [nvarchar](100) NULL,
	[ProjectStatus] [nvarchar](100) NULL,
	[Pack] [nvarchar](200) NULL,
	[HardPack] [nvarchar](200) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_ColunmConfig]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_ColunmConfig](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ColumnCode] [nvarchar](200) NULL,
	[ColumnName] [nvarchar](500) NULL,
	[ColumnGroup] [nvarchar](500) NULL,
	[GroupOrder] [int] NULL,
	[QueryOrder] [int] NULL,
	[AddOrder] [int] NULL,
	[EditOrder] [int] NULL,
	[ColumnOrder] [int] NULL,
	[Type] [varchar](2) NULL,
	[AddFlag] [int] NULL,
	[EditFlag] [int] NULL,
	[Flag] [int] NULL,
	[QueryFlag] [int] NULL,
	[ColumnFlag] [int] NULL,
	[EditStatus] [int] NULL,
	[IPMTCheck] [int] NULL,
	[CreateUser] [varchar](100) NULL,
	[CreateDate] [datetime] NULL,
	[ModifyUser] [varchar](100) NULL,
	[ModifyDate] [datetime] NULL,
	[Remark] [nvarchar](500) NULL,
	[ColumnClass] [nvarchar](200) NULL,
	[ColumnType] [nvarchar](200) NULL,
	[ColumnValidate] [nvarchar](500) NULL,
	[ColumnMessage] [nvarchar](500) NULL,
	[ValidateLength] [nvarchar](500) NULL,
	[IsReferenceShow] [int] NULL,
 CONSTRAINT [PK_ColunmConfig] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_ColunmConfig_bak20191017]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_ColunmConfig_bak20191017](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ColumnCode] [nvarchar](200) NULL,
	[ColumnName] [nvarchar](500) NULL,
	[ColumnGroup] [nvarchar](500) NULL,
	[GroupOrder] [int] NULL,
	[QueryOrder] [int] NULL,
	[AddOrder] [int] NULL,
	[EditOrder] [int] NULL,
	[ColumnOrder] [int] NULL,
	[Type] [varchar](2) NULL,
	[AddFlag] [int] NULL,
	[EditFlag] [int] NULL,
	[Flag] [int] NULL,
	[QueryFlag] [int] NULL,
	[ColumnFlag] [int] NULL,
	[EditStatus] [int] NULL,
	[IPMTCheck] [int] NULL,
	[CreateUser] [varchar](100) NULL,
	[CreateDate] [datetime] NULL,
	[ModifyUser] [varchar](100) NULL,
	[ModifyDate] [datetime] NULL,
	[Remark] [nvarchar](500) NULL,
	[ColumnClass] [nvarchar](200) NULL,
	[ColumnType] [nvarchar](200) NULL,
	[ColumnValidate] [nvarchar](500) NULL,
	[ColumnMessage] [nvarchar](500) NULL,
	[ValidateLength] [nvarchar](500) NULL,
	[IsReferenceShow] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_DATA_PERM]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_DATA_PERM](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[RESOURCE] [nvarchar](255) NULL,
	[EXPRESSION] [nvarchar](255) NULL,
	[NOTE] [nvarchar](255) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[FIELD] [nvarchar](255) NULL,
	[TYPE] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_DATA_PERM_1]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_DATA_PERM_1](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[RESOURCE] [nvarchar](255) NULL,
	[EXPRESSION] [nvarchar](255) NULL,
	[NOTE] [nvarchar](255) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[FIELD] [nvarchar](255) NULL,
	[TYPE] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_Dic]    Script Date: 2019/12/17 10:27:08 ******/
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
/****** Object:  Table [dbo].[IBDS_DifficultyCoefficient]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_DifficultyCoefficient](
	[ReleaseNo] [nvarchar](100) NULL,
	[ReleaseName] [nvarchar](100) NULL,
	[Bversion] [nvarchar](100) NULL,
	[DifficultyCoefficient] [nvarchar](100) NULL,
	[DifficultyCoefficient_1] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_DifficultyCoefficient_APPLY]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_DifficultyCoefficient_APPLY](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Process_Code] [nvarchar](200) NULL,
	[PLIPMTNo] [nvarchar](200) NULL,
	[ProdLineNo] [nvarchar](200) NULL,
	[ProductNo] [nvarchar](200) NULL,
	[VersionNo] [nvarchar](200) NULL,
	[ReleaseNo] [nvarchar](200) NULL,
	[IPMTSecretary] [nvarchar](200) NULL,
	[BversionNo] [nvarchar](200) NULL,
	[Bversion] [nvarchar](200) NULL,
	[isPack] [char](1) NULL,
	[Prod_BasisMaterial] [nvarchar](2000) NULL,
	[Prod_BasisMaterialId] [nvarchar](2000) NULL,
	[Hard_BasisMaterial] [nvarchar](2000) NULL,
	[Hard_BasisMaterialId] [nvarchar](2000) NULL,
	[ProSnRemark] [nvarchar](200) NULL,
	[HardSnRemark] [nvarchar](200) NULL,
	[copyto] [nvarchar](2000) NULL,
	[Remark] [nvarchar](2000) NULL,
	[Creator] [nvarchar](200) NULL,
	[CreateTime] [datetime] NULL,
	[Modifier] [nvarchar](200) NULL,
	[ModifyTime] [datetime] NULL,
 CONSTRAINT [PK__IBDS_Dif__3214EC27216D8348] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_DifficultyCoefficient_History]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_DifficultyCoefficient_History](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Process_Code] [nvarchar](200) NULL,
	[Code] [nvarchar](200) NULL,
	[ColumnName] [nvarchar](200) NULL,
	[OldValue] [nvarchar](200) NULL,
	[NewValue] [nvarchar](200) NULL,
	[Creator] [nvarchar](200) NULL,
	[CreateTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_DifficultyCoefficient_Item_APPLY]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_DifficultyCoefficient_Item_APPLY](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Diff_ID] [int] NULL,
	[BVersionno] [nvarchar](200) NULL,
	[BVersion] [nvarchar](200) NULL,
	[ProDifficult] [decimal](5, 2) NULL,
	[HardDifficult] [decimal](5, 2) NULL,
	[Status] [char](1) NULL,
	[Creator] [nvarchar](200) NULL,
	[CreateTime] [datetime] NULL,
	[Modifier] [nvarchar](200) NULL,
	[ModifyTime] [datetime] NULL,
 CONSTRAINT [PK__IBDS_Dif__3214EC27253E142C] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_DifficultyCoefficient_PROCESS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_DifficultyCoefficient_PROCESS](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[APPLY_CODE] [nvarchar](200) NULL,
	[Status] [nvarchar](200) NULL,
	[Handler] [nvarchar](200) NULL,
	[Instanse_ID] [nvarchar](50) NULL,
	[CurrentNode] [nvarchar](200) NULL,
	[STATUS_DESC] [nvarchar](200) NULL,
	[First_Sign] [nvarchar](200) NULL,
	[First_Date] [datetime] NULL,
	[MGN_Sign] [nvarchar](200) NULL,
	[MGN_Date] [datetime] NULL,
	[MGN_Opinion] [nvarchar](2000) NULL,
	[MGN_Result] [nvarchar](200) NULL,
	[Quality_Sign] [nvarchar](200) NULL,
	[Quality_Date] [datetime] NULL,
	[Quality_Opinion] [nvarchar](2000) NULL,
	[Quality_Result] [nvarchar](200) NULL,
	[IPMT_Sign] [nvarchar](200) NULL,
	[IPMT_Date] [datetime] NULL,
	[IPMT_Opinion] [nvarchar](2000) NULL,
	[IPMT_Result] [nvarchar](200) NULL,
	[Creator] [nvarchar](200) NULL,
	[CreateTime] [datetime] NULL,
	[Modifier] [nvarchar](200) NULL,
	[ModifyTime] [datetime] NULL,
 CONSTRAINT [PK__IBDS_Dif__3214EC271D9CF264] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [UQ_IBDS_DifficultyCoefficient_PROCESS_ApplyCode] UNIQUE NONCLUSTERED 
(
	[APPLY_CODE] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_ERROR_CODE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_ERROR_CODE](
	[type] [varchar](255) NULL,
	[name] [varchar](255) NULL,
	[code] [varchar](255) NULL,
	[create_user] [varchar](255) NULL,
	[create_time] [datetime2](7) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[cause] [varchar](2000) NULL,
	[projectCodeTmp] [varchar](2000) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_PROD]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PROD](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PROD_NO] [nvarchar](50) NULL,
	[PROD_NAME] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[PROD_CODE] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[SYNC_STATUS] [varchar](255) NULL DEFAULT ((0)),
	[PROD_NAME_EN] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_PROD_1]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PROD_1](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PROD_NO] [nvarchar](50) NULL,
	[PROD_NAME] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[PROD_CODE] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[SYNC_STATUS] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_PRODLINE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODLINE](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODLINE_DESC] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[PRODLINE_CODE] [nvarchar](255) NULL,
	[SYNC_STATUS] [varchar](100) NULL DEFAULT ((0)),
	[STATUS] [nvarchar](255) NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODLINE_DESC_EN] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_PRODLINE_1]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODLINE_1](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODLINE_DESC] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[PRODLINE_CODE] [nvarchar](255) NULL,
	[SYNC_STATUS] [varchar](100) NULL,
	[STATUS] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_PRODLINE_2]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODLINE_2](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODLINE_DESC] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[PRODLINE_CODE] [nvarchar](255) NULL,
	[SYNC_STATUS] [varchar](100) NULL,
	[STATUS] [nvarchar](255) NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_PRODLINE_3]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODLINE_3](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODLINE_DESC] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[PRODLINE_CODE] [nvarchar](255) NULL,
	[SYNC_STATUS] [varchar](100) NULL,
	[STATUS] [nvarchar](255) NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_Product]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_F_Product](
	[id] [int] NOT NULL,
	[f_PDT] [nvarchar](100) NULL,
	[f_prodno] [nvarchar](100) NULL,
	[f_prodno_1] [nvarchar](500) NULL,
	[f_prodname] [nvarchar](100) NULL,
	[f_prodname_1] [nvarchar](100) NULL,
	[f_prodcode] [nvarchar](100) NULL,
	[f_bomno] [nvarchar](500) NULL,
	[f_ProdAll] [nvarchar](500) NULL,
	[EnglishDepict] [nvarchar](500) NULL,
	[BeginTime] [datetime] NULL,
	[f_explain] [nvarchar](500) NULL,
	[f_bumen] [nvarchar](100) NULL,
	[f_class_1] [nvarchar](100) NULL,
	[f_PDT_1] [nvarchar](100) NULL,
	[f_prodno_old] [nvarchar](100) NULL,
	[f_prodno_old_1] [nvarchar](100) NULL,
	[f_prodname_old] [nvarchar](100) NULL,
	[f_prodname_old_1] [nvarchar](100) NULL,
	[f_prodcode_1] [nvarchar](100) NULL,
	[f_bomno_1] [nvarchar](500) NULL,
	[EnglishDepict_1] [nvarchar](500) NULL,
	[f_bomReadme] [nvarchar](500) NULL,
	[f_author] [nvarchar](100) NULL,
	[f_status] [nvarchar](50) NULL,
	[mark] [nvarchar](100) NULL,
	[f_projno] [nvarchar](100) NULL,
	[f_projname] [nvarchar](100) NULL,
	[f_bili] [nvarchar](100) NULL,
	[f_projcode] [nvarchar](100) NULL,
	[f_jingli] [nvarchar](100) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_F_PRODUCT_CODE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODUCT_CODE](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PDT_NAME] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](50) NULL,
	[PDT_MNG] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BOM_CODE] [nvarchar](max) NULL,
	[BOM_DESC] [nvarchar](max) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](max) NULL,
	[OLD_PRODUCT_CODE] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NO] [nvarchar](255) NULL,
	[OLD_PDT_MNG] [nvarchar](255) NULL,
	[OLD_PRODLINE_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[OLD_BOM_CODE] [nvarchar](max) NULL,
	[OLD_BOM_DESC] [nvarchar](max) NULL,
	[STATUS] [nvarchar](255) NULL,
	[EFFECT_DATE] [datetime2](7) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
	[FPROD_NO] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[PRODUCT_ID] [int] NULL,
	[PDT_ID] [int] NULL,
	[OLD_PRODLINE_ID] [int] NULL,
	[OLD_PRODUCT_ID] [int] NULL,
	[OLD_PDT_ID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_F_PRODUCT_CODE_1]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODUCT_CODE_1](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PDT_NAME] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](50) NULL,
	[PDT_MNG] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BOM_CODE] [nvarchar](max) NULL,
	[BOM_DESC] [nvarchar](max) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](max) NULL,
	[OLD_PRODUCT_CODE] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NO] [nvarchar](255) NULL,
	[OLD_PDT_MNG] [nvarchar](255) NULL,
	[OLD_PRODLINE_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[OLD_BOM_CODE] [nvarchar](max) NULL,
	[OLD_BOM_DESC] [nvarchar](max) NULL,
	[STATUS] [nvarchar](255) NULL,
	[EFFECT_DATE] [datetime2](7) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
	[FPROD_NO] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[PRODUCT_ID] [int] NULL,
	[PDT_ID] [int] NULL,
	[OLD_PRODLINE_ID] [int] NULL,
	[OLD_PRODUCT_ID] [int] NULL,
	[OLD_PDT_ID] [int] NULL,
 CONSTRAINT [PK__IBDS_PRD__3214EC277D6E8346_copy2] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_F_PRODUCT_CODE_2]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODUCT_CODE_2](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PDT_NAME] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](50) NULL,
	[PDT_MNG] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BOM_CODE] [nvarchar](max) NULL,
	[BOM_DESC] [nvarchar](max) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](max) NULL,
	[OLD_PRODUCT_CODE] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NO] [nvarchar](255) NULL,
	[OLD_PDT_MNG] [nvarchar](255) NULL,
	[OLD_PRODLINE_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[OLD_BOM_CODE] [nvarchar](max) NULL,
	[OLD_BOM_DESC] [nvarchar](max) NULL,
	[STATUS] [nvarchar](255) NULL,
	[EFFECT_DATE] [datetime2](7) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
	[FPROD_NO] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[PRODUCT_ID] [int] NULL,
	[PDT_ID] [int] NULL,
	[OLD_PRODLINE_ID] [int] NULL,
	[OLD_PRODUCT_ID] [int] NULL,
	[OLD_PDT_ID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_F_PRODUCT_CODE_3]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODUCT_CODE_3](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PDT_NAME] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](50) NULL,
	[PDT_MNG] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BOM_CODE] [nvarchar](max) NULL,
	[BOM_DESC] [nvarchar](max) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](max) NULL,
	[OLD_PRODUCT_CODE] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NO] [nvarchar](255) NULL,
	[OLD_PDT_MNG] [nvarchar](255) NULL,
	[OLD_PRODLINE_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[OLD_BOM_CODE] [nvarchar](max) NULL,
	[OLD_BOM_DESC] [nvarchar](max) NULL,
	[STATUS] [nvarchar](255) NULL,
	[EFFECT_DATE] [datetime2](7) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
	[FPROD_NO] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[PRODUCT_ID] [int] NULL,
	[PDT_ID] [int] NULL,
	[OLD_PRODLINE_ID] [int] NULL,
	[OLD_PRODUCT_ID] [int] NULL,
	[OLD_PDT_ID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_F_PRODUCT_CODE_4]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODUCT_CODE_4](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PDT_NAME] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](50) NULL,
	[PDT_MNG] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BOM_CODE] [nvarchar](max) NULL,
	[BOM_DESC] [nvarchar](max) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](max) NULL,
	[OLD_PRODUCT_CODE] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NO] [nvarchar](255) NULL,
	[OLD_PDT_MNG] [nvarchar](255) NULL,
	[OLD_PRODLINE_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[OLD_BOM_CODE] [nvarchar](max) NULL,
	[OLD_BOM_DESC] [nvarchar](max) NULL,
	[STATUS] [nvarchar](255) NULL,
	[EFFECT_DATE] [datetime2](7) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
	[FPROD_NO] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[PRODUCT_ID] [int] NULL,
	[PDT_ID] [int] NULL,
	[OLD_PRODLINE_ID] [int] NULL,
	[OLD_PRODUCT_ID] [int] NULL,
	[OLD_PDT_ID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_F_PRODUCT_CODE_BUMENQIAN]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODUCT_CODE_BUMENQIAN](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PDT_NAME] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](50) NULL,
	[PDT_MNG] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BOM_CODE] [nvarchar](max) NULL,
	[BOM_DESC] [nvarchar](max) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](max) NULL,
	[OLD_PRODUCT_CODE] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NO] [nvarchar](255) NULL,
	[OLD_PDT_MNG] [nvarchar](255) NULL,
	[OLD_PRODLINE_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[OLD_BOM_CODE] [nvarchar](max) NULL,
	[OLD_BOM_DESC] [nvarchar](max) NULL,
	[STATUS] [nvarchar](255) NULL,
	[EFFECT_DATE] [datetime2](7) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
	[FPROD_NO] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[PRODUCT_ID] [int] NULL,
	[PDT_ID] [int] NULL,
	[OLD_PRODLINE_ID] [int] NULL,
	[OLD_PRODUCT_ID] [int] NULL,
	[OLD_PDT_ID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_F_PRODUCT_CODE_copy]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODUCT_CODE_copy](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PDT_NAME] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](50) NULL,
	[PDT_MNG] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BOM_CODE] [nvarchar](max) NULL,
	[BOM_DESC] [nvarchar](max) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](max) NULL,
	[OLD_PRODUCT_CODE] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NO] [nvarchar](255) NULL,
	[OLD_PDT_MNG] [nvarchar](255) NULL,
	[OLD_PRODLINE_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[OLD_BOM_CODE] [nvarchar](max) NULL,
	[OLD_BOM_DESC] [nvarchar](max) NULL,
	[STATUS] [nvarchar](255) NULL,
	[EFFECT_DATE] [datetime2](7) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
	[FPROD_NO] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[PRODUCT_ID] [int] NULL,
	[PDT_ID] [int] NULL,
	[OLD_PRODLINE_ID] [int] NULL,
	[OLD_PRODUCT_ID] [int] NULL,
	[OLD_PDT_ID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_F_PRODUCT_CODE_copy1]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODUCT_CODE_copy1](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PDT_NAME] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](50) NULL,
	[PDT_MNG] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BOM_CODE] [nvarchar](max) NULL,
	[BOM_DESC] [nvarchar](max) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](max) NULL,
	[OLD_PRODUCT_CODE] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NO] [nvarchar](255) NULL,
	[OLD_PDT_MNG] [nvarchar](255) NULL,
	[OLD_PRODLINE_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[OLD_BOM_CODE] [nvarchar](max) NULL,
	[OLD_BOM_DESC] [nvarchar](max) NULL,
	[STATUS] [nvarchar](255) NULL,
	[EFFECT_DATE] [datetime2](7) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
	[FPROD_NO] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[PRODUCT_ID] [int] NULL,
	[PDT_ID] [int] NULL,
	[OLD_PRODLINE_ID] [int] NULL,
	[OLD_PRODUCT_ID] [int] NULL,
	[OLD_PDT_ID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_F_PRODUCT_CODE_HISTORY]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_F_PRODUCT_CODE_HISTORY](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PDT_NAME] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](50) NULL,
	[PDT_MNG] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BOM_CODE] [nvarchar](max) NULL,
	[BOM_DESC] [nvarchar](max) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](max) NULL,
	[OLD_PRODUCT_CODE] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NO] [nvarchar](255) NULL,
	[OLD_PDT_MNG] [nvarchar](255) NULL,
	[OLD_PRODLINE_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[OLD_BOM_CODE] [nvarchar](max) NULL,
	[OLD_BOM_DESC] [nvarchar](max) NULL,
	[STATUS] [nvarchar](255) NULL,
	[EFFECT_DATE] [datetime2](7) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
	[FPROD_NO] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[PRODLINE_ID] [int] NULL,
	[PRODUCT_ID] [int] NULL,
	[PDT_ID] [int] NULL,
	[OLD_PRODLINE_ID] [int] NULL,
	[OLD_PRODUCT_ID] [int] NULL,
	[OLD_PDT_ID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_F_PROJECT_CODE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PROJECT_CODE](
	[f_objca] [varchar](255) NULL,
	[f_pdtno] [varchar](255) NULL,
	[f_projno] [varchar](255) NULL,
	[f_projname] [varchar](255) NULL,
	[f_projcode] [varchar](255) NULL,
	[f_productlineno] [varchar](255) NULL,
	[f_releaseno] [varchar](255) NULL,
	[f_productno] [varchar](255) NULL,
	[f_productname] [varchar](255) NULL,
	[f_bizhong] [varchar](100) NULL,
	[f_fbizhong] [varchar](100) NULL,
	[BeginTime] [datetime] NULL,
	[f_projMng] [varchar](100) NULL,
	[f_dept] [varchar](100) NULL,
	[f_start_project_time] [datetime] NULL,
	[f_assign_point] [varchar](255) NULL,
	[remark] [varchar](max) NULL,
	[create_user] [varchar](100) NULL,
	[create_time] [datetime] NULL,
	[modify_user] [varchar](100) NULL,
	[modify_date] [datetime] NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[f_profile] [varchar](100) NULL,
	[status] [varchar](10) NULL,
	[datasource] [varchar](10) NULL,
	[f_objca_name] [varchar](255) NULL,
	[f_pdt_name] [varchar](255) NULL,
	[f_productline_name] [varchar](255) NULL,
	[f_assign_point_name] [varchar](255) NULL,
	[f_bversionno] [varchar](255) NULL,
	[f_releasename] [nvarchar](255) NULL,
	[f_bversionname] [nvarchar](255) NULL,
	[f_rate] [int] NULL,
	[f_old_objca] [varchar](255) NULL,
	[f_old_objca_name] [varchar](255) NULL,
	[f_old_pdtno] [varchar](100) NULL,
	[f_old_pdt_name] [varchar](255) NULL,
	[f_old_projno] [varchar](100) NULL,
	[f_old_projname] [varchar](255) NULL,
	[f_old_projcode] [varchar](255) NULL,
	[f_old_productlineno] [varchar](100) NULL,
	[f_old_productline_name] [nvarchar](255) NULL,
	[f_old_releaseno] [varchar](100) NULL,
	[f_old_productno] [varchar](100) NULL,
	[f_old_productname] [varchar](255) NULL,
	[f_old_bizhong] [varchar](255) NULL,
	[f_old_fbizhong] [varchar](255) NULL,
	[f_old_rate] [int] NULL,
	[f_version] [nvarchar](max) NULL,
	[f_old_version] [nvarchar](max) NULL,
	[mark] [varchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_PROJECT_CODE_bak1107]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PROJECT_CODE_bak1107](
	[f_objca] [varchar](255) NULL,
	[f_pdtno] [varchar](255) NULL,
	[f_projno] [varchar](255) NULL,
	[f_projname] [varchar](255) NULL,
	[f_projcode] [varchar](255) NULL,
	[f_productlineno] [varchar](255) NULL,
	[f_releaseno] [varchar](255) NULL,
	[f_productno] [varchar](255) NULL,
	[f_productname] [varchar](255) NULL,
	[f_bizhong] [varchar](100) NULL,
	[f_fbizhong] [varchar](100) NULL,
	[BeginTime] [datetime] NULL,
	[f_projMng] [varchar](100) NULL,
	[f_dept] [varchar](100) NULL,
	[f_start_project_time] [datetime] NULL,
	[f_assign_point] [varchar](255) NULL,
	[remark] [varchar](max) NULL,
	[create_user] [varchar](100) NULL,
	[create_time] [datetime] NULL,
	[modify_user] [varchar](100) NULL,
	[modify_date] [datetime] NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[f_profile] [varchar](100) NULL,
	[status] [varchar](10) NULL,
	[datasource] [varchar](10) NULL,
	[f_objca_name] [varchar](255) NULL,
	[f_pdt_name] [varchar](255) NULL,
	[f_productline_name] [varchar](255) NULL,
	[f_assign_point_name] [varchar](255) NULL,
	[f_bversionno] [varchar](255) NULL,
	[f_releasename] [nvarchar](255) NULL,
	[f_bversionname] [nvarchar](255) NULL,
	[f_rate] [int] NULL,
	[f_old_objca] [varchar](255) NULL,
	[f_old_objca_name] [varchar](255) NULL,
	[f_old_pdtno] [varchar](100) NULL,
	[f_old_pdt_name] [varchar](255) NULL,
	[f_old_projno] [varchar](100) NULL,
	[f_old_projname] [varchar](255) NULL,
	[f_old_projcode] [varchar](255) NULL,
	[f_old_productlineno] [varchar](100) NULL,
	[f_old_productline_name] [nvarchar](255) NULL,
	[f_old_releaseno] [varchar](100) NULL,
	[f_old_productno] [varchar](100) NULL,
	[f_old_productname] [varchar](255) NULL,
	[f_old_bizhong] [varchar](255) NULL,
	[f_old_fbizhong] [varchar](255) NULL,
	[f_old_rate] [int] NULL,
	[f_version] [nvarchar](max) NULL,
	[f_old_version] [nvarchar](max) NULL,
	[mark] [varchar](255) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_PROJECT_CODE_HIS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PROJECT_CODE_HIS](
	[f_objca] [varchar](255) NULL,
	[f_pdtno] [varchar](255) NULL,
	[f_projno] [varchar](255) NULL,
	[f_projname] [varchar](255) NULL,
	[f_projcode] [varchar](255) NULL,
	[f_productlineno] [varchar](255) NULL,
	[f_releaseno] [varchar](255) NULL,
	[f_productno] [varchar](255) NULL,
	[f_productname] [varchar](255) NULL,
	[f_bizhong] [varchar](100) NULL,
	[f_fbizhong] [varchar](100) NULL,
	[BeginTime] [datetime] NULL,
	[f_projMng] [varchar](100) NULL,
	[f_dept] [varchar](100) NULL,
	[f_start_project_time] [datetime] NULL,
	[f_assign_point] [varchar](255) NULL,
	[remark] [varchar](max) NULL,
	[create_user] [varchar](100) NULL,
	[create_time] [datetime] NULL,
	[modify_user] [varchar](100) NULL,
	[modify_date] [datetime] NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[f_profile] [varchar](100) NULL,
	[status] [varchar](10) NULL,
	[datasource] [varchar](10) NULL,
	[f_objca_name] [varchar](255) NULL,
	[f_pdt_name] [varchar](255) NULL,
	[f_productline_name] [varchar](255) NULL,
	[f_assign_point_name] [varchar](255) NULL,
	[f_bversionno] [varchar](255) NULL,
	[f_releasename] [nvarchar](255) NULL,
	[f_bversionname] [nvarchar](255) NULL,
	[f_rate] [int] NULL,
	[f_old_objca] [varchar](255) NULL,
	[f_old_objca_name] [varchar](255) NULL,
	[f_old_pdtno] [varchar](100) NULL,
	[f_old_pdt_name] [varchar](255) NULL,
	[f_old_projno] [varchar](100) NULL,
	[f_old_projname] [varchar](255) NULL,
	[f_old_projcode] [varchar](255) NULL,
	[f_old_productlineno] [varchar](100) NULL,
	[f_old_productline_name] [nvarchar](255) NULL,
	[f_old_releaseno] [varchar](100) NULL,
	[f_old_productno] [varchar](100) NULL,
	[f_old_productname] [varchar](255) NULL,
	[f_old_bizhong] [varchar](255) NULL,
	[f_old_fbizhong] [varchar](255) NULL,
	[f_old_rate] [int] NULL,
	[f_version] [nvarchar](max) NULL,
	[f_old_version] [nvarchar](max) NULL,
	[mark] [varchar](255) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_PROJECT_PRODUCT_REL]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PROJECT_PRODUCT_REL](
	[f_projno] [varchar](100) NULL,
	[f_product_code] [varchar](100) NULL,
	[rate] [varchar](100) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[f_old_product_code] [varchar](255) NULL,
	[f_old_rate] [varchar](255) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_F_PROJECT_PRODUCT_REL_HIS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_F_PROJECT_PRODUCT_REL_HIS](
	[f_projno] [varchar](100) NULL,
	[f_product_code] [varchar](100) NULL,
	[rate] [varchar](100) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[f_old_product_code] [varchar](255) NULL,
	[f_old_rate] [varchar](255) NULL,
	[f_projectcode_id] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_FEATRUE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_FEATRUE](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[FEATURENo] [nvarchar](100) NULL,
	[FEATURE] [nvarchar](1000) NULL,
	[FEATUREOld] [nvarchar](500) NULL,
	[engFEATURE] [nvarchar](1000) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](1000) NULL,
	[Remark] [nvarchar](100) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
 CONSTRAINT [PK__IBDS_FEA__3214EC2708211BE3] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_FILE_LOG]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_FILE_LOG](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[USER_NAME] [nvarchar](255) NULL,
	[USER_DESC] [nvarchar](255) NULL,
	[USER_IP] [nvarchar](255) NULL,
	[FILE_SIZE] [int] NULL,
	[OPERATE_TYPE] [nvarchar](255) NULL,
	[FILE_TYPE] [nvarchar](255) NULL,
	[FILE_NAME] [nvarchar](255) NULL,
	[FILE_ID] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_FPRODUCT]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_FPRODUCT](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[type] [nvarchar](100) NULL,
	[FPRODUCTNo] [nvarchar](100) NULL,
	[FPRODUCT] [nvarchar](100) NULL,
	[FPRODUCTOld] [nvarchar](100) NULL,
	[engFPRODUCT] [nvarchar](100) NULL,
	[IfPlan] [nvarchar](100) NULL,
	[FPRODUCTCOACode] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[BOM] [nvarchar](max) NULL,
	[Readers] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Match] [nvarchar](100) NULL,
	[FPRODUCTMatch] [nvarchar](100) NULL,
	[Status] [nvarchar](100) NULL CONSTRAINT [DF_IBDS_FRPRODUCT_Status]  DEFAULT ((1)),
	[CREATE_USER] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATE] [datetime] NULL,
 CONSTRAINT [PK_IBDS_FRPRODUCT] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_FPROJECTCODE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_FPROJECTCODE](
	[id] [int] NOT NULL,
	[f_objca] [varchar](100) NULL,
	[f_pdtno] [varchar](100) NULL,
	[f_projno] [varchar](100) NULL,
	[f_projname] [nvarchar](255) NULL,
	[f_projcode] [varchar](255) NULL,
	[f_productlineno] [varchar](100) NULL,
	[f_releaseno] [varchar](100) NULL,
	[f_productno] [varchar](100) NULL,
	[f_productname] [varchar](255) NULL,
	[f_rate] [int] NULL,
	[f_bizhong] [int] NULL,
	[f_fbizhong] [int] NULL,
	[BeginTime] [datetime] NULL,
	[manager] [varchar](100) NULL,
	[dept_id] [varchar](100) NULL,
	[f_pro_time] [datetime] NULL,
	[f_pro_point] [varchar](100) NULL,
	[f_remark] [varchar](255) NULL,
	[create_user] [varchar](255) NULL,
	[create_time] [datetime] NULL,
	[modify_user] [varchar](100) NULL,
	[modify_date] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_H3CPDM_Bom]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_H3CPDM_Bom](
	[OBID] [nvarchar](15) NULL,
	[S1PARTNUMBER] [nvarchar](20) NULL,
	[S1PARTREVISION] [nvarchar](3) NULL,
	[S1PARTTEMPLATE] [nvarchar](60) NULL,
	[THHXH] [nvarchar](240) NULL,
	[S1PARTDESCELEMENTS] [nvarchar](360) NULL,
	[S1EXTCHINESEDESC] [nvarchar](240) NULL,
	[S1INTENGLISHDESC] [nvarchar](240) NULL,
	[S1EXTENGLISHDESC] [nvarchar](240) NULL,
	[S1INTERNALMODEL] [nvarchar](240) NULL,
	[S1EXTERNALMODEL] [nvarchar](240) NULL,
	[DEFAULTUNITOFMEASURE] [nvarchar](32) NULL,
	[S1PARTSTATUS] [nvarchar](10) NULL,
	[H3PRODUCTLINE] [nvarchar](100) NULL,
	[S2PRODUCTPDT] [nvarchar](60) NULL,
	[H3PRODUCT] [nvarchar](100) NULL,
	[PROJECTNAME] [nvarchar](100) NULL,
	[H3PRODUCTRREVISION] [nvarchar](100) NULL,
	[H3PRODUCTBREVISION] [nvarchar](200) NULL,
	[S2ISALLOWSEND] [nvarchar](10) NULL,
	[TZ_ACTUALRELDATE] [datetime2](7) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_H3CPDM_Bom_copy]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_H3CPDM_Bom_copy](
	[OBID] [nvarchar](15) NULL,
	[S1PARTNUMBER] [nvarchar](20) NULL,
	[S1PARTREVISION] [nvarchar](3) NULL,
	[S1PARTTEMPLATE] [nvarchar](60) NULL,
	[THHXH] [nvarchar](240) NULL,
	[S1PARTDESCELEMENTS] [nvarchar](360) NULL,
	[S1EXTCHINESEDESC] [nvarchar](240) NULL,
	[S1INTENGLISHDESC] [nvarchar](240) NULL,
	[S1EXTENGLISHDESC] [nvarchar](240) NULL,
	[S1INTERNALMODEL] [nvarchar](240) NULL,
	[S1EXTERNALMODEL] [nvarchar](240) NULL,
	[DEFAULTUNITOFMEASURE] [nvarchar](32) NULL,
	[S1PARTSTATUS] [nvarchar](10) NULL,
	[H3PRODUCTLINE] [nvarchar](100) NULL,
	[S2PRODUCTPDT] [nvarchar](60) NULL,
	[H3PRODUCT] [nvarchar](100) NULL,
	[PROJECTNAME] [nvarchar](100) NULL,
	[H3PRODUCTRREVISION] [nvarchar](100) NULL,
	[H3PRODUCTBREVISION] [nvarchar](200) NULL,
	[S2ISALLOWSEND] [nvarchar](10) NULL,
	[TZ_ACTUALRELDATE] [datetime2](7) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_IFLOW_REQ]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_IFLOW_REQ](
	[SUBJECT] [varchar](5000) NULL,
	[ADD_USER_ID] [varchar](5000) NULL,
	[ADD_USER_NAME] [varchar](5000) NULL,
	[APPLY_TIME] [varchar](5000) NULL,
	[AUTHOR_ID] [varchar](5000) NULL,
	[AUTHOR_NAME] [varchar](5000) NULL,
	[URL] [varchar](5000) NULL,
	[SYSTEM_ID] [varchar](5000) NULL,
	[DOCUN_ID] [varchar](5000) NULL,
	[APP_ID] [varchar](5000) NULL,
	[PROCESS_ID] [varchar](5000) NULL,
	[PROCESS_NAME] [varchar](5000) NULL,
	[STATUS] [varchar](5000) NULL,
	[END_USER_ID] [varchar](5000) NULL,
	[ASSIGNER] [varchar](5000) NULL,
	[NODE_ID] [varchar](5000) NULL,
	[NODE_NAME] [varchar](5000) NULL,
	[TIMES_TAMP] [varchar](5000) NULL,
	[ACCEPT_TYPE] [varchar](5000) NULL,
	[REDIRECT_URL] [varchar](5000) NULL,
	[IS_BATCH] [varchar](5000) NULL,
	[IS_SMS] [varchar](255) NULL,
	[APPLICATION_URL] [varchar](255) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_INIT_LOG]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_INIT_LOG](
	[id] [int] NOT NULL,
	[type] [varchar](255) NULL,
	[isInit] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_LoginLog]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_LoginLog](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Operator] [nvarchar](100) NULL,
	[OptTime] [datetime] NULL,
	[ClientIP] [nvarchar](100) NULL,
	[OptDesc] [nvarchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_MAIL_INFO]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_MAIL_INFO](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[SEND_TO] [nvarchar](255) NULL,
	[CC_TO] [nvarchar](255) NULL,
	[SUBJECT] [nvarchar](255) NULL,
	[CONTENT] [nvarchar](255) NULL,
	[PROCESS_ID] [int] NULL,
	[APPLY_CODE] [nvarchar](255) NULL,
	[STATUS] [nvarchar](255) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[TASK_ID] [nvarchar](255) NULL,
	[URL] [nvarchar](255) NULL,
	[MODULE_DESC] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_MAXCODE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_MAXCODE](
	[project_name] [varchar](255) NULL,
	[prefix] [varchar](255) NULL,
	[code] [int] NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_MODEL_Notes]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_MODEL_Notes](
	[MODELNo] [nvarchar](100) NULL,
	[MODEL] [nvarchar](500) NULL,
	[MODELOld] [nvarchar](500) NULL,
	[engMODEL] [nvarchar](500) NULL,
	[MODELCOACode] [nvarchar](500) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[Readers] [nvarchar](500) NULL,
	[Remark] [nvarchar](500) NULL,
	[Match] [nvarchar](500) NULL,
	[MODELMatch] [nvarchar](500) NULL,
	[Status] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_MODULE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_MODULE](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MODULENo] [nvarchar](100) NULL,
	[MODULE] [nvarchar](100) NULL,
	[MODULEOld] [nvarchar](500) NULL,
	[engMODULE] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[SUBSYSTEMNo] [nvarchar](100) NULL,
	[Readers] [nvarchar](1000) NULL,
	[Remark] [nvarchar](100) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
 CONSTRAINT [PK__IBDS_MOD__3214EC270BF1ACC7] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_MODULE_VERSION]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_MODULE_VERSION](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MDLVSNNo] [nvarchar](100) NULL,
	[MDLVSN] [nvarchar](100) NULL,
	[MDLVSNOld] [nvarchar](500) NULL,
	[engMDLVSN] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[SUBSYSTEMNo] [nvarchar](100) NULL,
	[MODULENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_NoList]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_NoList](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[InfoName] [nvarchar](200) NULL,
	[CodeMark] [varchar](2) NULL,
	[CodeLength] [int] NULL,
	[CodeLast] [varchar](100) NULL,
	[Flag] [int] NULL,
 CONSTRAINT [PK_IBDS_NoList] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_Notes_BASE_LINE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_Notes_BASE_LINE](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[P] [nvarchar](100) NULL,
	[V] [nvarchar](100) NULL,
	[R] [nvarchar](100) NULL,
	[L] [nvarchar](100) NULL,
	[C] [nvarchar](100) NULL,
	[B] [nvarchar](100) NULL,
	[D] [nvarchar](100) NULL,
	[SP] [nvarchar](100) NULL,
	[BASELINENo] [nvarchar](100) NOT NULL,
	[BASELINE] [nvarchar](200) NULL,
	[BASELINEOld] [nvarchar](500) NULL,
	[engBASELINE] [nvarchar](400) NULL,
	[BASELINE_1] [nvarchar](400) NULL,
	[BASELINEOut] [nvarchar](500) NULL,
	[engBASELINEOut] [nvarchar](400) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[ParentItemNo] [nvarchar](100) NULL,
	[BASELINEStatus] [nvarchar](100) NULL,
	[BASELINEType] [nvarchar](100) NULL,
	[BASELINE_IssueTime] [datetime] NULL,
	[BASELINE_DisableTime] [datetime] NULL,
	[BASELINE_usingLimitWhether] [nvarchar](100) NULL,
	[BASELINE_UrgencyIssue] [nvarchar](100) NULL,
	[BASELINE_UsingRange] [nvarchar](100) NULL,
	[BASELINE_IssueRange] [nvarchar](100) NULL,
	[BASELINE_IssueStyle] [nvarchar](100) NULL,
	[Readers] [nvarchar](500) NULL,
	[ProdDataID] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_Notes_Bversion]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_Notes_Bversion](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[bversionno] [nvarchar](100) NULL,
	[bversioncname] [nvarchar](100) NULL,
	[bversionold] [nvarchar](500) NULL,
	[bversionename] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Match] [nvarchar](100) NULL,
	[bversionMatch] [nvarchar](100) NULL,
	[ProdDataID] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](500) NULL,
	[RNDPDT_ID] [nvarchar](500) NULL,
	[Quality_Mnger] [varchar](500) NULL,
	[CMO_ID] [nvarchar](500) NULL,
	[se] [nvarchar](500) NULL,
	[proDifficult] [nvarchar](255) NULL,
	[harddiffcult] [nvarchar](255) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[PROJECTNo] [nvarchar](100) NULL,
	[ProjectStatus] [nvarchar](100) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_Notes_Dic]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_Notes_Dic](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[FieldNo] [nvarchar](200) NULL,
	[FieldHint] [nvarchar](200) NULL,
	[FieldName] [nvarchar](200) NULL,
	[FieldMark] [nvarchar](200) NULL,
	[FieldType] [nvarchar](200) NULL,
	[IfList] [nvarchar](200) NULL,
	[IfTrack] [nvarchar](200) NULL,
	[IfChain] [nvarchar](200) NULL,
	[IfPerson] [nvarchar](200) NULL,
	[IfIPMTSecConfirm] [nvarchar](200) NULL,
	[BelongForms] [nvarchar](200) NULL,
	[Readers] [nvarchar](200) NULL,
	[Remark] [nvarchar](200) NULL,
	[SuperMan] [nvarchar](200) NULL,
	[SuperReaders] [nvarchar](200) NULL,
	[SuperWriters] [nvarchar](200) NULL,
	[Writers] [nvarchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_Notes_MODELTemp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_Notes_MODELTemp](
	[MODELNo] [nvarchar](100) NULL,
	[MODEL] [nvarchar](500) NULL,
	[MODELOld] [nvarchar](500) NULL,
	[engMODEL] [nvarchar](500) NULL,
	[MODELCOACode] [nvarchar](500) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[Readers] [nvarchar](500) NULL,
	[Remark] [nvarchar](500) NULL,
	[Match] [nvarchar](500) NULL,
	[MODELMatch] [nvarchar](500) NULL,
	[Status] [varchar](50) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_Notes_ReleaseTemp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_Notes_ReleaseTemp](
	[fldBversion_1] [nvarchar](100) NULL,
	[fldBversion_2] [nvarchar](100) NULL,
	[fldBversion_3] [nvarchar](100) NULL,
	[fldBversion_4] [nvarchar](100) NULL,
	[fldBver_1] [nvarchar](100) NULL,
	[fldBversion_5] [nvarchar](100) NULL,
	[fldBversion_6] [nvarchar](100) NULL,
	[fldBversion_7] [nvarchar](100) NULL,
	[fldBversion_8] [nvarchar](100) NULL,
	[fldBversion_9] [nvarchar](100) NULL,
	[fldBversion_10] [nvarchar](100) NULL,
	[fldBversion_11] [nvarchar](100) NULL,
	[fldBversion_12] [nvarchar](100) NULL,
	[fldBversion_13] [nvarchar](100) NULL,
	[fldBversion_14] [nvarchar](100) NULL,
	[fldBversion_15] [nvarchar](100) NULL,
	[fldBversion_16] [nvarchar](100) NULL,
	[fldBversion_17] [nvarchar](100) NULL,
	[fldBversion_18] [nvarchar](100) NULL,
	[fldBversion_19] [nvarchar](100) NULL,
	[fldBversion_20] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NOT NULL,
	[RELEASE] [nvarchar](100) NULL,
	[P] [nvarchar](100) NULL,
	[V] [nvarchar](100) NULL,
	[R] [nvarchar](100) NULL,
	[RELEASEOld] [nvarchar](500) NULL,
	[engRELEASE] [nvarchar](4000) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[ProductNO] [nvarchar](100) NULL,
	[VersionNo] [nvarchar](100) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[PROJECTNo] [nvarchar](4000) NULL,
	[PROJECTCOACode] [nvarchar](1000) NULL,
	[PROJECT] [nvarchar](1000) NULL,
	[engPROJECT] [nvarchar](4000) NULL,
	[RELEASENo_Software] [nvarchar](500) NULL,
	[PROJECTStatus] [nvarchar](50) NULL,
	[Match] [nvarchar](500) NULL,
	[RELEASEMatch] [nvarchar](500) NULL,
	[ProdDataID] [nvarchar](1000) NULL,
	[POP_ID] [nvarchar](1000) NULL,
	[CMO_ID] [nvarchar](1000) NULL,
	[Testing_Mnger] [nvarchar](1000) NULL,
	[TechSupport_Mnger] [nvarchar](1000) NULL,
	[Product_Mnger] [nvarchar](1000) NULL,
	[MarketTM] [nvarchar](1000) NULL,
	[softmg] [nvarchar](1000) NULL,
	[hardmg] [nvarchar](1000) NULL,
	[fldPDE] [nvarchar](500) NULL,
	[RNDPDT_ID] [nvarchar](1000) NULL,
	[Oversea_Mnger] [nvarchar](1000) NULL,
	[PilotProduction_Mnger] [nvarchar](1000) NULL,
	[OMC_Mnger] [nvarchar](1000) NULL,
	[System_Mnger] [nvarchar](1000) NULL,
	[Quality_Mnger] [nvarchar](1000) NULL,
	[Equipment_Mnger] [nvarchar](1000) NULL,
	[Documents_Mnger] [nvarchar](1000) NULL,
	[Purchase_Mnger] [nvarchar](1000) NULL,
	[Sales_Mnger] [nvarchar](1000) NULL,
	[PPPDT_ID] [nvarchar](1000) NULL,
	[Manufacture_Mnger] [nvarchar](1000) NULL,
	[FF_ID] [nvarchar](1000) NULL,
	[DifficultyCoefficient] [nvarchar](100) NULL,
	[DifficultyCoefficient_2] [nvarchar](100) NULL,
	[DifficultyCoefficient_3] [nvarchar](100) NULL,
	[DifficultyCoefficient_4] [nvarchar](100) NULL,
	[DifficultyCoefficient_5] [nvarchar](100) NULL,
	[DifficultyCoefficient_6] [nvarchar](100) NULL,
	[DifficultyCoefficient_7] [nvarchar](100) NULL,
	[DifficultyCoefficient_8] [nvarchar](100) NULL,
	[DifficultyCoefficient_9] [nvarchar](100) NULL,
	[DifficultyCoefficient_10] [nvarchar](100) NULL,
	[DifficultyCoefficient_11] [nvarchar](100) NULL,
	[DifficultyCoefficient_12] [nvarchar](100) NULL,
	[DifficultyCoefficient_13] [nvarchar](100) NULL,
	[DifficultyCoefficient_14] [nvarchar](100) NULL,
	[DifficultyCoefficient_15] [nvarchar](100) NULL,
	[DifficultyCoefficient_16] [nvarchar](100) NULL,
	[DifficultyCoefficient_17] [nvarchar](100) NULL,
	[DifficultyCoefficient_18] [nvarchar](100) NULL,
	[DifficultyCoefficient_19] [nvarchar](100) NULL,
	[DifficultyCoefficient_20] [nvarchar](100) NULL,
	[DifficultyCoefficient_1] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_2] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_3] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_4] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_5] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_6] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_7] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_8] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_9] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_10] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_11] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_12] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_13] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_14] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_15] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_16] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_17] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_18] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_19] [nvarchar](100) NULL,
	[DifficultyCoefficient_1_20] [nvarchar](100) NULL,
	[Readers] [nvarchar](500) NULL,
	[Remark] [nvarchar](1000) NULL,
	[Status] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_OperationLog]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_OperationLog](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Code] [nvarchar](200) NULL,
	[OptType] [nvarchar](200) NULL,
	[OldValue] [nvarchar](max) NULL,
	[NewValue] [nvarchar](max) NULL,
	[Operator] [nvarchar](200) NULL,
	[OptTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PART_CODE_APPLY]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PART_CODE_APPLY](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PROJECT_NAME] [nvarchar](255) NULL,
	[PROJECT_NO] [nvarchar](50) NULL,
	[PRODUCT_NUM] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](500) NULL,
	[INSIDE_DESC_EN] [nvarchar](255) NULL,
	[ABROAD_DESC_CN] [nvarchar](255) NULL,
	[ABROAD_DESC_EN] [nvarchar](255) NULL,
	[BUSINESS_MODEL] [nvarchar](255) NULL,
	[datasource] [nvarchar](255) NULL,
	[status] [varchar](255) NULL,
	[PRODLINE_ID] [int] NULL,
	[PROD_ID] [int] NULL,
	[FPROD_CODE_ID] [int] NULL,
	[BUSINESS_MODEL_ID] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_PART_CODE_PROCESS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PART_CODE_PROCESS](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[APPLY_CODE] [nvarchar](255) NULL,
	[STATUS] [nvarchar](255) NULL,
	[HANDLER] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[DEPT_TYPE] [nvarchar](50) NULL,
	[APPLY_PERSON] [nvarchar](50) NULL,
	[SUB_SIGN] [nvarchar](255) NULL,
	[CHECK_OPINION] [nvarchar](255) NULL,
	[CHECK_SIGN] [nvarchar](255) NULL,
	[CHECK_RESULT] [nvarchar](255) NULL,
	[PDT_SIGN] [nvarchar](255) NULL,
	[PDT_OPINION] [nvarchar](255) NULL,
	[PDT_RESULT] [nvarchar](255) NULL,
	[FPROD_SIGN] [nvarchar](255) NULL,
	[FPROD_OPINION] [nvarchar](255) NULL,
	[FPROD_RESULT] [nvarchar](255) NULL,
	[CW_SIGN] [nvarchar](255) NULL,
	[CW_OPINION] [nvarchar](255) NULL,
	[CW_RESULT] [nvarchar](50) NULL,
	[PROCESSMGN_SIGN] [nvarchar](255) NULL,
	[PROCESSMGN_RESULT] [varchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](0) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](0) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[SUBMIT_DATE] [datetime2](0) NULL,
	[CHECK_DATE] [datetime2](0) NULL,
	[PDT_DATE] [datetime2](7) NULL,
	[FPROD_DATE] [datetime2](7) NULL,
	[CW_DATE] [datetime2](7) NULL,
	[PROCESSMGN_DATE] [datetime2](7) NULL,
	[INSTANSE_ID] [nvarchar](50) NULL,
	[CURRENT_NODE] [nvarchar](255) NULL,
	[ASSIGN_SIGN] [nvarchar](255) NULL,
	[ASSIGN_DATE] [datetime2](7) NULL,
	[STATUS_DESC] [nvarchar](255) NULL,
	[PDT_MGN] [nvarchar](255) NULL,
	[TEL] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](255) NULL,
	[PDM_APPLY_CODE] [nvarchar](255) NULL,
	[PDT_ID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_PART_CRON]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PART_CRON](
	[cron_id] [int] NOT NULL,
	[cron_type] [varchar](255) NULL,
	[cron] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[cron_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_PDT]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_PDT](
	[PDTNo] [nvarchar](100) NOT NULL,
	[PDT] [nvarchar](100) NULL,
	[engPDT] [nvarchar](100) NULL,
	[PDTOld] [nvarchar](500) NULL,
	[Status] [nvarchar](50) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PDT_Manager] [nvarchar](100) NULL,
	[CMJKR_ID] [nvarchar](100) NULL,
	[SCJKR_ID] [nvarchar](100) NULL,
	[HCJKR_ID] [nvarchar](100) NULL,
	[AbroadJKR_ID] [nvarchar](100) NULL,
	[OrderDecom] [nvarchar](100) NULL,
	[Quality_Mnger_ID] [nvarchar](100) NULL,
	[PDT_GROUP] [nvarchar](100) NULL,
	[RND_GROUP] [nvarchar](100) NULL,
	[Readers] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](500) NULL,
	[LPDT_ID] [nvarchar](500) NULL,
	[RNDPDT_ID] [nvarchar](500) NULL,
	[MKTPDT_ID] [nvarchar](500) NULL,
	[FINPDT_ID] [nvarchar](500) NULL,
	[PROPDT_ID] [nvarchar](500) NULL,
	[PPPDT_ID] [nvarchar](500) NULL,
	[MFGPDT_ID] [nvarchar](500) NULL,
	[TSPDT_ID] [nvarchar](500) NULL,
	[PQA_ID] [nvarchar](500) NULL,
	[TE_ID] [nvarchar](500) NULL,
	[TD_ID] [nvarchar](500) NULL,
	[FA_ID] [nvarchar](500) NULL,
	[SE_ID] [nvarchar](500) NULL,
	[CMO_ID] [nvarchar](500) NULL,
	[NMJKR_ID] [nvarchar](100) NULL,
	[SOFTWARE_MANAGER] [nvarchar](100) NULL,
	[HARDWARE_MANAGER] [nvarchar](100) NULL,
	[EQUIPMENT_MANAGER] [nvarchar](100) NULL,
	[SQA_ID] [nvarchar](100) NULL,
	[HQA_ID] [nvarchar](100) NULL,
	[TQA_ID] [nvarchar](100) NULL,
	[PDE_ID] [nvarchar](100) NULL,
	[SOFTWARE_TEST_MANAGER] [nvarchar](100) NULL,
	[HARDWARE_TEST_MANAGER] [nvarchar](100) NULL,
	[MARKET_TECHNICAL_MANAGER] [nvarchar](100) NULL,
	[NETWORK_SE] [nvarchar](100) NULL,
	[SOFTWARE_INTERFATE_PERSON] [nvarchar](100) NULL,
	[TECHNICAL_INTERFACE_PERSON] [nvarchar](100) NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATE] [datetime] NULL,
	[id] [int] IDENTITY(1,1) NOT NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[Column01] [nvarchar](500) NULL,
	[Column02] [nvarchar](500) NULL,
	[Column03] [nvarchar](500) NULL,
	[Column04] [nvarchar](500) NULL,
	[Column05] [nvarchar](500) NULL,
	[Column06] [nvarchar](500) NULL,
	[Column07] [nvarchar](500) NULL,
	[Column08] [nvarchar](500) NULL,
	[Column09] [nvarchar](500) NULL,
	[Column10] [nvarchar](500) NULL,
 CONSTRAINT [PK__IBDS_PDT__3213E83F1A3FCC1E] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_People_APPLY]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_People_APPLY](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Process_Code] [nvarchar](200) NULL,
	[PInfoType] [nvarchar](200) NULL,
	[PLIPMTNo] [nvarchar](200) NULL,
	[PLIPMT] [nvarchar](200) NULL,
	[EngPLIPMT] [nvarchar](200) NULL,
	[PRODLINENo] [nvarchar](200) NULL,
	[PRODLINE] [nvarchar](200) NULL,
	[EngPRODLINE] [nvarchar](200) NULL,
	[PDTNo] [nvarchar](200) NULL,
	[PDT] [nvarchar](200) NULL,
	[EngPDT] [nvarchar](200) NULL,
	[VersionNo] [nvarchar](200) NULL,
	[Version] [nvarchar](200) NULL,
	[EngVersion] [nvarchar](200) NULL,
	[ReleaseNo] [nvarchar](200) NULL,
	[Release] [nvarchar](200) NULL,
	[EngRelease] [nvarchar](200) NULL,
	[IPMTSecretary] [nvarchar](200) NULL,
	[IsIPMTCheck] [nvarchar](200) NULL,
	[Remark] [nvarchar](2000) NULL,
	[Creator] [nvarchar](200) NULL,
	[CreateTime] [datetime] NULL,
	[Modifier] [nvarchar](200) NULL,
	[ModifyTime] [datetime] NULL,
	[BVersionno] [nvarchar](200) NULL,
	[BVersion] [nvarchar](200) NULL,
	[EngBVersion] [nvarchar](200) NULL,
 CONSTRAINT [PK__IBDS_Peo__3214EC2739450CD9] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_People_Item_APPLY]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_People_Item_APPLY](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[P_ID] [int] NULL,
	[ProCode] [nvarchar](200) NULL,
	[ProName] [nvarchar](200) NULL,
	[RoleName] [nvarchar](200) NULL,
	[ColumnName] [nvarchar](200) NULL,
	[OldPeoples] [nvarchar](200) NULL,
	[NewPeoples] [nvarchar](200) NULL,
	[IsSync] [char](1) NULL CONSTRAINT [DF_IBDS_People_Item_APPLY_IsSync]  DEFAULT ((0)),
	[Status] [char](1) NULL,
	[Creator] [nvarchar](200) NULL,
	[CreateTime] [datetime] NULL,
	[Modifier] [nvarchar](200) NULL,
	[ModifyTime] [datetime] NULL,
 CONSTRAINT [PK__IBDS_Peo__3214EC273D159DBD] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_People_PROCESS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_People_PROCESS](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[APPLY_CODE] [nvarchar](200) NULL,
	[Status] [nvarchar](200) NULL,
	[Handler] [nvarchar](200) NULL,
	[Instanse_ID] [nvarchar](50) NULL,
	[CurrentNode] [nvarchar](200) NULL,
	[STATUS_DESC] [nvarchar](200) NULL,
	[First_Sign] [nvarchar](200) NULL,
	[First_Date] [datetime] NULL,
	[IPMT_Sign] [nvarchar](200) NULL,
	[IPMT_Date] [datetime] NULL,
	[IPMT_Opinion] [nvarchar](2000) NULL,
	[IPMT_Result] [nvarchar](200) NULL,
	[Creator] [nvarchar](200) NULL,
	[CreateTime] [datetime] NULL,
	[Modifier] [nvarchar](200) NULL,
	[ModifyTime] [datetime] NULL,
 CONSTRAINT [PK__IBDS_Peo__3214EC2735747BF5] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [UQ_IBDS_People_PROCESS_ApplyCode] UNIQUE NONCLUSTERED 
(
	[APPLY_CODE] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PLIPMT]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_PLIPMT](
	[PLIPMTNo] [nvarchar](100) NOT NULL,
	[PLIPMT] [nvarchar](100) NULL,
	[engPLIPMT] [nvarchar](100) NULL,
	[PLIPMTOld] [nvarchar](500) NULL,
	[Status] [nvarchar](50) NULL,
	[PLIPMT_Umpire] [nvarchar](100) NULL,
	[PLIPMT_ViceUmpire] [nvarchar](100) NULL,
	[PLIMPT_Secretary] [nvarchar](100) NULL,
	[PLIPMT_Members] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[PLIPMT_PDM_Mnger] [nvarchar](100) NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATE] [datetime] NULL,
	[id] [int] IDENTITY(1,1) NOT NULL,
	[Readers] [nvarchar](500) NULL,
	[Column01] [nvarchar](500) NULL,
	[Column02] [nvarchar](500) NULL,
	[Column03] [nvarchar](500) NULL,
	[Column04] [nvarchar](500) NULL,
	[Column05] [nvarchar](500) NULL,
	[Column06] [nvarchar](500) NULL,
	[Column07] [nvarchar](500) NULL,
	[Column08] [nvarchar](500) NULL,
	[Column09] [nvarchar](500) NULL,
	[Column10] [nvarchar](500) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PRDOUCT_CODE_APPLY]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PRDOUCT_CODE_APPLY](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRODLINE_NAME] [nvarchar](255) NULL,
	[PRODUCT_NAME] [nvarchar](255) NULL,
	[PDT_NAME] [nvarchar](255) NULL,
	[PDT_NO] [nvarchar](50) NULL,
	[PDT_MNG] [nvarchar](255) NULL,
	[PRODLINE_NO] [nvarchar](50) NULL,
	[PRODUCT_NO] [nvarchar](50) NULL,
	[PRODUCT_CODE] [nvarchar](255) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BOM_CODE] [nvarchar](4000) NULL,
	[BOM_DESC] [nvarchar](4000) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[NOTE] [nvarchar](500) NULL,
	[OLD_PRODUCT_CODE] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NAME] [nvarchar](255) NULL,
	[OLD_PDT_NO] [nvarchar](255) NULL,
	[OLD_PDT_MNG] [nvarchar](255) NULL,
	[OLD_PRODLINE_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NO] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[OLD_PRODUCT_NAME_EN] [nvarchar](255) NULL,
	[OLD_BOM_CODE] [nvarchar](4000) NULL,
	[OLD_BOM_DESC] [nvarchar](4000) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
	[OLD_ID] [int] NULL,
	[PRODLINE_ID] [int] NULL DEFAULT ((0)),
	[PRODUCT_ID] [int] NULL DEFAULT ((0)),
	[PDT_ID] [int] NULL DEFAULT ((0)),
	[OLD_PRODLINE_ID] [int] NULL DEFAULT ((0)),
	[OLD_PRODUCT_ID] [int] NULL DEFAULT ((0)),
	[OLD_PDT_ID] [int] NULL DEFAULT ((0)),
	[PROD_NAME_EN] [nvarchar](255) NULL,
	[PRODLINE_NAME_EN] [varchar](255) NULL,
	[OLD_PROD_NAME_EN] [nvarchar](255) NULL,
	[OLD_PRODLINE_NAME_EN] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_PROCESS_CONFIG]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_PROCESS_CONFIG](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CODE] [nvarchar](255) NULL,
	[NAME] [nvarchar](255) NULL,
	[TYPE] [nvarchar](50) NULL,
	[NOTE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PROCESS_CONFIG_ITEM]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_PROCESS_CONFIG_ITEM](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CODE] [nvarchar](255) NULL,
	[CONFIG_CODE] [nvarchar](500) NULL,
	[CONTENT] [nvarchar](500) NULL,
	[TYPE] [nvarchar](50) NULL,
	[NOTE] [nvarchar](255) NULL,
	[PDT_CODE] [nvarchar](255) NULL,
	[FPROD_PERSON] [nvarchar](500) NULL,
	[PDT_MGN] [nvarchar](500) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[State] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PROCESS_CONFIG_ITEM_0]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_PROCESS_CONFIG_ITEM_0](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CODE] [nvarchar](255) NULL,
	[CONFIG_CODE] [nvarchar](500) NULL,
	[CONTENT] [nvarchar](500) NULL,
	[TYPE] [nvarchar](50) NULL,
	[NOTE] [nvarchar](255) NULL,
	[PDT_CODE] [nvarchar](255) NULL,
	[FPROD_PERSON] [nvarchar](500) NULL,
	[PDT_MGN] [nvarchar](500) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[State] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PROCESS_CONFIG_ITEM_1]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_PROCESS_CONFIG_ITEM_1](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CODE] [nvarchar](255) NULL,
	[CONFIG_CODE] [nvarchar](500) NULL,
	[CONTENT] [nvarchar](500) NULL,
	[TYPE] [nvarchar](50) NULL,
	[NOTE] [nvarchar](255) NULL,
	[PDT_CODE] [nvarchar](255) NULL,
	[FPROD_PERSON] [nvarchar](500) NULL,
	[PDT_MGN] [nvarchar](500) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[State] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PROCESS_CONFIG_ITEM_2]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_PROCESS_CONFIG_ITEM_2](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CODE] [nvarchar](255) NULL,
	[CONFIG_CODE] [nvarchar](500) NULL,
	[CONTENT] [nvarchar](500) NULL,
	[TYPE] [nvarchar](50) NULL,
	[NOTE] [nvarchar](255) NULL,
	[PDT_CODE] [nvarchar](255) NULL,
	[FPROD_PERSON] [nvarchar](500) NULL,
	[PDT_MGN] [nvarchar](500) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[State] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PROCESS_LOG]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PROCESS_LOG](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CHECK_DATE] [datetime2](7) NULL,
	[CHECK_PERSON] [nvarchar](255) NULL,
	[CHECK_ACCOUNT] [nvarchar](255) NULL,
	[CHECK_RESULT] [nvarchar](255) NULL,
	[CHECK_OPION] [nvarchar](2000) NULL,
	[CHECK_STATUS] [nvarchar](255) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[CREATE_USER] [varchar](255) NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [varchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_PROCESS_PERSON]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_PROCESS_PERSON](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CODE] [nvarchar](255) NULL,
	[CHECKER_ID] [nvarchar](500) NULL,
	[CHECKER_NAME] [nvarchar](500) NULL,
	[TYPE] [nvarchar](50) NULL,
	[NOTE] [nvarchar](255) NULL,
	[PROCESS_CODE] [nvarchar](255) NULL,
	[PROCESS_ROLE_CODE] [nvarchar](255) NULL,
	[DEPT_CODE] [nvarchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](7) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](7) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PRODLINE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_PRODLINE](
	[PRODLINENo] [nvarchar](100) NOT NULL,
	[PRODLINE] [nvarchar](100) NULL,
	[engPRODLINE] [nvarchar](100) NULL,
	[PRODLINEOld] [nvarchar](500) NULL,
	[Status] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[fldcpxzj] [nvarchar](100) NULL,
	[Quality_Director_ID] [nvarchar](100) NULL,
	[PL_CCB_GROUP] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Quality_Mnger_ID] [nvarchar](100) NULL,
	[Test_Mnger_ID] [nvarchar](100) NULL,
	[CMOLeader_ID] [nvarchar](100) NULL,
	[PrjMarketP] [nvarchar](100) NULL,
	[PL_CCB_SECRETARY] [nvarchar](100) NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATE] [datetime] NULL,
	[id] [int] IDENTITY(1,1) NOT NULL,
	[Readers] [nvarchar](500) NULL,
	[Column01] [nvarchar](500) NULL,
	[Column02] [nvarchar](500) NULL,
	[Column03] [nvarchar](500) NULL,
	[Column04] [nvarchar](500) NULL,
	[Column05] [nvarchar](500) NULL,
	[Column06] [nvarchar](500) NULL,
	[Column07] [nvarchar](500) NULL,
	[Column08] [nvarchar](500) NULL,
	[Column09] [nvarchar](500) NULL,
	[Column10] [nvarchar](500) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_Product]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_Product](
	[ProductNo] [nvarchar](100) NOT NULL,
	[Product] [nvarchar](100) NULL,
	[P] [nvarchar](500) NULL,
	[ProductOld] [nvarchar](500) NULL,
	[engProduct] [nvarchar](100) NULL,
	[IfPlan] [nvarchar](50) NULL,
	[ProductType] [nvarchar](100) NULL,
	[IfOfficialNaming] [nvarchar](50) NULL,
	[PRODUCTCOACode] [nvarchar](100) NULL,
	[PM_ID] [nvarchar](500) NULL,
	[POP_ID] [nvarchar](100) NULL,
	[CME_ID] [nvarchar](100) NULL,
	[CMO_ID] [nvarchar](100) NULL,
	[PDE_ID] [nvarchar](100) NULL,
	[FPRODUCT] [nvarchar](100) NULL,
	[BOM] [nvarchar](max) NULL,
	[REMARK] [nvarchar](100) NULL,
	[Status] [nvarchar](50) NULL,
	[Match] [nvarchar](500) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATE] [datetime] NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Readers] [nvarchar](500) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[Column01] [nvarchar](500) NULL,
	[Column02] [nvarchar](500) NULL,
	[Column03] [nvarchar](500) NULL,
	[Column04] [nvarchar](500) NULL,
	[Column05] [nvarchar](500) NULL,
	[Column06] [nvarchar](500) NULL,
	[Column07] [nvarchar](500) NULL,
	[Column08] [nvarchar](500) NULL,
	[Column09] [nvarchar](500) NULL,
	[Column10] [nvarchar](500) NULL,
 CONSTRAINT [PK__IBDS_Pro__3214EC2722D5121F] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_Product_Apply]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_Product_Apply](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[PRODUCT] [nvarchar](100) NULL,
	[engPRODUCT] [nvarchar](100) NULL,
	[FPRODUCTNo] [nvarchar](100) NULL,
	[PRODUCTTypeNo] [nvarchar](100) NULL,
	[PM_ID] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](100) NULL,
	[CMO_ID] [nvarchar](100) NULL,
	[PDE_ID] [nvarchar](100) NULL,
	[PRODUCTOldNo] [nvarchar](100) NULL,
	[PRODUCTOld] [nvarchar](100) NULL,
	[engPRODUCTOld] [nvarchar](100) NULL,
	[PRODUCTNameChange] [nvarchar](100) NULL,
	[IfDelBelow] [nvarchar](100) NULL,
	[AppyType] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[MODIFY_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[PROCESS_CODE] [nvarchar](100) NULL,
 CONSTRAINT [PK_IBDS_Product_Apply] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PRODUCT_CODE_PROCESS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PRODUCT_CODE_PROCESS](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[APPLY_CODE] [nvarchar](255) NULL,
	[STATUS] [nvarchar](255) NULL,
	[HANDLER] [nvarchar](255) NULL,
	[APPLY_DEPT] [nvarchar](50) NULL,
	[APPLY_TYPE] [nvarchar](50) NULL,
	[APPLY_COUNT] [nvarchar](50) NULL,
	[SUB_SIGN] [nvarchar](255) NULL,
	[CHECK_OPINION] [nvarchar](255) NULL,
	[CHECK_SIGN] [nvarchar](255) NULL,
	[CHECK_RESULT] [nvarchar](255) NULL,
	[PDT_SIGN] [nvarchar](255) NULL,
	[PDT_OPINION] [nvarchar](255) NULL,
	[PDT_RESULT] [nvarchar](255) NULL,
	[FPROD_SIGN] [nvarchar](255) NULL,
	[FPROD_OPINION] [nvarchar](255) NULL,
	[FPROD_RESULT] [nvarchar](255) NULL,
	[CW_SIGN] [nvarchar](255) NULL,
	[CW_OPINION] [nvarchar](255) NULL,
	[CW_RESULT] [nvarchar](50) NULL,
	[PROCESSMGN_SIGN] [nvarchar](255) NULL,
	[PROCESSMGN_RESULT] [varchar](255) NULL,
	[ORDER_BY] [int] NULL,
	[CREATE_DATE] [datetime2](0) NULL,
	[CREATE_USER] [nvarchar](255) NULL,
	[MODIFY_DATE] [datetime2](0) NULL,
	[MODIFY_USER] [nvarchar](255) NULL,
	[SUBMIT_DATE] [datetime2](0) NULL,
	[CHECK_DATE] [datetime2](0) NULL,
	[PDT_DATE] [datetime2](7) NULL,
	[FPROD_DATE] [datetime2](7) NULL,
	[CW_DATE] [datetime2](7) NULL,
	[PROCESSMGN_DATE] [datetime2](7) NULL,
	[INSTANSE_ID] [nvarchar](50) NULL,
	[CURRENT_NODE] [nvarchar](255) NULL,
	[ASSIGN_SIGN] [nvarchar](255) NULL,
	[ASSIGN_DATE] [datetime2](7) NULL,
	[STATUS_DESC] [nvarchar](255) NULL,
	[PDT_MGN] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_Product_MAXCODE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_Product_MAXCODE](
	[project_name] [varchar](255) NULL,
	[prefix] [varchar](255) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_Product_PROCESS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_Product_PROCESS](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ApplyCode] [nvarchar](100) NULL,
	[Status] [nvarchar](100) NULL,
	[Responsible] [nvarchar](100) NULL,
	[StatusName] [nvarchar](100) NULL,
	[APPLY_TYPE] [nvarchar](100) NULL,
	[Remark] [nvarchar](500) NULL,
	[Readers] [nvarchar](500) NULL,
	[copyto] [nvarchar](500) NULL,
	[POP_FillName] [nvarchar](100) NULL,
	[POP_FillTime] [datetime] NULL,
	[IPMT_Suggestion] [nvarchar](500) NULL,
	[IPMT_FillName] [nvarchar](100) NULL,
	[IPMT_FillTime] [datetime] NULL,
	[CheckResult] [nvarchar](100) NULL,
	[EditCurrentUser] [nvarchar](100) NULL,
	[AssignSign] [nvarchar](100) NULL,
	[AssignDate] [datetime] NULL,
	[INSTANSE_ID] [nvarchar](100) NULL,
	[CURRENT_NODE] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[MODIFY_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
 CONSTRAINT [PK_IBDS_Product_PROCESS] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [UQ_IBDS_Product_PROCESS_ApplyCode] UNIQUE NONCLUSTERED 
(
	[ApplyCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_PROJECT]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PROJECT](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PROJECTNo] [nvarchar](100) NOT NULL,
	[PROJECT] [nvarchar](100) NULL,
	[PROJECTOld] [nvarchar](500) NULL,
	[engPROJECT] [nvarchar](100) NULL,
	[PROJECTAlias] [nvarchar](100) NULL,
	[IfPlan] [nvarchar](100) NULL,
	[PROJECTCOACode] [nvarchar](100) NULL,
	[PROJECTTypeNo] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[Readers] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Match] [nvarchar](100) NULL,
	[PROJECTMatch] [nvarchar](100) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
	[dept_no] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_PROJECT_CODE_APPLY]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PROJECT_CODE_APPLY](
	[pro_name] [nvarchar](100) NULL,
	[BVersion] [nvarchar](100) NULL,
	[pro_number] [nvarchar](100) NULL,
	[pro_ca] [nvarchar](100) NULL,
	[pro_prodline_no] [nvarchar](100) NULL,
	[pro_no] [nvarchar](100) NULL,
	[pro_manager] [nvarchar](100) NULL,
	[pro_time] [datetime] NULL,
	[pro_point] [nvarchar](100) NULL,
	[version] [nvarchar](max) NULL,
	[ProFile] [nvarchar](500) NULL,
	[Remark] [nvarchar](max) NULL,
	[Probizhong] [nvarchar](100) NULL,
	[Profbizhong] [nvarchar](100) NULL,
	[create_date] [datetime] NULL,
	[create_user] [nvarchar](100) NULL,
	[modify_date] [datetime] NULL,
	[modify_user] [nvarchar](100) NULL,
	[status] [varchar](50) NULL,
	[productNum] [int] NULL,
	[apply_no] [varchar](100) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[old_pro_name] [varchar](255) NULL,
	[old_pro_number] [varchar](255) NULL,
	[old_pro_ca] [varchar](255) NULL,
	[old_pro_prodline_no] [varchar](255) NULL,
	[old_pro_no] [varchar](255) NULL DEFAULT (''),
	[old_pro_manager] [varchar](255) NULL,
	[old_version] [varchar](max) NULL,
	[old_ProFile] [varchar](255) NULL,
	[pro_ca_name] [varchar](255) NULL,
	[pro_point_name] [varchar](255) NULL,
	[pro_prodline_name] [varchar](255) NULL,
	[old_probizhong] [varchar](255) NULL,
	[old_profbizhong] [varchar](255) NULL,
	[old_pro_prodline_name] [varchar](255) NULL,
	[old_pro_ca_name] [varchar](255) NULL,
	[old_projcode_id] [int] NULL,
	[ProFile_id] [varchar](255) NULL,
	[pdt_name] [varchar](255) NULL,
	[bversion_no] [varchar](100) NULL,
	[old_bversion_no] [varchar](100) NULL,
	[old_bversion] [varchar](255) NULL,
	[pdt_no] [varchar](100) NULL,
	[release_no] [varchar](100) NULL,
	[old_projcode] [varchar](255) NULL,
	[old_projcode_name] [nvarchar](255) NULL,
	[old_release_no] [varchar](100) NULL,
	[old_release_name] [varchar](255) NULL,
	[BASIS_MATERIAL] [nvarchar](255) NULL,
	[BASIS_MATERIAL_ID] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_PROJECT_CODE_PROCESS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PROJECT_CODE_PROCESS](
	[apply_no] [nvarchar](100) NULL,
	[cur_status] [varchar](100) NULL,
	[cur_deal] [varchar](100) NULL,
	[approver] [varchar](100) NULL,
	[finance_interface] [varchar](100) NULL,
	[financer] [varchar](100) NULL,
	[project_office] [varchar](100) NULL,
	[approver_suggest] [nvarchar](2000) NULL,
	[finance_interface_suggest] [nvarchar](2000) NULL,
	[financer_suggest] [nvarchar](2000) NULL,
	[project_office_suggest] [nvarchar](2000) NULL,
	[process_mng] [varchar](100) NULL,
	[process_ins_id] [varchar](255) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[projMng_suggest] [varchar](2000) NULL,
	[proj_mng] [varchar](255) NULL,
	[applyer] [varchar](255) NULL,
	[dept] [varchar](100) NULL,
	[opt_type] [varchar](255) NULL,
	[pro_name] [varchar](255) NULL,
	[apply_count] [int] NULL,
	[apply_time] [datetime] NULL,
	[proj_mng_time] [datetime] NULL,
	[proj_fin_interface_time] [datetime] NULL,
	[proj_fin_time] [datetime] NULL,
	[proj_office_time] [datetime] NULL,
	[proj_mng_show] [varchar](255) NULL,
	[create_time] [datetime2](7) NULL DEFAULT (getdate()),
	[assign_Sign] [varchar](2000) NULL,
	[assign_Date] [datetime] NULL,
	[is_edit] [varchar](255) NULL DEFAULT ((-1)),
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_PROJECT_CODE_RECOMMEND]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PROJECT_CODE_RECOMMEND](
	[pro_number] [varchar](100) NULL,
	[pro_name] [nvarchar](255) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[pdt_no] [varchar](100) NULL,
	[bversion_name] [nvarchar](255) NULL,
	[pdt_name] [nvarchar](255) NULL,
	[proline_name] [nvarchar](255) NULL,
	[status] [varchar](10) NULL,
	[remark] [varchar](max) NULL,
 CONSTRAINT [PK__IBDS_PRO__3213E83F7CFB18A8] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_PROJECT_CODE_RECOMMEND_bak]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PROJECT_CODE_RECOMMEND_bak](
	[pro_number] [varchar](100) NULL,
	[pro_name] [nvarchar](255) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[pdt_no] [varchar](100) NULL,
	[bversion_name] [nvarchar](255) NULL,
	[pdt_name] [nvarchar](255) NULL,
	[proline_name] [nvarchar](255) NULL,
	[status] [varchar](10) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_PROJECT_PRODUCT_REL]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_PROJECT_PRODUCT_REL](
	[proj_no] [nvarchar](100) NOT NULL,
	[PRODUCT_CODE] [nvarchar](100) NULL,
	[aplicant] [nvarchar](100) NULL,
	[applyDate] [datetime] NULL,
	[pdtno] [nvarchar](100) NULL,
	[rate] [nvarchar](100) NULL,
	[status] [nvarchar](255) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[product_name] [varchar](255) NULL,
	[pdt_name] [varchar](255) NULL,
	[project_code_id] [int] NULL,
	[old_product_name] [varchar](255) NULL,
	[old_pdt_name] [varchar](255) NULL,
	[old_product_code] [varchar](255) NULL,
	[old_rate] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_RDProduct]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_RDProduct](
	[PRODUCTNo] [nvarchar](100) NULL,
	[PRODUCT] [nvarchar](100) NULL,
	[engPRODUCT] [nvarchar](100) NULL,
	[PRODUCTOld] [nvarchar](500) NULL,
	[Status] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[PRODUCTCOACode] [nvarchar](100) NULL,
	[IfPlan] [nvarchar](100) NULL,
	[PRODUCTTypeNo] [nvarchar](100) NULL,
	[IfOfficialNaming] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_RELEASE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_RELEASE](
	[RELEASENo] [nvarchar](100) NOT NULL,
	[RELEASE] [nvarchar](500) NULL,
	[P] [nvarchar](100) NULL,
	[V] [nvarchar](100) NULL,
	[R] [nvarchar](100) NULL,
	[RELEASEOld] [nvarchar](500) NULL,
	[engRELEASE] [nvarchar](500) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[Status] [nvarchar](100) NULL CONSTRAINT [DF_IBDS_RELEASE_Status]  DEFAULT ((1)),
	[VersionNo] [nvarchar](100) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[projectno] [nvarchar](1000) NULL,
	[RELEASENo_Software] [nvarchar](500) NULL,
	[PROJECTStatus] [nvarchar](50) NULL,
	[Match] [nvarchar](500) NULL,
	[RELEASEMatch] [nvarchar](500) NULL,
	[ProdDataID] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](500) NULL,
	[CMO_ID] [nvarchar](500) NULL,
	[Testing_Mnger] [nvarchar](500) NULL,
	[TechSupport_Mnger] [nvarchar](500) NULL,
	[Product_Mnger] [nvarchar](500) NULL,
	[MarketTM] [nvarchar](500) NULL,
	[softmg] [nvarchar](500) NULL,
	[hardmg] [nvarchar](500) NULL,
	[fldPDE] [nvarchar](500) NULL,
	[RNDPDT_ID] [nvarchar](500) NULL,
	[Oversea_Mnger] [nvarchar](500) NULL,
	[PilotProduction_Mnger] [nvarchar](500) NULL,
	[OMC_Mnger] [nvarchar](500) NULL,
	[System_Mnger] [nvarchar](500) NULL,
	[Quality_Mnger] [nvarchar](500) NULL,
	[Equipment_Mnger] [nvarchar](500) NULL,
	[Documents_Mnger] [nvarchar](500) NULL,
	[Purchase_Mnger] [nvarchar](500) NULL,
	[Sales_Mnger] [nvarchar](500) NULL,
	[PPPDT_ID] [nvarchar](500) NULL,
	[Manufacture_Mnger] [nvarchar](500) NULL,
	[FF_ID] [nvarchar](500) NULL,
	[proDifficult] [nvarchar](100) NULL,
	[harddiffcult] [nvarchar](100) NULL,
	[Readers] [nvarchar](500) NULL,
	[FINPDT_ID] [nvarchar](500) NULL,
	[Remark] [nvarchar](1000) NULL,
	[ProductNO] [nvarchar](100) NULL,
	[fdr] [nvarchar](500) NULL,
	[outnetparter] [nvarchar](500) NULL,
	[SE] [nvarchar](500) NULL,
	[SQA_ID] [nvarchar](500) NULL,
	[HQA_ID] [nvarchar](500) NULL,
	[TQA_ID] [nvarchar](500) NULL,
	[SOFTTESTMNG] [nvarchar](500) NULL,
	[HARDTESTMNG] [nvarchar](500) NULL,
	[SOFTPLAT_ID] [nvarchar](500) NULL,
	[NETMGPERSON_ID] [nvarchar](500) NULL,
	[NETMGNET] [nvarchar](500) NULL,
	[bom] [nvarchar](max) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Column01] [nvarchar](500) NULL,
	[Column02] [nvarchar](500) NULL,
	[Column03] [nvarchar](500) NULL,
	[Column04] [nvarchar](500) NULL,
	[Column05] [nvarchar](500) NULL,
	[Column06] [nvarchar](500) NULL,
	[Column07] [nvarchar](500) NULL,
	[Column08] [nvarchar](500) NULL,
	[Column09] [nvarchar](500) NULL,
	[Column10] [nvarchar](500) NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[MODIFY_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
 CONSTRAINT [PK__IBDS_REL__3214EC275CB86648] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_Resource]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_Resource](
	[HRES_ID] [int] IDENTITY(1,1) NOT NULL,
	[HRES_PCODE] [nvarchar](50) NULL,
	[HRES_NAME] [nvarchar](100) NULL,
	[HRES_CODE] [nvarchar](50) NULL,
	[HRES_CONTENT] [nvarchar](255) NULL,
	[HRES_CREATE_USER] [nvarchar](255) NULL,
	[HRES_CREATE_DATE] [datetime] NULL,
	[HRES_MODIFY_USER] [nvarchar](255) NULL,
	[HRES_MODIFY_DATE] [datetime] NULL,
	[HRES_SORT] [int] NULL,
	[RESOURCE_TYPE] [nvarchar](50) NULL,
	[FLAG] [nvarchar](50) NULL,
	[REMARK] [nvarchar](255) NULL,
	[IsShow] [char](1) NULL CONSTRAINT [DF_IBDS_Resource_IsShow]  DEFAULT ((0)),
	[HRES_TYPE] [nvarchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[HRES_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_Role]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_Role](
	[HRL_ID] [int] IDENTITY(1,1) NOT NULL,
	[HRL_NAME] [nvarchar](255) NULL,
	[HRL_CODE] [nvarchar](255) NULL,
	[HRL_CREATE_USER] [nvarchar](255) NULL,
	[HRL_CREATE_DATE] [datetime] NULL,
	[HRL_MODIFY_USER] [nvarchar](255) NULL,
	[HRL_MODIFY_DATE] [datetime] NULL,
	[FLAG] [int] NULL,
	[REMARK] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[HRL_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_ROLE_DATA]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_ROLE_DATA](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ROLE_ID] [int] NULL,
	[DATA_ID] [int] NULL,
	[ROLE_CODE] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_ROLE_DATA_1]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_ROLE_DATA_1](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ROLE_ID] [int] NULL,
	[DATA_ID] [int] NULL,
	[ROLE_CODE] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_Role_Resource]    Script Date: 2019/12/17 10:27:08 ******/
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
/****** Object:  Table [dbo].[IBDS_SUB_FEATRUE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_SUB_FEATRUE](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[SUBFEATURENo] [nvarchar](100) NULL,
	[SUBFEATURE] [nvarchar](100) NULL,
	[SUBFEATUREOld] [nvarchar](500) NULL,
	[engSUBFEATURE] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[FEATURENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](1000) NULL,
	[Remark] [nvarchar](100) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
 CONSTRAINT [PK__IBDS_SUB__3214EC277CAF6937] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_SUB_SYSTEM]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_SUB_SYSTEM](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[SUBSYSTEMNo] [nvarchar](100) NULL,
	[SUBSYSTEM] [nvarchar](100) NULL,
	[SUBSYSTEMOld] [nvarchar](500) NULL,
	[engSUBSYSTEM] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](1000) NULL,
	[Remark] [nvarchar](100) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
 CONSTRAINT [PK__IBDS_SUB__3214EC2778DED853] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_TASK]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_TASK](
	[task_id] [varchar](255) NOT NULL,
	[task_desc] [varchar](255) NULL,
	[status] [varchar](255) NULL,
	[type] [varchar](100) NOT NULL,
	[val] [varchar](1000) NOT NULL,
	[create_user] [varchar](255) NULL,
	[status_desc] [varchar](255) NULL,
	[create_time] [datetime] NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[final_status] [varchar](255) NULL,
	[update_user] [varchar](255) NULL,
	[update_time] [datetime] NULL,
	[act_task_id] [nvarchar](64) NOT NULL,
	[erp_apply_no] [varchar](100) NOT NULL,
	[cause] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_TEAM]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_TEAM](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[TEAMNo] [nvarchar](100) NULL,
	[TEAM] [nvarchar](100) NULL,
	[TEAMOld] [nvarchar](500) NULL,
	[engTEAM] [nvarchar](100) NULL,
	[PLIPMTNo] [nvarchar](100) NULL,
	[PRODLINENo] [nvarchar](100) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[VERSIONNo] [nvarchar](100) NULL,
	[RELEASENo] [nvarchar](100) NULL,
	[Readers] [nvarchar](1000) NULL,
	[Remark] [nvarchar](100) NULL,
	[Status] [nvarchar](50) NULL,
	[CREATED_USER] [nvarchar](100) NULL,
	[CREATED_DATE] [datetime] NULL,
	[MODIFY_USER] [nvarchar](100) NULL,
	[MODIFY_DATA] [datetime] NULL,
	[STANDBY1] [nvarchar](255) NULL,
	[STANDBY2] [nvarchar](255) NULL,
	[STANDBY3] [nvarchar](255) NULL,
	[STANDBY4] [nvarchar](255) NULL,
	[STANDBY5] [nvarchar](255) NULL,
	[STANDBY6] [nvarchar](255) NULL,
	[STANDBY7] [nvarchar](255) NULL,
	[STANDBY8] [nvarchar](255) NULL,
	[STANDBY9] [nvarchar](255) NULL,
	[STANDBY10] [nvarchar](255) NULL,
 CONSTRAINT [PK__IBDS_TEA__3214EC2704508AFF] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_User_Resource]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_User_Resource](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[HRRR_HUL_CODE] [varchar](100) NOT NULL,
	[HRRR_HRES_CODE] [varchar](100) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_User_Role]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_User_Role](
	[HURR_ID] [int] IDENTITY(1,1) NOT NULL,
	[HURR_HUL_CODE] [varchar](255) NOT NULL,
	[HURR_HRL_CODE] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[HURR_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_UserGroup]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_UserGroup](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[NotesGroup] [nvarchar](500) NULL,
	[AdmpGroup] [nvarchar](500) NULL,
	[GroupUserCode] [nvarchar](500) NULL,
	[CreateUser] [nvarchar](100) NULL,
	[CreateDate] [datetime] NULL,
	[ModifyUser] [nvarchar](100) NULL,
	[ModifyDate] [datetime] NULL,
	[Status] [int] NULL,
 CONSTRAINT [PK_UserGroup] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[IBDS_VERSION]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_VERSION](
	[VERSIONNo] [nvarchar](100) NOT NULL,
	[VERSION] [nvarchar](100) NULL,
	[P] [nvarchar](100) NULL,
	[V] [nvarchar](100) NULL,
	[engVERSION] [nvarchar](100) NULL,
	[VERSIONOld] [nvarchar](500) NULL,
	[Status] [nvarchar](50) NULL,
	[PRODUCTNo] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](100) NULL,
	[CMO_ID] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[Match] [nvarchar](500) NULL,
	[VersionMatch] [nvarchar](500) NULL,
	[ProdDataID] [nvarchar](500) NULL,
	[PilotProduction_Mnger] [nvarchar](100) NULL,
	[TechSupport_Mnger] [nvarchar](500) NULL,
	[Oversea_Mnger] [nvarchar](500) NULL,
	[CREATE_USER] [nvarchar](100) NULL,
	[CREATE_DATE] [datetime] NULL,
	[MODIFY_USER] [varchar](255) NULL,
	[MODIFY_DATE] [datetime] NULL,
	[PLIPMTNo] [nvarchar](255) NULL,
	[PRODLINENo] [nvarchar](255) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Readers] [nvarchar](100) NULL,
	[Column01] [nvarchar](500) NULL,
	[Column02] [nvarchar](500) NULL,
	[Column03] [nvarchar](500) NULL,
	[Column04] [nvarchar](500) NULL,
	[Column05] [nvarchar](500) NULL,
	[Column06] [nvarchar](500) NULL,
	[Column07] [nvarchar](500) NULL,
	[Column08] [nvarchar](500) NULL,
	[Column09] [nvarchar](500) NULL,
	[Column10] [nvarchar](500) NULL,
 CONSTRAINT [PK_IBDS_VERSION] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_VR_APPLY]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[IBDS_VR_APPLY](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Process_Code] [nvarchar](200) NULL,
	[PLIPMTNo] [nvarchar](200) NULL,
	[ProdLineNo] [nvarchar](200) NULL,
	[ProductNo] [nvarchar](200) NULL,
	[IPMTSecretary] [nvarchar](200) NULL,
	[NewPV] [char](1) NULL,
	[VersionNewNo] [nvarchar](200) NULL,
	[VersionNew] [nvarchar](200) NULL,
	[engVersionNew] [nvarchar](200) NULL,
	[ModPV] [char](1) NULL,
	[VersionOldNo] [nvarchar](200) NULL,
	[VersionOld] [nvarchar](200) NULL,
	[engVersionOld] [nvarchar](200) NULL,
	[VersionNow] [nvarchar](200) NULL,
	[engVersionNow] [nvarchar](200) NULL,
	[DelPV] [char](1) NULL,
	[VersionDelNo] [nvarchar](200) NULL,
	[Versiondel] [nvarchar](200) NULL,
	[engVersionDel] [nvarchar](200) NULL,
	[PVIfDelBelow] [char](1) NULL,
	[VersionNo] [nvarchar](200) NULL,
	[NewPR] [char](1) NULL,
	[ReleaseNewNo] [nvarchar](200) NULL,
	[ReleaseNew] [nvarchar](200) NULL,
	[engReleaseNew] [nvarchar](200) NULL,
	[PDTNo] [nvarchar](200) NULL,
	[ReleaseNo_Software] [nvarchar](200) NULL,
	[ModPR] [char](1) NULL,
	[ReleaseOldNo] [nvarchar](200) NULL,
	[ReleaseOld] [nvarchar](200) NULL,
	[engReleaseOld] [nvarchar](200) NULL,
	[ReleaseNow] [nvarchar](200) NULL,
	[engReleaseNow] [nvarchar](200) NULL,
	[ReleaseNo_SoftwareNow] [nvarchar](200) NULL,
	[DelPR] [char](1) NULL,
	[ReleaseDelNo] [nvarchar](200) NULL,
	[ReleaseDel] [nvarchar](200) NULL,
	[engReleaseDel] [nvarchar](200) NULL,
	[PRIfDelBelow] [char](1) NULL,
	[copyto] [nvarchar](2000) NULL,
	[Remark] [nvarchar](2000) NULL,
	[Creator] [nvarchar](200) NULL,
	[CreateTime] [datetime] NULL,
	[Modifier] [nvarchar](200) NULL,
	[ModifyTime] [datetime] NULL,
	[InheritRelease] [nvarchar](200) NULL,
	[PDTOldNo] [nvarchar](200) NULL,
	[PDTOld] [nvarchar](200) NULL,
	[PDTNowNo] [nvarchar](200) NULL,
	[ReleaseNo_SoftwareOld] [nvarchar](200) NULL,
 CONSTRAINT [PK__IBDS_VR___3214EC2719CC6180] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[IBDS_VR_PROCESS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IBDS_VR_PROCESS](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[APPLY_CODE] [nvarchar](200) NULL,
	[Status] [nvarchar](200) NULL,
	[Handler] [nvarchar](200) NULL,
	[Instanse_ID] [nvarchar](50) NULL,
	[CurrentNode] [nvarchar](200) NULL,
	[STATUS_DESC] [nvarchar](200) NULL,
	[First_Sign] [nvarchar](200) NULL,
	[First_Date] [datetime] NULL,
	[IPMT_Sign] [nvarchar](200) NULL,
	[IPMT_Date] [datetime] NULL,
	[IPMT_Opinion] [nvarchar](2000) NULL,
	[IPMT_Result] [nvarchar](200) NULL,
	[Creator] [nvarchar](200) NULL,
	[CreateTime] [datetime] NULL,
	[Modifier] [nvarchar](200) NULL,
	[ModifyTime] [datetime] NULL,
 CONSTRAINT [PK__IBDS_VR___3214EC2715FBD09C] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [UQ_IBDS_VR_PROCESS_ApplyCode] UNIQUE NONCLUSTERED 
(
	[APPLY_CODE] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[notesProjectCode]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[notesProjectCode](
	[f_objca_name] [varchar](100) NULL,
	[f_pdt_name] [nvarchar](255) NULL,
	[f_projno] [varchar](100) NULL,
	[f_projname] [varchar](255) NULL,
	[f_projcode] [varchar](100) NULL,
	[f_productline_name] [nvarchar](100) NULL,
	[f_version] [varchar](max) NULL,
	[f_product_code] [varchar](100) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[rate] [decimal](18, 10) NULL,
	[f_bizhong] [decimal](18, 10) NULL,
	[f_fbizhong] [decimal](18, 10) NULL,
	[BeginTime] [datetime] NULL,
	[f_projMng] [nvarchar](200) NULL,
	[f_dept] [nvarchar](500) NULL,
	[f_start_project_time] [datetime] NULL,
	[f_assign_point_name] [varchar](255) NULL,
	[remark] [varchar](max) NULL,
	[f_old_objca_name] [varchar](255) NULL,
	[f_old_pdt_name] [varchar](255) NULL,
	[f_old_projno] [varchar](100) NULL,
	[f_old_projname] [varchar](255) NULL,
	[f_old_projcode] [varchar](255) NULL,
	[f_old_productline_name] [nvarchar](255) NULL,
	[f_old_version] [varchar](max) NULL,
	[f_old_productno] [varchar](100) NULL,
	[f_old_productname] [varchar](255) NULL,
	[f_old_rate] [decimal](18, 10) NULL,
	[f_old_bizhong] [decimal](18, 10) NULL,
	[f_old_fbizhong] [decimal](18, 10) NULL,
	[f_author] [varchar](255) NULL,
	[WF_ORUNID] [varchar](100) NULL,
	[mark] [varchar](255) NULL,
	[UpdataFlag] [varchar](255) NULL,
	[readers] [varchar](255) NULL,
	[f_zhuangtai] [varchar](255) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[notesProjectCode_]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[notesProjectCode_](
	[f_objca_name] [varchar](100) NULL,
	[f_pdt_name] [nvarchar](255) NULL,
	[f_projno] [varchar](100) NULL,
	[f_projname] [varchar](255) NULL,
	[f_projcode] [varchar](100) NULL,
	[f_productline_name] [nvarchar](100) NULL,
	[f_version] [varchar](max) NULL,
	[f_product_code] [varchar](100) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[rate] [numeric](18, 10) NULL,
	[f_bizhong] [numeric](18, 10) NULL,
	[f_fbizhong] [numeric](18, 10) NULL,
	[BeginTime] [datetime] NULL,
	[f_projMng] [nvarchar](200) NULL,
	[f_dept] [nvarchar](500) NULL,
	[f_start_project_time] [datetime] NULL,
	[f_assign_point_name] [varchar](255) NULL,
	[remark] [varchar](max) NULL,
	[f_old_objca_name] [varchar](255) NULL,
	[f_old_pdt_name] [varchar](255) NULL,
	[f_old_projno] [varchar](100) NULL,
	[f_old_projname] [varchar](255) NULL,
	[f_old_projcode] [varchar](255) NULL,
	[f_old_productline_name] [nvarchar](255) NULL,
	[f_old_version] [varchar](max) NULL,
	[f_old_productno] [varchar](100) NULL,
	[f_old_productname] [varchar](255) NULL,
	[f_old_rate] [numeric](18, 10) NULL,
	[f_old_bizhong] [numeric](18, 10) NULL,
	[f_old_fbizhong] [numeric](18, 10) NULL,
	[f_author] [varchar](255) NULL,
	[WF_ORUNID] [varchar](100) NULL,
	[mark] [varchar](255) NULL,
	[UpdataFlag] [varchar](255) NULL,
	[readers] [varchar](255) NULL,
	[f_zhuangtai] [varchar](255) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[notesProjectCodeTmp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[notesProjectCodeTmp](
	[f_objca_name] [varchar](100) NULL,
	[f_pdt_name] [nvarchar](255) NULL,
	[f_projno] [varchar](100) NULL,
	[f_projname] [varchar](255) NULL,
	[f_projcode] [varchar](100) NULL,
	[f_productline_name] [nvarchar](100) NULL,
	[f_version] [varchar](max) NULL,
	[f_product_code] [varchar](100) NULL,
	[PRODUCT_NAME_CN] [nvarchar](255) NULL,
	[rate] [decimal](18, 10) NULL,
	[f_bizhong] [decimal](18, 10) NULL,
	[f_fbizhong] [decimal](18, 10) NULL,
	[BeginTime] [datetime] NULL,
	[f_projMng] [nvarchar](200) NULL,
	[f_dept] [nvarchar](500) NULL,
	[f_start_project_time] [datetime] NULL,
	[f_assign_point_name] [varchar](255) NULL,
	[remark] [varchar](max) NULL,
	[f_old_objca_name] [varchar](255) NULL,
	[f_old_pdt_name] [varchar](255) NULL,
	[f_old_projno] [varchar](100) NULL,
	[f_old_projname] [varchar](255) NULL,
	[f_old_projcode] [varchar](255) NULL,
	[f_old_productline_name] [nvarchar](255) NULL,
	[f_old_version] [varchar](max) NULL,
	[f_old_productno] [varchar](100) NULL,
	[f_old_productname] [varchar](255) NULL,
	[f_old_rate] [decimal](18, 10) NULL,
	[f_old_bizhong] [decimal](18, 10) NULL,
	[f_old_fbizhong] [decimal](18, 10) NULL,
	[f_author] [varchar](255) NULL,
	[WF_ORUNID] [varchar](100) NULL,
	[mark] [varchar](255) NULL,
	[UpdataFlag] [varchar](255) NULL,
	[readers] [varchar](255) NULL,
	[f_zhuangtai] [varchar](255) NULL,
	[cause] [varchar](255) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PDT_FPROD_PERSON_Temp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[PDT_FPROD_PERSON_Temp](
	[writer] [varchar](12) NOT NULL,
	[info_type] [varchar](7) NOT NULL,
	[PdtName] [nvarchar](500) NULL,
	[PdtPerson] [nvarchar](500) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PDT_PDT_MGN_Temp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PDT_PDT_MGN_Temp](
	[fldpdt] [nvarchar](500) NULL,
	[fldpdtmanager] [nvarchar](500) NULL,
	[fldpop] [nvarchar](500) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ProductBaseline_Temp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ProductBaseline_Temp](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[BASELINENo] [nvarchar](20) NULL,
	[BASELINE] [nvarchar](200) NULL,
	[engBASELINE] [nvarchar](400) NULL,
	[BASELINE_1] [nvarchar](400) NULL,
	[RELEASENo] [nvarchar](200) NULL,
	[CreateDate] [datetime] NULL,
	[Status] [char](10) NULL,
 CONSTRAINT [PK_ProductBaseline_Temp] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_BLOB_TRIGGERS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_BLOB_TRIGGERS](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[TRIGGER_NAME] [varchar](200) NOT NULL,
	[TRIGGER_GROUP] [varchar](200) NOT NULL,
	[BLOB_DATA] [image] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_CALENDARS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_CALENDARS](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[CALENDAR_NAME] [varchar](200) NOT NULL,
	[CALENDAR] [image] NOT NULL,
 CONSTRAINT [PK_QRTZ_CALENDARS] PRIMARY KEY CLUSTERED 
(
	[SCHED_NAME] ASC,
	[CALENDAR_NAME] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_CRON_TRIGGERS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_CRON_TRIGGERS](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[TRIGGER_NAME] [varchar](200) NOT NULL,
	[TRIGGER_GROUP] [varchar](200) NOT NULL,
	[CRON_EXPRESSION] [varchar](120) NOT NULL,
	[TIME_ZONE_ID] [varchar](80) NULL,
 CONSTRAINT [PK_QRTZ_CRON_TRIGGERS] PRIMARY KEY CLUSTERED 
(
	[SCHED_NAME] ASC,
	[TRIGGER_NAME] ASC,
	[TRIGGER_GROUP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_FIRED_TRIGGERS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_FIRED_TRIGGERS](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[ENTRY_ID] [varchar](95) NOT NULL,
	[TRIGGER_NAME] [varchar](200) NOT NULL,
	[TRIGGER_GROUP] [varchar](200) NOT NULL,
	[INSTANCE_NAME] [varchar](200) NOT NULL,
	[FIRED_TIME] [bigint] NOT NULL,
	[SCHED_TIME] [bigint] NOT NULL,
	[PRIORITY] [int] NOT NULL,
	[STATE] [varchar](16) NOT NULL,
	[JOB_NAME] [varchar](200) NULL,
	[JOB_GROUP] [varchar](200) NULL,
	[IS_NONCONCURRENT] [varchar](1) NULL,
	[REQUESTS_RECOVERY] [varchar](1) NULL,
 CONSTRAINT [PK_QRTZ_FIRED_TRIGGERS] PRIMARY KEY CLUSTERED 
(
	[SCHED_NAME] ASC,
	[ENTRY_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_JOB_DETAILS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_JOB_DETAILS](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[JOB_NAME] [varchar](200) NOT NULL,
	[JOB_GROUP] [varchar](200) NOT NULL,
	[DESCRIPTION] [varchar](250) NULL,
	[JOB_CLASS_NAME] [varchar](250) NOT NULL,
	[IS_DURABLE] [varchar](1) NOT NULL,
	[IS_NONCONCURRENT] [varchar](1) NOT NULL,
	[IS_UPDATE_DATA] [varchar](1) NOT NULL,
	[REQUESTS_RECOVERY] [varchar](1) NOT NULL,
	[JOB_DATA] [image] NULL,
 CONSTRAINT [PK_QRTZ_JOB_DETAILS] PRIMARY KEY CLUSTERED 
(
	[SCHED_NAME] ASC,
	[JOB_NAME] ASC,
	[JOB_GROUP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_LOCKS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_LOCKS](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[LOCK_NAME] [varchar](40) NOT NULL,
 CONSTRAINT [PK_QRTZ_LOCKS] PRIMARY KEY CLUSTERED 
(
	[SCHED_NAME] ASC,
	[LOCK_NAME] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_PAUSED_TRIGGER_GRPS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_PAUSED_TRIGGER_GRPS](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[TRIGGER_GROUP] [varchar](200) NOT NULL,
 CONSTRAINT [PK_QRTZ_PAUSED_TRIGGER_GRPS] PRIMARY KEY CLUSTERED 
(
	[SCHED_NAME] ASC,
	[TRIGGER_GROUP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_SCHEDULER_STATE]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_SCHEDULER_STATE](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[INSTANCE_NAME] [varchar](200) NOT NULL,
	[LAST_CHECKIN_TIME] [bigint] NOT NULL,
	[CHECKIN_INTERVAL] [bigint] NOT NULL,
 CONSTRAINT [PK_QRTZ_SCHEDULER_STATE] PRIMARY KEY CLUSTERED 
(
	[SCHED_NAME] ASC,
	[INSTANCE_NAME] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_SIMPLE_TRIGGERS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_SIMPLE_TRIGGERS](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[TRIGGER_NAME] [varchar](200) NOT NULL,
	[TRIGGER_GROUP] [varchar](200) NOT NULL,
	[REPEAT_COUNT] [bigint] NOT NULL,
	[REPEAT_INTERVAL] [bigint] NOT NULL,
	[TIMES_TRIGGERED] [bigint] NOT NULL,
 CONSTRAINT [PK_QRTZ_SIMPLE_TRIGGERS] PRIMARY KEY CLUSTERED 
(
	[SCHED_NAME] ASC,
	[TRIGGER_NAME] ASC,
	[TRIGGER_GROUP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_SIMPROP_TRIGGERS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_SIMPROP_TRIGGERS](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[TRIGGER_NAME] [varchar](200) NOT NULL,
	[TRIGGER_GROUP] [varchar](200) NOT NULL,
	[STR_PROP_1] [varchar](512) NULL,
	[STR_PROP_2] [varchar](512) NULL,
	[STR_PROP_3] [varchar](512) NULL,
	[INT_PROP_1] [int] NULL,
	[INT_PROP_2] [int] NULL,
	[LONG_PROP_1] [bigint] NULL,
	[LONG_PROP_2] [bigint] NULL,
	[DEC_PROP_1] [numeric](13, 4) NULL,
	[DEC_PROP_2] [numeric](13, 4) NULL,
	[BOOL_PROP_1] [varchar](1) NULL,
	[BOOL_PROP_2] [varchar](1) NULL,
 CONSTRAINT [PK_QRTZ_SIMPROP_TRIGGERS] PRIMARY KEY CLUSTERED 
(
	[SCHED_NAME] ASC,
	[TRIGGER_NAME] ASC,
	[TRIGGER_GROUP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QRTZ_TRIGGERS]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QRTZ_TRIGGERS](
	[SCHED_NAME] [varchar](120) NOT NULL,
	[TRIGGER_NAME] [varchar](200) NOT NULL,
	[TRIGGER_GROUP] [varchar](200) NOT NULL,
	[JOB_NAME] [varchar](200) NOT NULL,
	[JOB_GROUP] [varchar](200) NOT NULL,
	[DESCRIPTION] [varchar](250) NULL,
	[NEXT_FIRE_TIME] [bigint] NULL,
	[PREV_FIRE_TIME] [bigint] NULL,
	[PRIORITY] [int] NULL,
	[TRIGGER_STATE] [varchar](16) NOT NULL,
	[TRIGGER_TYPE] [varchar](8) NOT NULL,
	[START_TIME] [bigint] NOT NULL,
	[END_TIME] [bigint] NULL,
	[CALENDAR_NAME] [varchar](200) NULL,
	[MISFIRE_INSTR] [smallint] NULL,
	[JOB_DATA] [image] NULL,
 CONSTRAINT [PK_QRTZ_TRIGGERS] PRIMARY KEY CLUSTERED 
(
	[SCHED_NAME] ASC,
	[TRIGGER_NAME] ASC,
	[TRIGGER_GROUP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ReleaseDemo]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ReleaseDemo](
	[RELEASENo] [nvarchar](103) NULL,
	[RELEASE] [nvarchar](103) NULL,
	[engRELEASE] [nvarchar](100) NULL,
	[RELEASEOld] [nvarchar](500) NULL,
	[Status] [nvarchar](100) NULL,
	[PDTNo] [nvarchar](100) NULL,
	[VersionNo] [nvarchar](100) NULL,
	[POP_ID] [nvarchar](100) NULL,
	[Product_Mnger] [nvarchar](100) NULL,
	[RNDPDT_ID] [nvarchar](100) NULL,
	[Sales_Mnger] [nvarchar](100) NULL,
	[FINPDT_ID] [nvarchar](100) NULL,
	[Purchase_Mnger] [nvarchar](100) NULL,
	[Manufacture_Mnger] [nvarchar](100) NULL,
	[PPPDT_ID] [nvarchar](100) NULL,
	[TechSupport_Mnger] [nvarchar](100) NULL,
	[Quality_Mnger] [nvarchar](100) NULL,
	[System_Mnger] [nvarchar](100) NULL,
	[softmg] [nvarchar](100) NULL,
	[hardmg] [nvarchar](100) NULL,
	[Documents_Mnger] [nvarchar](100) NULL,
	[Equipment_Mnger] [nvarchar](100) NULL,
	[fldPDE] [nvarchar](100) NULL,
	[CMO_ID] [nvarchar](100) NULL,
	[Testing_Mnger] [nvarchar](100) NULL,
	[MarketTM] [nvarchar](100) NULL,
	[OMC_Mnger] [nvarchar](100) NULL,
	[FF_ID] [nvarchar](100) NULL,
	[PilotProduction_Mnger] [nvarchar](100) NULL,
	[Remark] [nvarchar](100) NULL,
	[PROJECTStatus] [nvarchar](50) NULL,
	[ProductNO] [nvarchar](100) NULL,
	[PDT] [nvarchar](100) NULL,
	[VERSION] [nvarchar](100) NULL,
	[PRODUCT] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ReleaseDifficultyCoefficient_Temp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ReleaseDifficultyCoefficient_Temp](
	[ReleaseNo] [nvarchar](100) NULL,
	[BuildNo] [nvarchar](100) NULL,
	[Products_difficulty_coefficient] [nvarchar](100) NULL,
	[Hardware_difficulty_coefficient] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ResourceInfo]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ResourceInfo](
	[HRES_ID] [int] IDENTITY(1,1) NOT NULL,
	[HRES_PID] [int] NULL,
	[HRES_NAME] [nvarchar](100) NULL,
	[HRES_CODE] [varchar](50) NULL,
	[HRES_CONTENT] [varchar](200) NULL,
	[HRES_CREATE_USER] [int] NULL,
	[HRES_CREATE_DATE] [datetime] NULL,
	[HRES_MODIFY_USER] [int] NULL,
	[HRES_MODIFY_DATE] [datetime] NULL,
	[HRES_SORT] [int] NULL,
	[RESOURCETYPE] [int] NULL,
	[FLAG] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Role_Resource_Relation]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role_Resource_Relation](
	[HRRR_ID] [int] IDENTITY(1,1) NOT NULL,
	[HRRR_HRL_ID] [int] NULL,
	[HRRR_HRES_ID] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[RoleInfo]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RoleInfo](
	[HRL_ID] [int] IDENTITY(1,1) NOT NULL,
	[HRL_NAME] [nvarchar](100) NULL,
	[HRL_CODE] [nvarchar](100) NULL,
	[HRL_CREATE_USER] [nvarchar](100) NULL,
	[HRL_CREATE_DATE] [datetime] NULL,
	[HRL_MODIFY_USER] [nvarchar](100) NULL,
	[HRL_MODIFY_DATE] [datetime] NULL,
	[FLAG] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbDomainAccount]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING OFF
GO
CREATE TABLE [dbo].[tbDomainAccount](
	[DAID] [int] IDENTITY(1,1) NOT NULL,
	[SamAccount] [varchar](500) NULL,
	[DisplayName] [varchar](500) NULL,
	[IsActive] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbDomainGroup]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbDomainGroup](
	[DGID] [int] IDENTITY(1,1) NOT NULL,
	[ID] [uniqueidentifier] NOT NULL DEFAULT (newid()),
	[GroupName] [nvarchar](200) NULL,
	[AdminName] [nvarchar](100) NULL,
	[GroupDesc] [nvarchar](300) NULL,
	[Member] [text] NULL,
	[SyncTime] [datetime] NULL DEFAULT (getdate()),
 CONSTRAINT [PK_tbDomainGroup] PRIMARY KEY CLUSTERED 
(
	[DGID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_2_10_EN]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_2_10_EN](
	[Version_ID] [int] NOT NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Status_ID] [tinyint] NOT NULL CONSTRAINT [df_tbl_2_10_EN_Status_ID]  DEFAULT ((1)),
	[ValidationStatus_ID] [tinyint] NOT NULL CONSTRAINT [df_tbl_2_10_EN_ValidationStatus_ID]  DEFAULT ((0)),
	[Name] [nvarchar](250) NULL,
	[Code] [nvarchar](250) NOT NULL,
	[ChangeTrackingMask] [int] NOT NULL CONSTRAINT [df_tbl_2_10_EN_ChangeTrackingMask]  DEFAULT ((0)),
	[EnterDTM] [datetime2](3) NOT NULL CONSTRAINT [df_tbl_2_10_EN_EnterDTM]  DEFAULT (getutcdate()),
	[EnterUserID] [int] NOT NULL,
	[EnterVersionID] [int] NOT NULL,
	[LastChgDTM] [datetime2](3) NOT NULL CONSTRAINT [df_tbl_2_10_EN_LastChgDTM]  DEFAULT (getutcdate()),
	[LastChgUserID] [int] NOT NULL,
	[LastChgVersionID] [int] NOT NULL,
	[LastChgTS] [timestamp] NOT NULL,
	[AsOf_ID] [int] NULL,
	[MUID] [uniqueidentifier] ROWGUIDCOL  NOT NULL CONSTRAINT [df_tbl_2_10_EN_MUID]  DEFAULT (newid()),
	[uda_10_507] [int] NULL,
	[uda_10_508] [decimal](38, 0) NULL,
	[uda_10_509] [nvarchar](100) NULL,
	[uda_10_510] [nvarchar](100) NULL,
	[uda_10_511] [nvarchar](100) NULL,
	[uda_10_512] [nvarchar](100) NULL,
	[uda_10_513] [nvarchar](100) NULL,
	[uda_10_514] [nvarchar](100) NULL,
	[uda_10_515] [nvarchar](100) NULL,
 CONSTRAINT [pk_tbl_2_10_EN] PRIMARY KEY CLUSTERED 
(
	[Version_ID] ASC,
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_2_10_EN_bak20191008]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_2_10_EN_bak20191008](
	[Version_ID] [int] NOT NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Status_ID] [tinyint] NOT NULL,
	[ValidationStatus_ID] [tinyint] NOT NULL,
	[Name] [nvarchar](250) NULL,
	[Code] [nvarchar](250) NOT NULL,
	[ChangeTrackingMask] [int] NOT NULL,
	[EnterDTM] [datetime2](3) NOT NULL,
	[EnterUserID] [int] NOT NULL,
	[EnterVersionID] [int] NOT NULL,
	[LastChgDTM] [datetime2](3) NOT NULL,
	[LastChgUserID] [int] NOT NULL,
	[LastChgVersionID] [int] NOT NULL,
	[LastChgTS] [timestamp] NOT NULL,
	[AsOf_ID] [int] NULL,
	[MUID] [uniqueidentifier] NOT NULL,
	[uda_10_507] [int] NULL,
	[uda_10_508] [decimal](38, 0) NULL,
	[uda_10_509] [nvarchar](100) NULL,
	[uda_10_510] [nvarchar](100) NULL,
	[uda_10_511] [nvarchar](100) NULL,
	[uda_10_512] [nvarchar](100) NULL,
	[uda_10_513] [nvarchar](100) NULL,
	[uda_10_514] [nvarchar](100) NULL,
	[uda_10_515] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_2_10_EN_Tmp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_2_10_EN_Tmp](
	[Version_ID] [int] NOT NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Status_ID] [tinyint] NOT NULL,
	[ValidationStatus_ID] [tinyint] NOT NULL,
	[Name] [nvarchar](250) NULL,
	[Code] [nvarchar](250) NOT NULL,
	[ChangeTrackingMask] [int] NOT NULL,
	[EnterDTM] [datetime2](3) NOT NULL,
	[EnterUserID] [int] NOT NULL,
	[EnterVersionID] [int] NOT NULL,
	[LastChgDTM] [datetime2](3) NOT NULL,
	[LastChgUserID] [int] NOT NULL,
	[LastChgVersionID] [int] NOT NULL,
	[LastChgTS] [timestamp] NOT NULL,
	[AsOf_ID] [int] NULL,
	[MUID] [uniqueidentifier] NOT NULL,
	[uda_10_507] [int] NULL,
	[uda_10_508] [decimal](38, 0) NULL,
	[uda_10_509] [nvarchar](100) NULL,
	[uda_10_510] [nvarchar](100) NULL,
	[uda_10_511] [nvarchar](100) NULL,
	[uda_10_512] [nvarchar](100) NULL,
	[uda_10_513] [nvarchar](100) NULL,
	[uda_10_514] [nvarchar](100) NULL,
	[uda_10_515] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_2_10_EN_Tmp_Tmp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_2_10_EN_Tmp_Tmp](
	[Version_ID] [int] NOT NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Status_ID] [tinyint] NOT NULL,
	[ValidationStatus_ID] [tinyint] NOT NULL,
	[Name] [nvarchar](250) NULL,
	[Code] [nvarchar](250) NOT NULL,
	[ChangeTrackingMask] [int] NOT NULL,
	[EnterDTM] [datetime2](3) NOT NULL,
	[EnterUserID] [int] NOT NULL,
	[EnterVersionID] [int] NOT NULL,
	[LastChgDTM] [datetime2](3) NOT NULL,
	[LastChgUserID] [int] NOT NULL,
	[LastChgVersionID] [int] NOT NULL,
	[LastChgTS] [timestamp] NOT NULL,
	[AsOf_ID] [int] NULL,
	[MUID] [uniqueidentifier] NOT NULL,
	[uda_10_507] [int] NULL,
	[uda_10_508] [decimal](38, 0) NULL,
	[uda_10_509] [nvarchar](100) NULL,
	[uda_10_510] [nvarchar](100) NULL,
	[uda_10_511] [nvarchar](100) NULL,
	[uda_10_512] [nvarchar](100) NULL,
	[uda_10_513] [nvarchar](100) NULL,
	[uda_10_514] [nvarchar](100) NULL,
	[uda_10_515] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_2_9_EN]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_2_9_EN](
	[Version_ID] [int] NOT NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Status_ID] [tinyint] NOT NULL CONSTRAINT [df_tbl_2_9_EN_Status_ID]  DEFAULT ((1)),
	[ValidationStatus_ID] [tinyint] NOT NULL CONSTRAINT [df_tbl_2_9_EN_ValidationStatus_ID]  DEFAULT ((0)),
	[Name] [nvarchar](250) NULL,
	[Code] [nvarchar](250) NOT NULL,
	[ChangeTrackingMask] [int] NOT NULL CONSTRAINT [df_tbl_2_9_EN_ChangeTrackingMask]  DEFAULT ((0)),
	[EnterDTM] [datetime2](3) NOT NULL CONSTRAINT [df_tbl_2_9_EN_EnterDTM]  DEFAULT (getutcdate()),
	[EnterUserID] [int] NOT NULL,
	[EnterVersionID] [int] NOT NULL,
	[LastChgDTM] [datetime2](3) NOT NULL CONSTRAINT [df_tbl_2_9_EN_LastChgDTM]  DEFAULT (getutcdate()),
	[LastChgUserID] [int] NOT NULL,
	[LastChgVersionID] [int] NOT NULL,
	[LastChgTS] [timestamp] NOT NULL,
	[AsOf_ID] [int] NULL,
	[MUID] [uniqueidentifier] ROWGUIDCOL  NOT NULL CONSTRAINT [df_tbl_2_9_EN_MUID]  DEFAULT (newid()),
	[uda_9_499] [nvarchar](100) NULL,
	[uda_9_500] [decimal](38, 0) NULL,
	[uda_9_501] [nvarchar](100) NULL,
	[uda_9_502] [decimal](38, 0) NULL,
	[uda_9_503] [nvarchar](100) NULL,
	[uda_9_504] [nvarchar](100) NULL,
	[uda_9_505] [nvarchar](500) NULL,
	[uda_9_506] [nvarchar](100) NULL,
 CONSTRAINT [pk_tbl_2_9_EN] PRIMARY KEY CLUSTERED 
(
	[Version_ID] ASC,
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_2_9_EN_bak20191008]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_2_9_EN_bak20191008](
	[Version_ID] [int] NOT NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Status_ID] [tinyint] NOT NULL,
	[ValidationStatus_ID] [tinyint] NOT NULL,
	[Name] [nvarchar](250) NULL,
	[Code] [nvarchar](250) NOT NULL,
	[ChangeTrackingMask] [int] NOT NULL,
	[EnterDTM] [datetime2](3) NOT NULL,
	[EnterUserID] [int] NOT NULL,
	[EnterVersionID] [int] NOT NULL,
	[LastChgDTM] [datetime2](3) NOT NULL,
	[LastChgUserID] [int] NOT NULL,
	[LastChgVersionID] [int] NOT NULL,
	[LastChgTS] [timestamp] NOT NULL,
	[AsOf_ID] [int] NULL,
	[MUID] [uniqueidentifier] NOT NULL,
	[uda_9_499] [nvarchar](100) NULL,
	[uda_9_500] [decimal](38, 0) NULL,
	[uda_9_501] [nvarchar](100) NULL,
	[uda_9_502] [decimal](38, 0) NULL,
	[uda_9_503] [nvarchar](100) NULL,
	[uda_9_504] [nvarchar](100) NULL,
	[uda_9_505] [nvarchar](500) NULL,
	[uda_9_506] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tbl_2_9_EN_Tmp]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_2_9_EN_Tmp](
	[Version_ID] [int] NOT NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Status_ID] [tinyint] NOT NULL,
	[ValidationStatus_ID] [tinyint] NOT NULL,
	[Name] [nvarchar](250) NULL,
	[Code] [nvarchar](250) NOT NULL,
	[ChangeTrackingMask] [int] NOT NULL,
	[EnterDTM] [datetime2](3) NOT NULL,
	[EnterUserID] [int] NOT NULL,
	[EnterVersionID] [int] NOT NULL,
	[LastChgDTM] [datetime2](3) NOT NULL,
	[LastChgUserID] [int] NOT NULL,
	[LastChgVersionID] [int] NOT NULL,
	[LastChgTS] [timestamp] NOT NULL,
	[AsOf_ID] [int] NULL,
	[MUID] [uniqueidentifier] NOT NULL,
	[uda_9_499] [nvarchar](100) NULL,
	[uda_9_500] [decimal](38, 0) NULL,
	[uda_9_501] [nvarchar](100) NULL,
	[uda_9_502] [decimal](38, 0) NULL,
	[uda_9_503] [nvarchar](100) NULL,
	[uda_9_504] [nvarchar](100) NULL,
	[uda_9_505] [nvarchar](500) NULL,
	[uda_9_506] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TreeGroupAll]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TreeGroupAll](
	[UserGroupID] [int] IDENTITY(1,1) NOT NULL,
	[GroupName] [nvarchar](max) NULL,
	[ChildGroupName] [nvarchar](max) NULL,
	[LevelValue] [int] NOT NULL,
	[GroupPath] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[User_Role_Relation]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User_Role_Relation](
	[HURR_ID] [int] IDENTITY(1,1) NOT NULL,
	[HURR_HUL_ID] [int] NULL,
	[HURR_HRL_ID] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[UserInfo]    Script Date: 2019/12/17 10:27:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UserInfo](
	[HUR_ID] [int] IDENTITY(1,1) NOT NULL,
	[HUR_NAME] [nvarchar](50) NULL,
	[HUR_CODE] [nvarchar](50) NULL,
	[HUR_NOTESACCOUNT] [nvarchar](50) NULL,
	[HUR_PASSWORD] [nvarchar](50) NULL,
	[HUR_EMAIL] [nvarchar](150) NULL,
	[HUR_ADDRESS] [nvarchar](150) NULL,
	[HUR_MOBILE] [nvarchar](150) NULL,
	[HUR_LAST_LOGIN_TIME] [datetime] NULL,
	[HUR_LAST_LOGIN_IP] [nvarchar](50) NULL,
	[HUL_CREATE_USER] [nvarchar](100) NULL,
	[HUR_CREATE_DATE] [datetime] NULL,
	[HUL_MODIFY_USER] [nvarchar](100) NULL,
	[HUR_MODIFY_DATE] [datetime] NULL,
	[HUR_MEMO] [nvarchar](500) NULL,
	[FLAG] [int] NULL,
	[USERTYPE] [nvarchar](50) NULL
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[IBDS_F_PROD_1] ADD  DEFAULT ((0)) FOR [SYNC_STATUS]
GO
ALTER TABLE [dbo].[IBDS_F_PRODLINE_1] ADD  CONSTRAINT [DF__IBDS_F_PR__SYNC___12B54F9D]  DEFAULT ((0)) FOR [SYNC_STATUS]
GO
ALTER TABLE [dbo].[IBDS_F_PRODLINE_2] ADD  DEFAULT ((0)) FOR [SYNC_STATUS]
GO
ALTER TABLE [dbo].[IBDS_F_PRODLINE_3] ADD  DEFAULT ((0)) FOR [SYNC_STATUS]
GO
ALTER TABLE [dbo].[QRTZ_CRON_TRIGGERS]  WITH CHECK ADD  CONSTRAINT [FK_QRTZ_CRON_TRIGGERS_QRTZ_TRIGGERS] FOREIGN KEY([SCHED_NAME], [TRIGGER_NAME], [TRIGGER_GROUP])
REFERENCES [dbo].[QRTZ_TRIGGERS] ([SCHED_NAME], [TRIGGER_NAME], [TRIGGER_GROUP])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[QRTZ_CRON_TRIGGERS] CHECK CONSTRAINT [FK_QRTZ_CRON_TRIGGERS_QRTZ_TRIGGERS]
GO
ALTER TABLE [dbo].[QRTZ_SIMPLE_TRIGGERS]  WITH CHECK ADD  CONSTRAINT [FK_QRTZ_SIMPLE_TRIGGERS_QRTZ_TRIGGERS] FOREIGN KEY([SCHED_NAME], [TRIGGER_NAME], [TRIGGER_GROUP])
REFERENCES [dbo].[QRTZ_TRIGGERS] ([SCHED_NAME], [TRIGGER_NAME], [TRIGGER_GROUP])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[QRTZ_SIMPLE_TRIGGERS] CHECK CONSTRAINT [FK_QRTZ_SIMPLE_TRIGGERS_QRTZ_TRIGGERS]
GO
ALTER TABLE [dbo].[QRTZ_SIMPROP_TRIGGERS]  WITH CHECK ADD  CONSTRAINT [FK_QRTZ_SIMPROP_TRIGGERS_QRTZ_TRIGGERS] FOREIGN KEY([SCHED_NAME], [TRIGGER_NAME], [TRIGGER_GROUP])
REFERENCES [dbo].[QRTZ_TRIGGERS] ([SCHED_NAME], [TRIGGER_NAME], [TRIGGER_GROUP])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[QRTZ_SIMPROP_TRIGGERS] CHECK CONSTRAINT [FK_QRTZ_SIMPROP_TRIGGERS_QRTZ_TRIGGERS]
GO
ALTER TABLE [dbo].[QRTZ_TRIGGERS]  WITH CHECK ADD  CONSTRAINT [FK_QRTZ_TRIGGERS_QRTZ_JOB_DETAILS] FOREIGN KEY([SCHED_NAME], [JOB_NAME], [JOB_GROUP])
REFERENCES [dbo].[QRTZ_JOB_DETAILS] ([SCHED_NAME], [JOB_NAME], [JOB_GROUP])
GO
ALTER TABLE [dbo].[QRTZ_TRIGGERS] CHECK CONSTRAINT [FK_QRTZ_TRIGGERS_QRTZ_JOB_DETAILS]
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'P'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'V'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'R'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'L'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'C'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'B'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'D'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'SP'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'基线版本内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'基线版本中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'基线版本曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINEOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'基线版本英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'engBASELINE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对于平台基线版本号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINE_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对外版本中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINEOut'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对外版本英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'engBASELINEOut'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'VERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属父版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'ParentItemNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态（是否已发布）' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINEStatus'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'版本类别' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINEType'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'版本发布日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINE_IssueTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'版本失效日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINE_DisableTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否受控' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINE_usingLimitWhether'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否紧急发布' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINE_UrgencyIssue'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'版本使用地域范围' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINE_UsingRange'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'版本发布范围' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINE_IssueRange'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'版本发布类别' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'BASELINE_IssueStyle'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'数据源的文档ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'ProdDataID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'CREATED_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'CREATED_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'MODIFY_DATA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段1' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'STANDBY1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段2' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'STANDBY2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段3' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'STANDBY3'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段4' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'STANDBY4'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段5' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'STANDBY5'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段6' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'STANDBY6'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段7' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'STANDBY7'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段8' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'STANDBY8'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段9' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'STANDBY9'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段10' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASE_LINE', @level2type=N'COLUMN',@level2name=N'STANDBY10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'VERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品B级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'BVERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件版本中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'BASELINE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件版本英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'engBASELINE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件版本对外的中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'BASELINEOut'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件版本对外的英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'engBASELINEOut'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件版本对应的父版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'ParentItemNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件版本对应的平台基线版本号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'BASELINE_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原软件版本中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'BASELINEOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原软件版本英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'engBASELINEOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原软件版本对外的中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'BASELINEOutOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原软件版本对外的英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'engBASELINEOutOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原软件版本对应的父版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'ParentItemNoOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原软件版本对应的平台基线版本号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'BASELINE_1_Old'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请类型(1 新增 2 修改 3删除)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'ApplyType'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseLine_Apply', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'VERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品B级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'BVERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属基线版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'BASELINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属特性' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'FEATURENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属子系统' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'SUBSYSTEMNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属模块' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'MODULENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'新增的个数' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'NumofFEATURENew'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对象内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'ObjectNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对象中文名称(包含基线版本以下对象)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'ObjectName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对象英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'engObject'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原对象内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'ObjectNoOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请类型(1 新增 2 修改 3删除)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'ApplyType'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对象类型，以编码的前两位区分' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'Type'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'更新时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'更新人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_Apply', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'ApplyCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所处环节' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前责任人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'Responsible'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前状态描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'StatusName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请类型(1 新增 2 修改 3删除)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'读者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'抄送人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'copyto'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'请指定该产品的配置经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'sendto_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'CMO_签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'CMO_FillName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'CMO_时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'CMO_FillTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品配置经理审核_审批意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_Suggestion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品配置经理审核_签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_FillName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品配置经理审核_时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_FillTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'CMO组长_审批意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'CMOLeader_Suggestion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'CMO组长_签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'CMOLeader_FillName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'CMO组长_时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'CMOLeader_FillTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'工作流实例ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'INSTANSE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'CheckResult'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'管理区段_更改当前责任人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'EditCurrentUser'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'指派签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'AssignSign'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'指派时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'AssignDate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前节点' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BaseObject_PROCESS', @level2type=N'COLUMN',@level2name=N'CurrentNode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键（UUID）' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASIS_MATERIAL', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASIS_MATERIAL', @level2type=N'COLUMN',@level2name=N'NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应模块' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASIS_MATERIAL', @level2type=N'COLUMN',@level2name=N'MODULE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'模块编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASIS_MATERIAL', @level2type=N'COLUMN',@level2name=N'MODULE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'材料内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASIS_MATERIAL', @level2type=N'COLUMN',@level2name=N'CONTENT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASIS_MATERIAL', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASIS_MATERIAL', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASIS_MATERIAL', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_BASIS_MATERIAL', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'难度系数打包' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_bversion', @level2type=N'COLUMN',@level2name=N'Pack'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件难度系数打包' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_bversion', @level2type=N'COLUMN',@level2name=N'HardPack'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'标识列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'列名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ColumnCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'中文名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ColumnName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'分组' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ColumnGroup'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'分组排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'GroupOrder'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'查询排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'QueryOrder'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'新增 排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'AddOrder'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'EditOrder'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'配置列排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ColumnOrder'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类型 新增TR类型  代表获取PDT下面所有R级成员信息' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'Type'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'新增列显示  0显示  1不显示' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'AddFlag'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编辑列显示 0显示 1不显示' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'EditFlag'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态(标记是否停用 0启用 1停用)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'Flag'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'查询状态(0 显示 1不显示)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'QueryFlag'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'属性状态(0显示 1不显示)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ColumnFlag'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否可编辑(0可编辑 1不可编辑)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'EditStatus'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否需要IPMT秘书审核  (0需要 1不需要)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'IPMTCheck'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'CreateUser'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'CreateDate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ModifyUser'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ModifyDate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'样式' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ColumnClass'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'字段类型 关联字典表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ColumnType'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'校验' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ColumnValidate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'提示信息' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ColumnMessage'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'校验长度' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'ValidateLength'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'参照框中是否展示 1:展示' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ColunmConfig', @level2type=N'COLUMN',@level2name=N'IsReferenceShow'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DATA_PERM', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资源' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DATA_PERM', @level2type=N'COLUMN',@level2name=N'RESOURCE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'表达式' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DATA_PERM', @level2type=N'COLUMN',@level2name=N'EXPRESSION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DATA_PERM', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DATA_PERM_1', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资源' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DATA_PERM_1', @level2type=N'COLUMN',@level2name=N'RESOURCE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'表达式' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DATA_PERM_1', @level2type=N'COLUMN',@level2name=N'EXPRESSION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DATA_PERM_1', @level2type=N'COLUMN',@level2name=N'NOTE'
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
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'R版本编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient', @level2type=N'COLUMN',@level2name=N'ReleaseNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'R版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient', @level2type=N'COLUMN',@level2name=N'ReleaseName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient', @level2type=N'COLUMN',@level2name=N'Bversion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品难度系数' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient', @level2type=N'COLUMN',@level2name=N'DifficultyCoefficient'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件难度系数' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient', @level2type=N'COLUMN',@level2name=N'DifficultyCoefficient_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程Code' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'Process_Code'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'ProdLineNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'ProductNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'VersionNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT执行秘书' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'IPMTSecretary'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'带R层级的B级编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'BversionNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'带当前R的B级名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'Bversion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否打包申请 0是' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'isPack'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品附件名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'Prod_BasisMaterial'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品附件ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'Prod_BasisMaterialId'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件附件名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'Hard_BasisMaterial'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件附件ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'Hard_BasisMaterialId'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品Sn附件说明' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'ProSnRemark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件Sn附件说明' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'HardSnRemark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'抄送人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'copyto'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'Creator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'CreateTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'Modifier'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_APPLY', @level2type=N'COLUMN',@level2name=N'ModifyTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_Item_APPLY', @level2type=N'COLUMN',@level2name=N'BVersion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品Sn' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_Item_APPLY', @level2type=N'COLUMN',@level2name=N'ProDifficult'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件Sn' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_Item_APPLY', @level2type=N'COLUMN',@level2name=N'HardDifficult'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_Item_APPLY', @level2type=N'COLUMN',@level2name=N'Creator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_Item_APPLY', @level2type=N'COLUMN',@level2name=N'CreateTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_Item_APPLY', @level2type=N'COLUMN',@level2name=N'Modifier'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_Item_APPLY', @level2type=N'COLUMN',@level2name=N'ModifyTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'标识列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'Handler'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'工作流实例ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'Instanse_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理节点' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'CurrentNode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'STATUS_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'第一环节签名人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'First_Sign'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'第一环节签名时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'First_Date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'质量分部经理签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'MGN_Sign'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'质量分部经理签名时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'MGN_Date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'质量分部经理审核意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'MGN_Opinion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'质量分部经理审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'MGN_Result'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'运作质量部签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'Quality_Sign'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'运作质量部签名时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'Quality_Date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'运作质量部审核意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'Quality_Opinion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'运作质量部审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'Quality_Result'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'Creator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'CreateTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'Modifier'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_DifficultyCoefficient_PROCESS', @level2type=N'COLUMN',@level2name=N'ModifyTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编码类型，比如R级，B级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ERROR_CODE', @level2type=N'COLUMN',@level2name=N'type'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ERROR_CODE', @level2type=N'COLUMN',@level2name=N'name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'内码,唯一编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ERROR_CODE', @level2type=N'COLUMN',@level2name=N'code'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'PROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'PROD_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应研发产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'PROD_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否同步' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'SYNC_STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD', @level2type=N'COLUMN',@level2name=N'PROD_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'PROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'PROD_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应研发产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'PROD_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否同步' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROD_1', @level2type=N'COLUMN',@level2name=N'SYNC_STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'PRODLINE_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发基本信息产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'PRODLINE_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否同步' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'SYNC_STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE', @level2type=N'COLUMN',@level2name=N'PRODLINE_DESC_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'PRODLINE_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发基本信息产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'PRODLINE_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否同步' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'SYNC_STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_1', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'PRODLINE_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发基本信息产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'PRODLINE_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否同步' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'SYNC_STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_2', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'PRODLINE_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发基本信息产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'PRODLINE_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否同步' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'SYNC_STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODLINE_3', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_PDT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_prodno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号/模块名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_prodno_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_prodname'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号/模块名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_prodname_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'代号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_prodcode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_bomno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品描述全（产品线\产品族\产品型号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_ProdAll'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'EnglishDepict'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编码生效日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'BeginTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_explain'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_bumen'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原所属产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_class_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原所属PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_PDT_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_prodno_old'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品型号/模块编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_prodno_old_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_prodname_old'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品/型号模块名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_prodname_old_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原代号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_prodcode_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原对应的BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_bomno_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'EnglishDepict_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_bomReadme'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'作者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_author'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编码状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'标记' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'mark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应的项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_projno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应的项目名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_projname'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'承担此项目的费用比例' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_bili'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应的项目代号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_projcode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'f_jingli'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_Product', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'OLD_BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'生效时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'EFFECT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料唯一名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'FPROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'OLD_BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'生效时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'EFFECT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料唯一名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'FPROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_1', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'OLD_BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'生效时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'EFFECT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料唯一名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'FPROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_2', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'OLD_BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'生效时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'EFFECT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料唯一名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'FPROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_3', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'OLD_BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'生效时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'EFFECT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料唯一名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'FPROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_4', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'OLD_BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'生效时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'EFFECT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料唯一名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'FPROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_BUMENQIAN', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'OLD_BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'生效时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'EFFECT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料唯一名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'FPROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'OLD_BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'生效时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'EFFECT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料唯一名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'FPROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_copy1', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'OLD_BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'生效时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'EFFECT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料唯一名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'FPROD_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PRODUCT_CODE_HISTORY', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'种类' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_objca'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_pdtno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_projno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_projname'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目代号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_projcode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_productlineno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应版本内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_releaseno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'服务的产品编码  弃用' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_productno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'服务的产品名称  弃用' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_productname'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'费用分摊运营商比重' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_bizhong'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'费用分摊非运营商比重' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_fbizhong'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编码生效日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'BeginTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_projMng'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_dept'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'立项时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_start_project_time'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应评审点' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_assign_point'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'create_user'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'create_time'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'modify_user'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'modify_date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态0，无效  1有效' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'数据来源' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'datasource'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目类别名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_objca_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_pdt_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_productline_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应评审点名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_assign_point_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_projno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_projname'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目代号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_projcode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原所属产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_productlineno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原所属产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_productline_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原对应R级内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_releaseno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原服务的产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_productno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原服务的产品名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_productname'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目分摊运营商比重' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_bizhong'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目分摊非运营商比重' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_fbizhong'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原分摊比例' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_rate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_version'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原对应版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'f_old_version'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编码状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_CODE', @level2type=N'COLUMN',@level2name=N'mark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'f_projno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'f_product_code'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'分摊比例' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'rate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'关联 IBDS_F_PROJECT_CODE_HIS的id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_F_PROJECT_PRODUCT_REL_HIS', @level2type=N'COLUMN',@level2name=N'f_projectcode_id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'特性内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'FEATURENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'特性中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'FEATURE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'特性曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'FEATUREOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子特性英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'engFEATURE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'VERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'CREATED_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'CREATED_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'MODIFY_DATA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段1' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段2' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段3' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY3'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段4' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY4'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段5' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY5'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段6' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY6'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段7' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY7'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段8' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY8'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段9' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY9'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段10' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'用户名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'USER_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'用户全拼加域账号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'USER_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'用户IP' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'USER_IP'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'文件大小（单位byte）' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'FILE_SIZE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作类型（上传或下载）' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'OPERATE_TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'文件类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'FILE_TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'文件名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'FILE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'文件编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'FILE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FILE_LOG', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'FPRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'FPRODUCT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'FPRODUCTOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务产品英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'engFPRODUCT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否为规划产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'IfPlan'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'FPRODUCTCOACode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'BOM'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'匹配结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'Match'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务参考信息修改后的产品名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'FPRODUCTMatch'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPRODUCT', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'种类' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_objca'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_pdtno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_projno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_projname'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目代号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_projcode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_productlineno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_releaseno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'服务的产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_productno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'服务的产品名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_productname'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'此产品应该分摊的项目费用比例' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_rate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'费用分摊运营商比重' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_bizhong'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'费用分摊非运营商比重' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_fbizhong'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编码生效日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'BeginTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'manager'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'dept_id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'立项时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_pro_time'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应评审点' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_pro_point'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'f_remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'create_user'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'create_time'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'modify_user'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_FPROJECTCODE', @level2type=N'COLUMN',@level2name=N'modify_date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否初始化 0  表示未 初始化  1 表示初始化' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_INIT_LOG', @level2type=N'COLUMN',@level2name=N'isInit'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_LoginLog', @level2type=N'COLUMN',@level2name=N'Operator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'登录时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_LoginLog', @level2type=N'COLUMN',@level2name=N'OptTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IP' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_LoginLog', @level2type=N'COLUMN',@level2name=N'ClientIP'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_LoginLog', @level2type=N'COLUMN',@level2name=N'OptDesc'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'发送目标地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MAIL_INFO', @level2type=N'COLUMN',@level2name=N'SEND_TO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'抄送目标地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MAIL_INFO', @level2type=N'COLUMN',@level2name=N'CC_TO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主题' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MAIL_INFO', @level2type=N'COLUMN',@level2name=N'SUBJECT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MAIL_INFO', @level2type=N'COLUMN',@level2name=N'CONTENT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MAIL_INFO', @level2type=N'COLUMN',@level2name=N'PROCESS_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MAIL_INFO', @level2type=N'COLUMN',@level2name=N'APPLY_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MAIL_INFO', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'任务id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MAIL_INFO', @level2type=N'COLUMN',@level2name=N'TASK_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核RUL' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MAIL_INFO', @level2type=N'COLUMN',@level2name=N'URL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'模块描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MAIL_INFO', @level2type=N'COLUMN',@level2name=N'MODULE_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'MODELNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'MODEL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'MODELOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'engMODEL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号财务编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'MODELCOACode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'匹配结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'Match'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务参考信息修改后的产品型号名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'MODELMatch'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODEL_Notes', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'模块内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'MODULENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'模块中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'MODULE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'模块曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'MODULEOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'模块英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'engMODULE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'VERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属子系统' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'SUBSYSTEMNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'CREATED_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'CREATED_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'MODIFY_DATA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段1' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'STANDBY1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段2' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'STANDBY2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段3' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'STANDBY3'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段4' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'STANDBY4'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段5' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'STANDBY5'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段6' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'STANDBY6'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段7' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'STANDBY7'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段8' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'STANDBY8'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段9' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'STANDBY9'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段10' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE', @level2type=N'COLUMN',@level2name=N'STANDBY10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'模块版本内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'MDLVSNNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'模块版本中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'MDLVSN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'模块版本曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'MDLVSNOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'模块版本英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'engMDLVSN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'VERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属子系统' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'SUBSYSTEMNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属模块' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'MODULENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'CREATED_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'CREATED_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'MODIFY_DATA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段1' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'STANDBY1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段2' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'STANDBY2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段3' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'STANDBY3'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段4' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'STANDBY4'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段5' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'STANDBY5'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段6' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'STANDBY6'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段7' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'STANDBY7'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段8' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'STANDBY8'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段9' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'STANDBY9'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段10' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_MODULE_VERSION', @level2type=N'COLUMN',@level2name=N'STANDBY10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'MODELNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'MODEL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'MODELOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'engMODEL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品型号财务编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'MODELCOACode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'匹配结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'Match'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务参考信息修改后的产品型号名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'MODELMatch'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_MODELTemp', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_3'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_4'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBver_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_5'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_6'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_7'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_8'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_9'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_11'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_12'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_13'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_14'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_15'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_16'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_17'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_18'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_19'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldBversion_20'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品R级内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品R级中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'RELEASE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'P'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'V'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'R'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品R级曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'RELEASEOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品R级英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'engRELEASE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'ProductNO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'VersionNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'PDTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应研发项目' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'PROJECTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应研发项目' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'PROJECTCOACode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应研发项目' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'PROJECT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应研发项目' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'engPROJECT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应的软件平台版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'RELEASENo_Software'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'PROJECTStatus'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'匹配结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Match'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'技术文件基础库修改后的产品R级名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'RELEASEMatch'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'数据源的文档ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'ProdDataID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品POP' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'POP_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品CMO' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'CMO_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'测试经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Testing_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'技术支援代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'TechSupport_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Product_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'市场技术经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'MarketTM'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'softmg'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'hardmg'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDE' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'fldPDE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'开发代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'RNDPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'开发代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Oversea_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'试制验证组组长' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'PilotProduction_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'网管经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'OMC_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'系统部经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'System_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PQA' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Quality_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'装备经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Equipment_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资料经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Documents_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'采购代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Purchase_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'市场代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Sales_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品工程代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'PPPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'交付代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Manufacture_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'订单履行专员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'FF_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品难度系数' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'DifficultyCoefficient'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件难度系数' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'DifficultyCoefficient_1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Notes_ReleaseTemp', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_OperationLog', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_OperationLog', @level2type=N'COLUMN',@level2name=N'Code'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_OperationLog', @level2type=N'COLUMN',@level2name=N'OptType'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'旧值' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_OperationLog', @level2type=N'COLUMN',@level2name=N'OldValue'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'新值' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_OperationLog', @level2type=N'COLUMN',@level2name=N'NewValue'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_OperationLog', @level2type=N'COLUMN',@level2name=N'Operator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_OperationLog', @level2type=N'COLUMN',@level2name=N'OptTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PROJECT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PROJECT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品代码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NUM'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对内英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'INSIDE_DESC_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对外中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'ABROAD_DESC_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对外英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'ABROAD_DESC_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商业模式' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'BUSINESS_MODEL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'数据来源(pdm/华智)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'datasource'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态（提交申请，在途，处理完成）' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODLINE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PROD_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'FPROD_CODE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商业模式字典码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'BUSINESS_MODEL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'HANDLER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'部门类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'DEPT_TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_PERSON'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子表单签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'SUB_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CHECK_OPINION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CHECK_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CHECK_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_OPINION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'FPROD_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'FPROD_OPINION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'FPROD_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CW_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CW_OPINION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CW_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程管理签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PROCESSMGN_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程管理结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PROCESSMGN_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'提交日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'SUBMIT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者审核日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CHECK_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT审核日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人审核日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'FPROD_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务审核日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CW_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程管理日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PROCESSMGN_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'工作流实例ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'INSTANSE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理节点' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CURRENT_NODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'指派签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'ASSIGN_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'指派日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'ASSIGN_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'STATUS_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_MGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'联系电话' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'TEL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDM申请单号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDM_APPLY_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'定时任务类型（pdm ....）' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CRON', @level2type=N'COLUMN',@level2name=N'cron_type'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'定时任务表达' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PART_CRON', @level2type=N'COLUMN',@level2name=N'cron'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PDTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PDT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'engPDT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PDTOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PDT_Manager'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件鉴定测试接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'SCJKR_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件鉴定测试接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'HCJKR_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发海外支持接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'AbroadJKR_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'成套（国内）' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'OrderDecom'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT核心群组' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PDT_GROUP'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发核心群组' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'RND_GROUP'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目操作员POP' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'POP_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'LPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'开发代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'RNDPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'市场代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'MKTPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'FINPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'采购代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PROPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品工程代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PPPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'交付代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'MFGPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'技术支援代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'TSPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PQA' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PQA_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资料经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'TD_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'引导者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'FA_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'SE' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'SE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'CMO' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'CMO_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'网管接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'NMJKR_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'SOFTWARE_MANAGER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'HARDWARE_MANAGER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'装备经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'EQUIPMENT_MANAGER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'SQA' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'SQA_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'HQA' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'HQA_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'TQA' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'TQA_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDE' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PDE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件测试经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'SOFTWARE_TEST_MANAGER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件测试经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'HARDWARE_TEST_MANAGER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'市场技术经理 ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'MARKET_TECHNICAL_MANAGER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'网管SE' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'NETWORK_SE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件平台接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'SOFTWARE_INTERFATE_PERSON'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'技术战略接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'TECHNICAL_INTERFACE_PERSON'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Column01'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Column02'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Column03'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Column04'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Column05'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Column06'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Column07'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Column08'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Column09'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PDT', @level2type=N'COLUMN',@level2name=N'Column10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'Process_Code'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'请选择要修改的人员所在产品信息' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'PInfoType'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'PDTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'VersionNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT执行秘书' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'IPMTSecretary'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'Creator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'CreateTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'Modifier'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'ModifyTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'BVersionno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'BVersion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_APPLY', @level2type=N'COLUMN',@level2name=N'EngBVersion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主表ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'P_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'人员角色名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'RoleName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应域名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'ColumnName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原有人员名单' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'OldPeoples'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改后人员名单' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'NewPeoples'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否同步下层级相同角色 0:否;1:是' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'IsSync'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态0：无效 1：有效' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'Creator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'CreateTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'Modifier'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_Item_APPLY', @level2type=N'COLUMN',@level2name=N'ModifyTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'标识列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'Handler'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'工作流实例ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'Instanse_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理节点' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'CurrentNode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'STATUS_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'第一环节签名人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'First_Sign'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'第一环节签名时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'First_Date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'IPMT_Sign'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT签名时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'IPMT_Date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT审核意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'IPMT_Opinion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'IPMT_Result'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'Creator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'CreateTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'Modifier'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_People_PROCESS', @level2type=N'COLUMN',@level2name=N'ModifyTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'PLIPMT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'engPLIPMT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'PLIPMTOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主任' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'PLIPMT_Umpire'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'副主任' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'PLIPMT_ViceUmpire'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'执行秘书' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'PLIMPT_Secretary'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT成员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'PLIPMT_Members'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDM业务员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'PLIPMT_PDM_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Column01'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Column02'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Column03'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Column04'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Column05'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Column06'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Column07'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Column08'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Column09'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PLIPMT', @level2type=N'COLUMN',@level2name=N'Column10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码  弃用' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PDT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PDT_MNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NO'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品中文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_CN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_BOM_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原BOM描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_BOM_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料唯一名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'BASIS_MATERIAL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务参考信息产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODLINE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务参考信息产品族id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODUCT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程PDT主键id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PRODUCT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原PDTid' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品族英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PROD_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线英文描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'PRODLINE_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品族描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PROD_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原产品线描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRDOUCT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'OLD_PRODLINE_NAME_EN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG', @level2type=N'COLUMN',@level2name=N'CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG', @level2type=N'COLUMN',@level2name=N'NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG', @level2type=N'COLUMN',@level2name=N'TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'配置表编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'CONFIG_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'CONTENT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'PDT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'FPROD_PERSON'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'PDT_MGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态 0：失效; 1：有效' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM', @level2type=N'COLUMN',@level2name=N'State'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'配置表编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'CONFIG_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'CONTENT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'PDT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'FPROD_PERSON'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'PDT_MGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态 0：失效; 1：有效' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_0', @level2type=N'COLUMN',@level2name=N'State'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'配置表编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'CONFIG_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'CONTENT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'PDT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'FPROD_PERSON'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'PDT_MGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态 0：失效; 1：有效' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_1', @level2type=N'COLUMN',@level2name=N'State'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'配置表编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'CONFIG_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'CONTENT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'PDT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'FPROD_PERSON'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'PDT_MGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态 0：失效; 1：有效' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_CONFIG_ITEM_2', @level2type=N'COLUMN',@level2name=N'State'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'CHECK_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'CHECK_PERSON'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核账号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'CHECK_ACCOUNT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'CHECK_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'CHECK_OPION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'CHECK_STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_LOG', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核人id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'CHECKER_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核人名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'CHECKER_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'NOTE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属电子流编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属流程角色编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'PROCESS_ROLE_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'部门编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'DEPT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROCESS_PERSON', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'PRODLINE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'engPRODLINE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'PRODLINEOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品线总监' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'fldcpxzj'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'质量部总监' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Quality_Director_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PL CBB 群组' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'PL_CCB_GROUP'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'质量分部经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Quality_Mnger_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'测试分部经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Test_Mnger_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'CMO组长' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'CMOLeader_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'市场技术组组长' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'PrjMarketP'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PL CBB 执行秘书' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'PL_CCB_SECRETARY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Column01'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Column02'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Column03'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Column04'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Column05'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Column06'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Column07'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Column08'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Column09'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODLINE', @level2type=N'COLUMN',@level2name=N'Column10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'ProductNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Product'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'P'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'ProductOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'engProduct'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否为规划产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'IfPlan'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'ProductType'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否已正式命名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'IfOfficialNaming'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应财务COA编码(关联财务表编码)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'PRODUCTCOACode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'PM_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品POP' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'POP_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品配置经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'CME_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品配置经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'CMO_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品数据经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'PDE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'请选择对应的财务产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'FPRODUCT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'BOM'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'REMARK'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态(0 有效 1失效)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'匹配' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Match'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Column01'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Column02'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Column03'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Column04'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Column05'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Column06'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Column07'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Column08'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Column09'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product', @level2type=N'COLUMN',@level2name=N'Column10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要新增产品的内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要新增产品的中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PRODUCT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要新增的英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'engPRODUCT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'请选择对应的财务编码与名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'FPRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PRODUCTTypeNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PM_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品POP' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'POP_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品配置经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'CMO_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品数据经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PDE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品的内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PRODUCTOldNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品的原中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PRODUCTOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品的原英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'engPRODUCTOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'请附产品命名电子流的命名修改申请链接' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PRODUCTNameChange'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否要删除该产品以下级别的信息：包括产品V级、R级、版本、项目组、特性、子系统、模块、模块版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'IfDelBelow'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请类型(1 新增 2 修改 3删除)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'AppyType'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'更新时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'更新人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_Apply', @level2type=N'COLUMN',@level2name=N'PROCESS_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'STATUS'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'HANDLER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_DEPT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'变动类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请产品编码数目' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_COUNT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子表单签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'SUB_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CHECK_OPINION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CHECK_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CHECK_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_OPINION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'FPROD_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'FPROD_OPINION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'FPROD_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CW_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CW_OPINION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CW_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程管理签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PROCESSMGN_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程管理结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PROCESSMGN_RESULT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'ORDER_BY'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'提交日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'SUBMIT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者审核日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CHECK_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT审核日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品财务接口人审核日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'FPROD_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务审核日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CW_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程管理日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PROCESSMGN_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'工作流实例ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'INSTANSE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理节点' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'CURRENT_NODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'指派签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'ASSIGN_SIGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'指派日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'ASSIGN_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'STATUS_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PRODUCT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'PDT_MGN'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'ApplyCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所处环节' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前责任人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'Responsible'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前状态描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'StatusName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请类型(1 新增 2 修改 3删除)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT审批意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'IPMT_Suggestion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'CheckResult'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'管理区段_更改当前用户' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'EditCurrentUser'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'指派签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'AssignSign'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'指派时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'AssignDate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'工作流实例ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'INSTANSE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理节点' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'CURRENT_NODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Product_PROCESS', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发项目内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'PROJECTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发项目中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'PROJECT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发项目曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'PROJECTOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发项目英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'engPROJECT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发项目代号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'PROJECTAlias'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否规划中' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'IfPlan'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'研发项目财务编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'PROJECTCOACode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目种类' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'PROJECTTypeNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'PDTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'与财务参考信息的匹配结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'Match'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务参考信息修改后的项目名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'PROJECTMatch'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'CREATED_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'CREATED_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'MODIFY_DATA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段1' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'STANDBY1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段2' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'STANDBY2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段3' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'STANDBY3'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段4' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'STANDBY4'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段5' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'STANDBY5'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段6' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'STANDBY6'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段7' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'STANDBY7'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段8' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'STANDBY8'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段9' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'STANDBY9'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段10' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'STANDBY10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT', @level2type=N'COLUMN',@level2name=N'dept_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'BVersion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_number'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目类别' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_ca'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_prodline_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目代号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_manager'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'立项时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_time'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应的评审点' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_point'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应的版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'version'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'ProFile'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N' 费用分摊运营商比重（请用英文半角的百分号）' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'Probizhong'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'费用分摊非运营商比重（请用英文半角的百分号）' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'Profbizhong'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'create_date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'create_user'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'modify_date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'modify_user'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否有效 0草稿  1  等待审批  2  生效' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品个数' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'productNum'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'apply_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_pro_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_pro_number'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目类别' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_pro_ca'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原所属产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_pro_prodline_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目代号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_pro_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_pro_manager'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原依据材料' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_ProFile'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目类别名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_ca_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应的评审点名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_point_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pro_prodline_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原运营商比例' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_probizhong'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原非运营商比例' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_profbizhong'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原所属产品线名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_pro_prodline_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原所属类别名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_pro_ca_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目编码id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_projcode_id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'依据材料id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'ProFile_id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属pdt，为了流程删除冗余' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pdt_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'pdt内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'pdt_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'R级内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'release_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_APPLY', @level2type=N'COLUMN',@level2name=N'old_projcode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'apply_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'cur_status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'cur_deal'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'approver'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'finance_interface'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务审批' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'financer'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目管理处' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'project_office'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'approver_suggest'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务接口人意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'finance_interface_suggest'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'financer_suggest'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目管理处意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'project_office_suggest'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程维护者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'process_mng'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程实例id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'process_ins_id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目经理审核意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'projMng_suggest'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'proj_mng'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'applyer'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人部门' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'dept'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作类型(新增，修改，删除)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'opt_type'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'pro_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请项目编码数量' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'apply_count'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核者审批时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'apply_time'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目经理审核时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'proj_mng_time'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务接口人审核时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'proj_fin_interface_time'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务审核时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'proj_fin_time'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目管理处审核时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'proj_office_time'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'流程签名处显示项目经理名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'proj_mng_show'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否显示' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_PROCESS', @level2type=N'COLUMN',@level2name=N'is_edit'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_RECOMMEND', @level2type=N'COLUMN',@level2name=N'pro_number'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_RECOMMEND', @level2type=N'COLUMN',@level2name=N'pro_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'pdt内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_RECOMMEND', @level2type=N'COLUMN',@level2name=N'pdt_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'B版本名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_RECOMMEND', @level2type=N'COLUMN',@level2name=N'bversion_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'pdt名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_RECOMMEND', @level2type=N'COLUMN',@level2name=N'pdt_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'启用1，停用 0' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_CODE_RECOMMEND', @level2type=N'COLUMN',@level2name=N'status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'proj_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'PRODUCT_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'aplicant'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'applyDate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属pdt' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'pdtno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'此产品分摊的项目费用比例' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'rate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态（是否生效1生效，0不生效）' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'product_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'pdt名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'pdt_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'关联项目编码主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'project_code_id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原服务的产品中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'old_product_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原所属PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'old_pdt_name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原服务的产品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'old_product_code'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'原此产品分摊的项目比例' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_PROJECT_PRODUCT_REL', @level2type=N'COLUMN',@level2name=N'old_rate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品R级内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品R级中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'RELEASE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'P'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'V'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'R'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品R级曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'RELEASEOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品R级英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'engRELEASE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'VersionNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'PDTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应研发项目' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'projectno'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应的软件平台版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'RELEASENo_Software'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'PROJECTStatus'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'匹配结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Match'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'技术文件基础库修改后的产品R级名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'RELEASEMatch'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'数据源的文档ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'ProdDataID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品POP' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'POP_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品CMO' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'CMO_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'测试经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Testing_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'技术支援代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'TechSupport_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDT经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Product_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'市场技术经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'MarketTM'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'softmg'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'hardmg'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PDE' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'fldPDE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'开发代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'RNDPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'海外经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Oversea_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'试制验证组组长' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'PilotProduction_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'网管经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'OMC_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'系统部经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'System_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'PQA' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Quality_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'装备经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Equipment_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资料经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Documents_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'采购代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Purchase_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'市场代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Sales_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品工程代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'PPPDT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'交付代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Manufacture_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'订单履行专员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'FF_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品难度系数' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'proDifficult'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件难度系数' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'harddiffcult'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'财务代表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'fdr'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'外网组成员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'outnetparter'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'（原系统部经理）流程写入' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'SE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'SQA' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'SQA_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'HQA' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'HQA_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'TQA' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'TQA_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件测试经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'SOFTTESTMNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'硬件测试经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'HARDTESTMNG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'软件平台接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'SOFTPLAT_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'网管接口人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'NETMGPERSON_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'网管SE' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'NETMGNET'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'对应BOM编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'bom'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Column01'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Column02'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Column03'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Column04'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Column05'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Column06'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Column07'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Column08'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Column09'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE', @level2type=N'COLUMN',@level2name=N'Column10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'装备经理' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_RELEASE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属父编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_PCODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资源名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资源编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_CONTENT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_SORT'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资源类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'RESOURCE_TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'FLAG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否主页上展示，1：展示 0：不展示' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'IsShow'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类型：Add:申请类，Query:查询类   ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Resource', @level2type=N'COLUMN',@level2name=N'HRES_TYPE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role', @level2type=N'COLUMN',@level2name=N'HRL_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role', @level2type=N'COLUMN',@level2name=N'HRL_NAME'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role', @level2type=N'COLUMN',@level2name=N'HRL_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role', @level2type=N'COLUMN',@level2name=N'HRL_CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role', @level2type=N'COLUMN',@level2name=N'HRL_CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role', @level2type=N'COLUMN',@level2name=N'HRL_MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role', @level2type=N'COLUMN',@level2name=N'HRL_MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role', @level2type=N'COLUMN',@level2name=N'FLAG'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role', @level2type=N'COLUMN',@level2name=N'REMARK'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ROLE_DATA', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ROLE_DATA', @level2type=N'COLUMN',@level2name=N'ROLE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'数据权限id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ROLE_DATA', @level2type=N'COLUMN',@level2name=N'DATA_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ROLE_DATA', @level2type=N'COLUMN',@level2name=N'ROLE_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ROLE_DATA_1', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ROLE_DATA_1', @level2type=N'COLUMN',@level2name=N'ROLE_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'数据权限id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ROLE_DATA_1', @level2type=N'COLUMN',@level2name=N'DATA_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_ROLE_DATA_1', @level2type=N'COLUMN',@level2name=N'ROLE_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role_Resource', @level2type=N'COLUMN',@level2name=N'HRRR_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色code' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role_Resource', @level2type=N'COLUMN',@level2name=N'HRRR_HRL_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'资源code' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_Role_Resource', @level2type=N'COLUMN',@level2name=N'HRRR_HRES_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子特性内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'SUBFEATURENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子特性中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'SUBFEATURE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子特性曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'SUBFEATUREOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子特性英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'engSUBFEATURE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'VERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属特性' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'FEATURENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'CREATED_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'CREATED_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'MODIFY_DATA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段1' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段2' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段3' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY3'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段4' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY4'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段5' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY5'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段6' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY6'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段7' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY7'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段8' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY8'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段9' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY9'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段10' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_FEATRUE', @level2type=N'COLUMN',@level2name=N'STANDBY10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子系统内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'SUBSYSTEMNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子系统中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'SUBSYSTEM'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子系统曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'SUBSYSTEMOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'子系统英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'engSUBSYSTEM'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'VERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'CREATED_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'CREATED_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'MODIFY_DATA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段1' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'STANDBY1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段2' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'STANDBY2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段3' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'STANDBY3'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段4' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'STANDBY4'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段5' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'STANDBY5'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段6' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'STANDBY6'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段7' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'STANDBY7'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段8' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'STANDBY8'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段9' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'STANDBY9'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段10' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_SUB_SYSTEM', @level2type=N'COLUMN',@level2name=N'STANDBY10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最终 状态 处理成功或者处理失败' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TASK', @level2type=N'COLUMN',@level2name=N'final_status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'工作流任务id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TASK', @level2type=N'COLUMN',@level2name=N'act_task_id'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'传给erp的批次号  用_分割次数' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TASK', @level2type=N'COLUMN',@level2name=N'erp_apply_no'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目组内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'TEAMNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目组中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'TEAM'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目组曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'TEAMOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'项目组英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'engTEAM'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品V级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'VERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'RELEASENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'CREATED_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'CREATED_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'最后编辑时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'MODIFY_DATA'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段1' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'STANDBY1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段2' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'STANDBY2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段3' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'STANDBY3'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段4' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'STANDBY4'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段5' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'STANDBY5'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段6' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'STANDBY6'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段7' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'STANDBY7'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段8' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'STANDBY8'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段9' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'STANDBY9'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备用字段10' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_TEAM', @level2type=N'COLUMN',@level2name=N'STANDBY10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_User_Role', @level2type=N'COLUMN',@level2name=N'HURR_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'用户code' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_User_Role', @level2type=N'COLUMN',@level2name=N'HURR_HUL_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色code' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_User_Role', @level2type=N'COLUMN',@level2name=N'HURR_HRL_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_UserGroup', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Notes群组名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_UserGroup', @level2type=N'COLUMN',@level2name=N'NotesGroup'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Admp群组名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_UserGroup', @level2type=N'COLUMN',@level2name=N'AdmpGroup'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'群里人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_UserGroup', @level2type=N'COLUMN',@level2name=N'GroupUserCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_UserGroup', @level2type=N'COLUMN',@level2name=N'CreateUser'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_UserGroup', @level2type=N'COLUMN',@level2name=N'CreateDate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_UserGroup', @level2type=N'COLUMN',@level2name=N'ModifyUser'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_UserGroup', @level2type=N'COLUMN',@level2name=N'ModifyDate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_UserGroup', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品V级内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'VERSIONNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品V级中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'VERSION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'P'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品/特性缩写' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'V'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品V级英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'engVERSION'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品V级曾用名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'VERSIONOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态(0有效 1失效)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'PRODUCTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品POP' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'POP_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品CMO' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'CMO_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'匹配结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Match'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'技术文件基础库修改后的产品V级名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'VersionMatch'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'数据源的文档ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'ProdDataID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'试制中心版本管理员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'PilotProduction_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'技术支援产品线接口人 ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'TechSupport_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'海外产品技术支持版本管理员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Oversea_Mnger'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'CREATE_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'CREATE_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'MODIFY_USER'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'MODIFY_DATE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'PRODLINENo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'能够看到此文档的人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Readers'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Column01'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Column02'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Column03'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Column04'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Column05'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Column06'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Column07'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Column08'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Column09'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'冗余字段' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VERSION', @level2type=N'COLUMN',@level2name=N'Column10'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属IPMT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'PLIPMTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属研发产品线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ProdLineNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'所属产品' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ProductNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT执行秘书' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'IPMTSecretary'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否新建V版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'NewPV'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要新增产品V级内码 写入V数据时编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'VersionNewNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要新增产品V级中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'VersionNew'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要新增产品V级英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'engVersionNew'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否有修改V' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ModPV'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品V级内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'VersionOldNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品V级原中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'VersionOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品V级原英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'engVersionOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品V级新中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'VersionNow'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品V级新英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'engVersionNow'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否有需要删除的V' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'DelPV'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要删除的产品V级内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'VersionDelNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要删除的产品V级中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'Versiondel'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要删除的产品V级英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'engVersionDel'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否要删除该产品V级以下级别的信息：包括产品R级、版本、项目组、特性、子系统、模块、模块版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'PVIfDelBelow'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'产品V级    产品R级信息修改操作之前请先选择所属产品V级（只能单选），如果V级是上面新增的，就不需再选择。' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'VersionNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否新增R级' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'NewPR'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要新增产品R级的内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseNewNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要新增产品R级中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseNew'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要新增产品R级英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'engReleaseNew'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'请选择对应的PDT' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'PDTNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'请选择对应的软件平台版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseNo_Software'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否修改R版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ModPR'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品R级的内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseOldNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品R级的原中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品R级的原英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'engReleaseOld'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品R级的新中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseNow'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品R级的新英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'engReleaseNow'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要修改产品R级的对应的软件平台版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseNo_SoftwareNow'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否删除R' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'DelPR'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要删除的产品R级内码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseDelNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要删除的产品R级中文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ReleaseDel'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'要删除的产品R级英文名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'engReleaseDel'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否要删除该产品R级以下级别的信息：包括版本、项目组、特性、子系统、模块、模块版本' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'PRIfDelBelow'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'抄送人员' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'copyto'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'Creator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'CreateTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'Modifier'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'ModifyTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'请选择继承角色信息的版本号 ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_APPLY', @level2type=N'COLUMN',@level2name=N'InheritRelease'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'标识列' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'申请编号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'APPLY_CODE'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理者' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'Handler'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'工作流实例ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'Instanse_ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'当前处理节点' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'CurrentNode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'STATUS_DESC'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'第一环节签名人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'First_Sign'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'第一环节签名时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'First_Date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT签名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'IPMT_Sign'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT签名时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'IPMT_Date'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IPMT审核意见' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'IPMT_Opinion'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'审核结果' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'IPMT_Result'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'Creator'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'创建时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'CreateTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'Modifier'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'修改时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'IBDS_VR_PROCESS', @level2type=N'COLUMN',@level2name=N'ModifyTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'异常数据描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'notesProjectCodeTmp', @level2type=N'COLUMN',@level2name=N'cause'
GO
