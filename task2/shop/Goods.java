package by.epam.module5.task2.shop;

public abstract class Goods {
    private  String name;
    private  int prise;

    public Goods() {
    }

    public Goods(String name, int prise) {
        this.name = name;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public int getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                '}';
    }
}
