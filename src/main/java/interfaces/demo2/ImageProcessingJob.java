package interfaces.demo2;

import java.awt.*;
/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-01-18 10:33]
 */
// ImageStore的使用举例
public class ImageProcessingJob {
    private static final String BUCKET_NAME = "ai_images_bucket";

    //...省略其他无关代码...    
    public void process() {
        Image image = null;
        //处理图片，并封装为Image对象    
        ImageStore imageStore = new PrivateImageStore();
        imageStore.upload(image, BUCKET_NAME);
    }
}