package facade;

public class Hdd {
    void copyFromDvd(DvdRom dvdRom) {
        if (dvdRom.hasData()) {
            System.out.println("HDD is coping data from DVD-ROM");
        } else {
            System.out.println("Put disc with data in DVD-ROM");
        }
    }
}
