
package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double sumAndMultiplyAndSubtractionAndDivision(double firs, double second) {
        return sum(firs, second) + multiply(firs, second) + subtraction(firs, second) + division(firs, second);
    }


    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractionAndDivision(5, 10));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubtractionAndDivision(20, 30));
    }
}
