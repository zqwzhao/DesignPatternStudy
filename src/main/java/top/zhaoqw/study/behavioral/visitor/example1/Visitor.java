package top.zhaoqw.study.behavioral.visitor.example1;

/**
 * 访问者模式
 *
 * @author zhaoqw
 * @date 2022/07/15
 */
public interface Visitor {
  // 访问学生信息
  void visit(Student student);

  // 访问教师信息
  void visit(Teacher teacher);
}
