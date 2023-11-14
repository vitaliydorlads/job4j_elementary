package ru.job4j;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result += String.valueOf(symbol);
                symbol = input.charAt(i);
                if (counter > 1) {
                    result += String.valueOf(counter);
                    symbol = input.charAt(i);
                    counter = 1;
                }

            }
        }
        if (counter > 1) {
            result += input.charAt((input.length() - 1)) + String.valueOf(counter);
        } else {
            result += input.charAt((input.length() - 1));
        }
        return result;
    }
}



