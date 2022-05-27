package top.zhaoqw.study.structural.adapter.action.example2.reform;

import top.zhaoqw.study.structural.adapter.action.example2.BSensitiveWordsFilter;

/**
 * @author: zhaoqw
 * @date: 2022/3/9 10:34
 */
public class BSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter{
  // 这里用构造器注入或者用注解进行注入
  BSensitiveWordsFilter bFilter;

  @Override
  public String filter(String text) {
    String filter = bFilter.filter(text);
    return filter;
  }
}
