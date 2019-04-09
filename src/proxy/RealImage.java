package proxy;

public class RealImage implements Image {
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Load " + file);
    }

    @Override
    public void display() {
        System.out.println("Display " + file);
    }
}
