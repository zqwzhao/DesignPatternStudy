package top.zhaoqw.study.behavioral.strategy.action1exam.newimpl;

import top.zhaoqw.study.behavioral.strategy.action1exam.LeaveForm;

public class AuditStrategyImpl5 implements AuditStrategy {
    @Override
    public boolean isSupport(LeaveForm leaveForm) {
        return leaveForm.getDays() > 1 && leaveForm.getType() == 0;
    }

    @Override
    public void audit(LeaveForm leaveForm) {
        System.out.println(leaveForm);
        System.out.println("一天以上病假，进入上级审批流程");
    }
    @Override
    public int getPriority() {
        return 0;
    }
    @Override
    public String getName() {
        return "一天以上病假审批规则";
    }
}