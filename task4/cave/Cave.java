package by.epam.module5.task4.cave;

import by.epam.module5.task4.dragon.MaxPriceTreasureComparator;
import by.epam.module5.task4.dragon.MaxWeightTreasureComparator;
import by.epam.module5.task4.treasure.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cave {
    private final String name;
    private double square;
    private List<Treasure> treasures;

    public static int AMOUNT_OF_TREASURES_IN_CAVE = 100;
    public static int INITIAL_WEIGHT = 1;
    public static int PRICE_FOR_GOLD = 150;
    public static int PRICE_FOR_SILVER = 100;
    public static int PRICE_FOR_PLATINUM = 250;
    public static int PRICE_FOR_PALLADIUM = 180;
    public static int PRICE_FOR_DIAMOND = 200;
    public static int PRICE_FOR_SAPPHIRE = 170;
    public static int PRICE_FOR_EMERALD = 160;
    public static int PRICE_FOR_RUBY = 140;
    public static int INDEX_OF_CHANGE_WEIGHT_AND_PRICE = 3;


    public Cave(String name, double square, List<Treasure> treasures) {
        this.name = name;
        this.square = square;
        this.treasures = treasures;
    }

    public Cave(String name, double square) {
        this.name = name;
        this.square = square;
    }

    public Cave(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave cave = (Cave) o;
        return Double.compare(cave.square, square) == 0 && Objects.equals(name, cave.name) && Objects.equals(treasures, cave.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square, treasures);
    }

    @Override
    public String toString() {
        return "Cave{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", treasuresList=" + treasures +
                '}';
    }
}
