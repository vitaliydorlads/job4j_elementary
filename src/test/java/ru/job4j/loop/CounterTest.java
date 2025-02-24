package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumStart0AndFinish10Then55() {
        int start = 0, finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumStart3AndFinish8Then33() {
        int start = 3, finish = 8;
        int expected = 33;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumStart2AndFinish1Then0() {
        int start = 2, finish = 1;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenStart1AndFinish3Then2() {
        int start = 1, finish = 3;
        int expected = 2;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenStar0AndFinish15Then56() {
        int start = 0, finish = 15;
        int expected = 56;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenStartMinus5AndFinish0ThenMinus6() {
        int start = -5, finish = 0;
        int expected = -6;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}