package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ItemAscByNameTest {

    @Test
    public void whenCompareAscByName() {

        List<Item> items = Arrays.asList(
                new Item("Petr"),
                new Item("Ivan"),
                new Item("Mihail"),
                new Item("Roman")
        );

        List<Item> expected = Arrays.asList(
                new Item("Ivan"),
                new Item("Mihail"),
                new Item("Petr"),
                new Item("Roman")
        );

        items.sort(new ItemAscByName());
        assertThat(expected, is(items));
    }
}
