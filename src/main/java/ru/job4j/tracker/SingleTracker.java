package ru.job4j.tracker;

/**
 * Реализация методов класса Tracker через
 * шаблон Singleton.
 *
 * @author Evgeniy Kapaev
 * @since 03-Sep-24
 */
public final class SingleTracker {
    private static SingleTracker singleTracker;
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (singleTracker == null) {
            singleTracker = new SingleTracker();
        }
        return singleTracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public boolean replace(int id, Item newItem) {
        return tracker.replace(id, newItem);
    }

    public void delete(int id) {
        tracker.delete(id);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }
}
