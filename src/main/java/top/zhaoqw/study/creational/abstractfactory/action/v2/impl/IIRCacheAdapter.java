package top.zhaoqw.study.creational.abstractfactory.action.v2.impl;

import top.zhaoqw.study.creational.abstractfactory.action.v1.matter.IIR;
import top.zhaoqw.study.creational.abstractfactory.action.v2.ICacheAdapter;

import java.util.concurrent.TimeUnit;

public class IIRCacheAdapter implements ICacheAdapter {
  private IIR iir = new IIR();

  public String get(String key) {
    return iir.get(key);
  }

  public void set(String key, String value) {
    iir.set(key, value);
  }

  public void set(String key, String value, long timeout, TimeUnit timeUnit) {
    iir.setExpire(key, value, timeout, timeUnit);
  }

  public void del(String key) {
    iir.del(key);
  }
}
