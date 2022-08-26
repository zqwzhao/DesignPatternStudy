package top.zhaoqw.study.behavioral.strategy.sortexample;

import top.zhaoqw.study.behavioral.strategy.sortexample.impl.ConcurrentExternalSort;
import top.zhaoqw.study.behavioral.strategy.sortexample.impl.ExternalSort;
import top.zhaoqw.study.behavioral.strategy.sortexample.impl.MapReduceSort;
import top.zhaoqw.study.behavioral.strategy.sortexample.impl.QuickSort;

import java.io.File;

/**
 * @author zhaoqw
 * @date 2022/08/25
 */
public class Sorter {
  private static final long GB = 1000 * 1000 * 1000;

  public void sortFile(String filePath) {
    File file = new File(filePath);
    long fileSize = file.length();

    ISortAlg sortAlg;
    if(fileSize < 6 * GB) {
      sortAlg = new QuickSort();
    } else if(fileSize < 10 * GB) {
      sortAlg = new ExternalSort();
    } else if(fileSize < 30 * GB) {
      sortAlg = new ConcurrentExternalSort();
    } else {
      sortAlg = new MapReduceSort();
    }
    sortAlg.sort(filePath);
  }

  /**
   * 利用SortAlgFactory创建
   *
   * @param filePath filepath
   */
  public void sortFile2(String filePath) {
    File file = new File(filePath);
    long fileSize = file.length();

    ISortAlg sortAlg;
    if(fileSize < 6 * GB) {
      sortAlg = SortAlgFactory.getSortAlg("QuickSort");
    } else if(fileSize < 10 * GB) {
      sortAlg = SortAlgFactory.getSortAlg("ExternalSort");
    } else if(fileSize < 30 * GB) {
      sortAlg = SortAlgFactory.getSortAlg("ConcurrentExternalSort");
    } else {
      sortAlg = SortAlgFactory.getSortAlg("MapReduceSort");
    }
    sortAlg.sort(filePath);
  }
}
