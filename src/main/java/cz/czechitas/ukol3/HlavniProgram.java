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

//        Pocitac mujPocitac;
//        mujPocitac = new Pocitac();
//        System.out.println(mujPocitac.toString());
//        mujPocitac.zapniSe();

        Disk mujDisk = new Disk();
        mujDisk.setKapacitaDisku(1_099_511_627_776L);
        mujDisk.setVyuziteMisto(511_627_776L);

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacitaPameti(48_000_000_000L);

        Procesor mujProcesor = new Procesor();
        mujProcesor.setVyrobce("Intel");
        mujProcesor.setRychlost(3_600_000_000L);

        @Override
        public String toString() {
            return "Disk {" +
                    " kapacita disku: " + kapacitaDisku + " B " +
                    ", vyuzite misto: " + vyuziteMisto + " B " +
                    '}';
        }

        @Override
        public String toString() {
            return "Pamet: " + kapacitaPameti + " B ";
        }

        @Override
        public String toString() {
            return "Procesor {" +
                    " vyrobce: " + vyrobce +
                    ", rychlost: " + rychlost + " Hz "
                    '}';
        }


        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.


        System.out.println("Program spuštěn.");
    }

}
