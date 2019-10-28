package com.assessment.assessment1024;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.scheduling.annotation.EnableScheduling;


@JsonIgnoreProperties(ignoreUnknown = true)
@EnableScheduling
public class Information {

  private Ticker ticker;
  private long timestamp;
  private boolean success;
  private String error;

  public Information(){}

  public Ticker getTicker() {
    return ticker;
  }

  public void setTicker (Ticker ticker){
    this.ticker = ticker;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public boolean isSuccess() {
    return success;
  }

  public String getError() {
    return error;
  }

  @Override
  public String toString() {
    return "Information{" +
      "ticker=" + ticker +
      ", timestamp=" + timestamp +
      ", success=" + success +
      ", error='" + error + '\'' +
      '}';
  }





}
