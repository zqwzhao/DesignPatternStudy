package top.zhaoqw.study.principle.single.reponsibility.example2;

import java.util.Map;

public class Serializer {
  private static final String IDENTIFIER_STRING = "UEUEUE;";
  private Gson gson;

  public Serializer() {
    this.gson = new Gson();
  }

  public String serialize(Map object) {
    StringBuilder textBuilder = new StringBuilder();
    textBuilder.append(IDENTIFIER_STRING);
    textBuilder.append(gson.toJson(object));
    return textBuilder.toString();
  }
}
