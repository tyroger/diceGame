package dice;

/**
 * Methode permettant de créer un joeur qui participe à une partie
 */
public class Joueur {

    private String nom;
    private int score;

// constructeur
    public Joueur(String nom){
        this.setNom(nom);
        this.setScore(0);
    }

    // getter & setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        score += score;
    }

    // methode
    public void jouer(Gobelet gobelet){
        gobelet.lancer();
        score += gobelet.getValeurLancer();
        gobelet.afficher_score();
    }
    public void afficher_score(){

        System.out.println("le score du joueur est de : " + this.getScore());
    }
}