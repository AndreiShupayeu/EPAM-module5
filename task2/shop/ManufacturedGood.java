package by.epam.module5.task2.shop;

public class ManufacturedGood extends Goods {
    private int warrantyPeriod;

    public ManufacturedGood(String name, int prise, int warrantyPeriod) {
        super(name, prise);
        this.warrantyPeriod = warrantyPeriod;
    }
}
