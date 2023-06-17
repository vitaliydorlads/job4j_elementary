package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("размер ages " + ages.length);
        System.out.println("размер surnames " + surnames.length);
        System.out.println("размер prices " + prices.length);
        String[] names = new String[4];
        names[0] = "петя";
        names[1] = "федя";
        names[2] = "вася";
        names[3] = "игорь";
        System.out.println(Arrays.toString(names));
    }
}