package ru.job4j.condition;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PointTest {

    @Test
    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expectedDistance = 2.0;
        double actualDistance = a.distance(b);
        assertEquals(expectedDistance, actualDistance, 0.001);
    }
}
