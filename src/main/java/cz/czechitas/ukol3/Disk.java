package cz.czechitas.ukol3;

public class Disk {

    private long kapacitaDisku;
    private long vyuziteMisto;

//    System.out.println("Kapacita disku je: " + kapacitaDisku)


    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    public long getKapacitaDisku() {
        return kapacitaDisku;
    }

    public void setKapacitaDisku(long kapacitaDisku) {
        this.kapacitaDisku = kapacitaDisku;
    }



}
