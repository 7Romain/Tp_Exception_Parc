package fr.oz;

public class Scooter extends VehiculeAMoteur {

    public Scooter(String marque, String modele, float volume_reservoir) {
        super(marque, modele, volume_reservoir, volume_reservoir);
    }

    public String toString() {

        return "Je suis le véhicule " + marque + " " + modele + "\n il reste "
                + this.moteur.getVolume_reservoir() + " litres dans le reservoir .";

    }

    public void demarrer() {
        moteur.démarrer();
    }

    public void arreter() {
        moteur.arreter();
    }

    public void rouler(float consommation) throws ExceptionEssence {
        if (!moteur.démarrer()) {
            moteur.démarrer();
        }
        float carburant = moteur.utiliser(consommation);
        if (carburant <= 0.0) {
            throw new ExceptionEssence();
        }
    }

    public void faireLePlein(float carburant) {
        try {
            moteur.faireLePlein(carburant);
        } catch (ExceptionDepassementReservoir edr) {
            edr.getStackTrace();
        }

    }
}
