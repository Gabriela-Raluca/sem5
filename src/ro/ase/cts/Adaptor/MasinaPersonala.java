package ro.ase.cts.Adaptor;

public class MasinaPersonala implements Masina {
    @Override
    public void ruleaza() {
        System.out.println("Masina ruleaza cu 100km/h");
    }

    @Override
    public void claxoneaza() {
        System.out.println("Sunet strident");
    }
}
