package com.assessment.assessment1024;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class Assessment1024Application {

  private static final Logger log = LoggerFactory.getLogger(Assessment1024Application.class);

  public static void main(String[] args) {
		SpringApplication.run(Assessment1024Application.class, args);
	}

	@Bean
  public RestTemplate restTemplate(RestTemplateBuilder builder) {
  	  return builder.build();
  }

  @Bean
  public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
  	  return args -> {
  	    Information information = restTemplate.getForObject(
  	      "https://api.cryptonator.com/api/ticker/btc-usd", Information.class);
        log.info(information.toString());
      };
  }

}
