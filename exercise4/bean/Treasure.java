package by.jonline.grow.basicsofoop.exercise4.bean;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable, Comparable {

    private String name;
    private String type;
    private double cost;


    public Treasure() {
    }

    public Treasure(String name, String type, double cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return Double.compare(treasure.cost, cost) == 0 &&
                Objects.equals(name, treasure.name) &&
                Objects.equals(type, treasure.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, cost);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                "}";
    }

    @Override
    public int compareTo(Object o) {

        Treasure treasure = (Treasure) o;

        if (this.cost > treasure.cost) {
            return 1;
        }

        if (this.cost < treasure.cost) {
            return -1;
        }

        return 0;
    }
}
