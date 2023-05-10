package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
        public void whenP6K2Square2dot72() {
            int p = 7;
            double k = 2;
            double expected = 2.72;
            double out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
    }
}