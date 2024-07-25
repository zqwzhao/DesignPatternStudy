package top.zhaoqw.study.behavioral.strategy.strageenum;

/**
 * 通过枚举来定义要做什么
 *
 */
public enum DayEnum {
    Monday {
        @Override
        public String toDo() {
//            ......省略复杂语句
            return "今天上英语课";
        }
    },
    Tuesday {
        @Override
        public String toDo() {
            return "今天上语文课";
        }
    },
    Wednesday {
        @Override
        public String toDo() {
            return "今天上数学课";
        }
    },
    Thursday {
        @Override
        public String toDo() {
            return "今天上音乐课";
        }
    };
    public abstract String toDo();
}
