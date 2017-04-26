package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigServerHandsonApplication {	
	@Autowired
	MyConfig myConfig;	
	
	@RequestMapping("/fromprop")
	public String fromEnv() {
		return myConfig.getGreeting();
	}
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerHandsonApplication.class, args);
	}

}
