package top.zhaoqw.study.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Pc系统
 *
 * @author zhaoqw
 * @date 2023/04/25
 */
public class PcServer {
    /**
     * 很多观察者
     */
    private List<Observer> observers = new ArrayList<>();

    private int cpu;
    private int memory;

    public void changeState(int cpu, int memory) {
        this.cpu = cpu;
        this.memory = memory;
        System.out.println("Cpu: " + cpu + "%, 内存占用: " + memory + "%");
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
