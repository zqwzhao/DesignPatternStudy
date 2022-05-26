package top.zhaoqw.study.creational.builder.demo1;

/**
 * @author: zhaoqw
 * @date: 2022/2/17 09:22
 */
public class StringUtils {
  public static boolean isBlank(String str) {
      return str.length() == 0 || str.replace(" ","").length() == 0;
  }


  public static boolean isEmpty(String str) {
    return str.length() == 0 || str==null;
  }
}
