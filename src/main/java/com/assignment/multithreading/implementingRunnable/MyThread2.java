package com.assignment.multithreading.implementingRunnable;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
}
