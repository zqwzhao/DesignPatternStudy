package top.zhaoqw.study.creational.abstractfactory.action.v2.impl;

import top.zhaoqw.study.creational.abstractfactory.action.v1.RedisUtils;
import top.zhaoqw.study.creational.abstractfactory.action.v2.CacheService;

import java.util.concurrent.TimeUnit;

/**
 * 缓存服务实现类
 *
 * @author zhaoqw
 * @date 2022/06/02
 */
public class CacheServiceImpl implements CacheService {

  private RedisUtils redisUtils = new RedisUtils();

  public String get(String key) {
    return redisUtils.get(key);
  }

  public void set(String key, String value) {
    redisUtils.set(key, value);
  }

  public void set(String key, String value, long timeout, TimeUnit timeUnit) {
    redisUtils.set(key, value, timeout, timeUnit);
  }

  public void del(String key) {
    redisUtils.del(key);
  }
}
