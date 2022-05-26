package top.zhaoqw.study.behavioral.strategy.example1;
// 策略接口：EvictionStrategy
// 策略类：LruEvictionStrategy、FifoEvictionStrategy、LfuEvictionStrategy...
// 策略工厂：EvictionStrategyFactory

public class UserCache {
//  private Map<String, User> cacheData = new HashMap<>();
//  private EvictionStrategy eviction;
//
//  public UserCache(EvictionStrategy eviction) {
//    this.eviction = eviction;
//  }

  //...
}

// 运行时动态确定，根据配置文件的配置决定使用哪种策略
/*public*/ class Application {
  public static void main(String[] args) throws Exception {
//    EvictionStrategy evictionStrategy = null;
//    Properties props = new Properties();
//    props.load(new FileInputStream("./config.properties"));
//    String type = props.getProperty("eviction_type");
//    evictionStrategy = EvictionStrategyFactory.getEvictionStrategy(type);
//    UserCache userCache = new UserCache(evictionStrategy);
    //...
  }
}

// 非运行时动态确定，在代码中指定使用哪种策略
/*
public class Application {
  public static void main(String[] args) {
    //...
    EvictionStrategy evictionStrategy = new LruEvictionStrategy();
    UserCache userCache = new UserCache(evictionStrategy);
    //...
  }
}
*/
