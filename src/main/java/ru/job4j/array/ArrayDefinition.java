package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Vitaliy";
        names[1] = "Alexandrovich";
        names[2] = "16.02.1991";
        names[3] = "Russia";
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        System.out.println(names[0] + " " + names[1] + "," + names[2] + "," + names[3]);
    }
}
