package creational.factory.factories;

import creational.factory.products.Burger;
import creational.factory.products.OrientalBurger;

public class OrientalRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        System.out.println("Creating Oriental Burger...");
        return new OrientalBurger();
    }

}

