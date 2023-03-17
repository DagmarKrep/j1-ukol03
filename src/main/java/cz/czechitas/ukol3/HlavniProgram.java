package cz.czechitas.ukol3;

import cz.czechitas.ukol3.Disk;
import cz.czechitas.ukol3.Pamet;
import cz.czechitas.ukol3.Procesor;
import cz.czechitas.ukol3.Pocitac;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        Pocitac mujPocitac;
        mujPocitac = new Pocitac();
        System.out.println(mujPocitac.toString());
        mujPocitac.zapniSe();

        Disk mujDisk = new Disk();
        mujDisk.setKapacitaDisku(1_099_511_627_776L);
        mujDisk.setVyuziteMisto(511_627_776L);

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacitaPameti(48_000_000_000L);

        Procesor mujProcesor = new Procesor();
        mujProcesor.setVyrobce("Intel");
        mujProcesor.setRychlost(3_600_000_000L);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);

        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();

        System.out.println(mujPocitac.toString());

        System.out.println("Program spuštěn.");
        System.out.println("Kapacita disku: " + mujDisk.getKapacitaDisku() + " B ");
        System.out.println("Vyuzite misto na disku: " + mujDisk.getVyuziteMisto() + " B ");
        System.out.println(mojePamet);
        System.out.println("Vyrobce: " + mujProcesor.getVyrobce());
        System.out.println("Rychlost: " + mujProcesor.getRychlost() + " Hz ");

        mujPocitac.vypnise();
        mujPocitac.vypniSe();
        mujPocitac.vypniSe();

        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.

    }

}
