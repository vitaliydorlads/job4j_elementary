package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean res = true;
        if (number < 2) {
            return false;
        }
        for (int x = 2; x <= number - 1; x++) {
            if (number % x == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}

