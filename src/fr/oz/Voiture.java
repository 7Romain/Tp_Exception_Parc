package fr.oz;

public class Voiture extends VehiculeAMoteur {

    public String volume_total;

    public Voiture(String marque, String modele, float volume_reservoir) {
        super(marque, modele, volume_reservoir, volume_reservoir);

    }

    public String toString() {

        return "Je suis le véhicule " + marque + " " + modele + "\n il reste "
                + this.moteur.getVolume_reservoir() + " litres dans le reservoir .";

    }

}
