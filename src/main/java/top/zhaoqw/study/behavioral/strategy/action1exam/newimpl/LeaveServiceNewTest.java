package top.zhaoqw.study.behavioral.strategy.action1exam.newimpl;

import top.zhaoqw.study.behavioral.strategy.action1exam.Employee;
import top.zhaoqw.study.behavioral.strategy.action1exam.LeaveForm;

class LeaveServiceNewTest {


    private static LeaveServiceNew leaveService = new LeaveServiceNew();

    public static void main(String[] args) {
        LeaveServiceNewTest leaveServiceNewTest = new LeaveServiceNewTest();
        leaveServiceNewTest.case1();
        leaveServiceNewTest.case2();
        leaveServiceNewTest.case3();
        leaveServiceNewTest.case4();
        leaveServiceNewTest.case5();
    }

    public void case1() {
        LeaveForm leaveForm = new LeaveForm(new Employee("张三", 6), 1, "家里只因没了，回去刨个坑！", 5);
        leaveService.audit(leaveForm);
    }


    public void case2() {
        LeaveForm leaveForm = new LeaveForm(new Employee("张全蛋", 9), 1, "小姨子要出差，去机场送行", 5);
        leaveService.audit(leaveForm);
    }


    public void case3() {
        LeaveForm leaveForm = new LeaveForm(new Employee("李四", 4), 0, "昨夜高烧42度，临时请病假一天", 1);
        leaveService.audit(leaveForm);
    }


    public void case4() {
        LeaveForm leaveForm = new LeaveForm(new Employee("李四", 4), 0, "估计是羊了个羊，跟领导再请4天休息一整周吧", 4);
        leaveService.audit(leaveForm);
    }

    public void case5() {
        LeaveForm leaveForm = new LeaveForm(new Employee("王五", 5), 2, "请一周年假，带全家去旅行", 5);
        leaveService.audit(leaveForm);
    }
}