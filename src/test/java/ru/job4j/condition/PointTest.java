package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And02Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double res = a.distance(b);
        double expected = 2.0;
        assertThat(res).isEqualTo(expected);
    }

    @Test
    void whenPoints12And22Then1() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 2);
        double res = a.distance(b);
        double expected = 1.0;
        assertThat(res).isEqualTo(expected);
    }

    @Test
    void whenPointsMinus2Minus2And22Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double res = a.distance(b);
        double expected = 5.66;
        assertThat(res).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints223And763Then7Dot54() {
        Point i = new Point(2, 2, 3);
        Point z = new Point(7, 6, 7);
        double res = i.distance3d(z);
        double expected = 7.54;
        assertThat(res).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoint1053And763Then3Dot74() {
        Point i = new Point(10, 5, 3);
        Point z = new Point(7, 6, 5);
        double res = i.distance3d(z);
        double expected = 3.74;
        assertThat(res).isEqualTo(expected, withPrecision(0.01));
    }
}