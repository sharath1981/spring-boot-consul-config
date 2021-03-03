package com.kpt.springbootconsulconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
@SpringBootApplication
public class SpringBootConsulConfigApplication {

	@Value("${custom.prop:sharath}")
	private String customProperty;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConsulConfigApplication.class, args);
	}

	@GetMapping
	public String test() {
		return customProperty;
	}
	

}
