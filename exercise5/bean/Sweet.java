package by.jonline.grow.basicsofoop.exercise5.bean;

import java.util.Objects;

public class Sweet extends Sweetness {

    private String type;
    private String flavor;

    public Sweet() {
    }

    public Sweet(double cost, double weight, double calories, String type, String flavor) {
        super(cost, weight, calories);
        this.type = type;
        this.flavor = flavor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sweet sweet = (Sweet) o;
        return Objects.equals(type, sweet.type) &&
                Objects.equals(flavor, sweet.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, flavor);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{type='" + type + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}
