package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[left.length - 1];
    }
}
