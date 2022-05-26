package top.zhaoqw.study.creational.singleton.action;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-12-16 10:53]
 */
public class Logger {
    private FileWriter fileWriter;
    private static final Logger INSTANCE = new Logger();

    private Logger() {
        File file = new File("E:/logs/myLogs.txt");
        try {
            fileWriter = new FileWriter(file,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void log(String message) {
        synchronized (Logger.class) {
            try {
                fileWriter.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class UserController {
    public void login(String username,String password) {
        // ...省略业务逻辑代码...
        Logger.getInstance( ).log(username + " logined ! " );
    }
}



