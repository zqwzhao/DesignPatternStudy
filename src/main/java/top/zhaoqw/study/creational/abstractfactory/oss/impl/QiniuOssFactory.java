package top.zhaoqw.study.creational.abstractfactory.oss.impl;

import top.zhaoqw.study.creational.abstractfactory.oss.AbstractOssFactory;
import top.zhaoqw.study.creational.abstractfactory.oss.OssImage;
import top.zhaoqw.study.creational.abstractfactory.oss.OssVideo;
import top.zhaoqw.study.creational.abstractfactory.oss.QiniuOssImage;
import top.zhaoqw.study.creational.abstractfactory.oss.QiniuOssVideo;

/**
 * @author zhaoqw
 * @date 2023/8/21
 */
public class QiniuOssFactory implements AbstractOssFactory {
    @Override
    public OssImage uploadImage(byte[] bytes) {
        return new QiniuOssImage(bytes, "admin");
    }

    @Override
    public OssVideo uploadVideo(byte[] bytes) {
        return new QiniuOssVideo(bytes, "admin");
    }
}
