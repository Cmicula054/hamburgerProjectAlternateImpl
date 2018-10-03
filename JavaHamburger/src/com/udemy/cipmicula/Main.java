package com.udemy.cipmicula;


public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("normal", "beef", 7.25);


        hamburger.addItem("pickles");
        hamburger.getPrice();


    }
}
