package creational.prototype;
// import lombok.Getter;
// import lombok.ToString;

// @Getter
// @ToString
public abstract class Vehicle {

    private final String brand;
    private final String model;
    private final String color;

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicle { " +
                "Brand: " + brand +
                ", Model: " + model +
                ", Color: " + color +
                " }";
    }
    

    public abstract Vehicle clone();

}

