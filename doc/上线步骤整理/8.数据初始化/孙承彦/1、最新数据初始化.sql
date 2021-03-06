
--初始化财务参考信息产品线
DELETE FROM IBDS_F_PRODLINE;
INSERT INTO IBDS_F_PRODLINE(PRODLINE_NO,PRODLINE_DESC,STATUS,PRODLINE_NAME) SELECT DISTINCT PROLINECODE ,PROLINECN,'1',PROLINECN FROM F_PROD_Temp;

--初始化财务参考信息产品族
DELETE FROM IBDS_F_PROD;
INSERT INTO IBDS_F_PROD (
	PROD_NO,
	PROD_NAME,
	PRODLINE_ID
) SELECT
	A.PRORACECODE,
	A.PRORACECN,
	B.ID
FROM
	F_PROD_Temp A,
	IBDS_F_PRODLINE B
WHERE
	A.PROLINECN = B.PRODLINE_DESC
AND A.PROLINECODE = B.PRODLINE_NO;


--更新产品线英文描述
UPDATE A SET A.PRODLINE_DESC_EN=B.PROLINEEN FROM IBDS_F_PRODLINE A,F_PRODLINE_Temp B WHERE A.PRODLINE_NAME=B.PROLINECN AND A.PRODLINE_NO=B.PROLINECODE;
--更新产品族描述
UPDATE A SET A.PROD_NAME_EN=B.PRORACEEN FROM IBDS_F_PROD A,F_PROD_Temp B WHERE A.PROD_NO=B.PRORACECODE AND A.PROD_NAME=B.PRORACECN ;


--初始化PDT
DELETE FROM IBDS_PROCESS_CONFIG_ITEM WHERE CONFIG_CODE='processPDT';
--插入PDT经理和财务接口人都有的PDT信息
INSERT INTO IBDS_PROCESS_CONFIG_ITEM (CONFIG_CODE,CONTENT,NOTE,FPROD_PERSON,PDT_MGN,STATE) SELECT 'processPDT',PDTNAME,PDTNAME,PDTPERSON,FLDPDTMANAGER,'1' FROM  PDT_PDT_MGN_Temp A,PDT_FPROD_PERSON_Temp B WHERE A.FLDPDT=B.PDTNAME;
--插入有PDT经理没有财务接口人的PDT信息
INSERT INTO IBDS_PROCESS_CONFIG_ITEM (CONFIG_CODE,CONTENT,NOTE,FPROD_PERSON,PDT_MGN,STATE) SELECT 'processPDT',fldpdt,fldpdt,NULL,FLDPDTMANAGER,'1' FROM  PDT_PDT_MGN_Temp WHERE FLDPDT NOT IN (SELECT PDTNAME FROM PDT_FPROD_PERSON_Temp);
--插入有财务接口人没有PDT经理的PDT信息
INSERT INTO IBDS_PROCESS_CONFIG_ITEM (CONFIG_CODE,CONTENT,NOTE,FPROD_PERSON,PDT_MGN,STATE) SELECT 'processPDT',PDTNAME,PDTNAME,PdtPerson,NULL,'1' FROM PDT_FPROD_PERSON_Temp WHERE PDTNAME NOT IN (SELECT FLDPDT FROM PDT_PDT_MGN_Temp);
--人员修改去除notes标识
UPDATE IBDS_PROCESS_CONFIG_ITEM SET FPROD_PERSON=REPLACE(REPLACE(FPROD_PERSON,'CN=',''),'/O=h3c',''),PDT_MGN=REPLACE(REPLACE(PDT_MGN,'CN=',''),'/O=h3c','') WHERE CONFIG_CODE='processPDT';
--姓名加工号改为域账号
UPDATE IBDS_PROCESS_CONFIG_ITEM SET FPROD_PERSON=(SELECT UDA_10_511 FROM tbl_2_10_EN WHERE UDA_10_509+' '+UDA_10_512 = IBDS_PROCESS_CONFIG_ITEM.FPROD_PERSON),PDT_MGN=(SELECT UDA_10_511 FROM tbl_2_10_EN WHERE UDA_10_509+' '+UDA_10_512 = IBDS_PROCESS_CONFIG_ITEM.PDT_MGN)  WHERE CONFIG_CODE='processPDT';
--更新研发基本信息内码
UPDATE IBDS_PROCESS_CONFIG_ITEM SET PDT_CODE=(SELECT PDTNO FROM IBDS_PDT WHERE PDT !='SDN' AND PDT = IBDS_PROCESS_CONFIG_ITEM.CONTENT )  WHERE CONFIG_CODE='processPDT';


--财务参考信息产品编码
DELETE  FROM IBDS_F_PRODUCT_CODE;
DELETE  FROM IBDS_F_PRODUCT_CODE_HISTORY;

INSERT INTO IBDS_F_PRODUCT_CODE (
	PRODLINE_NAME,
	PDT_NAME,
	PRODUCT_CODE,
	PRODUCT_NAME_CN,
	PRODUCT_NAME,
	PRODUCT_NAME_EN,
	BOM_CODE,
	NOTE,
	OLD_PRODUCT_CODE,
	OLD_PRODUCT_NAME_CN,
	OLD_PRODUCT_NAME_EN,
	OLD_BOM_CODE,
	STATUS,
	EFFECT_DATE,
	APPLY_DEPT,
	PRODLINE_ID,
	PDT_ID,
	OLD_PRODLINE_ID,
	OLD_PDT_ID,
PRODUCT_ID
)
SELECT
	f_class,
	f_PDT,
	f_prodno,
	f_prodname,
	LEFT(SUBSTRING(F_PRODALL,CHARINDEX('\', F_PRODALL)+1,LEN(F_PRODALL)-CHARINDEX('\', F_PRODALL)) ,CHARINDEX('\',SUBSTRING(F_PRODALL,CHARINDEX('\', F_PRODALL)+1,LEN(F_PRODALL)-CHARINDEX('\', F_PRODALL)) )-1),
	EnglishDepict,
	f_bomno,
	f_explain,
	f_prodno_old,
	f_prodname_old,
	EnglishDepict_1,
	f_bomno_1,
	CASE f_status
WHEN '新增' THEN
	'1'
WHEN '改变' THEN
	'2'
WHEN '停用' THEN
	'3'
ELSE
	NULL
END,
 BeginTime,
 CASE f_bumen
WHEN '研发' THEN
	'D0001'
WHEN '专业服务部' THEN
	'D0002'
WHEN '其他' THEN
	'D0003'
ELSE
	NULL
END,
 (
	SELECT
		TOP 1 ID
	FROM
		IBDS_F_PRODLINE
	WHERE
		IBDS_F_PRODLINE.PRODLINE_DESC = F_PRODUCT_CODE_Temp.f_class
),
 (
	SELECT
		TOP 1 ID
	FROM
		IBDS_PROCESS_CONFIG_ITEM
	WHERE
		IBDS_PROCESS_CONFIG_ITEM.CONFIG_CODE = 'processPDT'
	AND IBDS_PROCESS_CONFIG_ITEM.CONTENT = F_PRODUCT_CODE_Temp.f_PDT
),
 (
	SELECT
		TOP 1 ID
	FROM
		IBDS_F_PRODLINE
	WHERE
		IBDS_F_PRODLINE.PRODLINE_DESC = F_PRODUCT_CODE_Temp.f_class_1
),
 (
	SELECT
		TOP 1 ID
	FROM
		IBDS_PROCESS_CONFIG_ITEM
	WHERE
		IBDS_PROCESS_CONFIG_ITEM.CONFIG_CODE = 'processPDT'
	AND IBDS_PROCESS_CONFIG_ITEM.CONTENT = F_PRODUCT_CODE_Temp.f_PDT_1
),
 (
	SELECT 
		TOP 1 ID
	FROM IBDS_F_PROD
	WHERE IBDS_F_PROD.PROD_NAME=
	LEFT(SUBSTRING(F_PRODALL,CHARINDEX('\', F_PRODALL)+1,LEN(F_PRODALL)-CHARINDEX('\', F_PRODALL)) ,CHARINDEX('\',SUBSTRING(F_PRODALL,CHARINDEX('\', F_PRODALL)+1,LEN(F_PRODALL)-CHARINDEX('\', F_PRODALL)) )-1)
 )
FROM
	F_PRODUCT_CODE_Temp WHERE MARK='1';

INSERT INTO IBDS_F_PRODUCT_CODE_HISTORY (
	PRODLINE_NAME,
	PDT_NAME,
	PRODUCT_CODE,
	PRODUCT_NAME_CN,
	PRODUCT_NAME,
	PRODUCT_NAME_EN,
	BOM_CODE,
	NOTE,
	OLD_PRODUCT_CODE,
	OLD_PRODUCT_NAME_CN,
	OLD_PRODUCT_NAME_EN,
	OLD_BOM_CODE,
	STATUS,
	EFFECT_DATE,
	APPLY_DEPT,
	PRODLINE_ID,
	PDT_ID,
	OLD_PRODLINE_ID,
	OLD_PDT_ID,
PRODUCT_ID
)
SELECT
	f_class,
	f_PDT,
	f_prodno,
	f_prodname,
	LEFT(SUBSTRING(F_PRODALL,CHARINDEX('\', F_PRODALL)+1,LEN(F_PRODALL)-CHARINDEX('\', F_PRODALL)) ,CHARINDEX('\',SUBSTRING(F_PRODALL,CHARINDEX('\', F_PRODALL)+1,LEN(F_PRODALL)-CHARINDEX('\', F_PRODALL)) )-1),
	EnglishDepict,
	f_bomno,
	f_explain,
	f_prodno_old,
	f_prodname_old,
	EnglishDepict_1,
	f_bomno_1,
	CASE f_status
WHEN '新增' THEN
	'1'
WHEN '改变' THEN
	'2'
WHEN '停用' THEN
	'3'
ELSE
	NULL
END,
 BeginTime,
 CASE f_bumen
WHEN '研发' THEN
	'D0001'
WHEN '专业服务部' THEN
	'D0002'
WHEN '其他' THEN
	'D0003'
ELSE
	NULL
END,
 (
	SELECT
		TOP 1 ID
	FROM
		IBDS_F_PRODLINE
	WHERE
		IBDS_F_PRODLINE.PRODLINE_DESC = F_PRODUCT_CODE_Temp.f_class
),
 (
	SELECT
		TOP 1 ID
	FROM
		IBDS_PROCESS_CONFIG_ITEM
	WHERE
		IBDS_PROCESS_CONFIG_ITEM.CONFIG_CODE = 'processPDT'
	AND IBDS_PROCESS_CONFIG_ITEM.CONTENT = F_PRODUCT_CODE_Temp.f_PDT
),
 (
	SELECT
		TOP 1 ID
	FROM
		IBDS_F_PRODLINE
	WHERE
		IBDS_F_PRODLINE.PRODLINE_DESC = F_PRODUCT_CODE_Temp.f_class_1
),
 (
	SELECT
		TOP 1 ID
	FROM
		IBDS_PROCESS_CONFIG_ITEM
	WHERE
		IBDS_PROCESS_CONFIG_ITEM.CONFIG_CODE = 'processPDT'
	AND IBDS_PROCESS_CONFIG_ITEM.CONTENT = F_PRODUCT_CODE_Temp.f_PDT_1
),
 (
	SELECT 
		TOP 1 ID
	FROM IBDS_F_PROD
	WHERE IBDS_F_PROD.PROD_NAME=
	LEFT(SUBSTRING(F_PRODALL,CHARINDEX('\', F_PRODALL)+1,LEN(F_PRODALL)-CHARINDEX('\', F_PRODALL)) ,CHARINDEX('\',SUBSTRING(F_PRODALL,CHARINDEX('\', F_PRODALL)+1,LEN(F_PRODALL)-CHARINDEX('\', F_PRODALL)) )-1)
 )
FROM
	F_PRODUCT_CODE_Temp WHERE MARK='0';


--更新产品线产品族ID
UPDATE IBDS_F_PRODUCT_CODE
SET PRODUCT_NAME = LEFT (
	SUBSTRING (
		F_PRODALL,
		CHARINDEX('\', F_PRODALL) + 1,
		LEN(F_PRODALL) - CHARINDEX('\', F_PRODALL)
	),
	CHARINDEX(
		'\',
		SUBSTRING (
			F_PRODALL,
			CHARINDEX('\', F_PRODALL) + 1,
			LEN(F_PRODALL) - CHARINDEX('\', F_PRODALL)
		)
	) - 1
),
 PRODUCT_ID = (
	SELECT
		TOP 1 ID
	FROM
		IBDS_F_PROD
	WHERE
		SUBSTRING(PRODUCT_CODE,1,5)=IBDS_F_PROD.PROD_NO AND IBDS_F_PROD.PROD_NAME = LEFT (
			SUBSTRING (
				F_PRODALL,
				CHARINDEX('\', F_PRODALL) + 1,
				LEN(F_PRODALL) - CHARINDEX('\', F_PRODALL)
			),
			CHARINDEX(
				'\',
				SUBSTRING (
					F_PRODALL,
					CHARINDEX('\', F_PRODALL) + 1,
					LEN(F_PRODALL) - CHARINDEX('\', F_PRODALL)
				)
			) - 1
		)
)
FROM
	IBDS_F_PRODUCT_CODE,
	F_PRODUCT_CODE_Temp
WHERE
	IBDS_F_PRODUCT_CODE.PRODUCT_CODE = F_PRODUCT_CODE_Temp.f_prodno


UPDATE IBDS_F_PRODUCT_CODE_HISTORY
SET PRODUCT_NAME = LEFT (
	SUBSTRING (
		F_PRODALL,
		CHARINDEX('\', F_PRODALL) + 1,
		LEN(F_PRODALL) - CHARINDEX('\', F_PRODALL)
	),
	CHARINDEX(
		'\',
		SUBSTRING (
			F_PRODALL,
			CHARINDEX('\', F_PRODALL) + 1,
			LEN(F_PRODALL) - CHARINDEX('\', F_PRODALL)
		)
	) - 1
),
 PRODUCT_ID = (
	SELECT
		TOP 1 ID
	FROM
		IBDS_F_PROD
	WHERE
		SUBSTRING(PRODUCT_CODE,1,5)=IBDS_F_PROD.PROD_NO AND IBDS_F_PROD.PROD_NAME = LEFT (
			SUBSTRING (
				F_PRODALL,
				CHARINDEX('\', F_PRODALL) + 1,
				LEN(F_PRODALL) - CHARINDEX('\', F_PRODALL)
			),
			CHARINDEX(
				'\',
				SUBSTRING (
					F_PRODALL,
					CHARINDEX('\', F_PRODALL) + 1,
					LEN(F_PRODALL) - CHARINDEX('\', F_PRODALL)
				)
			) - 1
		)
)
FROM
	IBDS_F_PRODUCT_CODE_HISTORY,
	F_PRODUCT_CODE_Temp
WHERE
	IBDS_F_PRODUCT_CODE_HISTORY.PRODUCT_CODE = F_PRODUCT_CODE_Temp.f_prodno




UPDATE IBDS_F_PRODUCT_CODE SET PRODLINE_NO=SUBSTRING(PRODUCT_CODE,1,2);
UPDATE IBDS_F_PRODUCT_CODE_HISTORY SET PRODLINE_NO=SUBSTRING(PRODUCT_CODE,1,2);

UPDATE IBDS_F_PRODUCT_CODE SET PRODLINE_ID=(SELECT TOP 1 ID FROM IBDS_F_PRODLINE WHERE IBDS_F_PRODUCT_CODE.PRODLINE_NAME=IBDS_F_PRODLINE.PRODLINE_NAME AND IBDS_F_PRODUCT_CODE.PRODLINE_NO=IBDS_F_PRODLINE.PRODLINE_NO);

UPDATE IBDS_F_PRODUCT_CODE_HISTORY SET PRODLINE_ID=(SELECT TOP 1 ID FROM IBDS_F_PRODLINE WHERE IBDS_F_PRODUCT_CODE_HISTORY.PRODLINE_NAME=IBDS_F_PRODLINE.PRODLINE_NAME AND IBDS_F_PRODUCT_CODE_HISTORY.PRODLINE_NO=IBDS_F_PRODLINE.PRODLINE_NO);


--同步PDT状态
UPDATE A SET A.State=B.STATUS FROM  IBDS_PROCESS_CONFIG_ITEM A,IBDS_PDT B WHERE A.PDT_CODE=B.PDTNO AND CONFIG_CODE='processPDT' AND PDT_CODE IS NOT NULL AND PDT_CODE != '';


--更新财务产品线对应研发产品线
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='ADNET产品线' ,PRODLINE_CODE='PL000036' WHERE PRODLINE_NO='22' AND PRODLINE_NAME='ADNET';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='安全产品线' ,PRODLINE_CODE='PL000019' WHERE PRODLINE_NO='13' AND PRODLINE_NAME='安全';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='存储产品线' ,PRODLINE_CODE='PL000031' WHERE PRODLINE_NO='16' AND PRODLINE_NAME='存储';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='存储产品线' ,PRODLINE_CODE='PL000031' WHERE PRODLINE_NO='20' AND PRODLINE_NAME='存储OEM';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='多媒体产品线' ,PRODLINE_CODE='PL000018' WHERE PRODLINE_NO='12' AND PRODLINE_NAME='多媒体';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='公共产品线' ,PRODLINE_CODE='PL000005' WHERE PRODLINE_NO='00' AND PRODLINE_NAME='所有产品';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='公共产品线' ,PRODLINE_CODE='PL000005' WHERE PRODLINE_NO='26' AND PRODLINE_NAME='安防产品线';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='交换机产品线' ,PRODLINE_CODE='PL000017' WHERE PRODLINE_NO='11' AND PRODLINE_NAME='交换机';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='交换机产品线' ,PRODLINE_CODE='PL000017' WHERE PRODLINE_NO='15' AND PRODLINE_NAME='交换机';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='交换机产品线' ,PRODLINE_CODE='PL000017' WHERE PRODLINE_NO='18' AND PRODLINE_NAME='交换机产品线';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='路由器产品线' ,PRODLINE_CODE='PL000016' WHERE PRODLINE_NO='29' AND PRODLINE_NAME='传输';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='路由器产品线' ,PRODLINE_CODE='PL000016' WHERE PRODLINE_NO='15' AND PRODLINE_NAME='路由器';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='路由器产品线' ,PRODLINE_CODE='PL000016' WHERE PRODLINE_NO='10' AND PRODLINE_NAME='路由器';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='数字化业务产品线' ,PRODLINE_CODE='PL000032' WHERE PRODLINE_NO='28' AND PRODLINE_NAME='数字化业务';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='无线产品线' ,PRODLINE_CODE='PL000021' WHERE PRODLINE_NO='25' AND PRODLINE_NAME='移动通信产品';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='无线产品线' ,PRODLINE_CODE='PL000021' WHERE PRODLINE_NO='14' AND PRODLINE_NAME='无线产品';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='无线产品线' ,PRODLINE_CODE='PL000021' WHERE PRODLINE_NO='15' AND PRODLINE_NAME='无线';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='业务软件产品线' ,PRODLINE_CODE='PL000022' WHERE PRODLINE_NO='17' AND PRODLINE_NAME='软件';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='云数产品线' ,PRODLINE_CODE='PL000030' WHERE PRODLINE_NO='18' AND PRODLINE_NAME='2013';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='云数产品线' ,PRODLINE_CODE='PL000030' WHERE PRODLINE_NO='18' AND PRODLINE_NAME='云数';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='云数产品线' ,PRODLINE_CODE='PL000030' WHERE PRODLINE_NO='19' AND PRODLINE_NAME='云数';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='云数产品线' ,PRODLINE_CODE='PL000030' WHERE PRODLINE_NO='23' AND PRODLINE_NAME='云数';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='云数产品线' ,PRODLINE_CODE='PL000030' WHERE PRODLINE_NO='24' AND PRODLINE_NAME='大数据';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='智慧计算产品线' ,PRODLINE_CODE='PL000029' WHERE PRODLINE_NO='23' AND PRODLINE_NAME='UIS';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='智能终端产品线' ,PRODLINE_CODE='PL000023' WHERE PRODLINE_NO='15' AND PRODLINE_NAME='SMB';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='智能终端产品线' ,PRODLINE_CODE='PL000023' WHERE PRODLINE_NO='15' AND PRODLINE_NAME='SOHO';
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC='智慧计算产品线' ,PRODLINE_CODE='PL000029' WHERE PRODLINE_NO='19' AND PRODLINE_NAME='2014';

--更新产品编码PDT

UPDATE IBDS_F_PRODUCT_CODE SET PDT_NAME='中低端路由器',PDT_ID=(SELECT ID FROM IBDS_PROCESS_CONFIG_ITEM WHERE CONTENT='中低端路由器') WHERE PRODUCT_CODE IN (
'1001501',
'1001502',
'1001503',
'1002501',
'1002502',
'1002503',
'1007601',
'1007602',
'1007603',
'1007604',
'1007605',
'1007606',
'1008601',
'1008602',
'1008603',
'1008604',
'1008605',
'1008606',
'1012002'

);


UPDATE IBDS_F_PRODUCT_CODE SET PDT_NAME='H3C CloudUIS',PDT_ID=(SELECT ID FROM IBDS_PROCESS_CONFIG_ITEM WHERE CONTENT='H3C CloudUIS') WHERE PRODUCT_CODE IN (
'1950103',
'2310000',
'2310001',
'2310002',
'2310003',
'2310004',
'2310005',
'2320000',
'2320001',
'2320002',
'2320003',
'2330000',
'2330001',
'2360000',
'2360001',
'2360002',
'2371000',
'2371001',
'2400400'

);

UPDATE IBDS_F_PRODUCT_CODE SET PDT_NAME='刀片服务器',PDT_ID=(SELECT ID FROM IBDS_PROCESS_CONFIG_ITEM WHERE CONTENT='刀片服务器') WHERE  PRODUCT_CODE IN (
'2340000',
'2340001',
'2340002',
'2351100',
'2351101',
'2351102',
'2370000',
'2370001',
'2370002',
'2372000',
'2372001'

) ;

UPDATE IBDS_F_PRODUCT_CODE SET PDT_NAME='服务器OEM IN',PDT_ID=(SELECT ID FROM IBDS_PROCESS_CONFIG_ITEM WHERE CONTENT='服务器OEM IN') WHERE   PRODUCT_CODE = '2330050';

UPDATE IBDS_F_PRODUCT_CODE SET PDT_NAME='数据平台',PDT_ID=(SELECT ID FROM IBDS_PROCESS_CONFIG_ITEM WHERE CONTENT='数据平台') WHERE PRODUCT_CODE IN (
'2400100',
'2400500',
'2400501',
'2400600',
'2400601'

);

UPDATE IBDS_F_PRODUCT_CODE SET PDT_NAME='移动通信解决方案',PDT_ID=(SELECT ID FROM IBDS_PROCESS_CONFIG_ITEM WHERE CONTENT='移动通信解决方案') WHERE PRODUCT_CODE='2500106';

UPDATE
IBDS_F_PRODUCT_CODE SET APPLY_DEPT='D0001'
WHERE
	APPLY_DEPT IS NULL
AND (
	PRODUCT_CODE LIKE '10%'
	OR PRODUCT_CODE LIKE '11%'
	OR PRODUCT_CODE LIKE '12%'
	OR PRODUCT_CODE LIKE '13%'
	OR PRODUCT_CODE LIKE '14%'
	OR PRODUCT_CODE LIKE '15%'
	OR PRODUCT_CODE LIKE '16%'
	OR PRODUCT_CODE LIKE '17%'
	OR PRODUCT_CODE LIKE '18%'
	OR PRODUCT_CODE LIKE '19%'
	OR PRODUCT_CODE LIKE '20%'
	OR PRODUCT_CODE LIKE '21%'
	OR PRODUCT_CODE LIKE '22%'
	OR PRODUCT_CODE LIKE '23%'
	OR PRODUCT_CODE LIKE '24%'
	OR PRODUCT_CODE LIKE '25%'
	OR PRODUCT_CODE LIKE '26%'
	OR PRODUCT_CODE LIKE '27%'
	OR PRODUCT_CODE LIKE '28%'
	OR PRODUCT_CODE LIKE '29%'

);
UPDATE IBDS_F_PRODUCT_CODE SET APPLY_DEPT='D0001' WHERE PRODUCT_CODE='0000000';
UPDATE IBDS_F_PRODUCT_CODE SET APPLY_DEPT='D0002' WHERE PRODUCT_CODE='4900101';


--更新研发基本信息PDT经理
UPDATE A
SET A.PDT_MGN = (
	SELECT
		uda_10_511
	FROM
		tbl_2_10_EN
	WHERE
		(
			tbl_2_10_EN.UDA_10_509 + ' ' + tbl_2_10_EN.uda_10_512
		) = B.PDT_MANAGER
)
FROM
	IBDS_PROCESS_CONFIG_ITEM A,
	IBDS_PDT B
WHERE
	A.PDT_CODE = B.PDTNO
AND CONFIG_CODE = 'processPDT';

--更新研发基本信息财务接口人
UPDATE A
SET A.FPROD_PERSON = (
	SELECT
		uda_10_511
	FROM
		tbl_2_10_EN
	WHERE
		(
			tbl_2_10_EN.UDA_10_509 + ' ' + tbl_2_10_EN.uda_10_512
		) = B.FINPDT_ID
)
FROM
	IBDS_PROCESS_CONFIG_ITEM A,
	IBDS_PDT B
WHERE
	A.PDT_CODE = B.PDTNO
AND CONFIG_CODE = 'processPDT';


--更新产品线英文描述
UPDATE A SET A.PRODLINE_DESC_EN=B.PROLINEEN FROM IBDS_F_PRODLINE A,F_PRODLINE_Temp B WHERE A.PRODLINE_NAME=B.PROLINECN AND A.PRODLINE_NO=B.PROLINECODE;
--更新产品族描述
UPDATE A SET A.PROD_NAME_EN=B.PRORACEEN FROM IBDS_F_PROD A,F_PROD_Temp B WHERE A.PROD_NO=B.PRORACECODE AND A.PROD_NAME=B.PRORACECN ;

--英文名称为空的产品线产品族更新为中文名称
UPDATE IBDS_F_PRODLINE SET PRODLINE_DESC_EN=PRODLINE_DESC WHERE PRODLINE_DESC_EN IS NULL OR PRODLINE_DESC_EN='';
UPDATE IBDS_F_PROD SET PROD_NAME_EN=PROD_NAME WHERE PROD_NAME_EN IS NULL OR PROD_NAME_EN='';

--状态为空的数据更新为修改
UPDATE IBDS_F_PRODUCT_CODE SET STATUS='2' WHERE STATUS IS NULL OR STATUS='';