package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", 3.56, "Sausage", "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.12);
        System.out.println("the total is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(5.67, "Bacon");
        healthyBurger.addHamburgerAddition1("tomato", 0.27);
        healthyBurger.addHealthyAddition1("carrots", 3.1);
        System.out.println(healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("ice cream" , 5.23);
        db.itemizeHamburger();

    }
}
