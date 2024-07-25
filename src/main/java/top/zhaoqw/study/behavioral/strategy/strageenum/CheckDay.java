package top.zhaoqw.study.behavioral.strategy.strageenum;

public class CheckDay {
    public String day(DayEnum dayEnum) {
        return dayEnum.toDo();
    }


    public String dayNew(DayEnumNew dayEnumNew) {
        return dayEnumNew.toDo();
    }

}
