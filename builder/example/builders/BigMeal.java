public class BigMeal extends Cook {

    @Override
    public void prepareBurger() {
        meal.addBurger(new Burger("Bacon Burger"));
    }

    @Override
    public void prepareBeverage() {
        meal.addBeverage(new Beverage("Lager Beer"));
    }

    @Override
    public void prepareExtra() {
        meal.addExtra(new Extra("French fries"));
    }
}
