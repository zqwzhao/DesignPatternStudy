package top.zhaoqw.study.behavioral.strategy.action1exam;

public class LeaveForm {
    private Employee employee; //员工
    private String reason; //请假原因
    private int days; //天数
    private int type; //类型：0-病假 1-婚丧假 2-年假

    public LeaveForm(Employee employee, int type, String reason, int days) {
        this.employee = employee;
        this.reason = reason;
        this.days = days;
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getReason() {
        return reason;
    }

    public int getDays() {
        return days;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "LeaveForm{" +
                "employee=" + employee +
                ", reason='" + reason + '\'' +
                ", days=" + days +
                ", type=" + type +
                '}';
    }
}