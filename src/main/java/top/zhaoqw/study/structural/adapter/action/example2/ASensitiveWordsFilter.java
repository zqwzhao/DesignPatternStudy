package top.zhaoqw.study.structural.adapter.action.example2;

public class ASensitiveWordsFilter { // A敏感词过滤系统提供的接口
  //text是原始文本，函数输出用***替换敏感词之后的文本
  public String filterSexyWords(String text) {
    // ...
    return "xxx";
  }

  public String filterPoliticalWords(String text) {
    // ...
    return "xxx";
  }
}
