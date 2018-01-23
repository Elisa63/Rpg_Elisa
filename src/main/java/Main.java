import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Combien de joueurs : ");
        int nbJoueurs = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < nbJoueurs; i++) {
            System.out.print("Nom du joueur " + (i + 1) + " : ");

        }

        System.out.println("Choix du personnage :");
        System.out.println("1. Guerrier (200 points de vie, 10 points de dégat :");
        String PersoGuerrier = scan.next();
        System.out.println("2. Mage (100 points de vie, 20 points dégat :");
        String PersoMage = scan.next();
        System.out.println("3. Soigneur (50 points de vie, 5 point de dégat :");
        String PersoSoigneur = scan.next();
        Perso monPerso = new Perso();
        Monstre monMonstre = new Monstre();






    }
}





