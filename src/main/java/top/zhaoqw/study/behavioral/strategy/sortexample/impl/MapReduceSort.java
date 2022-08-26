package top.zhaoqw.study.behavioral.strategy.sortexample.impl;

import top.zhaoqw.study.behavioral.strategy.sortexample.ISortAlg;

/**
 * 利用类似Hadoop的Map Reduce排序
 *
 *
 * @author zhaoqw
 * @date 2022/08/25
 */
public class MapReduceSort implements ISortAlg {

  @Override
  public void sort(String filePath) {
    System.out.println("分布式MapReduce排序");
  }
}
