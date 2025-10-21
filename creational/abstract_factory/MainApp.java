package creational.abstract_factory;

import creational.abstract_factory.factories.ClassicRestaurant;
import creational.abstract_factory.factories.OrientalRestaurant;
import creational.abstract_factory.factories.Restaurant;
import creational.abstract_factory.products.Burger;
import creational.abstract_factory.products.Pizza;

public class MainApp {

    public static void main(String[] args) {

        Restaurant orientalRestaurant = new OrientalRestaurant();
        Restaurant classicRestaurant = new ClassicRestaurant();

        Pizza classicPizza = classicRestaurant.createPizza();
        Burger classicBurger = classicRestaurant.createBurger();
        Pizza orientalPizza = orientalRestaurant.createPizza();
        Burger orientalBurger = orientalRestaurant.createBurger();

    }

}
