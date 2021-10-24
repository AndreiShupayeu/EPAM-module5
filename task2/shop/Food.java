package by.epam.module5.task2.shop;

public class Food extends Goods {
    private int expirationDate;

    public Food(String name, int prise, int expirationDate) {
        super(name, prise);
        this.expirationDate = expirationDate;
    }

}
