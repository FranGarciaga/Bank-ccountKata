package org.example;

public class Account {
    private double balance;

    public Account(double balance) { //CONSTRUCTOR --> INIT
        this.balance = balance;
    }

    public Account() { // SOBRECARGA DE MÉTODOS
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) return;
        this.balance += amount;
    }

    public void retirarMoney (double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException();

        }
        this.balance -= amount;
    }
}

