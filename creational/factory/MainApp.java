package creational.factory;

import creational.factory.factories.ClassicRestaurant;
import creational.factory.factories.OrientalRestaurant;
import creational.factory.factories.Restaurant;

public class MainApp {

    public static void main(String[] args) {

        Restaurant orientalRestaurant = new OrientalRestaurant();
        orientalRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant classicRestaurant = new ClassicRestaurant();
        classicRestaurant.orderBurger();

    }

}
