package top.zhaoqw.study.creational.abstractfactory.oss;

/**
 * 抽象工厂接口，实现接入不同的Oss厂商
 */
public interface AbstractOssFactory {
    public OssImage uploadImage(byte[] bytes);
    public OssVideo uploadVideo(byte[] bytes);
}
