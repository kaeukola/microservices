package com.bnymellon.fta.config.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@EnableEurekaClient
@Configuration
//@RefreshScope
//@EnableBinding
public class ConfigClient {
	private static final Logger log = LoggerFactory.getLogger(ConfigClient.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ConfigClient.class, args);

	}

	@Autowired
	void setEnvironment(Environment e) {
		log.debug("config project:" + e.getProperty("configuration.projectName"));
	}
}
