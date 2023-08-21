package top.zhaoqw.study.behavioral.memento;

/**
 * 备忘录接口
 *
 * 备忘录模式Memento是⼀种⾏为设计模式， 允许在不暴露对象实现细节
 * 的情况下保存和恢复对象之前的状态。
 * 很多时候我们总是需要记录⼀个对象的内部状态，这样做的⽬的就是为
 * 了允许⽤户取消不确定或者错误的操作，能够恢复到他原先的状态，使
 * 得他有"后悔药"可吃。
 * @author zhaoqw
 * @date 2023/8/21
 */
public interface Memento<T> {
    public T getSnapshot();
}
