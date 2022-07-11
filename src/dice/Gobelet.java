package dice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * la classe represnte le gobelet utilisé pour la partie de dés
 */
public class Gobelet extends De {

    private int valeurLancer;
    public List<De> tableauDes;

    public Gobelet(List<De> tableauDes) {
        this.setValeurLancer(0);
        this.tableauDes = tableauDes;
        // nombre de dés nécéssaires
    }


    public void setValeurLancer(int valeurLancer) {
        this.valeurLancer = valeurLancer;
    }

    /**
     * générer un nombre de dés pour une partie, compris entre 2 et 4;
     * represente egalement la taille du tableau "Des"
     */
    public int nbDes() {
        int nb_des;
        int minValue = 2;
        int maxValue = 4;
        nb_des = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
        System.out.println("nombres de dés pour la partie : " + nb_des);
        return nb_des;
    }

    public int getValeurLancer() {
        valeurLancer = 0;
        for (De de : tableauDes
        ) {
            valeurLancer += de.getValeurDuDe();
        }
        return valeurLancer;

    }

    /**
     * lancé de dés
     */
    public void lancer() {
        for (De de : tableauDes
        ) {
            this.valeurLancer += de.getValeurDuDe();
        }
    }

    public void afficher_score() {
        System.out.println("la somme des dés du gobelet est de : " + this.valeurLancer);
    }
}
