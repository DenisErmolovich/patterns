package flyweight;

public class Square implements Shape {
    int a = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("(%s, %s): рисуем квадрат со стороной %s", x, y, a));
    }
}
