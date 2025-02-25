package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int res = 1;
        for (int x = 2; x <= number; x++) {
                res *= x;
            }
        return res;
    }
}