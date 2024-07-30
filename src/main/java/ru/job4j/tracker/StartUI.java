package ru.job4j.tracker;

/**
 * Консольное приложение для работы с классом ru.job4j.tracker.Tracker.
 *
 * @author Evgeniy Kapaev
 */
public class StartUI {

    /**
     * Инициализирует приложение и запускает выполнение различных
     * пользовательских действий.
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Выводит на экран меню доступных пользовательских действий.
     */
    private void showMenu(UserAction[] actions) {
        System.out.println("Меню:");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    /**
     * Запускает приложение.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
