package cz.czechitas.ukol3;

import cz.czechitas.ukol3.Disk;
import cz.czechitas.ukol3.Pamet;
import cz.czechitas.ukol3.Procesor;

import java.util.Objects;

public class Pocitac {

    private static boolean jeZapnuty;

    private Procesor cpu;

    private Pamet ram;

    private Disk pevnyDisk;

    private long velikostSouboru;


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

    public long getVelikostSouboru() {
        return velikostSouboru;
    }

    public void setVelikostSouboru(long velikostSouboru) {
        this.velikostSouboru = velikostSouboru;
    }

    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        Pocitac.jeZapnuty = jeZapnuty;
    }

    public void zapniSe() {
        if (Pocitac.jeZapnuty) {
            System.err.println("Pocitac je zapnuty.");
        } else {
            setJeZapnuty(true);
            System.out.println("Pocitac je zapnuty.");
        }
//
//        zapis 1 :
//
//        Procesor.requireNonNull(vyrobce);
//
//        zapis 2:
//
//        Objects.requireNonNull(Procesor);
//        Objects.requireNonNull(Pamet);
//        Objects.requireNonNull(Disk);
//
//        zapis 3 :

//        else if (Procesor == null) {
//            System.err.println("Chybi procesor.");
//            return;
//        } else if (Pamet == null) {
//            System.err.println("Chybi pamet.");
//            return;
//        } else if (Disk == null) {
//            System.err.println("Chybi disk.");
//            return;

    }

    public void vypniSe() {
        if (!Pocitac.jeZapnuty) {
            //-> do nothing
        } else {
            setJeZapnuty(false);
            System.out.println("Pocitac je vypnuty.");
        }
    }

    public void vytvorSouborOVelikosti(long velikostSouboru) {
        vyuziteMisto + velikostSouboru == vyuziteMisto;
    }

    public void vymazSouborOVelikosti(long velikostSouboru) {
        vyuziteMisto - velikostSouboru == vyuziteMisto;

    }

}