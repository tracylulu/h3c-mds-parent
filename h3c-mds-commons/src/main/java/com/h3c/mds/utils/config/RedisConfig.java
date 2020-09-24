package com.h3c.mds.utils.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

//@Configuration
public class RedisConfig {
    /*@Bean
    public RedisTemplate<String, Object> getRedisTemplate(
            RedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
        redisTemplate.setConnectionFactory(factory);
        redisTemplate.setKeySerializer(new StringRedisSerializer()); // key的序列化类型
//        redisTemplate.setValueSerializer(new RedisObjectSerializer()); // value的序列化类型
        return redisTemplate;
    }*/
	
	
	
	
	  @Resource
	  private LettuceConnectionFactory myLettuceConnectionFactory;
	  
	  
	  @Bean
	  public RedisTemplate<String, Object> redisTemplate() {
	    RedisTemplate<String, Object> template = new RedisTemplate<>();
	    template.setKeySerializer(new StringRedisSerializer());
//	    template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
	    template.setConnectionFactory(myLettuceConnectionFactory);
	    return template;
	  }	
}