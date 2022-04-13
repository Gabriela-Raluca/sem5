package ro.ase.cts.Builder;

public class AutoturismBuilder implements Builder {

    private String sasiu;
    private String producator;
    private int roti;
    private String interior;

    @Override
    public Builder buildSasiu() {
        this.sasiu="WBAG83623";
        return this;
    }

    @Override
    public Builder buildProducator() {
        this.producator="BMW";
        return this;
    }

    @Override
    public Builder buildRoti() {
        this.roti=4;
        return this;
    }


    @Override
    public Builder buildInterior() {
        this.interior="piele";
        return this;
    }

    @Override
    public Automobil getAutomobil() {
        return new Automobil(sasiu,producator,roti,interior);
    }
}
