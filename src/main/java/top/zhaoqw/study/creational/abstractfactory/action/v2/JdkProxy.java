package top.zhaoqw.study.creational.abstractfactory.action.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhaoqw
 * @date 2022/06/10
 */
public class JdkProxy {
  public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter adapter) {
    InvocationHandler handler = new JdkInvocationHandler(adapter);
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    Class<?>[] classes = interfaceClass.getInterfaces();

    return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
  }
}
