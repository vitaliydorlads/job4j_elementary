package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (Math.abs(y2 - y1) == Math.abs(x2 - x1)) {
                rsl = Math.abs(y2 - y1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        int rsl1 = way(6, 7, 1, 2);
        int rsl2 = way(7, 0, 0, 7);
        int rsl3 = way(2, 6, 4, 1);
        int rsl4 = way(-1, 6, 4, 1);
        int rsl5 = way(2, -1, 4, 1);
        int rsl6 = way(2, 6, -1, 1);
        int rsl7 = way(2, 6, 4, -1);
        int rsl8 = way(10, 6, 4, 1);
        int rsl9 = way(2, 10, 4, 1);
        int rsl10 = way(2, 6, 10, 1);
        int rsl11 = way(2, 6, 4, 10);
    }
}
