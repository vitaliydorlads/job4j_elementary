package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int x = 0; x < bound; x++) {
            rst[x] = (int) Math.pow(x, 2);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int index : array) {
            System.out.print(index + " ");
        }
    }
}