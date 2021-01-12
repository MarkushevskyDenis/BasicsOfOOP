package by.jonline.grow.basicsofoop.exercise4.dao;

import by.jonline.grow.basicsofoop.exercise4.bean.Dragon;

import java.io.IOException;

public interface Dao {

     void save(Dragon dragon)throws IOException;
     Dragon get() throws IOException, ClassNotFoundException;

}
