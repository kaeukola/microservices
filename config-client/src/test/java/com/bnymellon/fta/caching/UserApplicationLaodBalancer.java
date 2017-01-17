package com.bnymellon.fta.caching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Component
//@SpringBootApplication
@RestController
//@EnableEurekaClient
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
//@RibbonClient(name = "sbaoneCachingClient", configuration =// SbaoneConfiguration.class)
public class UserApplicationLaodBalancer {

/*	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
*/
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/hello")
	public String hi(@RequestParam(value = "name", defaultValue = "Krishna") String name) {
		String greeting = this.restTemplate.getForObject("http://sbaoneCachingClient/greeting", String.class);
		return String.format("%s, %s!", greeting, name);
	}

	public static void main(String[] args) {
		SpringApplication.run(UserApplicationLaodBalancer.class, args);
	}
}