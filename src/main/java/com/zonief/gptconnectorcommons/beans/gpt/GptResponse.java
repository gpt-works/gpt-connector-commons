package com.zonief.gptconnectorcommons.beans.gpt;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class GptResponse {

  private String id;
  private String object;
  private LocalDate created;
  private String model;
  private List<Choice> choices;
  private Usage usage;
}
