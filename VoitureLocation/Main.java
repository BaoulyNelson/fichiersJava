import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        GestionCompagnieVoitures compagnie = new CompagnieVoitures();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Gestion de la compagnie de location de voitures ---");
            System.out.println("1. Enregistrer une voiture");
            System.out.println("2. Afficher toutes les voitures");
            System.out.println("3. Rechercher une voiture par son code");
            System.out.println("4. Modifier le prix de vente d'une voiture par son code");
            System.out.println("5. Supprimer une voiture par son code");
            System.out.println("6. Quitter");
            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            System.out.println();

            switch (choix) {
                case 1:
                scanner.nextLine();
                    System.out.print("Marque : ");
                    String marque = scanner.nextLine();
                    System.out.print("Modèle : ");
                    String modele = scanner.nextLine();
                    System.out.print("Nombre de cylindres : ");
                    int nombreCylindre = scanner.nextInt();
                    System.out.print("Prix : ");
                    double prix = scanner.nextDouble();
                    Voiture voiture = new Voiture(0, marque, modele, nombreCylindre, prix);
                    compagnie.enregistrerVoiture(voiture);
                    break;

                case 2:
                    compagnie.afficherToutesVoitures();
                    break;

                case 3:
                    System.out.print("Entrez le code de la voiture : ");
                    int codeRecherche = scanner.nextInt();
                    Voiture voitureTrouvee = compagnie.rechercherVoitureParCode(codeRecherche);
                    if (voitureTrouvee != null) {
                        System.out.println(voitureTrouvee);
                    } else {
                        System.out.println("Voiture non trouvée avec le code " + codeRecherche);
                    }
                    break;

                case 4:
                    System.out.print("Entrez le code de la voiture : ");
                    int codeModification = scanner.nextInt();
                    System.out.print("Nouveau prix : ");
                    double nouveauPrix = scanner.nextDouble();
                    compagnie.modifierPrixVoiture(codeModification, nouveauPrix);
                    break;

                case 5:
                    System.out.print("Entrez le code de la voiture à supprimer : ");
                    int codeSuppression = scanner.nextInt();
                    compagnie.supprimerVoitureParCode(codeSuppression);
                    System.out.println("voiture supprimee avec succes!");

                    break;

                case 6:
                    System.out.println("Au revoir !");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }
}
