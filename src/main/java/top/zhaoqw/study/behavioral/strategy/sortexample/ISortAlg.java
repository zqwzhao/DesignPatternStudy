package top.zhaoqw.study.behavioral.strategy.sortexample;

/**
 * @author zhaoqw
 * @date 2022/08/25
 */
public interface ISortAlg {
  /**
   * 将文件中的数字进行排序
   * 22，334，54，56
   * @param filePath 文件路径
   */
  void sort(String filePath);
}
