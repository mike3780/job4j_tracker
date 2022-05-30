package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLess0() {
        new Fact().calc(-1);
    }

    @Test
    public void when3then6() {
        int rsl = new Fact().calc(3);
        assertThat(rsl, is(6));
    }
}
