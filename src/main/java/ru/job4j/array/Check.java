package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int x = 1; x < data.length; x++) {
            if (data[x] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

