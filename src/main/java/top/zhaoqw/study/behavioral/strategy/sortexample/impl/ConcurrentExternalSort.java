package top.zhaoqw.study.behavioral.strategy.sortexample.impl;

import top.zhaoqw.study.behavioral.strategy.sortexample.ISortAlg;

/**
 * 单机多线程排序
 *
 * @author zhaoqw
 * @date 2022/08/25
 */
public class                                                                                                                                                                                                                                                                                                                                                                                                      ConcurrentExternalSort implements ISortAlg {
  @Override
  public void sort(String filePath) {
    System.out.println("单机多线程排序");
  }
}
