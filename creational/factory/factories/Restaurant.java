package creational.factory.factories;

import creational.factory.products.Burger;

public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Ordering Burger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    protected abstract Burger createBurger();

}

