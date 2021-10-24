package by.epam.module5.task4.cave;

import by.epam.module5.task4.dragon.MaxPriceTreasureComparator;
import by.epam.module5.task4.dragon.MaxWeightTreasureComparator;
import by.epam.module5.task4.treasure.Treasure;

import java.util.ArrayList;
import java.util.List;

public class CaveLogic {
    private final Cave cave;

    public CaveLogic(Cave cave){
        this.cave= cave;
    }
    List<Treasure> getTreasuresByPrice(int price) {
        List<Treasure> treasuresInRange = new ArrayList<>();
        for (Treasure treasure :cave.getTreasures()) {
            if (treasure.getPrice() <= price) {
                treasuresInRange.add(treasure);
            }
        }
        return treasuresInRange;
    }

    Treasure getMostExpensiveTreasure() {
        MaxPriceTreasureComparator maxPrice = new MaxPriceTreasureComparator();
        cave.getTreasures().sort(maxPrice);
        return cave.getTreasures().get(cave.getTreasures().size() - 1);
    }

    Treasure getHeaviestTreasure() {
        MaxWeightTreasureComparator maxWeight = new MaxWeightTreasureComparator();
        cave.getTreasures().sort(maxWeight);
        return cave.getTreasures().get(cave.getTreasures().size() - 1);
    }

}
