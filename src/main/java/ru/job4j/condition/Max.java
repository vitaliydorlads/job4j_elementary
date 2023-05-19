package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int a = max(1, 2);
        int b = max(3, 3);
        int c = max(5, 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}