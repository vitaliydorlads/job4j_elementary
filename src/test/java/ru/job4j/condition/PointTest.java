package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
        public void when00to20then4() {
            int x1 = 0;
            int y1 = 3;
            int x2 = 2;
            int y2 = 7;
            double expected = 4.123105625617661;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
    }
}