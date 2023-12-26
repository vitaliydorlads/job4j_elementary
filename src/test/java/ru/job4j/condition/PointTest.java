package ru.job4j.condition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PointTest {

    @Test
    public void when00to02then2dot0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expectedDistance = 2.0;
        double actualDistance = a.distance(b);
        assertEquals(expectedDistance, actualDistance, 0.001);
    }

    @Test
    public void when00to27then7dot28() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 7);
        double expectedDistance = 7.28;
        double actualDistance = a.distance(b);
        assertEquals(expectedDistance, actualDistance, 0.001);
    }

    @Test
    public void when00to67then9dot21() {
        Point a = new Point(0, 0);
        Point b = new Point(6, 7);
        double expectedDistance = 9.21;
        double actualDistance = a.distance(b);
        assertEquals(expectedDistance, actualDistance, 0.01);
    }
}
