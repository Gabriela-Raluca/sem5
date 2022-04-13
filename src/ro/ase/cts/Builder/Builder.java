package ro.ase.cts.Builder;//constructia de ob plecand de la anumite detalii pe care le avem

public interface Builder {
    //metode de build pt comp automobilului

    public Builder buildSasiu();
    public Builder buildProducator();
    public Builder buildRoti();;
    public Builder buildInterior();

    public Automobil getAutomobil();
}
