package fr.oz;

public class ExceptionDepassementReservoir extends Exception {
    public static final long serialVersionUID = 2L;

    public ExceptionDepassementReservoir() {
        super("Le réservoir va déborder, mettez moins d'essence.");
    }

}
