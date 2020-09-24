
CREATE VIEW [dbo].[V_PRODUCT_VIEW] AS
SELECT
	f.PLIPMT,
	e.PRODLINE,
	t.*
FROM
	IBDS_PRODUCT t
	LEFT JOIN IBDS_PRODLINE e  ON t.PRODLINENo= e.PRODLINENo
	LEFT JOIN IBDS_PLIPMT f ON t.PLIPMTNo= f.PLIPMTNo