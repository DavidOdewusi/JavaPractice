package com.assignment.multithreading;

class MyRun implements Runnable {

    @Override
    public void run() {

    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        int count = 1;

        while(true) {
            System.out.println(count++ + " My Thread");
        }
    }
}

class Data {
    synchronized public void display(String str) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
    }
}

class MyThread1 extends Thread{
    Data data;

    public MyThread1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.display("Hello World");
    }
}
class MyThread2 extends Thread{
    Data data;

    public MyThread2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.display("Welcome");
    }
}

class MyData {
    int value = 0;
    boolean flag = true;

    synchronized void set(int v) {
        while (!flag) {
            try {wait();} catch (InterruptedException e){System.out.println(e);}
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized int get() {
        int x = 0;
        while (flag){
            try {wait();} catch (InterruptedException e){System.out.println(e);}
        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread{
    MyData data;

    public Producer(MyData data) {
        this.data = data;
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            data.set(count);
            System.out.println("Producer: " + count);
            count++;
        }
    }
}

class Consumer extends Thread{
    MyData data;

    public Consumer(MyData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Consumer: " + data.get());
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(new MyRun(),"David");
//        MyThread g = new MyThread("My Thread 1");
//
//
//
//        System.out.println("Id " + g.threadId());
//        System.out.println("Name " + g.getName());
//        System.out.println("Priority " + g.getPriority());
////        g.setDaemon(true);
//        g.start();
//        int count = 1;
//
//        while(true) {
//            System.out.println(count++ + " Main");
//            Thread.yield();
//        }

//        Thread mainThread = Thread.currentThread();
//        mainThread.join();
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//        g.interrupt();
//        System.out.println("State " + g.getState());
//        System.out.println("Thread Group " + g.getThreadGroup());
//        System.out.println("Alive " + g.isAlive());

//        Data d = new Data();
//        MyThread1 thread1 = new MyThread1(d);
//        MyThread2 thread2 = new MyThread2(d);
//        thread1.start();
//        thread2.start();

        MyData d = new MyData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();

    }
}
