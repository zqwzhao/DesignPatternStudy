package top.zhaoqw.study.creational.abstractfactory.action.v1.impl;

import top.zhaoqw.study.creational.abstractfactory.action.v1.CacheService;
import top.zhaoqw.study.creational.abstractfactory.action.v1.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author zhaoqw
 * @date 2022/06/02
 */
public class CacheServiceImpl implements CacheService {
  private RedisUtils redisUtils = new RedisUtils();

  @Override
  public String get(String key) {
    return redisUtils.get(key);
  }

  @Override
  public void set(String key, String value) {
    redisUtils.set(key, value);
  }

  @Override
  public void set(String key, String value, long timeout, TimeUnit timeUnit) {
    redisUtils.set(key, value, timeout, timeUnit);
  }

  @Override
  public void del(String key) {
    redisUtils.del(key);
  }
}
