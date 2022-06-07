package fr.oz;

import javax.swing.JOptionPane;
import javax.swing.event.CellEditorListener;

public class App {
    public static void main(String[] args) {
        Voiture citroen = new Voiture("Citroen", "C5", 40.0f);

        for (int i = 0; i < 6; ++i) {
            try {
                citroen.rouler(10);
            } catch (ExceptionEssence ex) {
                System.out.println("Je suis le véhicule " + citroen.marque + " " + citroen.modele + "\n il reste "
                        + citroen.getVolume_reservoir() + " dans le réservoir et je viens de tomber en panne. ");
                JOptionPane.showMessageDialog(null,
                        ("Je suis le véhicule " + citroen.marque + " " + citroen.modele + "\n il reste "
                                + citroen.getVolume_reservoir()
                                + " dans le réservoir et je viens de tomber en panne. "),
                        ex.getMessage().toString(), JOptionPane.ERROR_MESSAGE);
                String resultat = JOptionPane.showInputDialog(null, "Veuillez saisir le nombre de litres SVP ");
                Integer ajout = new Integer(resultat);
                citroen.faireLePlein(ajout);
            }

        }
        JOptionPane.showMessageDialog(null,
                ("Je suis le véhicule " + citroen.marque + " " + citroen.modele + "\n il reste "
                        + citroen.getVolume_reservoir()
                        + " dans le réservoir. J'ai reçu au total " + citroen.getEssenceMise()
                        + " litres dans le réservoir."),
                "Message!", JOptionPane.INFORMATION_MESSAGE);

    }
}
