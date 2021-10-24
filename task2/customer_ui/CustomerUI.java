package by.epam.module5.task2.customer_ui;

import by.epam.module5.task2.shop.Shop;
import by.epam.module5.task2.payment.Payment;

import java.util.Scanner;

public class CustomerUI {
    private final Shop shop;
    private final Payment payment;

    public CustomerUI(Shop shop, Payment payment) {
        this.shop = shop;
        this.payment = payment;
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        Payment.CartCustomer cartCustomer = getCartCustomer(in);
        printMainMenu(in, cartCustomer);
    }

    private Payment.CartCustomer getCartCustomer(Scanner in) {

        System.out.println("Indicate your name:");
        payment.setNameCustomer(in.next());
        System.out.println("Indicate your address:");
        payment.setAddressCustomer(in.next());
        System.out.println("Indicate your account:");
        payment.setAccountCustomer(in.nextInt());

        return payment.new CartCustomer();
    }

    private void printMainMenu(Scanner in, Payment.CartCustomer cartCustomer) {
        boolean running = true;

        while (running) {

            System.out.println("Indicate your choice:");
            System.out.println("1) Choose goods.");
            System.out.println("2) Make a payment.");
            System.out.println("3) Exit.");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    printMenuGoods(in, cartCustomer);
                    break;
                case 2:
                    if (cartCustomer.getGoods() == null) {
                        System.out.println("First select the goods!" + "\n");
                    } else {
                        cartCustomer.makePayment();
                        System.out.println();
                    }
                    break;
                case 3:
                    running = false;
                    break;
            }
        }
    }

    private void printMenuGoods(Scanner in, Payment.CartCustomer cartCustomer) {

        System.out.println("Indicate type of goods:");
        System.out.println("1) Food.");
        System.out.println("2) Manufactured goods.");
        System.out.println("3) Main menu.");

        int choice = in.nextInt();

        switch (choice) {
            case 1:
                cartCustomer.appendGoods((shop.getList(getNameFood(in))));
                System.out.println(cartCustomer);
                break;
            case 2:
                cartCustomer.appendGoods(shop.getList(getNameManufactureGood(in)));
                System.out.println(cartCustomer);
                break;
            case 3:
                break;
        }
    }

    private String getNameFood(Scanner in) {
        int choiceFood = 0;

        while (choiceFood <= 0 || choiceFood > 3) {
            System.out.println("Indicate food:");
            System.out.println("1) Milk");
            System.out.println("2) Bread");
            System.out.println("3) Meat");

            choiceFood = in.nextInt();

            if (choiceFood <= 0 || choiceFood > 3) {
                System.out.println("Digit should be from 1 to 3!");
            }
        }

        String s = null;
        switch (choiceFood) {
            case 1:
                s = "Milk";
                break;
            case 2:
                s = "Bread";
                break;
            case 3:
                s = "Meat";
                break;
        }
        return s;
    }

    private String getNameManufactureGood(Scanner in) {
        int choiceManufactureGoods = 0;

        while (choiceManufactureGoods <= 0 || choiceManufactureGoods > 3) {

            System.out.println("Indicate goods:");
            System.out.println("1) TV");
            System.out.println("2) Fridge");
            System.out.println("3) Telephone");

            choiceManufactureGoods = in.nextInt();

            if (choiceManufactureGoods <= 0 || choiceManufactureGoods > 3) {
                System.out.println("Digit should be from 1 to 3!");
            }
        }

        String s = null;
        switch (choiceManufactureGoods) {
            case 1:
                s = "TV";
                break;
            case 2:
                s = "Fridge";
                break;
            case 3:
                s = "Telephone";
                break;
        }
        return s;
    }
}
