package com.tracing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CloudConfig {
	
	@Bean
	public RestTemplate defaultRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean
//	public Sampler defaultSampler() {
//		return new Sampler();
//	}

}
