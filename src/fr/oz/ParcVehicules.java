package fr.oz;

public class ParcVehicules {
    final int TAILLE_DU_PARC = 7;
    VehiculeAMoteur[] vehicules = new VehiculeAMoteur[TAILLE_DU_PARC];

    public void controlerVehicules() {

        for (VehiculeAMoteur vehicule : vehicules) {
            System.out.println(vehicule);
        }

    }

}
