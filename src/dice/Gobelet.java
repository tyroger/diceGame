package dice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Gobelet extends De {

    private int valeurLancer;
    public List<De> tableauDes = new ArrayList<>(Arrays.asList());
    int nb_des = nbDes();

    public Gobelet() {
        this.setValeurLancer(0);
        // nombre de dés nécéssaires
        for (int i = 0; i < nb_des; i++) {
            De de = new De();
            tableauDes.add(i, de);
        }
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
            tableauDes.remove(de);
        }
        for (int i = 0; i < nb_des; i++) {
            De de = new De();
            tableauDes.add(de);
        }
    }

    public void afficher_score() {
        int score = 0;
        for (De de : tableauDes) {
            score += de.getValeurDuDe();
        }
        System.out.println("la somme des dés du gobelet est de : " + score);
    }
}
