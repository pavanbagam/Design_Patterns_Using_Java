package creational.abstract_factory.factories;

import creational.abstract_factory.products.Burger;
import creational.abstract_factory.products.Pizza;

public abstract class Restaurant {

    // Business logic can be added here or in another class

    public abstract Burger createBurger();

    public abstract Pizza createPizza();

}
