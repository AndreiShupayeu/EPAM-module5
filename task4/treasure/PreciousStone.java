package by.epam.module5.task4.treasure;

import java.util.Objects;

public class PreciousStone extends Treasure {
    private final Stone stones;

    public PreciousStone(int weight, int price, Stone stones) {
        super(weight, price);
        this.stones = stones;
    }
    public PreciousStone(PreciousStone preciousStone) {
        super.weight=preciousStone.getWeight();
        super.price =preciousStone.getPrice();
        this.stones = preciousStone.getStones();
    }

    public Stone getStones() {
        return stones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreciousStone that = (PreciousStone) o;
        return stones == that.stones;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stones);
    }

    @Override
    public String toString() {
        return "PreciousStone stone = " + stones + " weight: " + getWeight()+" kg price: " + getPrice()+" usd" + "\n";

    }
}
