package ro.ase.cts.Builder;

public class Automobil  {
    private String sasiu;
    private String producator;
    private int roti;
    private String interior;

    public Automobil(String sasiu, String producator, int roti, String interior) {
    this.sasiu=sasiu;
    this.producator=producator;
    this.roti=roti;
    this.interior=interior;
    }


    //nu instantiem obiectele-->fol clasa ro.ase.cts.Builder


    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setRoti(int roti) {
        this.roti = roti;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "ro.ase.cts.Automobil{" +
                "sasiu='" + sasiu + '\'' +
                ", producator='" + producator + '\'' +
                ", roti=" + roti +
                ", interior='" + interior + '\'' +
                '}';
    }
}
