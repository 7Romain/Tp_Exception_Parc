package fr.oz;

import javax.swing.JOptionPane;

public class Moteur {
    String vol_Reservoir;
    float maxReservoir = 60;

    public float getMaxReservoir() {
        return maxReservoir;
    }

    public String toString() {
        return vol_Reservoir = String.valueOf(volume_reservoir);
    }

    public Moteur(float volume_reservoir, float volume_total, boolean démarré) {
        this.volume_reservoir = volume_reservoir;
        this.volume_total = volume_total;
        this.démarré = démarré;
    }

    public Moteur() {
        volume_reservoir = 0;
        volume_total = 0;
        démarré = false;
    }

    public Moteur(float volume_reservoir, float station) {
        this.volume_reservoir = volume_reservoir;
        this.essenceMise = station;
        volume_total = 0;
        démarré = false;
    }

    float volume_reservoir = 0;
    float volume_total = 0;
    boolean démarré = false;
    float essenceMise = 0;

    public float getVolume_reservoir() {
        return volume_reservoir;
    }

    public boolean isDémarré() {
        return démarré;
    }

    public boolean démarrer() {

        if (volume_reservoir > 0.1) {
            volume_reservoir -= 0.1;
            démarré = true;
            System.out.println("Le moteur est démarré avec " + volume_reservoir
                    + " litres dans le réservoir. \n Je viens de consommer 1/10 litre pour démarrer. ");

        } else {
            System.out.println("Pas assez de carburant pour démarrer");
            démarré = false;
        }
        return démarré;
    }

    public float utiliser(float consommation) {
        if (consommation <= (volume_reservoir - 0.1)) {
            volume_reservoir -= consommation;
            volume_total += consommation;
            System.out.println("Le moteur utilise " + consommation + " litres, il  reste "
                    + (volume_reservoir) + " litres dans le réservoir. \n Je viens de consommer " + volume_total
                    + " litres");
        } else {
            JOptionPane.showMessageDialog(null, "Il n'y a pas assez de carburant pour effectuer le trajet", "Attention",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out
                    .println("Le moteur utilise " + volume_reservoir
                            + " litre(s), il  reste 0 litre dans le réservoir. \n Panne d'essence");
            volume_reservoir -= volume_reservoir;
            volume_total = +volume_reservoir;
            démarré = false;

        }
        return volume_reservoir;

    }

    public void faireLePlein(float carburant) throws ExceptionDepassementReservoir {
        if (volume_reservoir + carburant > getMaxReservoir()) {
            throw (new ExceptionDepassementReservoir());
        }
        System.out.println("Le moteur est arreté. \n Je fais le plein avec " + carburant + " litres");
        volume_reservoir += carburant;
        essenceMise += carburant;
    }

    public void arreter() {
        System.out.println("je m'arrete");
    }
}
