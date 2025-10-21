package structural.composite;
import structural.composite.products.Book;
import structural.composite.products.VideoGame;
public class MainApp {

    /*
     * Video Reference: https://youtu.be/oo9AsGqnisk
     */
    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(
                        new VideoGame("1", 100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("2", 200),
                                new Book("3", 300)
                        ),
                        new VideoGame("4", 400),
                        new VideoGame("5", 500)
                )
        );
        System.out.println(deliveryService.calculateOrderPrice());

    }

}
