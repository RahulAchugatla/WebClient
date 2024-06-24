package com.webclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class AuditingAndLombokApplication {

//	@Bean
//	public WebClient.Builder getWebClientBuilder(){
//	  return WebClient.builder();
//	}
//	
	public static void main(String[] args) {
		SpringApplication.run(AuditingAndLombokApplication.class, args);
	}
}
