package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coinS = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int coin : coinS) {
            while ((money - price) >= coin) {
                money -= coin;
                rsl[size++] = coin;

            }
        }
        return Arrays.copyOf(rsl, size);
    }
}