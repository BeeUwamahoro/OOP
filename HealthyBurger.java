package com.company;

public class HealthyBurger extends Hamburger {
    private String heatlhyExtra1Name;
    private double healthyExtra1Price;
    private String heatlhyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(double price, String meat) {
        super("Healthy", price, meat, "Brown Rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.heatlhyExtra1Name = name;
        this.healthyExtra1Price=price;
    }
    public void addHealthyAddition2(String name, double price){
        this.heatlhyExtra2Name = name;
        this.healthyExtra2Price=price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice= super.itemizeHamburger();
       if (this.heatlhyExtra1Name!=null){
           hamburgerPrice+=this.healthyExtra1Price;
           System.out.println("Added " +this.heatlhyExtra1Name + " for a extra " + this.healthyExtra1Price);
       }
        if (this.heatlhyExtra2Name!=null){
            hamburgerPrice+=this.healthyExtra2Price;
            System.out.println("Added " +this.heatlhyExtra2Name + " for a extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
