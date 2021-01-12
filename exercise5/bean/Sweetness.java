package by.jonline.grow.basicsofoop.exercise5.bean;

import java.util.Objects;

public class Sweetness {

    private double cost;
    private double weight;
    private double calories;


    public Sweetness() {
    }

    public Sweetness(double cost, double weight, double calories) {
        this.cost = cost;
        this.weight = weight;
        this.calories = calories;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweetness sweetness = (Sweetness) o;
        return Double.compare(sweetness.cost, cost) == 0 &&
                Double.compare(sweetness.weight, weight) == 0 &&
                Double.compare(sweetness.calories, calories) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, weight, calories);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{cost=" + cost +
                ", weight=" + weight +
                ", calories=" + calories +
                '}';
    }
}
