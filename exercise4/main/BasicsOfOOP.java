package by.jonline.grow.basicsofoop.exercise4.main;

import by.jonline.grow.basicsofoop.exercise4.view.View;
import by.jonline.grow.basicsofoop.exercise4.bean.Dragon;
import by.jonline.grow.basicsofoop.exercise4.bean.Treasure;
import by.jonline.grow.basicsofoop.exercise4.dao.Dao;
import by.jonline.grow.basicsofoop.exercise4.dao.UserDao;
import by.jonline.grow.basicsofoop.exercise4.exception.DataNotFoundException;

import java.io.IOException;
import java.util.Arrays;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Приложение должно быть объектно-, а не процедурно-ориентированным.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения данных можно использовать файлы.
 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
 * дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
 * выбора сокровищ на заданную сумму.
 */

public class BasicsOfOOP {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Treasure[] treasures = new Treasure[4];

        treasures[0] = new Treasure("лук Леголаса", "оружие", 500);
        treasures[1] = new Treasure("топор Гимли", "оружие", 50);
        treasures[2] = new Treasure("стрела Боромира", "секретное оружие", 5);
        treasures[3] = new Treasure("кольчуга Фродо", "броня", 500);

        Dragon dragon = new Dragon(Arrays.asList(treasures));
        View view = new View();

        Dao userDao = new UserDao();
        userDao.save(dragon);
        view.outByCost(500);
        view.outByCost(5);
        view.outByCost(0);
        view.outMostExpensive();



    }
}

