package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
        public void whenP6K2Square3() {
            int p = 7;
            double k = 2;
            int expected = 3;
            double out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
    }
}