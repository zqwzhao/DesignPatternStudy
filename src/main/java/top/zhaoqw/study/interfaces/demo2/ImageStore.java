package top.zhaoqw.study.interfaces.demo2;

import java.awt.*;
/**
 * @author: zhaoqw
 * @date: 2022/1/18 09:11
 */
public interface ImageStore {
    String upload(Image image, String bucketName);

    Image download(String url);
}
