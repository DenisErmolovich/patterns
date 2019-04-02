package facade;

public class Computer {
    Power power = new Power();
    DvdRom dvdRom = new DvdRom();
    Hdd hdd = new Hdd();

    void copy() {
        power.on();
        dvdRom.load();
        hdd.copyFromDvd(dvdRom);
    }
}
