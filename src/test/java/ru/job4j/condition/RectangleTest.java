package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {
    @Test
    void whenLength3AndWidth4ThenDiagonal5() {
        double length = 3;
        double width = 4;
        double expected = 5.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength1AndWidth2ThenDiagonal2dot23() {
        double length = 1;
        double width = 2;
        double expected = 2.23;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength5AndWidth6ThenDiagonal7dot81() {
        double length = 5;
        double width = 6;
        double expected = 7.81;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}