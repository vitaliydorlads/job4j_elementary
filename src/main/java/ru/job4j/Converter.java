package ru.job4j;

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
        float euro = Converter.rubleToEuro(140);
        float dollar = rubleToDollar(200);
        System.out.println("140 рублей это " + euro + " euro." + " и 200 рублей это "  + dollar + " dollar.");
    }

}
