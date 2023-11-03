import java.util.Random;
import java.util.Scanner;

public class Separer{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int taille = 0,i=0;
        int[] tableau = new int[taille];
        int[] tPairs;
        int[] tImpairs;

        Random random = new Random();

        // Génération des 100 nombres entrelacés
        for (i = 0; i < taille; i++) {
            if (random.nextBoolean()) {
                tableau[i] = random.nextInt(100) * 2; // Génère un nombre pair
            } else {
                tableau[i] = random.nextInt(100) * 2 + 1; // Génère un nombre impair
            }
        }
 
    System.out.print("entrer la taille du tableau: ");
    taille=sc.nextInt();
    System.out.println(tableau[i]);
}
}
