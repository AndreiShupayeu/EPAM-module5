package by.epam.module5.task2.shop;

import java.util.ArrayList;

public class Shop {

    ArrayList<Goods> list = new ArrayList<>();

    public Shop(ArrayList<Goods> list) {
        this.list = list;
    }

    public ArrayList<Goods> getList(String s) {
        ArrayList<Goods> result = new ArrayList<>();
        for (Goods goods : list) {
            if (s.equals(goods.getName())) {
                result.add(goods);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "list=" + list +
                '}';
    }
}
