package top.zhaoqw.study.behavioral.strategy.sortexample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Sorter的改进版
 *
 * @author zhaoqw
 * @date 2022/08/25
 */
public class SoterTo {
  private static final long GB = 1000 * 1000 * 1000;
  private static final List<AlgRange> algs = new ArrayList<>();

  static {
    algs.add(new AlgRange(0, 6*GB, SortAlgFactory.getSortAlg("QuickSort")));
    algs.add(new AlgRange(6*GB, 10 * GB, SortAlgFactory.getSortAlg("ExternalSort")));
    algs.add(new AlgRange(10 * GB, 30*GB, SortAlgFactory.getSortAlg("ConcurrentExternalSort")));
    algs.add(new AlgRange(30 * GB, Integer.MAX_VALUE, SortAlgFactory.getSortAlg("MapReduceSort")));
  }

  /**
   * 范围
   */
  private static class AlgRange {
    private long start;
    private long end;
    private ISortAlg alg;

    public long getStart() {
      return start;
    }

    public AlgRange(long start, long end, ISortAlg alg) {
      this.start = start;
      this.end = end;
      this.alg = alg;
    }

    public void setStart(long start) {
      this.start = start;
    }

    public boolean inRange(long size) {
      return size >= start && size < end;
    }

    public ISortAlg getAlg() {
      return alg;
    }
  }

  public void sortFile(String filePath) {
    // 省去校验
    File file = new File(filePath);
    long fileSize = file.length();
    ISortAlg sortAlg = null;
    for (AlgRange algRange : algs) {
      if (algRange.inRange(fileSize)) {
        sortAlg = algRange.getAlg();
        break;
      }
    }
  }
}
