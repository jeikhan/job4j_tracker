# job4j_tracker &middot; ![CI GitHubAction](https://github.com/peterarsentev/job4j_tracker/actions/workflows/maven.yml/badge.svg) ![release](https://img.shields.io/badge/Release-stable-brightgreen)

Консольное приложение, которое хранит данные в формате "**Имя - Идентификатор(ID)**".

Приложение содержит следующие функции:
- **Добавление заявки**: пользователь вводит название заявки и программа присваивает ей уникальный ID.
- **Отображение списка всех заявок**: программа отображает список всех заявок.
- **Редактирование заявки**: пользователь вводит ID существующей заявки, затем вводит новое название, которым заменяется существующая, идентификатор не изменяется.
- **Удаление заявки**: пользователь вводит ID заявки и программа удаляет её.
- **Поиск заявки по ID**: программа отображает заявку по введенному ID.
- **Поиск заявки по имени**: программа отображает заявку(-и) по введенному имени.

## Документация

### Скачивание

Скачать последний релиз приложения `tracker.jar` по [ссылке](https://github.com/jeikhan/job4j/releases).

### Установка JRE

Для запуска приложения необходимо скачать и установить среду выполнения для Java:

- Установщик для **Windows**: [x32](https://javadl.oracle.com/webapps/download/AutoDL?BundleId=250127_d8aa705069af427f9b83e66b34f5e380) / [x64](https://javadl.oracle.com/webapps/download/AutoDL?BundleId=250129_d8aa705069af427f9b83e66b34f5e380)
- Терминал **Linux**: `sudo apt install default-jre`

### Запуск приложения

Запустить командную строку(Windows) или терминал(Linux) из папки со скаченным релизом и ввести команды для запуска приложения:
- Windows: `java -jar tracker.jar`
- Linux: `java -jar tracker.jar`

## Задачи

- [x] Обеспечить бесперебойную работу приложения.
- [ ] Внедрить шаблон Singleton.