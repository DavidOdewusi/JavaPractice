package com.assignment.multithreading.readandwritenote;

public class Teacher extends Thread{
    private WhiteBoard b;
    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};

    public Teacher (WhiteBoard board) {b = board;}

    @Override
    public void run() {
        for (int i = 0; i < notes.length; i++)
            b.write(notes[i]);
//        System.out.println("Teacher has written: " + b.getText());
    }
}
