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
public class Usage {
  @JsonProperty("prompt_tokens")
  private int promptTokens;
  @JsonProperty("completion_tokens")
  private int completionTokens;
  @JsonProperty("total_tokens")
  private int totalTokens;

}
