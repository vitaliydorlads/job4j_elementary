package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int x = 0; x < array.length / 2; x++) {
            int temp = array[x];
            array[x] = array[array.length - x - 1];
            array[array.length - x - 1] = temp;
        }
        return array;
    }
}