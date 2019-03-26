package builder;

public class Car {
    String name = "Default";
    Transmission transmission = Transmission.MANUAL;
    int maxSpeed = 120;

    public void setName(String name) {
        this.name = name;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("Car [name = %s, transmission = %s, speed = %s]", name, transmission, maxSpeed);
    }
}
