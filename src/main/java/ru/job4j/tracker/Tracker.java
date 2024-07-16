package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Консольное приложение Tracker.
 *
 * @author Evgeniy Kapaev
 */
public class Tracker {

    /**
     * Массив заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Уникальный номер добавленной заявки.
     */
    private int ids = 1;

    /**
     * Размер массива заявок.
     */
    private int size = 0;

    /**
     * Возвращает index заявки по id.
     *
     * @param id аргумент для поиска заявки.
     * @return индекс заявки в массиве.
     */
    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    /**
     * Добавляет заявку, переданную в аргументах в массив заявок items.
     *
     * @param item заявка.
     * @return добавленная заявка.
     */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * Возвращает копию массива items без null элементов(без пустых ячеек).
     *
     * @return копия массива items.
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    /**
     * Вывод заявок, у которых имя совпадает с аргументом(key)
     * для поиска.
     *
     * @param key аргумент для поиска заявок по имени.
     * @return результирующий массив заявок.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.size];
        int localSize = 0;
        for (int i = 0; i < this.size; i++) {
            if (items[i].getName().equals(key)) {
                result[localSize++] = items[i];
            }
        }
        return Arrays.copyOf(result, localSize);
    }

    /**
     * Вывод заявок, у которых id совпадает с аргументом(id)
     * для поиска.
     *
     * @param id аргумент для поиска заявок по id.
     * @return элемент массива заявок, соответствующий аргументу.
     */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * Замена заявки, найденной по id, на новую.
     *
     * @param id   id искомой заявки.
     * @param item новая заявка.
     * @return true или false.
     */
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items[index] = item;
        }
        return result;
    }
}