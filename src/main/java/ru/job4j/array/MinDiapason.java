package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int x = start; x <= finish; x++) {
            if (min > array[x]) {
                min = array[x];
            }
        }
        return min;
    }
}