package top.zhaoqw.study.behavioral.strategy.action1exam.newimpl;

import top.zhaoqw.study.behavioral.strategy.action1exam.LeaveForm;

//审核策略类
public interface AuditStrategy {
    //判断条件是否匹配
    public boolean isSupport(LeaveForm form);
    //审核业务逻辑
    public void audit(LeaveForm leaveForm);
    //规则冲突时的优先级
    public int getPriority();
    //规则名称
    public String getName();
}