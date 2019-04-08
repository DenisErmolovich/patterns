package decorator;

import decorator.decorators.BorderDecorator;
import decorator.decorators.ColorDecorator;
import decorator.objects.Component;
import decorator.objects.TextView;
import decorator.objects.Window;

public class TestDecorator {
    public static void main(String[] args) {
        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();

        Component textViewWithColor = new ColorDecorator(new TextView());
        textViewWithColor.draw();
    }
}
