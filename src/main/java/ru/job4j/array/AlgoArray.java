package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        int x = array[2];
        array[2] = array[1];
        array[1] = x;
        int y = array[4];
        array[4] = array[3];
        array[3] = y;
        for (int index : array) {
            System.out.print(index + " ");
        }
    }
}