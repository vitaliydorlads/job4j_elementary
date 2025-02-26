package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 1;
        double total = annualDeposit;
        do {
            total += annualDeposit + (total * percent / 100);
            years += 1;
        } while (total <= goal);
        return years;
    }
}
