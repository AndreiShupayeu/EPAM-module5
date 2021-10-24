package by.epam.module5.task2.payment;

import by.epam.module5.task2.shop.Goods;

import java.util.ArrayList;

public class Payment {
    String nameCustomer;
    String addressCustomer;
    int accountCustomer;

    public Payment(String nameCustomer, String addressCustomer, int accountCustomer) {
        this.nameCustomer = nameCustomer;
        this.addressCustomer = addressCustomer;
        this.accountCustomer = accountCustomer;
    }

    public Payment() {
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public void setAccountCustomer(int accountCustomer) {
        this.accountCustomer = accountCustomer;
    }

    public class CartCustomer {
        private ArrayList<Goods> goods;

        public CartCustomer() {
        }

        public CartCustomer(ArrayList<Goods> goods) {
            this.goods = goods;
        }

        public ArrayList<Goods> getGoods() {
            return goods;
        }

        public void setGoods(ArrayList<Goods> goods) {
            this.goods = goods;
        }

        public void appendGoods(ArrayList<Goods> goods) {
            if (this.goods == null) {
                setGoods(goods);
            } else {
                this.goods.add(goods.get(0));
            }
        }

        public int getTotalSum() {
            if (goods == null) {
                return 0;
            }
            int totalSum = 0;
            for (Goods g : goods) {
                totalSum += g.getPrise();
            }
            return totalSum;
        }

        public void makePayment() {
            System.out.println("From your account: " + Payment.this.accountCustomer + " debited:" + getTotalSum() +
                    " thank you! Except delivery.");
            goods = null;
        }

        @Override
        public String toString() {
            return "CartCustomer{" +
                    "goods=" + goods +
                    '}';
        }
    }
}
