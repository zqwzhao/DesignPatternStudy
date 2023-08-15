package top.zhaoqw.study.behavioral.visitor.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 访问者：校长
 *
 * @author zhaoqw
 * @date 2022/07/15
 */
public class Principal implements Visitor {
  private Logger logger = LoggerFactory.getLogger(Principal.class);

  public void visit(Student student) {
    logger.info("学生信息 姓名：{} 班级：{}", student.name, student.clazz);
  }

  public void visit(Teacher teacher) {
    logger.info("老师信息 姓名：{} 班级：{} 升学率：{}", teacher.name, teacher.clazz, teacher.entranceRatio());
  }

}
