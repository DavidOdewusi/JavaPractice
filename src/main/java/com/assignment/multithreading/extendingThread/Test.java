package com.assignment.multithreading.extendingThread;

public class Test {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println(MyThread.currentThread());

        int i = 0;
        while (i < 3) {
            System.out.println(i + "World");
            i++;
        }
    }
}
