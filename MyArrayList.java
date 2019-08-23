package com.SortColection;

public class MyArrayList {
    /**
     * 存储数据的空间
     */
    private int[] array;
    /**
     * 已有数据的个数
     */
    private int size;

    void pushFront(int item) {
        if (this.size == this.array.length) {
            int capacity = this.array.length * 2;
            int[] newArray = new int[capacity];
            // 搬家
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.array[i];
            }

            // 变更信息
            this.array = newArray;
        }

        for (int i = 0; i < this.size; i++) {
            this.array[this.size - i] = this.array[this.size - i - 1];
        }

        this.array[0] = item;
        this.size++;
    }
}
