package com.h3c.mds.flowable.service;

public interface ConversionService {

	/**
	 * 数据转换接口
	 * @param source  源数据
	 * @param targetType   转换后的实体
	 * @return
	 */
	<T> T convert(Object source, Class<T> targetType);
}
