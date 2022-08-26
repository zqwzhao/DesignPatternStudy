package top.zhaoqw.study.behavioral.strategy.sortexample;

import top.zhaoqw.study.behavioral.strategy.sortexample.impl.ConcurrentExternalSort;
import top.zhaoqw.study.behavioral.strategy.sortexample.impl.ExternalSort;
import top.zhaoqw.study.behavioral.strategy.sortexample.impl.MapReduceSort;
import top.zhaoqw.study.behavioral.strategy.sortexample.impl.QuickSort;

import java.util.HashMap;
import java.util.Map;

/**
 * 排序算法工厂
 *
 * @author zhaoqw
 * @date 2022/08/25
 */
public class SortAlgFactory {
  private static final Map<String, ISortAlg> algs = new HashMap<>();

  static {
    algs.put("QuickSort", new QuickSort());
    algs.put("ExternalSort", new ExternalSort());
    algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
    algs.put("MapReduceSort", new MapReduceSort());
  }

  public static ISortAlg getSortAlg(String type) {
    if (type == null || type.isEmpty()) {
      throw new IllegalArgumentException("type should not empty");
    }
    return algs.get(type);
  }
}
