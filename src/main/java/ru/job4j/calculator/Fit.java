package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
    double rsl = (187 - 100) * 1.15;
    return rsl;
}

    public static double womanWeight(short height) {
        double rsl = (187 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        short height1 = 160;
        double man = Fit.manWeight(height);
        double woman = womanWeight(height1);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 160 is " + woman);
    }
}