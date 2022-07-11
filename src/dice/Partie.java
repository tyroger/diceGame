package dice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partie {

    public List<Joueur> joueurs = new ArrayList<>(Arrays.asList());
    private int nb_tours;
    Gobelet gobelet;

    public Partie(int nb_tours, int nb_des) {
        this.setNb_tours(nb_tours);
    }

    public int getNb_tours() {
        return nb_tours;
    }

    public void setNb_tours(int nb_tours) {
        this.nb_tours = nb_tours;
    }


    /**
     * Inscription d'un joeur au tournois
     */
    public void initialiser(Joueur joueur) {
        joueurs.add(joueur);
    }

    /**
     * lancement de la partie où chaque joeur jour à son tour
     */
    public void lancerPartie() {
        for (Joueur joueur : joueurs
        ) {
            joueur.jouer(gobelet);
        }
    }

    /**
     * determiner qui est le gagnant de la partie
     */
    public void afficherGagnant() {
        int winningScore = joueurs.get(0).getScore();
        Joueur winner = joueurs.get(0);

        for (int i = 0; i < joueurs.size() - 1; i++) {
            if (joueurs.get(i).getScore() > winningScore) ;
            winningScore = joueurs.get(i).getScore();
            winner = joueurs.get(i);
        }
        System.out.println("Le gagnant est " + winner.getNom());
    }
}
