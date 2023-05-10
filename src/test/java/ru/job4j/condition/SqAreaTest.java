package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
        public void whenP6K2Square2dot29() {
            int p = 7;
            int k = 3;
            double expected = 2.29;
            double out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
    }
}