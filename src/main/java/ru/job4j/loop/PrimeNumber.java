package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int x = 2; x <= finish; x++) {
            if (CheckPrimeNumber.check(x)) {
                count += 1;
            }
        }
        return count;
    }
}
