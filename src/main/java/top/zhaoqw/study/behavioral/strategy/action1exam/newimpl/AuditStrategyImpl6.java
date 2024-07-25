package top.zhaoqw.study.behavioral.strategy.action1exam.newimpl;

import top.zhaoqw.study.behavioral.strategy.action1exam.LeaveForm;

public class AuditStrategyImpl6 implements AuditStrategy {
    @Override
    public boolean isSupport(LeaveForm leaveForm) {
        return leaveForm.getType() == 2;
    }

    @Override
    public void audit(LeaveForm leaveForm) {
        System.out.println(leaveForm);
        System.out.println("正在查询您的剩余年假天数...");
        System.out.println("您的可用年假还有8天，进入上级审批流程");
    }
    @Override
    public int getPriority() {
        return 0;
    }
    @Override
    public String getName() {
        return "年假审批规则";
    }
}