package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Консольное приложение Tracker.
 *
 * @author Evgeniy Kapaev
 */
public class Tracker {

    /**
     * Массив заявок.
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Уникальный номер добавленной заявки.
     */
    private int ids = 1;

    /**
     * Возвращает index заявки по id.
     *
     * @param id аргумент для поиска заявки.
     * @return индекс заявки в массиве.
     */
    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
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
        items.add(item);
        return item;
    }

    /**
     * Возвращает копию массива items без null элементов(без пустых ячеек).
     *
     * @return копия массива items.
     */
    public List<Item> findAll() {
        return List.copyOf(items);
    }

    /**
     * Вывод заявок, у которых имя совпадает с аргументом(key)
     * для поиска.
     *
     * @param key аргумент для поиска заявок по имени.
     * @return результирующий массив заявок.
     */
    public List<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
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
        return index != -1 ? items.get(index) : null;
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
            items.set(index, item);
        }
        return result;
    }

    /**
     * Удаление заявки, найденной по id.
     *
     * @param id id искомой заявки.
     */
    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
        }
    }
}