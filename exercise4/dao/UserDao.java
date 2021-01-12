package by.jonline.grow.basicsofoop.exercise4.dao;

import by.jonline.grow.basicsofoop.exercise4.bean.Dragon;

import java.io.*;

public class UserDao implements Dao {

    public void save(Dragon dragon) throws IOException {

        try (FileOutputStream w = new FileOutputStream(System.getProperty("user.dir") + "\\by\\jonline\\grow\\basicsofoop\\exercise4\\resources\\treasure.ser");
             ObjectOutputStream writer = new ObjectOutputStream(w)) {

            writer.writeObject(dragon);

        }

    }

    public Dragon get() throws IOException, ClassNotFoundException {

        Dragon dragon;

        try (FileInputStream r = new FileInputStream(System.getProperty("user.dir") + "\\by\\jonline\\grow\\basicsofoop\\exercise4\\resources\\treasure.ser");
             ObjectInputStream reader = new ObjectInputStream(r)) {

            dragon = (Dragon) reader.readObject();

        }

        return dragon;
    }

}
