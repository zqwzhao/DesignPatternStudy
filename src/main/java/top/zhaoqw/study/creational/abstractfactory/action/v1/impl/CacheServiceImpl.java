package top.zhaoqw.study.creational.abstractfactory.action.v1.impl;

import top.zhaoqw.study.creational.abstractfactory.action.v1.CacheService;
import top.zhaoqw.study.creational.abstractfactory.action.v1.RedisUtils;
import top.zhaoqw.study.creational.abstractfactory.action.v1.matter.EGM;
import top.zhaoqw.study.creational.abstractfactory.action.v1.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author zhaoqw
 * @date 2022/06/02
 */
public class CacheServiceImpl implements CacheService {
  private RedisUtils redisUtils = new RedisUtils();
  private EGM egm = new EGM();
  private IIR iir = new IIR();

  @Override
  public String get(String key, int redisType) {
    if (1 == redisType) {
      return egm.gain(key);
    }
    if (2 == redisType) {
      return iir.get(key);
    }
    return redisUtils.get(key);
  }

  @Override
  public void set(String key, String value, int redisType) {
    if (1 == redisType) {
      egm.set(key, value);
    }
    if (2 == redisType) {
      iir.set(key, value);
    }
    redisUtils.set(key, value);
  }

  @Override
  public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {
    if (1 == redisType) {
      egm.setEx(key, value, timeout, timeUnit);
    }
    if (2 == redisType) {
      iir.setExpire(key, value, timeout, timeUnit);
    }
    redisUtils.set(key, value, timeout, timeUnit);
  }

  @Override
  public void del(String key,  int redisType) {
    if (1 == redisType) {
      egm.delete(key);
    }
    if (2 == redisType) {
      iir.del(key);
    }
    redisUtils.del(key);
  }
}
