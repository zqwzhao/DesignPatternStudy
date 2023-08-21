package top.zhaoqw.study.structural.facade.demo1;

public class ApplicationFacade {
    private CacheManager cacheManager = new CacheManager();
    private DatabaseManager dbManager = new DatabaseManager();
    private WebServerManager webManager = new WebServerManager();

    public void initSystem() {
        dbManager.startDbCluster();
        cacheManager.initRedis();
        webManager.loadWebApp();
    }
}