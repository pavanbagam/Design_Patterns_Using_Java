package creational;

public class MainApp {

    public static void main(String[] args) {

        System.out.println(Singleton.getInstance("Pavan"));
        Singleton singleton = Singleton.getInstance("Singleton");
        System.out.println(singleton);
        System.out.println(singleton.getData());

    }

}
