package com.assignment.multithreading.ATM;

import java.text.NumberFormat;

public class ATM {

  synchronized public void checkBalance(String name) {
      System.out.println("Checking...... " + name + " balance");
      try {
          Thread.sleep(3000);
      } catch (Exception e) {
          System.out.println(e);
      }
      System.out.println("Balance");
    }

    synchronized public void withdraw (String name, int amount) {
        System.out.println("Please wait...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Hello " + name + " you just withdrew " + NumberFormat.getCurrencyInstance().format(amount));
    }
}
