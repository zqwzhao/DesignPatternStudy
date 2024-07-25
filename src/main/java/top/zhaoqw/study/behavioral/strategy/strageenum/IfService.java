package top.zhaoqw.study.behavioral.strategy.strageenum;

public class IfService {

    public String getToDo(String day) {
//        if ("Monday".equals(day)) {
//            return "今天上英语课";
//        } else if ("Tuesday".equals(day)) {
//            return "今天上语文课";
//        } else if ("Wednesday".equals(day)) {
//            return "今天上数学课";
//        } else if ("Thursday".equals(day)) {
//            return "今天上音乐课";
//        } else if ("sunday".equals(day)) {
//            return "今天上编程课";
//        } else {
//            return null;
//        }

        if("Monday".equals(day)||"Tuesday".equals(day)||"Wednesday".equals(day)){
            return "今天上英语课";
        }else if("Thursday".equals(day)){
            return null;
        }
        return null;
    }


    public String todo(String day) {
        CheckDay checkDay=new CheckDay();
        return checkDay.day(DayEnum.valueOf(day));
    }


    public static String todoNew(String day) {
        CheckDay checkDay=new CheckDay();
        return checkDay.dayNew(DayEnumNew.valueOf(day));
    }


}