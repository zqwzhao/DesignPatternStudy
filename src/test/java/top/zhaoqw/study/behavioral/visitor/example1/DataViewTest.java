package top.zhaoqw.study.behavioral.visitor.example1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author zhaoqw
 * @date 2022/07/15
 */
public class DataViewTest {

  @Test
  public void visitorTest() {
    DataView dataView = new DataView();

    System.out.println("家长视角访问");
    dataView.show(new Parent());     // 家长

    System.out.println("校长视角访问：");
    dataView.show(new Principal());  // 校长
  }
}
