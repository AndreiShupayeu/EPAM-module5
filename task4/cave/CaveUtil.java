package by.epam.module5.task4.cave;

import by.epam.module5.task4.treasure.*;

import java.util.ArrayList;
import java.util.List;

import static by.epam.module5.task4.cave.Cave.*;

public class CaveUtil {
    private Cave cave;

    public CaveUtil(Cave cave) {
        this.cave = cave;
    }

    public static List<Treasure> createTreasures() {

        List<Treasure> elementaryTreasuresList = createElementaryTreasuresList();

        List<Treasure> treasures = new ArrayList<>();

        while (treasures.size() < AMOUNT_OF_TREASURES_IN_CAVE) {
            for (int i = 0; i < elementaryTreasuresList.size(); i++) {
                treasures.add(elementaryTreasuresList.get(i));
                Treasure treasure;
                if (elementaryTreasuresList.get(i) instanceof PreciousMetal) {
                    treasure = new PreciousMetal((PreciousMetal) elementaryTreasuresList.get(i));
                } else {
                    treasure = new PreciousStone((PreciousStone) elementaryTreasuresList.get(i));
                }
                treasure.changePrise(INDEX_OF_CHANGE_WEIGHT_AND_PRICE);
                treasure.changeWeight(INDEX_OF_CHANGE_WEIGHT_AND_PRICE);
                elementaryTreasuresList.set(i, treasure);
            }
        }

        return treasures;
    }

    public static List<Treasure> createElementaryTreasuresList() {
        PreciousMetal preciousMetals = new PreciousMetal(INITIAL_WEIGHT, PRICE_FOR_GOLD, Metal.GOLD);
        PreciousMetal preciousMetals1 = new PreciousMetal(INITIAL_WEIGHT, PRICE_FOR_SILVER, Metal.SILVER);
        PreciousMetal preciousMetals2 = new PreciousMetal(INITIAL_WEIGHT, PRICE_FOR_PLATINUM, Metal.PLATINUM);
        PreciousMetal preciousMetals3 = new PreciousMetal(INITIAL_WEIGHT, PRICE_FOR_PALLADIUM, Metal.PALLADIUM);

        PreciousStone preciousStones = new PreciousStone(INITIAL_WEIGHT, PRICE_FOR_DIAMOND, Stone.DIAMOND);
        PreciousStone preciousStones1 = new PreciousStone(INITIAL_WEIGHT, PRICE_FOR_SAPPHIRE, Stone.SAPPHIRE);
        PreciousStone preciousStones2 = new PreciousStone(INITIAL_WEIGHT, PRICE_FOR_EMERALD, Stone.EMERALD);
        PreciousStone preciousStones3 = new PreciousStone(INITIAL_WEIGHT, PRICE_FOR_RUBY, Stone.RUBY);

        List<Treasure> elementaryTreasuresList = new ArrayList<>();
        elementaryTreasuresList.add(preciousMetals);
        elementaryTreasuresList.add(preciousMetals1);
        elementaryTreasuresList.add(preciousMetals2);
        elementaryTreasuresList.add(preciousMetals3);
        elementaryTreasuresList.add(preciousStones);
        elementaryTreasuresList.add(preciousStones1);
        elementaryTreasuresList.add(preciousStones2);
        elementaryTreasuresList.add(preciousStones3);

        return elementaryTreasuresList;
    }
}
