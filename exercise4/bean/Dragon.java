package by.jonline.grow.basicsofoop.exercise4.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dragon implements Serializable {

   List<Treasure> treasures = new ArrayList<>();

    public Dragon() {
    }

    public Dragon(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dragon dragon = (Dragon) o;
        return Objects.equals(treasures, dragon.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treasures);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "treasures=" + treasures +
                '}';
    }
}
