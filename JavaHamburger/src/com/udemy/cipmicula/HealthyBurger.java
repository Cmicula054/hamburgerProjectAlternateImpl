package com.udemy.cipmicula;

import java.text.DecimalFormat;

public class HealthyBurger extends Hamburger {
    private boolean tofu;
    private boolean spinach;

    public HealthyBurger() {
        super("RyeBread", "lowFat", 8.40);
        super.setHealthy(true);
    }

    @Override
    public void getPrice() {
        for (int i = 0; i < 6; i++) {
            if (tofu) {
                System.out.println("tofu added + .50");
                this.tofu = false;
            } if (spinach) {
                System.out.println("spinach added + .50");
                this.spinach = false;
            }
        }
        super.getPrice();
    }

    @Override
    public void addItem(String item) {
        if(getAdditions() < 6) {
            super.addItem(item);
            switch (item.toLowerCase()) {
                case "tofu":
                    this.tofu = true;
                    this.setPrice(Double.parseDouble(new DecimalFormat("##.####").format(this.price() + .50)));
                    System.out.println("+ tofu");
                    setAdditions(getAdditions() + 1);
                    break;
                case "spinach":
                    this.spinach = true;
                    this.setPrice(Double.parseDouble(new DecimalFormat("##.####").format(this.price() + .50)));
                    System.out.println("+ spinach");
                    setAdditions(getAdditions() + 1);
                    break;
            }
        } else {
            System.out.println("Unable to add more than 6 items to healthy burger");
        }
    }
}
