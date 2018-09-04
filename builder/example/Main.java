public class Main {

    public static void main() {
        Staff john = new Staff(new BigMeal());
        Meal definedMeal = john.makeMeal();
        SpecificMeal specificMeal = new SpecificMeal.Chef()
                .prepareBurger(new Burger("Double Cheesburger"))
                .prepareBeverage(new Beverage("Cola"))
                .prepareExtra(new Extra("Onion Rings"))
                .makeMeal();
        //give meals to client
    }
}
