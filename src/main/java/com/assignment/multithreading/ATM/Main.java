package com.assignment.multithreading.ATM;

public class Main {
    public static void main(String[] args) {
        ATM card = new ATM();
        Customer customer1 = new Customer(card, "David", 500);
        Customer customer2 = new Customer(card, "Queen", 5000);
        customer1.start();
        customer2.start();

    }
}
