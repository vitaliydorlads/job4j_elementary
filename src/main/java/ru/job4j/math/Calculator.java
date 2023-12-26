package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class Calculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double sumAndMultiplyAndDifferenceAndDivide(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("сумма двух операций из класса MathFunction: " + differenceAndDivide(10, 20));
        System.out.println("сумма вычисления всех четырех операций из класса MathFunction: " + sumAndMultiplyAndDifferenceAndDivide(10, 20));
    }
}