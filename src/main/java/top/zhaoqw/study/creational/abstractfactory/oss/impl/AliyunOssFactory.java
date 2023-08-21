package top.zhaoqw.study.creational.abstractfactory.oss.impl;

import top.zhaoqw.study.creational.abstractfactory.oss.AbstractOssFactory;
import top.zhaoqw.study.creational.abstractfactory.oss.AliyunOssImage;
import top.zhaoqw.study.creational.abstractfactory.oss.AliyunOssVideo;
import top.zhaoqw.study.creational.abstractfactory.oss.OssImage;
import top.zhaoqw.study.creational.abstractfactory.oss.OssVideo;

/**
 * @author zhaoqw
 * @date 2023/8/21
 */
public class AliyunOssFactory implements AbstractOssFactory {
    @Override
    public OssImage uploadImage(byte[] bytes) {
        return new AliyunOssImage(bytes,"admin",true);
    }

    @Override
    public OssVideo uploadVideo(byte[] bytes) {
        return new AliyunOssVideo(bytes,"admin");
    }
}
