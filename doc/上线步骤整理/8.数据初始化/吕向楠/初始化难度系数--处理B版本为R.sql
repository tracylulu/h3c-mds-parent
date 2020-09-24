--SELECT *  FROM (SELECT * FROM dbo.IBDS_DifficultyCoefficient WHERE Bversion='r') a INNER JOIN ( SELECT * FROM dbo.IBDS_DifficultyCoefficient WHERE Bversion !='r') b
--ON a.ReleaseNo=b.ReleaseNo   ORDER BY a.ReleaseNo 
 



 DECLARE @releaseno NVARCHAR(200),@prosn NVARCHAR(200),@hardsn NVARCHAR(200)
 DECLARE @pack NVARCHAR(200)
 DECLARE curs CURSOR FOR( SELECT ReleaseNo,DifficultyCoefficient,DifficultyCoefficient_1 FROM dbo.IBDS_DifficultyCoefficient WHERE Bversion='r' AND DifficultyCoefficient NOT IN ('待定','暂无','申请中') )

 OPEN curs
 FETCH NEXT FROM curs INTO @releaseno,@prosn,@hardsn
 WHILE @@FETCH_STATUS=0
 BEGIN
	IF(SELECT COUNT(*) FROM dbo.IBDS_bversion WHERE RELEASENo=@releaseno)=1
	BEGIN
		UPDATE dbo.IBDS_bversion SET proDifficult=@prosn,harddiffcult=@hardsn WHERE RELEASENo=@releaseno
    END
	ELSE
	BEGIN
		 --所有b打包 获取打包数据
		SET @pack=( REPLACE(STUFF((SELECT ',' + bversioncname FROM dbo.IBDS_bversion WHERE RELEASENo=@releaseno ORDER BY bversioncname FOR XML PATH('')) , 1, 1, '') ,',','&') )
		IF @prosn IS NOT NULL AND @hardsn IS NULL
		BEGIN
			UPDATE dbo.IBDS_bversion SET proDifficult=@prosn,Pack=(CASE WHEN @prosn IS NULL THEN NULL WHEN @prosn='' THEN NULL ELSE @pack END)  WHERE RELEASENo=@releaseno
		END 
		ELSE IF @prosn IS NULL AND @hardsn IS NOT NULL
		BEGIN
			UPDATE dbo.IBDS_bversion SET harddiffcult=@hardsn,HardPack=(CASE WHEN @prosn IS NULL THEN NULL WHEN @prosn='' THEN NULL ELSE @pack END) WHERE RELEASENo=@releaseno
		END 
		ELSE IF @prosn IS NOT NULL AND @hardsn IS NOT NULL
		BEGIN
		    UPDATE dbo.IBDS_bversion SET proDifficult=@prosn,Pack=(CASE WHEN @prosn IS NULL THEN NULL WHEN @prosn='' THEN NULL ELSE @pack END) ,
		harddiffcult=@hardsn,HardPack=(CASE WHEN @prosn IS NULL THEN NULL WHEN @prosn='' THEN NULL ELSE @pack END) WHERE RELEASENo=@releaseno
		END
		
	END  
	
	
	SET @pack='';
	--next
	 FETCH NEXT FROM curs INTO @releaseno,@prosn,@hardsn
 END 

 CLOSE curs
 DEALLOCATE curs




