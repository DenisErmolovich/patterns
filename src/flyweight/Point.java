package flyweight;

public class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("(%s, %s): рисуем точку", x, y));
    }
}
