package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 80;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 240;
        float expected = 3;
        float out = rubleToDollar(in);
        float out1 = rubleToEuro(in);
        boolean passed = expected == out;
        boolean passed1 = expected == out1;
        System.out.println("240 rubles are 3. \nТест для Dollar = " + passed + "\nТест для Euro = " + passed1);
    }
}