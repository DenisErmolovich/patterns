package factory_method;

public class CarSelector {
    public static CarSelector instance;

    private CarSelector() {}

    public static CarSelector getInstance() {
        if (null == instance) {
            instance = new CarSelector();
        }
        return  instance;
    }

    public Car getCar (RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
            case MOUNTAINS:
                car = new NewJeep();
                break;
        }
        return car;
    }
}
