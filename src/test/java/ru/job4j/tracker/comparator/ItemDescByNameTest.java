package ru.job4j.tracker.comparator;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {
    @Test
    public void whenItemsDescSort() {
        List<Item> items = Arrays.asList(
                new Item(1, "Richard Hammond"),
                new Item(2, "Stig"),
                new Item(3, "Jeremy Clarkson"),
                new Item(4, "James May")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "Stig"),
                new Item(4, "Richard Hammond"),
                new Item(1, "Jeremy Clarkson"),
                new Item(3, "James May")
        );
        assertThat(items).isEqualTo(expected);
    }
}