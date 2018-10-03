package com.udemy.cipmicula;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("fatty bread", "fatty meat", 10.25);
        super.setDeluxe(true);
    }

    @Override
    public void addItem(String item) {
        System.out.println("Deluxe allows no further additions");
    }

    @Override
    public void getPrice() {
        super.getPrice();
    }
}
