package top.zhaoqw.study.behavioral.strategy.action1exam;

public class LeaveServiceOld {
    public void audit(LeaveForm leaveForm){
        //3天以下婚丧假，自动通过
        if(leaveForm.getDays() <= 3 && leaveForm.getType()==1){
            System.out.println("三天以下婚丧假无需审批自动通过");
        }
        if(leaveForm.getDays() > 3 && leaveForm.getType()==1){
            System.out.println("三天以上婚丧假，进入上级审批流程");
        }
        if(leaveForm.getEmployee().getLevel() ==9){
            System.out.println("总经理请假无需审批自动通过");
        }
        if(leaveForm.getDays() == 1 && leaveForm.getType() == 0){
            System.out.println("一天病假无需审批自动通过");
        }
        if(leaveForm.getDays() > 1  && leaveForm.getType() == 0){
            System.out.println("一天以上病假，进入上级审批流程");
        }
    }
}
