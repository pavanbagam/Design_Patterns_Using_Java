package creational.abstract_factory.factories;
import creational.abstract_factory.products.Burger;
import creational.abstract_factory.products.OrientalBurger;
import creational.abstract_factory.products.OrientalPizza;
import creational.abstract_factory.products.Pizza;
public class OrientalRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new OrientalBurger();
    }

    @Override
    public Pizza createPizza() {
        return new OrientalPizza();
    }

}