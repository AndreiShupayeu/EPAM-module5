package by.epam.module5.task4.treasure;

import java.io.Serializable;

public  class Treasure implements Serializable {
    protected int price;
    protected int weight;


    public Treasure(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public Treasure() {
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void changeWeight(int changelog) {
        this.weight *=changelog;
    }
    public void changePrise(int changelog) {
        this.price *=changelog;
    }



    @Override
    public String toString() {
        return "Treasure{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
