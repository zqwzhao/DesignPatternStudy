package top.zhaoqw.study.behavioral.strategy.action1exam.newimpl;

import top.zhaoqw.study.behavioral.strategy.action1exam.LeaveForm;

public class AuditStrategyImpl3 implements AuditStrategy{
    @Override
    public boolean isSupport(LeaveForm leaveForm) {
        return leaveForm.getEmployee().getLevel() ==9;
    }

    @Override
    public void audit(LeaveForm leaveForm) {
        System.out.println(leaveForm);
        System.out.println("总经理请假无需审批自动通过");
    }
    @Override
    public int getPriority() {
        return 999;
    }
    @Override
    public String getName() {
        return "总经理请假审批规则";
    }
}