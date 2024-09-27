package ru.job4j.tracker.comparator;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {
    @Test
    public void whenItemsAscSort() {
        List<Item> items = Arrays.asList(
                new Item(1, "Richard Hammond"),
                new Item(2, "Stig"),
                new Item(3, "Jeremy Clarkson"),
                new Item(4, "James May")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "James May"),
                new Item(1, "Jeremy Clarkson"),
                new Item(4, "Richard Hammond"),
                new Item(2, "Stig")
        );
        assertThat(items).isEqualTo(expected);
    }
}