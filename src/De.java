/**
 * represente le dé du gobelet
 * @valeur valeur donnée par un dé
 */
public class De {
    private int valeur;

    /**
     * le constructeur initialisera la valeur du dé à 0
     */
    public De() {
        this.valeur = 0;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    /**
     * Methode permettant de simuler le lancé du dé,
     * génère une valeur comprise ente 1 et 6
     */
    public void lancer() {
        int valeur;
        int minValue = 1;
        int maxValue = 6;
        valeur = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
        setValeur(valeur);
    }
}
