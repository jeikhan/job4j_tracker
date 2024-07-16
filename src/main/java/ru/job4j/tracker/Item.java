package ru.job4j.tracker;

import java.time.LocalDateTime;

/**
 * Консольное приложение Tracker. Модель заявки.
 *
 * @author Evgeniy Kapaev
 */
public class Item {

    /**
     * Уникальный номер заявки.
     */
    private int id;

    /**
     * Содержит название заявки.
     */
    private String name;

    /**
     * Содержит дату создания заявки
     */
    private LocalDateTime created = LocalDateTime.now();

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}