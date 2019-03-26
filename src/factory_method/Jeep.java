package factory_method;

public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("Jeep drive");
    }

    @Override
    public void stop() {
        System.out.println("Jeep stop");
    }
}
