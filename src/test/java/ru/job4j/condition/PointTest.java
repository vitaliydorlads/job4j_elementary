package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And02Then2() {
        int x1 = 0, y1 = 0;
        int x2 = 0, y2 = 2;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double expected = 2.0;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    void whenPoints12And02Then1() {
        int x1 = 1, y1 = 2;
        int x2 = 0, y2 = 2;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double expected = 1.0;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    void whenPointsMinus2Minus2And22Then5Dot66() {
        int x1 = -2, y1 = -2;
        int x2 = 2, y2 = 2;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double expected = 5.66;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }
}