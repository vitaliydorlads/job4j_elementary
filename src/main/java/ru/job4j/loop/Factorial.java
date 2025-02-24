package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int res = 1;
        if (number > 0) {
            for (int x = 1; x <= number; x++) {
                res *= x;
            }
        }
        return res;
    }
}