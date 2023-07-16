package com.assignment.multithreading.ATM;

import java.text.NumberFormat;

public class Customer extends Thread{
    private ATM card;
    private String name;
    private int amount;

    public Customer(ATM card, String name,int amount) {
        this.card = card;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        useATM();
    }

   void useATM() {
            card.checkBalance(name);
            card.withdraw(name, amount);
    }



}
