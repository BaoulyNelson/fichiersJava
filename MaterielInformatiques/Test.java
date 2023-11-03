import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        Main men = new Main();
        int choix = 0;

        do {
            afficherMenu();
            choix = scanner.nextInt();
            System.out.println();
            scanner.nextLine(); // Pour consommer le retour à la ligne

            switch (choix) {
                case 1:
                    men.enregistrerProduit();
                    break;
                case 2:
                    men.afficherProduits();
                    break;
                case 3:
                    men.modifierProduit();
                    break;
                case 4:
                    men.rechercherProduit();
                    break;
                case 5:
                    men.supprimerProduit();
                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        } while (choix != 6);
    }

    public static void afficherMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Enregistrer un produit");
        System.out.println("2. Afficher les produits");
        System.out.println("3. Modifier un produit");
        System.out.println("4. Rechercher un produit");
        System.out.println("5. Supprimer un produit");
        System.out.println("6. Quitter");
        System.out.print("Choix : ");
    }

}
