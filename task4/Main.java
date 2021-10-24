package by.epam.module5.task4;

//Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Приложение должно быть объектно-, а не процедурно-ориентированным.
//• Каждый класс должен иметь отражающее смысл название и информативный состав.
//• Наследование должно применяться только тогда, когда это имеет смысл.
//• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//• Классы должны быть грамотно разложены по пакетам.
//• Консольное меню должно быть минимальным.
//• Для хранения данных можно использовать файлы.
//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//выбора сокровищ на заданную сумму.

import by.epam.module5.task4.cave.Cave;
import by.epam.module5.task4.cave.CaveLogic;
import by.epam.module5.task4.cave.CaveUI;
import by.epam.module5.task4.cave.CaveUtil;
import by.epam.module5.task4.dragon.Dragon;
import by.epam.module5.task4.treasure.Treasure;


import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Dragon dragon = new Dragon("Smoug", 10000);
        List<Treasure> treasures = CaveUtil.createTreasures();
        System.out.println(treasures.size());
//        Cave cave = new Cave("TheCoolest", 1000, treasures);
//        CaveUtil caveUtil= new CaveUtil(cave);
//        CaveLogic caveLogic = new CaveLogic(cave);
//        CaveUI caveUI = new CaveUI(cave, caveUtil, caveLogic, dragon);
//        caveUI.start();
    }
}
 /*   Для хранения сокровищ (последующего обращения к сокровищам) можно использовать файл.

//        FileOutputStream fos= new FileOutputStream("D:\\treasures.bin");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        oos.writeObject(treasuresList);
//        fos.close();
//
//        FileInputStream fis = new FileInputStream("D:\\treasures.bin");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        List<Treasures> treasures= (List<Treasures>)ois.readObject();
//        ois.close();
*/