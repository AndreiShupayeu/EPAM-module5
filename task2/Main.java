package by.epam.module5.task2;
//Создать класс Payment с внутренним классом, с помощью объектов которого
// можно сформировать покупку из нескольких товаров


import by.epam.module5.task2.customer_ui.CustomerUI;
import by.epam.module5.task2.payment.Payment;
import by.epam.module5.task2.shop.Food;
import by.epam.module5.task2.shop.Goods;
import by.epam.module5.task2.shop.ManufacturedGood;
import by.epam.module5.task2.shop.Shop;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment();

        CustomerUI customerUI = new CustomerUI(createShop(), payment);

        customerUI.start();
    }

    public static Shop createShop() {
        return new Shop(createListGoods());
    }

    public static ArrayList<Goods> createListGoods() {

        Goods goods = new Food("Bread", 10, 3);
        Goods goods1 = new Food("Milk", 8, 2);
        Goods goods2 = new Food("Meal", 20, 3);
        Goods goods3 = new ManufacturedGood("TV", 500, 3);
        Goods goods4 = new ManufacturedGood("Fridge", 400, 5);
        Goods goods5 = new ManufacturedGood("Telephone", 500, 1);

        ArrayList<Goods> list = new ArrayList<>();

        list.add(goods);
        list.add(goods1);
        list.add(goods2);
        list.add(goods3);
        list.add(goods4);
        list.add(goods5);

        return list;
    }
}
