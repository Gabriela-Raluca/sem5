package ro.ase.cts.Builder;

public class InginerAuto {
    Builder builder;

    public InginerAuto(String builderTip){
        if(builderTip.equals("Autoturism")){
            this.builder=new AutoturismBuilder();
        }
        else if (builderTip.equals("Camion")){
            this.builder=new CamionBuilder();
        }
    }

    public void builVehicul(){
        builder.buildInterior().buildRoti().buildSasiu().buildProducator();
    }

    public Automobil getAutomobil(){
        return builder.getAutomobil();
    }
}
