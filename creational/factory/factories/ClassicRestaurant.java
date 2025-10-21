package creational.factory.factories;

import creational.factory.products.Burger;
import creational.factory.products.ClassicBurger;

public class ClassicRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        System.out.println("Creating Classic Burger...");
        return new ClassicBurger();
    }

}

