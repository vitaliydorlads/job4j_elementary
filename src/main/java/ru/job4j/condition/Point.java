package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double distance = a.distance(b);
        System.out.println(distance);
    }
}
