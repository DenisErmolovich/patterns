package builder;

public class TestBuilder {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildName("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildSpeed(230)
                .build();
        System.out.println(car);
    }
}
