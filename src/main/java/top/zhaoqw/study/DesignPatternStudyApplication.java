package top.zhaoqw.study;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

@SpringBootApplication
public class DesignPatternStudyApplication {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    ConfigurableApplicationContext context = SpringApplication.run(DesignPatternStudyApplication.class, args);
  }

}
