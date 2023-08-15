package top.zhaoqw.study.creational.simplefactory.action2.v2.store.impl;

import org.junit.Test;
import top.zhaoqw.study.creational.abstractfactory.action.v2.CacheService;
import top.zhaoqw.study.creational.abstractfactory.action.v2.JdkProxy;
import top.zhaoqw.study.creational.abstractfactory.action.v2.impl.CacheServiceImpl;
import top.zhaoqw.study.creational.abstractfactory.action.v2.impl.EGMCacheAdapter;
import top.zhaoqw.study.creational.abstractfactory.action.v2.impl.IIRCacheAdapter;

/**
 * @author zhaoqw
 * @date 2022/06/10
 */
public class AbstractFactory {
  @Test
  public void testCacheService2() {
    // jdk 的动态代理需要接口
    CacheService egmProxy =  JdkProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
    egmProxy.set("user1", "牛叠为");
    String user1 = egmProxy.get("user1");
    System.out.println(user1);
    CacheService iirProxy = JdkProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
    iirProxy.set("user2", "任唱");
    String user2 = iirProxy.get("user2");
    System.out.println(user2);
  }
}
