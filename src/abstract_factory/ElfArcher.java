package abstract_factory;

public class ElfArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Archer has shot!");
    }
}
