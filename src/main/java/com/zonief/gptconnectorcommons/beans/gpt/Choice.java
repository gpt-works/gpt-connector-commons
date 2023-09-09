package com.zonief.gptconnectorcommons.beans.gpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Choice {

  private String index;
  private MessageGpt message;
  @JsonProperty("finish_reason")
  private String finishReason;

}
