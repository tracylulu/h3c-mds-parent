USE [master]
GO

/****** Object:  LinkedServer [ERP]    Script Date: 2019/8/20 9:40:46 ******/
EXEC master.dbo.sp_addlinkedserver @server = N'ERP', @srvproduct=N'orcle', @provider=N'OraOLEDB.Oracle', @datasrc=N' (DESCRIPTION= (ADDRESS=(PROTOCOL=tcp)(HOST=10.63.8.34)(PORT=1521))(CONNECT_DATA= (SERVICE_NAME=YUAT)  (INSTANCE_NAME=YUAT) ))'
 /* For security reasons the linked server remote logins password is changed with ######## */
EXEC master.dbo.sp_addlinkedsrvlogin @rmtsrvname=N'ERP',@useself=N'False',@locallogin=NULL,@rmtuser=N'MDS',@rmtpassword='########'

GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'collation compatible', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'data access', @optvalue=N'true'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'dist', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'pub', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'rpc', @optvalue=N'true'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'rpc out', @optvalue=N'true'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'sub', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'connect timeout', @optvalue=N'0'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'collation name', @optvalue=null
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'lazy schema validation', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'query timeout', @optvalue=N'0'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'use remote collation', @optvalue=N'true'
GO

EXEC master.dbo.sp_serveroption @server=N'ERP', @optname=N'remote proc transaction promotion', @optvalue=N'true'
GO


