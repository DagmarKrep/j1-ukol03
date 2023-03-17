package cz.czechitas.ukol3;

public class Pocitac {

    private static boolean jeZapnuty;

    private boolean jeVypnuty;
    
    private Procesor cpu;

    private Pamet ram;

    private Disk pevnyDisk;


    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public boolean isJeZapnuty() {
        return this.jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    public void zapniSe() {
        setJeZapnuty( boolean Pocitac.jeZapnuty) {
            this.jeZapnuty = jeZapnuty;
            System.out.println("Pocitac je zapnuty.");
        }
    }

    public boolean isJeVypnuty () {
        return this.jeVypnuty;
    }

    public void setJeVypnuty ( boolean jeVypnuty) {
        this.jeVypnuty = jeVypnuty;
    }

    public void VypniSe () {
        setJeVypnuty( boolean jeVypnuty) {
            this.jeVypnuty = jeVypnuty;
            System.out.println("Pocitac je vypnuty.");
        }
    }

 if (Procesor == null) {
        System.err.println("Chybi procesor.");
        return;
    } else if (Pamet == null) {
        System.err.println("Chybi pamet.");
        return;
    } else if (Disk == null) {
        System.err.println("Chybi disk.");
        return;
    } else if (Pocitac.jeZapnuty) {
        System.err.println("Pocitac je zapnuty.");
        return;
    } else {
     zapniSe();
    }

}