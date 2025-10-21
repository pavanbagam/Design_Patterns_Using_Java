package creational.prototype;
// import lombok.ToString;

// @ToString(callSuper = true)
public class Car extends Vehicle {

    private final int topSpeed;

    public Car(String brand, String model, String color, int topSpeed) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
    }

    private Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Top Speed: " + topSpeed;
    }



    @Override
    public Car clone() {
        return new Car(this);
    }

}

