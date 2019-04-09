package proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Image image = new RealImage("C:/image");
        sleep(2);
        image.display();

        System.out.println("Pause...");
        sleep(3);
        System.out.println("Resume =>");

        Image imageWithProxy = new ProxyImage("C:/image");
        sleep(2);
        imageWithProxy.display();
    }

    private static void sleep(int seconds) {
        try {
            Thread.sleep(1_000 * seconds);
        } catch (InterruptedException e) {
            System.err.println("Something went wrong... See stack trace below:");
            e.printStackTrace();
        }
    }
}
