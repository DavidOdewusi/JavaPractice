package com.assignment.multithreading.readandwritenote;

public class WhiteBoard {
    private String text;
    private int numOfStudent = 0;
    private int count = 0;


    synchronized public String read() {
        while (count == 0)
            try {wait();} catch (InterruptedException e){}

        count--;
        if (count == 0)
            notify();
        return text;
    }

    synchronized public void write(String t) {
        System.out.println("Teacher is writing: " + t);
        while(count != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            text = t;
            count = numOfStudent;
            notifyAll();
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }

    public String getText() {
        return text;
    }

    public int getCount() {
        return count;
    }
}
