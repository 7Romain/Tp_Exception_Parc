package fr.oz;

public abstract class Vehicule {

    public String getSimpleName;

    String getMarque() {
        return marque;

    }

    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    String marque;
    String modele;

}
