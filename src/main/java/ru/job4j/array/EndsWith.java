package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int x = 0; x < post.length; x++) {
            if (post[post.length - 1 - x] != word[word.length - 1 - x]) {
                result = false;
                break;
            }
        }
        return result;
    }
}