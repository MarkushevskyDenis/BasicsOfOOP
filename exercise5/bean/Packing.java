package by.jonline.grow.basicsofoop.exercise5.bean;

import java.util.Objects;

public class Packing {

    private String color;
    private String print;
    private double cost;

    public Packing() {
    }

    public Packing(String color, String print, double cost) {
        this.color = color;
        this.print = print;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrint() {
        return print;
    }

    public void setPrint(String print) {
        this.print = print;
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
        Packing packing = (Packing) o;
        return Double.compare(packing.cost, cost) == 0 &&
                Objects.equals(color, packing.color) &&
                Objects.equals(print, packing.print);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, print, cost);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{color='" + color + '\'' +
                ", print='" + print + '\'' +
                ", cost=" + cost +
                '}';
    }
}
