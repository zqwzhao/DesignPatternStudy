package top.zhaoqw.study.structural.adapter.action.example2.reform;

import top.zhaoqw.study.structural.adapter.action.example2.ASensitiveWordsFilter;

public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
  private ASensitiveWordsFilter aFilter;
  public String filter(String text) {
    String maskedText = aFilter.filterSexyWords(text);
    maskedText = aFilter.filterPoliticalWords(maskedText);
    return maskedText;
  }
}
