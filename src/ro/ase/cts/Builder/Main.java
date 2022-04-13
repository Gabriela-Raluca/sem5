package ro.ase.cts.Builder;// BUILDER
//--Simulare fabricare masini--


public class Main {

    public static void main(String[] args) {

        InginerAuto i1=new InginerAuto("Autoturism");
        i1.builVehicul();
        Automobil autot=i1.getAutomobil();
        System.out.println(autot);

        InginerAuto i2=new InginerAuto("Camion");
        i2.builVehicul();
        Automobil camion=i2.getAutomobil();
        System.out.println(camion);
    }
}
