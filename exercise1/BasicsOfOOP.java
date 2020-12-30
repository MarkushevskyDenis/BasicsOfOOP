package by.jonline.grow.basicsofoop.exercise1;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 */

public class BasicsOfOOP {
    public static void main(String[] args) {
        Directory directory = new Directory("F:\\jOnline\\");
        TextFile textFile = TextFile.create("HelloWord",directory);

        textFile.add("Тестовый текст. Тестовый текст1.");
        textFile.setTitle("Test");
        textFile.out();

    }
}
