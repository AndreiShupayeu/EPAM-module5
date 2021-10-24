package by.epam.module5.task4.cave;

import by.epam.module5.task4.cave.Cave;
import by.epam.module5.task4.dragon.Dragon;
import by.epam.module5.task4.treasure.Treasure;

import java.util.List;
import java.util.Scanner;

public class CaveUI {
    private final Cave cave;
    private CaveUtil caveUtil;
    private CaveLogic caveLogic;
    private final Dragon dragon;

    public CaveUI(Cave cave, CaveUtil caveUtil, CaveLogic caveLogic, Dragon dragon) {
        this.cave = cave;
        this.caveUtil = caveUtil;
        this.caveLogic = caveLogic;
        this.dragon = dragon;
    }

    public CaveUI(Cave cave, Dragon dragon) {
        this.cave = cave;
        this.dragon = dragon;
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, my name is " + dragon.getName() + ", i am " + dragon.getAge() + " years old!");
        printMainMenu(in);
    }

    private void printMainMenu(Scanner in) {

        boolean running = true;

        while (running) {
            System.out.println("Maybe i'll eat you, but for now choose:" + "\n");
            System.out.println("1) Show the most expensive treasure.");
            System.out.println("2) Show the heaviest treasure.");
            System.out.println("3) Show treasures for stated sum.");
            System.out.println("4) Exit.");

            int choice = 0;

            while (choice <= 0 || choice > 4) {
                if (in.hasNextInt()) {
                    choice = in.nextInt();
                    if (choice <= 0 || choice > 4) {
                        System.out.println("You should enter digit from 1 to 4.");
                    }
                } else {
                    System.out.println("You should enter digit.");
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("The most expensive treasure:");
                    System.out.println(caveLogic.getMostExpensiveTreasure());
                    break;
                case 2:
                    System.out.println("The heaviest treasure:");
                    System.out.println(caveLogic.getHeaviestTreasure());
                    break;
                case 3:
                    printMethodTreasuresByPrice(in);
                    break;
                case 4:
                    running = false;
            }
        }
    }

    private void printMethodTreasuresByPrice(Scanner in) {
        System.out.println("How much money do you have?");
        int sum = in.nextInt();

        List<Treasure> treasures = caveLogic.getTreasuresByPrice(sum);
        if (treasures.isEmpty()) {
            System.out.println("You are too poor. My treasures are more expensive!");
        } else {
            System.out.println("Treasures for specified amount:" + "\n" + treasures);
        }
    }
}
