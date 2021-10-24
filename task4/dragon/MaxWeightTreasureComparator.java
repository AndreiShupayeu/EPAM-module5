package by.epam.module5.task4.dragon;

import by.epam.module5.task4.treasure.Treasure;

import java.util.Comparator;

public class MaxWeightTreasureComparator implements Comparator<Treasure> {


    @Override
    public int compare(Treasure o1, Treasure o2) {
        return o1.getWeight()-o2.getWeight();
    }
}
