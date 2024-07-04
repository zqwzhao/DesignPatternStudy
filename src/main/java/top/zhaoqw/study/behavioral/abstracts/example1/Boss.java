package top.zhaoqw.study.behavioral.abstracts.example1;

/**
 * @author zhaoqw
 * @date 2024/7/4
 */
public class Boss {
    public void command(String task, Leader leader) {
        leader.doing(task);
    }
}
