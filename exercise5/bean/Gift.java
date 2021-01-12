package by.jonline.grow.basicsofoop.exercise5.bean;

import java.util.Arrays;
import java.util.Objects;

public class Gift {

    private Sweet[] sweets;
    private Packing packing;

    public Gift() {
    }

    public Gift(Sweet[] sweets, Packing packing) {
        this.sweets = sweets;
        this.packing = packing;
    }

    public Sweet[] getSweets() {
        return sweets;
    }

    public void setSweets(Sweet[] sweets) {
        this.sweets = sweets;
    }

    public Packing getPacking() {
        return packing;
    }

    public void setPacking(Packing packing) {
        this.packing = packing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift = (Gift) o;
        return Arrays.equals(sweets, gift.sweets) &&
                Objects.equals(packing, gift.packing);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(packing);
        result = 31 * result + Arrays.hashCode(sweets);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{sweets=" + Arrays.toString(sweets) +
                ", packing=" + packing +
                '}';
    }
}
