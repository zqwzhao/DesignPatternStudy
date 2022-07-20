package top.zhaoqw.study.oop.polymorphism;

import java.util.Arrays;

public class DynamicArray {
    private static final int DEFAULT_CAPACITY = 10;
    protected int size = 0;
    protected int capacity = DEFAULT_CAPACITY;
    protected Integer[] elements = new Integer[DEFAULT_CAPACITY];

    public int size() {
        return this.size;
    }

    public Integer get(int index) {
        return elements[index];
    }

    //...省略n多方法...
    public void add(Integer e) {
        ensureCapacity();
        elements[size++] = e;
    }

    protected void ensureCapacity() {
        if(size == capacity) {
            int newSize = size + size >> 1;
            elements = Arrays.copyOf(elements, newSize);
        }
    }
}
