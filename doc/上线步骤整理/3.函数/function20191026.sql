USE [IBDSDB]
GO
/****** Object:  UserDefinedFunction [dbo].[F_RepalceGroup]    Script Date: 2019/10/26 9:01:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date, ,>
-- Description:	notes群组及admp群组转换
-- =============================================
CREATE FUNCTION [dbo].[F_RepalceGroup]
(
	-- Add the parameters for the function here
	@group NVARCHAR(max),
	@type CHAR(1) --0:note群组替换ADMP群组，1：ADMP群组替换notes群组
)
RETURNS NVARCHAR(max)
AS
BEGIN
	-- Declare the return variable here
	DECLARE @value NVARCHAR(200)

	
	IF @type=0
	BEGIN
	SET  @value=(SELECT STUFF(( SELECT  ',' + e.tableColumn
                FROM  (
					--群组里填写人员处理
					SELECT LTRIM(REPLACE(REPLACE(REPLACE(d.tableColumn,'CN=',''),'/O=h3c',''),'/O=huawei-3com','')) tableColumn  FROM  (
							SELECT a.tableColumn,b.Code,c.NotesGroup,c.AdmpGroup  FROM [dbo].[F_StrToTable](@group) a 
							LEFT JOIN tbl_2_10_EN b ON a.tableColumn=b.uda_10_509+' '+b.Code
							LEFT JOIN dbo.IBDS_UserGroup c ON a.tableColumn=c.NotesGroup) d  
					WHERE d.Code IS NOT NULL
					UNION ALL
					--群组处理
					SELECT LTRIM(d.AdmpGroup) tableColumn  FROM   (
						SELECT a.tableColumn,b.Code,c.NotesGroup,c.AdmpGroup  FROM [dbo].[F_StrToTable](@group) a 
						LEFT JOIN tbl_2_10_EN b ON a.tableColumn=b.uda_10_509+' '+b.Code
						LEFT JOIN dbo.IBDS_UserGroup c ON a.tableColumn=c.NotesGroup
						) d 
					WHERE d.NotesGroup IS NOT NULL
					--找不到对应的 显示原来的
					--只同步reader
					UNION ALL
					SELECT LTRIM( REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(d.tableColumn,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),'/h3c',''),'/huawei-3com',''),'/O=huawei','')) tableColumn  FROM   (
						SELECT a.tableColumn,b.Code,c.NotesGroup,c.AdmpGroup  FROM [dbo].[F_StrToTable](@group) a 
						LEFT JOIN tbl_2_10_EN b ON a.tableColumn=b.uda_10_509+' '+b.Code
						LEFT JOIN dbo.IBDS_UserGroup c ON a.tableColumn=c.NotesGroup
						)d 
						WHERE d.NotesGroup IS  NULL AND d.Code IS NULL) e
					WHERE e.tableColumn IS NOT NULL ORDER BY E.tableColumn
			 FOR
                XML PATH('')
              ), 1, 1, '') )
			
	END 
	ELSE 
	BEGIN
		SET  @value=(SELECT STUFF(( SELECT  ',' + e.tableColumn
                FROM  (
					--群组里填写人员处理
					SELECT LTRIM( CASE d.tableColumn WHEN NULL THEN '' ELSE dbo.[F_ReplaceUser](d.tableColumn) END )   AS  tableColumn  FROM  (
						SELECT a.tableColumn,b.Code,c.NotesGroup,c.AdmpGroup  FROM [dbo].[F_StrToTable](@group) a 
						LEFT JOIN tbl_2_10_EN b ON a.tableColumn=b.uda_10_509+' '+b.Code
						LEFT JOIN dbo.IBDS_UserGroup c ON a.tableColumn=c.AdmpGroup
						) d 
					WHERE d.Code IS NOT NULL
					UNION ALL
					--群组处理
					SELECT LTRIM(d.NotesGroup) tableColumn  FROM   (
						SELECT a.tableColumn,b.Code,c.NotesGroup,c.AdmpGroup  FROM [dbo].[F_StrToTable](@group) a 
						LEFT JOIN tbl_2_10_EN b ON a.tableColumn=b.uda_10_509+' '+b.Code
						LEFT JOIN dbo.IBDS_UserGroup c ON a.tableColumn=c.AdmpGroup
						) d 
					WHERE d.NotesGroup IS NOT NULL
					UNION ALL
					--找不到对应的 显示原来的
					SELECT  LTRIM(d.tableColumn)  FROM   (
						SELECT a.tableColumn,b.Code,c.NotesGroup,c.AdmpGroup  FROM [dbo].[F_StrToTable](@group) a 
						LEFT JOIN tbl_2_10_EN b ON a.tableColumn=b.uda_10_509+' '+b.Code
						LEFT JOIN dbo.IBDS_UserGroup c ON a.tableColumn=c.AdmpGroup
						) d
						WHERE d.NotesGroup IS  NULL AND d.Code IS NULL AND LTRIM(d.tableColumn) !='*' 
					UNION ALL
					--找不到对应的 显示原来的
					SELECT  LTRIM(d.tableColumn)+'/O=h3c'  FROM   (
						SELECT a.tableColumn,b.Code,c.NotesGroup,c.AdmpGroup  FROM [dbo].[F_StrToTable](@group) a 
						LEFT JOIN tbl_2_10_EN b ON a.tableColumn=b.uda_10_509+' '+b.Code
						LEFT JOIN dbo.IBDS_UserGroup c ON a.tableColumn=c.AdmpGroup
						) d
						WHERE d.NotesGroup IS  NULL AND d.Code IS NULL AND LTRIM(d.tableColumn)='*' 
				)e
				WHERE e.tableColumn IS NOT NULL  ORDER BY E.tableColumn
				FOR
                XML PATH('')
              ), 1, 1, '') )
		 SET @value=replace(@value, '*/O=h3c,*/O=h3c','*/O=huawei-3com,*/O=h3c')
	END 
	
	SET @value=REPLACE(@value,'&amp;','&')
			 
	RETURN @value

END



GO
/****** Object:  UserDefinedFunction [dbo].[F_ReplaceUser]    Script Date: 2019/10/26 9:01:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date, ,>
-- Description:	为人员信息添加cn /o=h3c 
-- =============================================
CREATE FUNCTION [dbo].[F_ReplaceUser]
(
	@user NVARCHAR(200)
)
RETURNS NVARCHAR(200)
AS
BEGIN
	-- Declare the return variable here
	DECLARE @repalceUser NVARCHAR(200)

	-- Add the T-SQL statements to compute the return value here
	--SET @repalceUser=(SELECT CASE LEN(@user) 
	--		WHEN 0 THEN '' 
	--		WHEN  NULL THEN NULL 
	--		WHEN CHARINDEX(',',@user,LEN(@user))  THEN  'CN='+REPLACE(SUBSTRING(@user,0,LEN(@user)),',','/O=h3c,CN=')+'/O=h3c'
	--		ELSE   'CN='+REPLACE(@user,',','/O=h3c,CN=')+'/O=h3c'END )

	-- Return the result of the function

	SET @repalceUser=(SELECT STUFF(( SELECT  ',' + CASE SUBSTRING(e.tableColumn,CHARINDEX(' ',e.tableColumn)+1,2)
														WHEN 'wx' THEN 'CN='+e.tableColumn+'/OU='+SUBSTRING(e.tableColumn,CHARINDEX(' ',e.tableColumn)+1,2)+'/O=h3c01'
														WHEN 'wy' THEN 'CN='+e.tableColumn+'/OU='+SUBSTRING(e.tableColumn,CHARINDEX(' ',e.tableColumn)+1,2)+'/O=h3c01'
														WHEN 'fw' THEN 'CN='+e.tableColumn+'/OU='+SUBSTRING(e.tableColumn,CHARINDEX(' ',e.tableColumn)+1,2)+'/O=h3c01'
														WHEN 'kf' THEN 'CN='+e.tableColumn+'/OU='+SUBSTRING(e.tableColumn,CHARINDEX(' ',e.tableColumn)+1,2)+'/O=h3c01'
														WHEN 'ys' THEN 'CN='+e.tableColumn+'/OU='+SUBSTRING(e.tableColumn,CHARINDEX(' ',e.tableColumn)+1,2)+'/O=h3c01'
														WHEN 'gw' THEN 'CN='+e.tableColumn+'/OU='+SUBSTRING(e.tableColumn,CHARINDEX(' ',e.tableColumn)+1,2)+'/O=h3c01'
														ELSE 'CN='+e.tableColumn+'/O=h3c'END 
																	
                FROM  (
					SELECT * FROM [dbo].[F_StrToTable](@user) WHERE tableColumn!='' AND tableColumn IS NOT NULL
					) e
			 WHERE e.tableColumn IS NOT NULL
			 FOR
                XML PATH('')
              ), 1, 1, '') )
	

	RETURN @repalceUser

END



GO
/****** Object:  UserDefinedFunction [dbo].[F_StrToTable]    Script Date: 2019/10/26 9:01:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

create Function [dbo].[F_StrToTable](@str varchar(max)) 
Returns @tableName Table 
( 
tableColumn varchar(max) --如:a,b,c  
) 
As 
--该函数用于把一个用逗号分隔的多个数据字符串变成一个表的一列，例如字符串'1,2,3,4,5' 将编程一个表，这个表 
Begin 
set @str = @str+',' 
Declare @insertStr varchar(50) --–截取后的第一个字符串 
Declare @newstr varchar(1000) --–截取第一个字符串后剩余的字符串 
set @insertStr = left(@str,charindex(',',@str)-1) 
set @newstr = stuff(@str,1,charindex(',',@str),'') 
Insert @tableName Values(@insertStr) 
while(len(@newstr)>0) 
begin 
set @insertStr = left(@newstr,charindex(',',@newstr)-1) 
  if (@insertStr<>'')
  begin 
Insert @tableName Values(@insertStr) 
end
set @newstr = stuff(@newstr,1,charindex(',',@newstr),'') 

end 
Return 
End


GO
/****** Object:  UserDefinedFunction [dbo].[STR_SPLIT]    Script Date: 2019/10/26 9:01:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE FUNCTION [dbo].[STR_SPLIT] (
    @String VARCHAR(MAX),
    @Delimiter VARCHAR(MAX)
) RETURNS @temptable TABLE (items VARCHAR(MAX)) AS
BEGIN
    DECLARE @idx INT=1
    DECLARE @slice VARCHAR(MAX) 
    IF LEN(@String) < 1 OR LEN(ISNULL(@String,'')) = 0
        RETURN
    WHILE @idx != 0
    BEGIN
        SET @idx = CHARINDEX(@Delimiter,@String)

        IF @idx != 0
            SET @slice = LEFT(@String,@idx - 1)
        ELSE
            SET @slice = @String

        IF LEN(@slice) > 0
            INSERT INTO @temptable(items) VALUES(@slice)

        SET @String = RIGHT (@String, LEN(@String) - @idx)

        IF LEN(@String) = 0
            BREAK
    END
    RETURN
END

GO
