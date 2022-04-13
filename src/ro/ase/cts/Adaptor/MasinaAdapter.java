package ro.ase.cts.Adaptor;

public class MasinaAdapter implements JucarieMobila{

    Masina masina;
    //dorim sa facem adaptor(transpunerea) de la Jucarie la o Masina Reala

    @Override
    public void seDeplaseaza() {

    }

    @Override
    public void emiteSunete() {

    }

    public MasinaAdapter (Masina masina){
        this.masina=masina;
    }
}
