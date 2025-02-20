package ru.job4j.condition;

public class Rectangle {
    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public static void main(String[] args) {
        double result = diagonal(3, 4);
        System.out.println("Diagonal of rectangle with length 3 and width 4 is " + result);
        double result2 = diagonal(1, 2);
        System.out.println("Diagonal of rectangle with length 1 and width 2 is " + result2);
        double result3 = diagonal(5, 6);
        System.out.println("Diagonal of rectangle with length 5 and width 6 is " + result3);
    }
}
