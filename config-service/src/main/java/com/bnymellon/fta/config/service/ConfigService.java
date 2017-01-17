package com.bnymellon.fta.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient
@EnableConfigServer
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class ConfigService {

	public static void main(String[] args) {
		// http://localhost:8888/sbaone-config-server/production
		// mvn clean package;java -jar -DSPRING_PROFILES_ACTIVE=development
		// target/sbaone-config-service-0.8.16-SNAPSHOT.jar

		/*if (System.getProperty("spring.config.name") == null)
		System.setProperty("spring.config.name", "config-service");*/

		SpringApplication.run(ConfigService.class, args);
	}
}
