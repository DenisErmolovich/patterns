package prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Human original = new Human(25, "Oleg");
        System.out.println(original);

        Human copy = (Human)original.copy();
        System.out.println(copy);
    }
}
