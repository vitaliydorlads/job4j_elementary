package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMaxNumberFirstAndSecondThenSecond() {
        int first = 1, second = 2;
        int res = Max.max(first, second);
        int exp = second;
        assertThat(res).isEqualTo(exp);
    }

    @Test
    void whenMaxNumberFirstAndSecondAndThirdThenThird() {
        int first = 1, second = 2, third = 3;
        int res = Max.max(first, second, third);
        int exp = third;
        assertThat(res).isEqualTo(exp);
    }

    @Test
    void whenMaxNumberFirstAndSecondAndThirdAndFourthThenFourth() {
        int first = 1, second = 2, third = 3, fourth = 4;
        int res = Max.max(first, second, third, fourth);
        int exp = fourth;
        assertThat(res).isEqualTo(exp);
    }
}