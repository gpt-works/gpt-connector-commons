package com.zonief.gptconnectorcommons.beans.gpt.enums;

public enum GptRole {

  USER("user"),
  SYSTEM("system"),
  ASSISTANT("assistant");

  private final String value;

  GptRole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
