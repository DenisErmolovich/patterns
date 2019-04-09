package proxy;

public class ProxyImage implements Image {
    String file;
    RealImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (null == image) {
            image = new RealImage(file);
        }
        image.display();
    }
}
