package structural.bridge;

import structural.bridge.abstractions.AmericanRestaurant;
import structural.bridge.abstractions.ItalianRestaurant;
import structural.bridge.abstractions.Restaurant;
import structural.bridge.implementations.PepperoniPizza;
import structural.bridge.implementations.VeggiePizza;

public class MainApp {

    public static void main(String[] args) {

        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }

}
