package bridge;

public class TestBridge {
    public static void main(String[] args) {
        Car car = new Sedan(new Skoda());
        car.showDetails();
    }
}
