package flyweight;

public class Circle implements Shape {
    int r = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("(%s, %s): рисуем круг с радиусом %s", x, y, r));
    }
}
