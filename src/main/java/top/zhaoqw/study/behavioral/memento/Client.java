package top.zhaoqw.study.behavioral.memento;

/**
 * @author zhaoqw
 * @date 2023/8/21
 */
public class Client {
    /**
     * 客户端
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建执⾏者，⽤于管理原始对象
        Originator<Goods> originator = new Originator(new Goods("⼩熊洗碗机", "...", 2389));
        //创建备忘录，留存最原始的记录
        MementoImpl<Goods> memento = originator.createMemento();
        Goods goods = originator.getObject();
        //创建管理者，⽤于管理备忘录的变化
        Caretaker caretaker = new Caretaker();
        //增加备忘录列表
        caretaker.addMemmemtos(memento);
        goods.setPrice(2208);
        caretaker.addMemmemtos(originator.createMemento());
        goods.setPrice(1998);
        goods.setDescription("双⼗⼀⼤促，低价1998");
        caretaker.addMemmemtos(originator.createMemento());
        //查看数据历史变化
        int i = 0;
        for (Memento m : caretaker.getMemmentoList()) {
            System.out.println(i + ":" + m.getSnapshot());
            i++;
        }
        Memento<Goods> m = caretaker.getMemmentoList().get(2);
        Goods o = originator.restoreMemmento(m);
        System.out.println("数据已恢复⾄指定节点状态");
        System.out.println(o);
    }

}
