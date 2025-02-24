package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int x = start; x <= finish; x++) {
            sum += x;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int res = 0;
        for (int x = start; x <= finish; x++) {
            if (x % 2 == 0) {
                res += x;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(2, 1));
        System.out.println(sumByEven(1, 3));
        System.out.println(sumByEven(0, 15));
        System.out.println(sumByEven(-5, 0));
    }
}
