package builder;

public class CarBuilder {
    String name;
    Transmission transmission;
    int speed;

    CarBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    CarBuilder buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    CarBuilder buildSpeed(int maxSpeed) {
        this.speed = maxSpeed;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setName(name);
        car.setTransmission(transmission);
        car.setMaxSpeed(speed);
        return car;
    }
}
