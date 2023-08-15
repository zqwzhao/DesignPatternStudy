package top.zhaoqw.study.behavioral.strategy.example2.agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhaoqw
 * @date 2022/07/15
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {
  private Logger logger = LoggerFactory.getLogger(MapperFactoryBean.class);

  private Class<T> mapperInterfaces;

  public MapperFactoryBean(Class<T> mapperInterfaces) {
    this.mapperInterfaces = mapperInterfaces;
  }

  @Override
  public T getObject() throws Exception {
    InvocationHandler handler = (proxy, method, args) -> {
      Select select = method.getAnnotation(Select.class);
      logger.info("SQL:{}",select.value().replace("#uid", args[0].toString()));
      return args[0] + "沉淀、分享、成长，让自己和他人都能有所收获！";
    };

    return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterfaces}, handler);
  }

  @Override
  public Class<?> getObjectType() {
    return mapperInterfaces;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }
}
