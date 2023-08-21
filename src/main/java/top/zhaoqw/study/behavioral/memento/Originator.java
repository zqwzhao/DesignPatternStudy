package top.zhaoqw.study.behavioral.memento;

public class Originator<T> {
    //内部持有类的引⽤
    private T object = null;

    public Originator(T object) {
        this.object = object;
    }

    public MementoImpl createMemento() {
        return new MementoImpl(object);
    }

    /**
     * 将发起⼈恢复到备忘录对象所记载的状态
     */
    public T restoreMemmento(Memento memmento) {
        this.object = (T) memmento.getSnapshot();
        return object;
    }

    public T getObject() {
        return object;
    }
}
