package top.zhaoqw.study.behavioral.abstracts.example1;

/**
 * @author zhaoqw
 * @date 2024/7/4
 */
public class EmployeeA implements IEmployee{
    private String goodAt = "编程";
    @Override
    public void doing(String task) {
        System.out.println("我是员工A, 我擅长" + goodAt + ", 我开始做" + task + "工作" );
    }
}
