package top.zhaoqw.study.creational.abstractfactory.oss;

import top.zhaoqw.study.creational.abstractfactory.oss.impl.QiniuOssFactory;

/**
 * 用户端根本不需要了解阿里云/七牛云的处理细节，直接创建工厂对象就好啦。
 * 你建哪个工厂，就采用哪个工厂生产品，产品的特质也不同。
 * 同时，未来接入腾讯云也不需要修改现在的代码，按上面的套路实现一个工厂和图片、视频对象即可
 *
 * @author zhaoqw
 * @date 2023/8/21
 */
public class Client {
    public static void main(String[] args) {
        AbstractOssFactory factory = new QiniuOssFactory();
        OssImage ossImage = factory.uploadImage(new byte[1024]);
        OssVideo ossVideo = factory.uploadVideo(new byte[1024]);
        System.out.println(ossImage.getThumb());
        System.out.println(ossImage.getWatermark());
        System.out.println(ossImage.getEnhance());
        System.out.println(ossVideo.get720P());
        System.out.println(ossVideo.get1080P());
    }
}
