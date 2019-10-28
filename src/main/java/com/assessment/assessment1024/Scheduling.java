package com.assessment.assessment1024;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class Scheduling {

  private static final Logger log = LoggerFactory.getLogger(Scheduling.class);


  @Scheduled(fixedRate = 5000)
  public void printFiveSeconds(){
    RestTemplate restTemplate = new RestTemplate();
    Information updatedInfo = restTemplate.getForObject(
      "https://api.cryptonator.com/api/ticker/btc-usd", Information.class);
    log.info(updatedInfo.toString());
  }

}
