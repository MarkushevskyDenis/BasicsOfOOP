package by.jonline.grow.basicsofoop.exercise5.bean;

import java.util.Objects;

public class Chocolate extends Sweetness {

    private String type;

    public Chocolate() {
    }

    public Chocolate(double cost, double weight, double calories, String type) {
        super(cost, weight, calories);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chocolate chocolate = (Chocolate) o;
        return Objects.equals(type, chocolate.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "type='" + type + '\'' +
                '}';
    }

}
