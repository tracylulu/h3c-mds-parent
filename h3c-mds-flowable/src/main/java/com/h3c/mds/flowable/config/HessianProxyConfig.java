package com.h3c.mds.flowable.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.stereotype.Component;

import com.h3c.mds.service.inv.ErpInvService;
import com.h3c.mds.service.master.ErpService;

/**
 * 初始化hessina接口实例
 * @author l20095
 *
 */
@Component
public class HessianProxyConfig {

	
	@Value("${erp.coa.url}")
	private  String erpCoaUrl;
	
	@Value("${erp.inv.url}")
	private String erpInvUrl;
	
	@Bean
	public HessianProxyFactoryBean helloClient() {              
	      HessianProxyFactoryBean factory = new HessianProxyFactoryBean();   
	      factory.setServiceUrl(erpCoaUrl);   
	      factory.setServiceInterface(ErpService.class);   
	      return factory;
	}
	
	@Bean
	public HessianProxyFactoryBean erpInvService() {              
	      HessianProxyFactoryBean factory = new HessianProxyFactoryBean();   
	      factory.setServiceUrl(erpInvUrl);   
	      factory.setServiceInterface(ErpInvService.class);   
	      return factory;
	}
}
