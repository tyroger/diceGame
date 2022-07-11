import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gobelet extends De {

    private int valeurDes; // somme d'un lancé de gobelet
    public List<Integer> des = new ArrayList<>(Arrays.asList());


    public Gobelet() {
        super();
        this.valeurDes = 0;
        // générer le nombre de dés nécéssaires :
        int nb_des = nbDes();
        //ajouter les dés au tableaux
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

    /**
     * retourner la somme des dés du gobelet
     */
    public int getValeurDes() {
        int sum = 0;
        for (int de : des
        ) {
            sum += de;
        }
        return sum;
    }


    /**
     * change la valeur de chacun des dés du gobelet
     * met à jour la valeur du gobelet
     */
    public void lancer() {
        for (int i = 0; i < des.size(); i++) {
            des.set(i,lancerDe());
        }
        getValeurDes();
    }


    /**
     * affiche en console le score du dernier lancé de gobelet
     */
    public void afficher_score() {
        int sum = 0;
        for (int de : des
        ) {
            sum += de;
        }
        System.out.println("valeur du lancé : " + sum);
    }
}
