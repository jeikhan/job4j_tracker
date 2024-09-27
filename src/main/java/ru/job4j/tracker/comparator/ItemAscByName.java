package ru.job4j.tracker.comparator;

import ru.job4j.tracker.Item;

import java.util.Comparator;

/**
 * Реализация сортировки списка по возрастанию.
 *
 * @author Evgeniy Kapaev
 * @since 27 Sep 2024
 */
public class ItemAscByName implements Comparator<Item> {
    @Override
    public int compare(Item left, Item right) {
        return left.getName().compareTo(right.getName());
    }
}