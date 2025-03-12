package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        for (int index : coins) {
            while ((money - price) >= index) {
                money -= index;
                result[size] = index;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
