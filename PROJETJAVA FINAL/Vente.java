//package Commandespackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Date;
import Commandespackage.Stationpackage.Station;

public class Vente {
    Scanner sc=new Scanner(System.in);
    private String id;
    private String nomStation;
    private int quantiteGallonDiesel;
    private int quantiteGallonGazoline;
    static  String dateVente;
    public static ArrayList<Vente> commandes = new ArrayList<Vente>();


//creation du constructeur 
public  Vente(String id, String nomStation, int quantiteGallonDiesel, int quantiteGallonGazoline,String dateVente){
        this.id = "V-" + (int)(Math.random() * 100);
        this.nomStation = nomStation;
        this.quantiteGallonDiesel = quantiteGallonDiesel;
        this.quantiteGallonGazoline = quantiteGallonGazoline;
        this.dateVente=new Date().toLocaleString();

    }
    // Les getters
    public String getNomStation() {
        return nomStation;
    }

    public int getquantiteGallonGazoline() {
        return quantiteGallonGazoline;
    }

    public int getquantiteGallonDiesel() {
        return quantiteGallonDiesel;
    }
    public String getdateVente() {
        return dateVente;
    }

    public void vendreGazoline(int quantite) {
        if (quantite <= quantiteGallonGazoline) {
            quantiteGallonGazoline -= quantite;
            System.out.println("Vente de " + quantite + " gallons de gazoline à " + (quantite * 250) + " gourdes.");
        } else {
            System.out.println("Pas assez de gazoline disponible.");
        }
    }

    public void vendreDiesel(int quantite) {
        if (quantite <= quantiteGallonDiesel) {
            quantiteGallonDiesel -= quantite;
            System.out.println("Vente de " + quantite + " gallons de diesel à " + (quantite * 353) + " gourdes.");
        } else {
            System.out.println("Pas assez de diesel disponible.");
        }
    }


        ArrayList<Vente> ventes = new ArrayList<Vente>();
        Vente[] Ventes = {
                new Vente("Tabarre", 500, 300),
                new Vente("Pétion-ville", 400, 400),
                new Vente("Gressier", 200, 600),
                new Vente("Mirebalais", 300, 500)
        };

        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu :");
            System.out.println("1. Enregistrer une vente");
            System.out.println("2. Afficher les ventes");
            System.out.println("0. Quitter");

            choix = scanner.nextInt();
            scanner.nextLine(); // consommer le retour à la ligne

            switch (choix) {
                case 1:
                    System.out.println("Sélectionnez la station d'essence :");
                    for (int i = 0; i < stations.length; i++) {
                        System.out.println((i + 1) + ". " + stations[i].getNom());
                    }
                    int stationIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // consommer le retour à la ligne
                    System.out.println("Sélectionnez le type de carburant (1 pour gazoline, 2 pour diesel) :");
                    int carburantIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // consommer le retour à la ligne
                    System.out.println("Entrez la quantité de gallons :");
                    int quantite = scanner.nextInt();
                    scanner.nextLine(); // consommer le retour à la ligne

                    if (carburantIndex == 0) {
                        stations[stationIndex].vendreGazoline(quantite);
                        ventes.add(new Vente(0, stations[stationIndex].getNom(), quantite, 0,"27 janvier"));
                    } else if (carburantIndex == 1) {
                        stations[stationIndex].vendreDiesel(quantite);
                        ventes.add(new Vente(0, stations[stationIndex].getNom(),quantite,0,"28 fevrier"));	
                    }
                }
            }while(choix != 0);	    
}

class Approvisionnement {
    // Définition de la classe Approvisionnement
        private int id;
        private String station;
        private int quantiteDiesel;
        private int quantiteGazoline;
        private String date;

        public Approvisionnement(int id, String station, int quantiteDiesel, int quantiteGazoline, String date) {
            this.id = id;
            this.station = station;
            this.quantiteDiesel = quantiteDiesel;
            this.quantiteGazoline = quantiteGazoline;
            this.date = date;
        }

        public String toString() {
            return "ID: " + id + ", Station: " + station + ", Quantité Diesel: " + quantiteDiesel +
                    ", Quantité Gazoline: " + quantiteGazoline + ", Date: " + date;
        }
    }

    // Définition de la classe Vente
    // Méthode pour lancer l'approvisionnement
    private static void lancerApprovisionnement(ArrayList<Approvisionnement> approvisionnements) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'ID de l'approvisionnement: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entrez le nom de la station: ");
        String station = scanner.nextLine();

        System.out.print("Entrez la quantité de diesel (en gallons): ");
        int quantiteDiesel = scanner.nextInt();

        System.out.print("Entrez la quantité de gazoline (en gallons): ");
        int quantiteGazoline = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entrez la date (format JJ/MM/AAAA): ");
        String date = scanner.nextLine();

        Approvisionnement approvisionnement = new Approvisionnement(id, station, quantiteDiesel, quantiteGazoline, date);
        //approvisionnements.add(approvisionnement);

        System.out.println("L'approvisionnement a été enregistré.");

        System.out.print("Voulez-vous lancer le processus de renflouement des stations ? (O/N) ");
        String reponse = scanner.nextLine();

        if (reponse.equalsIgnoreCase("O")) {
            // Tri des approvisionnements par ordre décroissant du pourcentage d'utilisation des essences
         System.out.println("A implemneter"); 
	/*Collections.sort(approvisionnements);
	(a1, a2) -> {
                int pourcentage1 = (a1.quantiteDiesel + a1.quantiteGazoline) * 100 / 2000; // 2000 gallons est la
            });*/
        }
    

    public static void main(String[] args) {
}
}


