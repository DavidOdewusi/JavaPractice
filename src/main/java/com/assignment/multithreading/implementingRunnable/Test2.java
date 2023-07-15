package com.assignment.multithreading.implementingRunnable;

public class Test2 {
    public static void main(String[] args) {
        MyThread2 m = new MyThread2();
        Thread t = new Thread(m);
        t.start();

        int i = 0;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
