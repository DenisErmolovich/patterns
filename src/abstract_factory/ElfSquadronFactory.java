package abstract_factory;

public class ElfSquadronFactory extends SquadronFactory {
    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior crateWarrior() {
        return new ElfWarrior();
    }
}
