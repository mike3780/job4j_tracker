package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ItemDescByNameTest {

    @Test
    public void whenCompareDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Petr"),
                new Item("Ivan"),
                new Item("Mihail"),
                new Item("Roman")
        );

        List<Item> expected = Arrays.asList(
                new Item("Roman"),
                new Item("Petr"),
                new Item("Mihail"),
                new Item("Ivan")

        );

        items.sort(new ItemDescByName());
        assertThat(expected, is(items));
    }
}
