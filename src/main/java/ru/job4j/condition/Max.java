package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean number = left > right;
        int result = number ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int a = max(1, 2);
        int b = max(3, 3);
        System.out.println(a);
        System.out.println(b);
    }
}