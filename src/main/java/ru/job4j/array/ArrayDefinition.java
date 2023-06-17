package ru.job4j.array;
import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "петя";
        names[1] = "федя";
        names[2] = "вася";
        names[3] = "игорь";
        System.out.println(Arrays.toString(names));
    }
}
