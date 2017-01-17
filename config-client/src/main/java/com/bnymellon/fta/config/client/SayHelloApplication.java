package com.bnymellon.fta.config.client;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SayHelloApplication {

	private static Logger log = LoggerFactory.getLogger(SayHelloApplication.class);

	@Value("${greeting.message:default welcome greeting!!!!!!!}")
	String welcomeGreetings;

	@RequestMapping("/greeting")
	public String greet() {
		log.info("Access /greeting");
		List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
		Random rand = new Random();

		int randomNum = rand.nextInt(greetings.size());
		return greetings.get(randomNum);
	}

	@RequestMapping("/welcome")
	public String welcome() {
		log.info("Access /welcome");
		return welcomeGreetings;
	}

	@RequestMapping(value = "/")
	public String home() {
		log.info("Access /");
		return "Hi!";
	}

	@RequestMapping(value = "/newyear/greeting")
	public String newyearGreeting() {
		log.info("Access /");
		return "Happy New Year!";
	}

	@RequestMapping(value = "/holiday/greeting")
	public String holidayGreeting() {
		log.info("Access /");
		return "Happy Holidays!";
	}

}
