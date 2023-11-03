import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Produit> produits = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void enregistrerProduit() {
        System.out.println("=== Enregistrer un produit ===");
      
        System.out.print("Entrer la Marque(HP,Dell,Lenovo,Asus,Apple,Acer): ");
        String marque = scanner.nextLine();
        System.out.print("Entrer la Date de fabrication : ");
        String dateFabrication = scanner.nextLine();
        System.out.print("Entrer le Prix : ");
        double prix = scanner.nextDouble();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        System.out.println("Type de produit (1: Ordinateur, 2: Imprimante, 3: Scanner) : ");
        int typeProduit = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        switch (typeProduit) {
            case 1:
            System.out.println("Type d'ordinateur (1: Ordinateur de bureau, 2: Ordinateur portable) : ");
            int typeOrdinateur = scanner.nextInt();
            scanner.nextLine(); // Pour consommer le retour à la ligne

            if (typeOrdinateur == 1) {
                System.out.print("Entrer le Processeur(IntelCore,i5,AMD,Rysen7,Qualcomm): ");
                String processeur = scanner.nextLine();
                System.out.print("Entrer la RAM (en Go) : ");
                int ram = scanner.nextInt();
                System.out.print("Entrer le Disque dur (en Go) : ");
                int disqueDur = scanner.nextInt();
                scanner.nextLine(); // Pour consommer le retour à la ligne
                System.out.print("Entrer le Système d'exploitation(Windows,macOSBigSur,LinuxUbuntu,Chrome OS: ");
                String systemeExploitation = scanner.nextLine();
                System.out.print("Entrer la Carte graphique(NVIDIA GeForce, RTX 3080,AMD Radeon,RX 6800XT,Intel Iris, Xe Graphics,NVIDIA,Quadro P5000) : ");
                String carteGraphique = scanner.nextLine();

                produits.add(new Ordinateur(0, marque, dateFabrication, prix,
                        processeur, ram, disqueDur, systemeExploitation, carteGraphique));
        System.out.println("ordinateur de bureau enregistré avec succès !");

            } else if (typeOrdinateur == 2) {
                System.out.print("Entrer le Processeur(IntelCore,i5,AMD,Rysen7,Qualcomm): ");
                String processeur = scanner.nextLine();
                System.out.print("Entrer la RAM (en Go) : ");
                int ram = scanner.nextInt();
                System.out.print("Entrer le Disque dur (en Go) : ");
                int disqueDur = scanner.nextInt();
                scanner.nextLine(); // Pour consommer le retour à la ligne
                System.out.print("Entrer le Système d'exploitation(Windows,macOSBigSur,LinuxUbuntu,Chrome OS: ");
                String systemeExploitation = scanner.nextLine();
                System.out.print("Entrer le Type d'écran(LCD,LED,IPS,OLED) : ");
                String typeEcran = scanner.nextLine();
                System.out.print("Entrer la Taille d'écran : ");
                double tailleEcran = scanner.nextDouble();
                scanner.nextLine(); // Pour consommer le retour à la ligne

                produits.add(new Ordinateur(0, marque, dateFabrication, prix,
                        processeur, ram, disqueDur, systemeExploitation, typeEcran, tailleEcran));
        System.out.println("ordinateur portable enregistré avec succès !");

            } else {
                System.out.println("Type d'ordinateur invalide. Opération annulée.");
            }
            break;
            case 2:
                System.out.print("Entrer le Type d'imprimante(Laser,Jet d'encre,Thermique,3D): ");
                String typeImprimante = scanner.nextLine();
                System.out.print("Entrer la Résolution : ");
                int resolutionImprimante = scanner.nextInt();
                System.out.print("Entrer la Vitesse d'impression : ");
                int vitesseImpression = scanner.nextInt();
                scanner.nextLine(); // Pour consommer le retour à la ligne

                produits.add(new Imprimante(0, marque, dateFabrication, prix,
                        typeImprimante, resolutionImprimante, vitesseImpression));
        System.out.println("imprimante enregistré avec succès !");

                break;

            case 3:
                System.out.print("Entrer la Résolution du scanner : ");
                int resolutionScanner = scanner.nextInt();
                scanner.nextLine(); // Pour consommer le retour à la ligne

                produits.add(new Scanners(0, marque, dateFabrication, prix, resolutionScanner));
        System.out.println("scanners enregistré avec succès !");

                break;

            default:
                System.out.println("Type de produit invalide. Opération annulée.");
                break;
        }

        System.out.println("fin des enregistrements des produits !\n");
    }

    public  void afficherProduits() {
        System.out.println("=== Liste des produits ===");

        if (produits.isEmpty()) {
            System.out.println("Aucun produit enregistré.");
        } else {
            for (Produit produit : produits) {
                System.out.println(produit.toString());
            }
        }
    }

    public  void modifierProduit() {
        System.out.println("=== Modifier un produit ===");
        System.out.print("Numéro de référence du produit à modifier : ");
        int numeroReference = scanner.nextInt();

        Produit produitTrouve = null;
        for (Produit produit : produits) {
            if (produit.getNumeroReference()==(numeroReference)) {
                produitTrouve = produit;
                break;
            }
        }

        if (produitTrouve != null) {
            System.out.println("Nouvelles informations :");

            System.out.print("Entrer la Nouvelle marque : ");
            String nouvelleMarque = scanner.nextLine();
            produitTrouve.setMarque(nouvelleMarque);

            System.out.print("Entrer la Nouvelle date de fabrication : ");
            String nouvelleDateFabrication = scanner.nextLine();
            produitTrouve.setDateFabrication(nouvelleDateFabrication);

            System.out.print("Entrer le Nouveau prix : ");
            double nouveauPrix = scanner.nextDouble();
            produitTrouve.setPrix(nouveauPrix);

            System.out.println("Produit modifié avec succès !");
        } else {
            System.out.println("Aucun produit trouvé avec le numéro "+numeroReference+ " spécifié.");
        }
    }

    public  void rechercherProduit() {
        System.out.println("=== Rechercher un produit ===");
        System.out.print("Numéro de référence du produit recherché : ");
        int numeroReference = scanner.nextInt();

        Produit produitTrouve = null;
        for (Produit produit : produits) {
            if (produit.getNumeroReference()==(numeroReference)) {
                produitTrouve = produit;
                break;
            }
        }

        if (produitTrouve != null) {
            System.out.println("Produit trouvé :");
            System.out.println(produitTrouve.toString());
        } else {
            System.out.println("Aucun produit trouvé avec le numéro "+numeroReference+ " spécifié.");
        }
    }

    public void supprimerProduit() {
        System.out.println("=== Supprimer un produit ===");
        System.out.print("Numéro de référence du produit à supprimer : ");
        int numeroReference = scanner.nextInt();

        Produit produitTrouve = null;
        for (Produit produit : produits) {
            if (produit.getNumeroReference()==(numeroReference)) {
                produitTrouve = produit;
                break;
            }
        }

        if (produitTrouve != null) {
            produits.remove(produitTrouve);
            System.out.println("Produit supprimé avec succès !");
        } else {
            System.out.println("Aucun produit trouvé avec le numéro " +numeroReference+ " spécifié.");
        }
    }

}
