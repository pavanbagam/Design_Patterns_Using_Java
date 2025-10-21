package creational.abstract_factory.factories;

import creational.abstract_factory.products.Burger;
import creational.abstract_factory.products.ClassicBurger;
import creational.abstract_factory.products.ClassicPizza;
import creational.abstract_factory.products.Pizza;

public class ClassicRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new ClassicBurger();
    }

    @Override
    public Pizza createPizza() {
        return new ClassicPizza();
    }

}
