package top.zhaoqw.study.behavioral.strategy.action1exam.newimpl;

import top.zhaoqw.study.behavioral.strategy.action1exam.LeaveForm;

public class LeaveServiceNew {
    public void audit(LeaveForm leaveForm){
        AuditStrategyFactory factory = AuditStrategyFactory.getInstance();
        AuditStrategy auditStrategy = factory.getAuditStrategy(leaveForm);
        System.out.println("符合规则：" + auditStrategy.getName() + "(" + auditStrategy.getClass().getSimpleName() + ")" );
        auditStrategy.audit(leaveForm);
    }
}