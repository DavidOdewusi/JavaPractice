package com.assignment.multithreading.extendingThread;

public class MyThread extends Thread {
    public void run() {
        int i = 0;
        while (i<3) {
            System.out.println(i + "Hello");
            i++;
        }
    }
}
