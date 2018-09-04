public class KidsMeal extends Cook {

    @Override
    public void prepareBurger() {
        meal.addBurger(new Burger("Cheeseburger"));
    }

    @Override
    public void prepareBeverage() {
        meal.addBeverage(new Beverage("Orange Juice"));
    }

    @Override
    public void prepareExtra() {
        meal.addExtra(new Extra("Apple"));
    }
}
