package top.zhaoqw.study.interfaces.demo2;

import java.awt.*;

/**
 * @author: zhaoqw
 * @date: 2022/1/18 09:11
 */
public class PrivateImageStore implements ImageStore {
    public String upload(Image image, String bucketName) {
        createBucketIfNotExisting(bucketName);
        //...上传图片到私有云...
        // ...返回图片的url...
        return null;
    }

    public Image download(String url) {
        //...从私有云下载图片...
        return null;
    }

    private void createBucketIfNotExisting(String bucketName) {
        // ...创建bucket...
        // ...失败会抛出异常..
    }

}



