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
	
	@Autowired
	MyCloudConfig myCloudConfig;
	
	
	
	@RequestMapping("/fromprop")
	public String fromEnv() {
		logger.info("Called Logger");
		return myConfig.getGreeting();
	}
	
	@RequestMapping("/fromserver")
	public String fromServer() {
		logger.info("Called Logger");
		return myCloudConfig.getGreeting();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerHandsonApplication.class, args);
	}

}
