package top.zhaoqw.study.behavioral.strategy.action1exam;

/**
 * @author zhaoqw
 * @date 2024/7/25
 */
public class Employee {
    private String name;
    private int level;

    public Employee(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
