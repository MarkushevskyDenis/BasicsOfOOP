package by.jonline.grow.basicsofoop.exercise4.logic;

import by.jonline.grow.basicsofoop.exercise4.bean.Dragon;
import by.jonline.grow.basicsofoop.exercise4.bean.Treasure;
import by.jonline.grow.basicsofoop.exercise4.dao.UserDao;
import by.jonline.grow.basicsofoop.exercise4.exception.DataNotFoundException;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic {

    public Treasure getMostExpensive() throws IOException, ClassNotFoundException {

        Dragon dragon;
        List<Treasure> treasures;
        UserDao userDao = new UserDao();

        dragon = userDao.get();
        treasures = dragon.getTreasures();

        return Collections.max(treasures);

    }

    public List<Treasure> getByCost(double cost) throws IOException, ClassNotFoundException, DataNotFoundException {

        Dragon dragon;
        List<Treasure> treasures;
        List<Treasure> result;
        UserDao userDao = new UserDao();
        boolean q = false;

        result = new ArrayList<>();
        dragon = userDao.get();
        treasures = dragon.getTreasures();

        for (Treasure treasure : treasures) {
            if (treasure.getCost() == cost) {
                result.add(treasure);
                q = true;
            }
        }

        if (q) {
            return result;
        } else {
            throw new DataNotFoundException();
        }

    }

}
