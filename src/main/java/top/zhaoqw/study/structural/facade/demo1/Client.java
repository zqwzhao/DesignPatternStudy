package top.zhaoqw.study.structural.facade.demo1;

/**
 * @author zhaoqw
 * @date 2023/8/21
 */
public class Client {
    public static void main(String[] args) {
        //如果没有额外操作，客户端必须⼿动运⾏这些组件，这极⼤提⾼了客户端的使⽤⻔槛
        new DatabaseManager().startDbCluster();
        new CacheManager().initRedis();
        new WebServerManager().loadWebApp();
        // 好的做法是引⼊⻔⾯Facade，让应⽤开发⽅提供操作，为客户端提供最简单的操作⼊⼝即可
        // 类似于微服务网关
        ApplicationFacade applicationFacade = new ApplicationFacade();
        applicationFacade.initSystem();
    }
}
