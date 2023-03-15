package com.qqrobot.twrobot;

import love.forte.simboot.spring.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSimbot
@SpringBootApplication
public class TwrobotApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwrobotApplication.class, args);
	}

}
