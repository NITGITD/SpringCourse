package com.nt.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::0-param constructor");
	}
	@Bean
	public LocalDateTime createDateTime() {
		System.out.println("AppConfig.createDateTime()");
		return LocalDateTime.now();
	}
}
