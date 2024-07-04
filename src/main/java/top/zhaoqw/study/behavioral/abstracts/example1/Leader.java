package top.zhaoqw.study.behavioral.abstracts.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoqw
 * @date 2024/7/4
 */
public class Leader implements IEmployee {
    private Map<String,IEmployee> employees = new HashMap();

    public Leader() {
        employees.put("爬虫", new EmployeeA());
        employees.put("海报图", new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if (!employees.containsKey(task)) {
            System.out.println("这个任务: " + task + ", 超出了我的能力范围");
            return;
        }
        employees.get(task).doing(task);
    }
}
