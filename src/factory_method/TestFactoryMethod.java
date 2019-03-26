package factory_method;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Car car = CarSelector.getInstance().getCar(RoadType.CITY);
        car.stop();

        car = CarSelector.getInstance().getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        car = CarSelector.getInstance().getCar(RoadType.MOUNTAINS);
    }
}
