package top.zhaoqw.study.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhaoqw
 * @date 2023/8/15
 */
public class PoliteInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object bean, Method method, Object[] args) throws Throwable {
        if (method.getAnnotation(Polite.class) != null) {
            System.out.println("before...........................");
            String result = (String)method.invoke(bean, args);
            if (result.endsWith(".")) {
                result = result.substring(0, result.length() - 1) + "!";
            }
            System.out.println("after...........................");
            return result;
        }
        return method.invoke(bean, args);
    }
}
