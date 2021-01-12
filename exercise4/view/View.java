package by.jonline.grow.basicsofoop.exercise4.view;

import by.jonline.grow.basicsofoop.exercise4.bean.Treasure;
import by.jonline.grow.basicsofoop.exercise4.exception.DataNotFoundException;
import by.jonline.grow.basicsofoop.exercise4.logic.Logic;

import java.io.IOException;
import java.util.List;

public class View {

    public void outMostExpensive() throws IOException, ClassNotFoundException {

        Logic logic = new Logic();
        Treasure treasure;

        treasure = logic.getMostExpensive();

        System.out.println("the most expensive is " + treasure.getName() + '.' + " the cost of " + treasure.getName() + " is " + treasure.getCost());


    }

    public void outByCost(double cost) throws IOException, ClassNotFoundException {

        Logic logic = new Logic();
        List<Treasure> treasureList;

        try {

            treasureList = logic.getByCost(cost);

            for (Treasure treasure : treasureList) {
                System.out.println(treasure);
            }

        } catch (DataNotFoundException e) {
            System.out.println("nothing");
        }

    }

}
