package com.udemy.cipmicula;

import java.text.DecimalFormat;

public class Hamburger {

    private String breadRoll;
    private String meat;
    private double price;
    private boolean lettuce;
    private boolean tomato;
    private boolean pickles;
    private boolean onions;
    private boolean deluxe;
    private boolean healthy;
    private int additions;

    public Hamburger(String breadRoll, String meat, double price) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDeluxe() {
        return deluxe;
    }

    public void setDeluxe(boolean deluxe) {
        this.deluxe = deluxe;
    }

    public int getAdditions() {
        return additions;
    }

    public void setAdditions(int additions) {
        this.additions = additions;
    }

    public void getPrice() {
        if (additions < 1 && !isDeluxe() && !isHealthy()) {
            System.out.println("base price " + price);
        }
        int isHealthy = isHealthy() ? 6 : 4;
        for (int i = 0; i < isHealthy; i++) {
            if (lettuce) {
                System.out.println("lettuce added + .50");
                this.lettuce = false;
            }
            if (tomato) {
                System.out.println("tomato added + .65");
                this.tomato = false;
            }
            if (pickles) {
                System.out.println("pickles added + .65");
                this.pickles = false;
            }
            if (onions) {
                System.out.println("onions added + .65");
                this.onions = false;
            }
        }
        System.out.println("total price = " + price);
    }

    public double price() {
        return this.price;
    }

    public void addItem(String item) {
        if (additions < 4 || isHealthy()) {
            switch (item.toLowerCase()) {
                case "lettuce":
                    this.lettuce = true;
                    this.price = Double.parseDouble(new DecimalFormat("##.####").format(this.price += .50));
                    System.out.println("+ lettuce");
                    additions++;
                    break;
                case "tomato":
                    this.tomato = true;
                    this.price = Double.parseDouble(new DecimalFormat("##.####").format(this.price += .65));
                    System.out.println("+ tomato");
                    additions++;
                    break;
                case "pickles":
                    this.pickles = true;
                    this.price = Double.parseDouble(new DecimalFormat("##.####").format(this.price += .65));
                    System.out.println("+ pickles");
                    additions++;
                    break;
                case "onions":
                    this.onions = true;
                    this.price = Double.parseDouble(new DecimalFormat("##.####").format(this.price += .65));
                    System.out.println("+ onions");
                    additions++;
                    break;

                default: {
                        System.out.println("Item does not come with burger");
                    }
            }
        } else {
            System.out.println("Unable to add anymore additions");
        }
    }
}
