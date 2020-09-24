package com.h3c.mds.utils;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.Date;

import com.h3c.mds.utils.entity.BeanChangeContent;
import com.h3c.mds.utils.entity.ChangeType;
import com.h3c.mds.utils.entity.TestBean;

public class BeanUtils {

	public static void main(String[] args) throws ParseException {

		TestBean bef = new TestBean();
		bef.setId("13");
		bef.setName("zhangsan");
		bef.setBirthday(new Date());

		TestBean aft = new TestBean();
		aft.setId("1");
		aft.setName("zhangsan2");
		aft.setAge(10);
		System.out.println(getChange(bef, null));
		System.out.println(getChange(bef, aft));
		System.out.println(getChange(null, aft));

	}

	/**
	 * 获取到更改后不同属性
	 * 
	 * @param bef
	 *            为null 添加
	 * @param aft
	 *            为null 删除
	 * @return
	 */
	public static <T> BeanChangeContent<T> getChange(T bef, T aft) {
		if (bef == null) {
			return getChange_add(aft);
		} else if (aft == null) {
			return getChange_del(bef);
		} else {
			return getChange_modify(bef, aft);
		}
	}

	public static <T> BeanChangeContent<T> getChange_add(T obj) {
		return getChange(null, obj, ChangeType.ADD);
	}

	public static <T> BeanChangeContent<T> getChange_modify(T bef, T aft) {
		return getChange(bef, aft, ChangeType.MODIFY);
	}

	public static <T> BeanChangeContent<T> getChange_del(T obj) {
		return getChange(obj, null, ChangeType.DEL);
	}

	public static <T> BeanChangeContent<T> getChange(T bef, T aft, ChangeType changeType) {
		BeanChangeContent<T> result = new BeanChangeContent<>();
		try {

			Class<T> thisClass;
			// 获取类型
			if (bef == null) {
				thisClass = (Class<T>) aft.getClass();
			} else {

				thisClass = (Class<T>) bef.getClass();
			}
			result.setChangeType(changeType);
			switch (changeType) {
			case ADD:
				result.setBef(thisClass.newInstance());
				result.setAft(aft);
				break;
			case MODIFY:

				// 修改前，修改后的对象
				T befResult = thisClass.newInstance();
				T aftResult = thisClass.newInstance();

				// 获取字段
				Field[] fields = bef.getClass().getDeclaredFields();
				for (Field field : fields) {
					String name = "";
					switch (bef.getClass().getSimpleName()) {
					case CommonConst.PI:
						name = "plipmt";
						break;
					case CommonConst.PL:
						name = "prodline";
						break;
					case CommonConst.PT:
						name = "pdt";
						break;
					case CommonConst.PP:
						name = "product";
						break;
					case CommonConst.PV:
						name = "version";
						break;
					case CommonConst.PR:
						name = "release";
						break;
					case CommonConst.PB:
						name = "bversioncname";
						break;
					case CommonConst.PJ:
						name = "project";
						break;
					case CommonConst.BL:
						name = "baseline";
						break;
					case CommonConst.FT:
						name = "feature";
						break;
					case CommonConst.SF:
						name = "subfeature";
						break;
					case CommonConst.TM:
						name = "team";

						break;
					case CommonConst.SS:
						name = "subsystem";
						break;
					case CommonConst.MD:
						name = "module";
						break;
					case CommonConst.MV:
						name = "mdlvsn";
						break;
					}

					String fieldName = field.getName();
					String method_suffix = fieldName.substring(0, 1).toUpperCase()
							+ fieldName.substring(1, fieldName.length());

					// getter and sertter
					String setter = "set" + method_suffix;
					String getter = "get" + method_suffix;

					try {
						// 调用get方法
						Object befValue = thisClass.getMethod(getter).invoke(bef, null);
						Object aftValue = thisClass.getMethod(getter).invoke(aft, null);
						// System.out.println("befValue === " + befValue);
						// System.out.println("aftValue === " + aftValue);
						// 如果调用的两个值不一样，拷贝到新的对象中 ?
						if (befValue == null && aftValue == null) { // 两个都没值
							continue;
						}

						if (befValue == null && "".equals(aftValue)) { // 两个都没值
							continue;
						}
						if ("".equals(befValue) && aftValue == null) { // 两个都没值
							continue;
						}

						if (method_suffix.toLowerCase().equals("id")
								|| method_suffix.toLowerCase().equals("projectno")) {
							continue;
						}
						if (befValue == null) {// 更改后没值
							thisClass.getMethod(setter, aftValue.getClass()).invoke(aftResult, aftValue);
						} else if (aftValue == null) {// 更改前没值
							thisClass.getMethod(setter, befValue.getClass()).invoke(befResult, befValue);
						} else if (!befValue.equals(aftValue)
								|| (name.equals(method_suffix.toLowerCase()) && !(name.equals("bversioncname")))
								|| (name.equals(method_suffix.toLowerCase()) && (name.equals("bversioncname")))) { // 两个值不想等
							// System.out.println("befValue.getClass() === " + befValue.getClass());
							thisClass.getMethod(setter, befValue.getClass()).invoke(befResult, befValue);
							thisClass.getMethod(setter, befValue.getClass()).invoke(aftResult, aftValue);
						}
					} catch (NoSuchMethodException e) {
						System.out.println("无方法 : " + e.getMessage());
					} finally {
						name = "";
					}
				}
				result.setBef(befResult);
				result.setAft(aftResult);
				break;
			case DEL:
				result.setBef(bef);
				result.setAft(null);
				break;
			default:
				break;
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}
