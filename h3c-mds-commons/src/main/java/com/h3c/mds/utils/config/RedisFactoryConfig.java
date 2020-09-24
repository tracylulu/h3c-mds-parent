package com.h3c.mds.utils.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

//@Configuration
public class RedisFactoryConfig {
	@Autowired
	  private Environment environment;
	  @Bean
	      public RedisConnectionFactory myLettuceConnectionFactory() {
	   
	        String master = environment.getProperty("spring.redis.sentinel.master");
	        String redisNodes = environment.getProperty("spring.redis.sentinel.nodes");
	        RedisSentinelConfiguration configuration = new RedisSentinelConfiguration();
	        String[] host = redisNodes.split(",");
	        for(String redisHost : host){
	            String[] item = redisHost.split(":");
	            String ip = item[0];
	            String port = item[1];
	            configuration.addSentinel(new RedisNode(ip, Integer.parseInt(port)));
	        }
	        configuration.setMaster(master);
//	        configuration.setDatabase(Integer.valueOf(environment.getProperty("spring.redis.database")));
	        configuration.setPassword(RedisPassword.of(environment.getProperty("spring.redis.password")));
	        return new LettuceConnectionFactory(configuration);
	      }
	    }