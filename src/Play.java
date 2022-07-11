import dice.De;
import dice.Joueur;
import dice.Partie;
import dice.Gobelet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        String prenomJoueur;

        Scanner getInfo = new Scanner(System.in);

        System.out.println("entrez le nombre de tours :");
        int nbDes = getInfo.nextInt();

        List<De> listeDe = new ArrayList<>();

        for (int i = 0; i < nbDes; i++) {

            listeDe.add(new De());
        }
        Gobelet gobelet = new Gobelet(listeDe);


        System.out.println("nom du joeur :");
        prenomJoueur = getInfo.next();
        Joueur joueur1 = new Joueur("prenom");


        System.out.println("nom du joeur :");
        prenomJoueur = getInfo.next();
        Joueur joueur2 = new Joueur("prenomJoueur");


        Partie partie = new Partie(2,3);

        partie.initialiser(joueur1);
        partie.initialiser(joueur2);

        partie.lancerPartie();

    }
}
