package factory_method;

public class NewJeep implements Car {
    @Override
    public void drive() {
        System.out.println("New jeep drive");
    }

    @Override
    public void stop() {
        System.out.println("New jeep stop");
    }
}
