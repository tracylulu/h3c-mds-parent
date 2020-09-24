package com.h3c.mds.utils.easyui;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EasyUIJSONUtils {

	/**
	 * 将srcJObjStr和addJObjStr合并，如果有重复字段，以addJObjStr为准
	 * 
	 * @param srcJObjStr
	 *            原jsonObject字符串
	 * @param addJObjStr
	 *            需要加入的jsonObject字符串
	 * @return srcJObjStr
	 */
	public static String combineJson(String srcJObjStr, String addJObjStr) throws JSONException {
		if (addJObjStr == null || addJObjStr.isEmpty()) {
			return srcJObjStr;
		}
		if (srcJObjStr == null || srcJObjStr.isEmpty()) {
			return addJObjStr;
		}

		JSONObject srcJObj = new JSONObject(srcJObjStr);
		JSONObject addJObj = new JSONObject(addJObjStr);

		combineJson(srcJObj, addJObj);

		return srcJObj.toString();
	}

	private static JSONObject combineJson(JSONObject srcObj, JSONObject addObj) throws JSONException {

		Iterator<String> itKeys1 = addObj.keys();
		String key, value;
		while (itKeys1.hasNext()) {
			key = itKeys1.next();
			value = addObj.optString(key);

			srcObj.put(key, value);
		}
		return srcObj;
	}

	/**
	 * 树节点关闭状态 默认顶层是closed状态
	 * 
	 * @param list
	 * @return
	 */
	public static String list2EasyUiTreeGrid_close(List<?> list) {
		return list2EasyUiTreeGrid_state(list, "closed");
	}

	/**
	 * 树节点 open状态
	 * 
	 * @param list
	 * @return
	 */
	public static String list2EasyUiTreeGrid_open(List<?> list) {
		return list2EasyUiTreeGrid_state(list, "open");
	}

	/**
	 * 组装TreeGrid
	 * 
	 * @param list
	 * @param state
	 * @return
	 */
	public static String list2EasyUiTreeGrid_state(List<?> list, String state) {
		JSONArray result = new JSONArray();
		try {
			if (list == null || list.isEmpty()) {
				return "[]";
			}
			// 首先把list转成 JSONArray 对象
			JSONArray jsonArray = new JSONArray(list);
			for (int i = 0; i < jsonArray.length(); i++) {
				// 遍历 jsonarray 数组，把每一个对象转成 json 对象
				if (list.get(i) == null) {
					System.out.println("存在空数据 ==> 第" + (i + 1) + "条数据" + list);
					continue;
				}
				JSONObject obj_one = jsonArray.getJSONObject(i);
				JSONObject obj_two = new JSONObject("{\"state\":\"" + state + "\",\"iconCls\":\"icon-ok\"}");
				result.put(combineJson(obj_one, obj_two));
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return result == null ? "[]" : result.toString();
	}

	/**
	 * propertygrid菜单显示
	 * 
	 * @param list
	 * @param map
	 * @return
	 */
	public static String buildPropertygrid(List<Map<String, String>> list, Map<String, String> map) {
		JSONArray jsonArray = new JSONArray(list);
		try {

			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject obj = jsonArray.getJSONObject(i);
				obj.put("name", obj.get("ColumnName"));
				obj.put("group", obj.get("ColumnGroup"));
				obj.put("value", map.get(obj.get("ColumnCode")));

			}

		} catch (JSONException e) {
			e.printStackTrace();
		}

		return jsonArray.toString();
	}

	public static String buildPropertygrid(List<Map<String, String>> list, Object entity) {
		JSONArray jsonArray = new JSONArray(list);
		try {

			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject obj = jsonArray.getJSONObject(i);
				String ColumnCode = (String) obj.get("ColumnCode");
				obj.put("name", obj.get("ColumnName"));
				obj.put("group", obj.get("ColumnGroup"));
				String getMethod = "get" + ColumnCode.substring(0, 1).toUpperCase()
						+ ColumnCode.substring(1, ColumnCode.length());
				try {
					Method getter = entity.getClass().getMethod(getMethod);
					obj.put("value", getter.invoke(entity));
				} catch (Exception e) {
					// e.printStackTrace();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonArray.toString();
	}

	/**
	 * 查询变更前后的日志记录
	 * 
	 * @param list
	 * @param entity
	 * @param objEn
	 * @return
	 */
	public static String buildPropertygridByCondition(List<Map<String, String>> list, Object entity, Object objEn) {
		JSONArray jsonArray = new JSONArray(list);
		JSONArray jsonArrayNew = new JSONArray();
		JSONObject obj1 = new JSONObject(entity.toString());
		Map<String, Object> map = new HashMap<String, Object>();
		// 得到类对象
		Class userCla = (Class) objEn.getClass();
		/* 得到类中的所有属性集合 */
		Field[] fs = userCla.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			Field f = fs[i];
			f.setAccessible(true); // 设置些属性是可以访问的
			Object val = new Object();
			try {
				val = f.get(objEn);
				// 得到此属性的值
				map.put(f.getName(), val);// 设置键值
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

		}
		try {

			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject obj = jsonArray.getJSONObject(i);
				String ColumnCode = (String) obj.get("ColumnCode");
				if (obj1.has(ColumnCode)) {
					obj.put("name", obj.get("ColumnName"));
					obj.put("group", obj.get("ColumnGroup"));
					if (!obj.get("Type").toString().toUpperCase().equals("PI") && ColumnCode.equals("plipmtno")) {
						if (obj1.has("plipmt1")) {
							obj.put("value", obj1.get("plipmt1"));
						} else {
							obj.put("value", map.get("plipmt"));
						}
					} else if (!obj.get("Type").toString().toUpperCase().equals("PL")
							&& ColumnCode.equals("prodlineno")) {
						if (obj1.has("prodline1")) {
							obj.put("value", obj1.get("prodline1"));
						} else {
							obj.put("value", map.get("prodline"));
						}
					} else if (!obj.get("Type").toString().toUpperCase().equals("PT") && ColumnCode.equals("pdtno")) {
						if (obj1.has("pdt1")) {
							obj.put("value", obj1.get("pdt1"));
						} else {
							obj.put("value", map.get("pdt"));
						}
					} else if (!obj.get("Type").toString().toUpperCase().equals("PP")
							&& ColumnCode.equals("productno")) {
						if (obj1.has("product1")) {
							obj.put("value", obj1.get("product1"));
						} else {
							obj.put("value", map.get("product"));
						}
					} else if (!obj.get("Type").toString().toUpperCase().equals("PV")
							&& ColumnCode.equals("versionno")) {
						if (obj1.has("version1")) {
							obj.put("value", obj1.get("version1"));
						} else {
							obj.put("value", map.get("version"));
						}
					} else if (!obj.get("Type").toString().toUpperCase().equals("PR")
							&& ColumnCode.equals("releaseno")) {
						if (obj1.has("release1")) {
							obj.put("value", obj1.get("release1"));
						} else {
							obj.put("value", map.get("release"));
						}
					} else if (!obj.get("Type").toString().toUpperCase().equals("SF")
							&& ColumnCode.equals("featureno")) {
						if (obj1.has("feature1")) {
							obj.put("value", obj1.get("feature1"));
						} else {
							obj.put("value", map.get("feature"));
						}
					} else if (!obj.get("Type").toString().toUpperCase().equals("SS")
							&& ColumnCode.equals("subsystemno")) {
						if (obj1.has("subsystem1")) {
							obj.put("value", obj1.get("subsystem1"));
						} else {
							obj.put("value", map.get("subsystem"));
						}
					} else if (!obj.get("Type").toString().toUpperCase().equals("MD")
							&& ColumnCode.equals("moduleno")) {
						if (obj1.has("module1")) {
							obj.put("value", obj1.get("module1"));
						} else {
							obj.put("value", map.get("module"));
						}
					} else {
						obj.put("value", obj1.get(ColumnCode));
					}
					jsonArrayNew.put(obj);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonArrayNew.toString();
	}
	
	/**
	 * 查询变更前后的日志记录
	 * 
	 * @param mapColumns 列表名称
	 * @param entity 修改实体
	 * @param deptName 部门名称
	 * @return
	 */
	public static String buildDeptLogPropertygrid(Map<String,String> mapColumns, Object entity,String deptName) {
		JSONArray jsonArrayNew = new JSONArray();
		JSONObject objEntity = new JSONObject(entity.toString());
		Map<String, Object> map = new HashMap<String, Object>();
		JSONObject objDeptName = new JSONObject();
		objDeptName.put("value", deptName);
		objDeptName.put("name", mapColumns.get("name"));
		jsonArrayNew.put(objDeptName);

		try {
			for(String column: mapColumns.keySet()) {
				JSONObject objValue = new JSONObject();
				if (objEntity.has(column)) {					
					objValue.put("value", objEntity.get(column));
					objValue.put("name", mapColumns.get(column));
					jsonArrayNew.put(objValue);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonArrayNew.toString();
	}

	public static void main(String[] args) {
		String s = "{\"overseaMnger\":\"liucaixuan 03806,\"}";

		JSONObject obj1 = new JSONObject(s);
		System.out.println(obj1.get("overseaMnger"));
	}

}
