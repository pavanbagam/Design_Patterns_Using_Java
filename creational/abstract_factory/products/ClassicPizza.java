package creational.abstract_factory.products;

public class ClassicPizza implements Pizza {

    @Override
    public void bake() {
        // Logic relevant to Classic Pizzas
        System.out.println("Baking Classic Pizza...");
    }

}