package top.zhaoqw.study.behavioral.visitor.example2;

import java.time.LocalDateTime;

/**
 * @author zhaoqw
 * @date 2022/07/23
 */
public class DateTest {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime localDateTime = now.plusDays(25);
    System.out.println(localDateTime.toString());
  }
}
