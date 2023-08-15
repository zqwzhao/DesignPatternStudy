package top.zhaoqw.study.creational.abstractfactory.action.v2;

import top.zhaoqw.study.creational.abstractfactory.action.v2.utils.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhaoqw
 * @date 2022/06/10
 */
public class JdkInvocationHandler implements InvocationHandler {
  private ICacheAdapter iCacheAdapter;

  public JdkInvocationHandler(ICacheAdapter iCacheAdapter) {
    this.iCacheAdapter = iCacheAdapter;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args)
      throws Throwable {
    return ICacheAdapter.class.getMethod(method.getName(),
        ClassLoaderUtils.getClazzByArgs(args)).invoke(iCacheAdapter, args);
  }
}
