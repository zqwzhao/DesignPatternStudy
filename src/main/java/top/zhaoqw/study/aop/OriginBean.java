package top.zhaoqw.study.aop;

import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@Component
public class OriginBean {

    public String name;

    @Polite
    public String hello() {
        return "Hello, " + name + ".";
    }

    @Polite
    public String morning() {
        return "Morning, " + name + ".";
    }
}