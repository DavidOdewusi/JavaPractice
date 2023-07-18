package com.assignment.multithreading.readandwritenote;

public class Student extends Thread{
    WhiteBoard b;
    private String name;

    public Student(String name, WhiteBoard b) {
        this.name = name;
        this.b = b;
        b.setNumOfStudent(b.getNumOfStudent() + 1);
    }

    @Override
    public void run() {
        String text;

        do
        {
            text=b.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }

}
