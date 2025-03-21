package ru.job4j.condition;

public class Max {
    public static int maxNumber(int first, int second) {
        return Math.max(first, second);
    }

    public static int maxNumber(int first, int second, int third) {
        return Math.max(Math.max(first, second), third);
    }

    public static int maxNumber(int first, int second, int third, int fourth) {
        return Math.max(Math.max(Math.max(first, second), third), fourth);
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число: " + maxNumber(2, 3));
        System.out.println("Максимальное число: " + maxNumber(2, 3, 4));
        System.out.println("Максимальное число: " + maxNumber(2, 3, 4, 5));
    }
}
