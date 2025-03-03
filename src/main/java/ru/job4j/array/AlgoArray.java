package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int y = i + 1; y < array.length; y++) {
                if (array[i] > array[y]) {
                    temp = array[i];
                    array[i] = array[y];
                    array[y] = temp;
                }
            }
        }
        for (int index : array) {
            System.out.println(index);
        }
    }
}
