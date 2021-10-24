package by.epam.module5.task4.treasure;

import java.util.Objects;

public class PreciousMetal extends Treasure {
    private final Metal metals;

    public PreciousMetal(int weight, int price, Metal metals) {
        super(weight, price);
        this.metals = metals;
    }

    public PreciousMetal(PreciousMetal preciousMetal) {
        super.weight = preciousMetal.getWeight();
        super.price = preciousMetal.getPrice();
        this.metals = preciousMetal.getMetals();
    }

    public Metal getMetals() {
        return metals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreciousMetal that = (PreciousMetal) o;
        return metals == that.metals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(metals);
    }

    @Override
    public String toString() {
        return "PreciousMetal metal = " + metals + " weight: " + getWeight() + " kg price: " + getPrice() + " usd" + "\n";
    }
}
