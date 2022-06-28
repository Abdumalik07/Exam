package com.company;

public class BankAccount {
    private double amount;

    public void deposit(double sum) {
        this.amount += sum;
    }

    public void withDraw(int sum) {
        try {
            if (amount < sum) {
                throw new MyLimitException("Not enough found", getAmount());
            } else {
                amount -= sum;
                System.out.println("Vy uspeshno snali: " + sum);
            }
        } catch (MyLimitException e) {
            System.out.println(e.getMessage());
            e.getRemainingAmount();
            amount -= getAmount();
            System.exit(0);
        }

    }

    public double getAmount() {
        return amount;
    }
}
