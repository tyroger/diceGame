package dice;

/**
 * represente le dé du gobelet
 * @valeur valeur donnée par un dé
 */
public class De {
    private int valeurDuDe;

    /**
     * le constructeur initialisera la valeur du dé à 0
     */
    public De() {
        this.valeurDuDe = 0;
    }

    public int getValeurDuDe() {
        valeurDuDe = lancerDe();
        return valeurDuDe;
    }


    /**
     * Methode permettant de simuler le lancé du dé,
     * génère une valeur comprise ente 1 et 6
     */
    public int lancerDe() {
        int valeur;
        int minValue = 1;
        int maxValue = 6;
        valeur = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
        return valeur;
    }
}
