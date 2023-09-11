package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int exp = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (exp >= coins[i]) {
                exp -= coins[i];
                rsl[size++] = coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}