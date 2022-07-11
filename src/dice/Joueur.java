package dice;

/**
 * Methode permettant de créer un joeur qui participe à une partie
 */
public class Joueur {

    private String nom;
    private int Score;

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
        return Score;
    }

    public void setScore(int score) {
        Score += score;
    }

    // methode
    public void jouer(Gobelet gobelet){
        gobelet.lancer();
        this.setScore(gobelet.getValeurLancer());
    }
    public void afficher_score(){

        System.out.println("le score du joueur est de : " + this.getScore());
    }
}