package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        if (finish >= 2) {
            count += 1;
            for (int x = 3; x <= finish; x++) {
                if (CheckPrimeNumber.check(x)) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
