public class Joueur {

    private String nom;
    private int Score;


    public Joueur(String nom){
        this.setNom(nom);
        this.setScore(0);
    }

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
        Score = score;
    }

    public void jouer(Gobelet gobelet){}
    public void afficher_score(){}
}