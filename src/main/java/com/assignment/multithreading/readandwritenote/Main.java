package com.assignment.multithreading.readandwritenote;

public class Main {
    public static void main(String[] args) {
        WhiteBoard board = new WhiteBoard();
        Teacher teacher = new Teacher(board);
        Student david = new Student("David", board);
        Student samuel = new Student("Samuel", board);
        Student queen = new Student("Queen", board);
        Student wafiyi = new Student("Wafiyi", board);
        teacher.start();
        david.start();
        samuel.start();
        queen.start();
        wafiyi.start();
        System.out.println(board.getCount());

    }
}
