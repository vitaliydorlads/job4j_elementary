package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[data.length - 1];
        for (boolean x : data) {
            if (x != result) {
                return false;
            }
        }
        return true;
    }
}

