	

--	UPDATE IBDS_PLIPMT SET  PLIPMT_Umpire =REPLACE(REPLACE(PLIPMT_Umpire,'CN=',''),'/O=h3c',''),PLIPMT_ViceUmpire=REPLACE(REPLACE(PLIPMT_ViceUmpire,'CN=',''),'/O=h3c',''),
--					PLIMPT_Secretary=REPLACE(REPLACE(PLIMPT_Secretary,'CN=',''),'/O=h3c',''),PLIPMT_PDM_Mnger=REPLACE(REPLACE(PLIPMT_PDM_Mnger,'CN=',''),'/O=h3c',''),
--					PLIPMT_Members=dbo.F_RepalceGroup(PLIPMT_Members,0)

	


--	UPDATE IBDS_PRODLINE SET fldcpxzj=REPLACE(REPLACE(fldcpxzj,'CN=',''),'/O=h3c',''),Quality_Director_ID=REPLACE(REPLACE(Quality_Director_ID,'CN=',''),'/O=h3c',''),
--			Quality_Mnger_ID=REPLACE(REPLACE(Quality_Mnger_ID,'CN=',''),'/O=h3c',''),Test_Mnger_ID=REPLACE(REPLACE(Test_Mnger_ID,'CN=',''),'/O=h3c',''),
--			CMOLeader_ID=REPLACE(REPLACE(CMOLeader_ID,'CN=',''),'/O=h3c',''),PL_CCB_SECRETARY=REPLACE(REPLACE(PL_CCB_SECRETARY,'CN=',''),'/O=h3c',''),
--			PrjMarketP=REPLACE(REPLACE(PrjMarketP,'CN=',''),'/O=h3c',''),
--			PL_CCB_GROUP=dbo.F_RepalceGroup(PL_CCB_GROUP,0)

	

--	UPDATE IBDS_PDT SET PDT_Manager=REPLACE(REPLACE(REPLACE(PDT_Manager,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			CMJKR_ID=REPLACE(REPLACE(REPLACE(CMJKR_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			SCJKR_ID=REPLACE(REPLACE(REPLACE(SCJKR_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			HCJKR_ID=REPLACE(REPLACE(REPLACE(HCJKR_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			AbroadJKR_ID=REPLACE(REPLACE(REPLACE(AbroadJKR_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			OrderDecom=REPLACE(REPLACE(REPLACE(OrderDecom,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			Quality_Mnger_ID=REPLACE(REPLACE(REPLACE(Quality_Mnger_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			POP_ID=REPLACE(REPLACE(REPLACE(POP_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			LPDT_ID=REPLACE(REPLACE(REPLACE(LPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			RNDPDT_ID=REPLACE(REPLACE(REPLACE(RNDPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			MKTPDT_ID=REPLACE(REPLACE(REPLACE(MKTPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			FINPDT_ID=REPLACE(REPLACE(REPLACE(FINPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			PROPDT_ID=REPLACE(REPLACE(REPLACE(PROPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			PPPDT_ID=REPLACE(REPLACE(REPLACE(PPPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			MFGPDT_ID=REPLACE(REPLACE(REPLACE(MFGPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			TSPDT_ID=REPLACE(REPLACE(REPLACE(TSPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			PQA_ID=REPLACE(REPLACE(REPLACE(PQA_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			TE_ID=REPLACE(REPLACE(REPLACE(TE_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			TD_ID=REPLACE(REPLACE(REPLACE(TD_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			FA_ID=REPLACE(REPLACE(REPLACE(FA_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			SE_ID=REPLACE(REPLACE(REPLACE(SE_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			CMO_ID=REPLACE(REPLACE(REPLACE(CMO_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			NMJKR_ID=REPLACE(REPLACE(REPLACE(NMJKR_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--			PDT_GROUP=dbo.F_RepalceGroup(PDT_GROUP,0),
--			RND_GROUP=dbo.F_RepalceGroup(RND_GROUP,0)

	
--UPDATE  IBDS_Product SET PM_ID=REPLACE(REPLACE(REPLACE(PM_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						POP_ID=REPLACE(REPLACE(REPLACE(POP_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						CME_ID=REPLACE(REPLACE(REPLACE(CME_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						CMO_ID=REPLACE(REPLACE(REPLACE(CMO_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						PDE_ID=REPLACE(REPLACE(REPLACE(PDE_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com','')


	

--UPDATE IBDS_VERSION SET  POP_ID=REPLACE(REPLACE(REPLACE(POP_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						 CMO_ID=REPLACE(REPLACE(REPLACE(CMO_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						 PilotProduction_Mnger=REPLACE(REPLACE(REPLACE(PilotProduction_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						 TechSupport_Mnger=REPLACE(REPLACE(REPLACE(TechSupport_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						 Oversea_Mnger=REPLACE(REPLACE(REPLACE(Oversea_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com','')




--UPDATE IBDS_Release SET POP_ID=REPLACE(REPLACE(REPLACE(POP_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						CMO_ID=REPLACE(REPLACE(REPLACE(CMO_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						Testing_Mnger=REPLACE(REPLACE(REPLACE(Testing_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						TechSupport_Mnger=REPLACE(REPLACE(REPLACE(TechSupport_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						Product_Mnger=REPLACE(REPLACE(REPLACE(Product_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						MarketTM=REPLACE(REPLACE(REPLACE(MarketTM,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						softmg=REPLACE(REPLACE(REPLACE(softmg,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						hardmg=REPLACE(REPLACE(REPLACE(hardmg,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						fldPDE=REPLACE(REPLACE(REPLACE(fldPDE,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						RNDPDT_ID=REPLACE(REPLACE(REPLACE(RNDPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						Oversea_Mnger=REPLACE(REPLACE(REPLACE(Oversea_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						PilotProduction_Mnger=REPLACE(REPLACE(REPLACE(PilotProduction_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						OMC_Mnger=REPLACE(REPLACE(REPLACE(OMC_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						System_Mnger=REPLACE(REPLACE(REPLACE(System_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						Quality_Mnger=REPLACE(REPLACE(REPLACE(Quality_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						Equipment_Mnger=REPLACE(REPLACE(REPLACE(Equipment_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						Documents_Mnger=REPLACE(REPLACE(REPLACE(Documents_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						Purchase_Mnger=REPLACE(REPLACE(REPLACE(Purchase_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						Sales_Mnger=REPLACE(REPLACE(REPLACE(Sales_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						PPPDT_ID=REPLACE(REPLACE(REPLACE(PPPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						Manufacture_Mnger=REPLACE(REPLACE(REPLACE(Manufacture_Mnger,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						FF_ID=REPLACE(REPLACE(REPLACE(FF_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						FINPDT_ID=REPLACE(REPLACE(REPLACE(FINPDT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						SE=REPLACE(REPLACE(REPLACE(SE,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						SQA_ID=REPLACE(REPLACE(REPLACE(SQA_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						HQA_ID=REPLACE(REPLACE(REPLACE(HQA_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						SOFTTESTMNG=REPLACE(REPLACE(REPLACE(SOFTTESTMNG,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						HARDTESTMNG=REPLACE(REPLACE(REPLACE(HARDTESTMNG,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						SOFTPLAT_ID=REPLACE(REPLACE(REPLACE(SOFTPLAT_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						NETMGPERSON_ID=REPLACE(REPLACE(REPLACE(NETMGPERSON_ID,'CN=',''),'/O=h3c',''),'/O=huawei-3com',''),
--						NETMGNET=REPLACE(REPLACE(REPLACE(NETMGNET,'CN=',''),'/O=h3c',''),'/O=huawei-3com','')

