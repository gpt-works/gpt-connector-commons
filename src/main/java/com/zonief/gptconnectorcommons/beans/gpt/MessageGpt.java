package com.zonief.gptconnectorcommons.beans.gpt;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class MessageGpt implements Serializable {

  private String role;
  private String content;
}
