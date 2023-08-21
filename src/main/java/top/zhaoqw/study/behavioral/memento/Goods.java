package top.zhaoqw.study.behavioral.memento;

/**
 * @author zhaoqw
 * @date 2023/8/21
 */
public class Goods {
    private String title;
    private String description;
    private float price;

    public Goods() {
    }

    public Goods(String title, String description, float price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
