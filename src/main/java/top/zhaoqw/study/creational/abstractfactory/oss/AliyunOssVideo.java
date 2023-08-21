package top.zhaoqw.study.creational.abstractfactory.oss;

/**
 * @author zhaoqw
 * @date 2023/8/21
 */
public class AliyunOssVideo implements OssVideo {
    private byte[] bytes;
    public AliyunOssVideo(byte[] bytes, String watermark) {
        this.bytes = bytes;
        System.out.println("[阿里云]视频已上传至阿里云OSS，URL：http://oss.aliyun.com/xxx.mp4");
        System.out.println("[阿里云]720P转码成功，码率：5000K");
        System.out.println("[阿里云]1080P转码成功,码率：7000K");
    }

    @Override
    public String get720P() {
        return "http://oss.aliyun.com/xxx_720p.mp4";
    }

    @Override
    public String get1080P() {
        return "http://oss.aliyun.com/xxx_1080p.mp4";
    }
}
