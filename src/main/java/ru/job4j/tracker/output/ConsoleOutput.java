package ru.job4j.tracker.output;

/**
 * Реализация интерфейса Output - вывода в консоль.
 */
public class ConsoleOutput implements Output {
    @Override
    public void println(Object object) {
        System.out.println(object);
    }
}
