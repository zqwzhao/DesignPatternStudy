package top.zhaoqw.study.creational.abstractfactory.action.v2.impl;

import top.zhaoqw.study.creational.abstractfactory.action.v1.matter.EGM;
import top.zhaoqw.study.creational.abstractfactory.action.v2.ICacheAdapter;

import java.util.concurrent.TimeUnit;

public class EGMCacheAdapter implements ICacheAdapter {
  private EGM egm = new EGM();

  public String get(String key) {
    return egm.gain(key);
  }

  public void set(String key, String value) {
    egm.set(key, value);
  }

  public void set(String key, String value, long timeout, TimeUnit timeUnit) {
    egm.setEx(key, value, timeout, timeUnit);
  }

  public void del(String key) {
    egm.delete(key);
  }
}
