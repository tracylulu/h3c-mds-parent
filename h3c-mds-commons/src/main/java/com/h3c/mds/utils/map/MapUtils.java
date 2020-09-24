package com.h3c.mds.utils.map;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {
	public static Map<String, String> titleMap = new HashMap<>();

	static {
		titleMap.put("PI", "IPMT信息");
		titleMap.put("PL", "产品线信息");
		titleMap.put("FP", "财务产品信息");
		titleMap.put("PT", "PDT信息");
		titleMap.put("PP", "研发产品信息");
		titleMap.put("ML", "产品型号信息");
		titleMap.put("PV", "产品V级信息");
		titleMap.put("PR", "产品R级信息");
		titleMap.put("PJ", "研发项目信息");
		titleMap.put("BL", "软件信息");
		titleMap.put("FT", "特性信息");
		titleMap.put("TM", "项目组信息");
		titleMap.put("SS", "子系统信息");
		titleMap.put("MD", "模块信息");
		titleMap.put("MV", "模块版本信息");
		titleMap.put("SF", "子特性信息");
		titleMap.put("PB", "产品B级信息");
		titleMap.put("BL", "基线版本信息");
	}

}
