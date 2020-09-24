package com.h3c.mds.config;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
public class ProductWebConfig implements WebMvcConfigurer {

	/**
	 * 解决ie responsebody返回json的时候提示下载问题
	 * 
	 * @return
	 */
	/*public MappingJackson2HttpMessageConverter customJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
		MediaType media = new MediaType(MediaType.TEXT_HTML, Charset.forName("UTF-8"));
		supportedMediaTypes.add(media);
		jsonConverter.setSupportedMediaTypes(supportedMediaTypes);
		System.out.println("MappingJackson2HttpMessageConverter========================================");
		return jsonConverter;
	}*/

	/**
	 * 解决低版本ieresponsebody返回json的时候提示下载问题
	 * 
	 * @return
	 */
	public FastJsonHttpMessageConverter getFastJsonHttpMessageConverter() {
		// 1.需要定义一个convert转换消息的对象;
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		// 2处理ie浏览器保存数据时出现下载json数据问题
		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.TEXT_HTML);
		// 3.在convert中添加配置信息.
		fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);
		return fastJsonHttpMessageConverter;
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		converters.add(customJackson2HttpMessageConverter());
		converters.add(getFastJsonHttpMessageConverter()); 
	}

}
