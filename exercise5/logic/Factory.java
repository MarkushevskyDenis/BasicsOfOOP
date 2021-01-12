package by.jonline.grow.basicsofoop.exercise5.logic;

import by.jonline.grow.basicsofoop.exercise5.Exception.DataNotFoundException;
import by.jonline.grow.basicsofoop.exercise5.bean.Chocolate;
import by.jonline.grow.basicsofoop.exercise5.bean.Sweet;
import by.jonline.grow.basicsofoop.exercise5.bean.Sweetness;

public class Factory {

    public Sweetness getSweetness(char type)throws DataNotFoundException{

        Sweetness sweetness = null;

        if (type == 'c'){
            sweetness = new Chocolate();
        }else if (type == 's'){
            sweetness = new Sweet();
        }else{
            throw new DataNotFoundException("error input data");
        }

        return sweetness;
    }

}
