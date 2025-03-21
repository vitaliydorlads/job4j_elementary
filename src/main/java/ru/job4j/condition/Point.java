package ru.job4j.condition;

public class Point {
    private int z;
    private final int x;
    private final int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2) + Math.pow((that.z - this.z), 2));
    }

    public static void main(String[] args) {
        Point i = new Point(10, 5, 3);
        Point z = new Point(7, 6, 5);
        System.out.println(i.distance3d(z));
    }
}
