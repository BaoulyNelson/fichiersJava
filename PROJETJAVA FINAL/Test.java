import java.util.Scanner;
import java.util.random.*;
import javax.lang.model.element.QualifiedNameable;
import java.util.ArrayList;
import Commandespackage.Stationpackage.Station;
import Commandespackage.Commandes;

public class Test {
        static Scanner sc = new Scanner(System.in);

        public static void menu() {
                System.out.println();
                System.out.println("\t\t\t\t[=============================== ESIH ===============================]");
                System.out.println(
                                "\t\t[=============================== ECOLE SUPERIEURE INFOTRONIQUE D'HAITI ===============================]");
                System.out.println("\t" + "\t"
                                + " -----------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("\tDEVOIRFINAL JAVA DE LA PREMIERE SESSION : ");
                System.out.println("\tNIVEAU L3                               : ");
                System.out.println("\tNOM DU GROUPE -> (LES INTRÉPIDES)       : ");
                System.out.println("\tEXERCICES SUR STATION POMPES            : ");
                System.out.println("\tCOURS ENSEIGNE PAR PROF. Jaures PIERRE  : ");
                System.out.println();
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"
                                + "        DEVOIR PREPARE PAR UN ENSEMBLE DE PROGRAMMEUR:");
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"
                                + "                NOM     PRENOM");
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"
                                + "                ---     ------");
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"
                                + "        1-) [---DORELUS    Bersony  ---]:");
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"
                                + "        2-) [---JOSEPH     Clavensky---]:");
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"
                                + "        3-) [---NELSON     Benito   ---]:");
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"
                                + "        4-) [---BELLAMOUR  Sivenson  --]:");
                System.out.println();
                int operation1 = 0, operation2 = 0, operation3 = 0, operation4 = 0, operation5 = 0;
                Scanner sc = new Scanner(System.in);
                System.out.println();
                while (operation1 < 5) {
                        System.out.println("\t=============>>>>>>>>>>MENU PRINCIPAL==========>>>>>>>>>>>>>>>>>>>");
                        System.out.println();
                        System.out.println(
                                        ">>>>---presser 1<<<<<<<< pour effectuer certaines operations relatives aux stations");
                        System.out.println(
                                        ">>>>---presser 2<<<<<<<< pour effectuer certaines operations relatives aux commandes");
                        System.out.println(
                                        ">>>>---presser 3<<<<<<<< pour effectuer certaines operations relatives aux approvisonnements");
                        System.out.println(
                                        ">>>>---presser 4<<<<<<<< pour effectuer certaines operations relatives aux ventes");
                        operation1 = sc.nextInt();
                        switch (operation1) {
                                case 1:
                                        System.out.println("\t quelle operation voulez-vous faire sur les stations?");
                                        System.out.println();
                                        System.out.println("=========faire un choix entre 1 et 4===================");
                                        System.out.println();
                                        System.out.println(" 1. pour enregistrer les stations");
                                        System.out.println();
                                        System.out.println(" 2. pour modifier la quantite");
                                        System.out.println();
                                        System.out.println(" 3. pour afficher toutes les stations");
                                        System.out.println();
                                        System.out.println(
                                                        " 4. pour afficher toutes les stations ayant le moins et le plus de reserves");
                                        System.out.println();
                                        operation2 = sc.nextInt();
                                        switch (operation2) {
                                                case 1:
                                                        enregistrer();
                                                        Test.setTotalDiesel();
                                                        Test.setTotalGazoline();
                                                        break;
                                                case 2:
                                                        ModifierStat();
                                                        break;
                                                case 3:
                                                        afficher();
                                                        break;
                                                case 4:
                                                        stationPluspetit();
                                                        break;
                                                default:
                                                        System.out.println(">>>>>>>>>>>>>desole>>>>>>>>>>>>>");
                                                        break;
                                        }
                                        break;
                                case 2:
                                        System.out.println("\t quelle operation voulez-vous faire sur les commandes?");
                                        System.out.println();
                                        System.out.println("=========faire un choix entre 1 et 3====================");
                                        System.out.println();
                                        System.out.println("1. Enregistrer commande");
                                        System.out.println();
                                        System.out.println("2. afficher toutes les commandes");
                                        System.out.println();
                                        System.out.println("3. supprimer une commande par ladministrateur.");
                                        System.out.println();
                                        operation3 = sc.nextInt();
                                        switch (operation3) {
                                                case 1:
                                                        enregistrerCommandes();
                                                        break;
                                                case 2:
                                                        afficherCommandes();
                                                        break;
                                                case 3:
                                                        supprimerCommandes();
                                                        break;
                                                default:
                                                        System.out.println(">>>>>>>>>>>>>desole>>>>>>>>>>>>>");
                                                        break;
                                        }
                                        break;
                                case 3:
                                        System.out.println(
                                                        "\t quelle operation voulez-vous faire sur les approvisonnements?");
                                        System.out.println();
                                        System.out.println(
                                                        "============faire un choix entre 1 et 2=========================");
                                        System.out.println();
                                        System.out.println("1.Enregistrer");
                                        System.out.println();
                                        System.out.println("2.afficher tous les approvisionnements.");
                                        System.out.println();
                                        operation4 = sc.nextInt();
                                        switch (operation4) {
                                                case 1:
                                                        enregistrerApprovisionnement();
                                                        break;
                                                case 2:
                                                        afficherApprovisionnement();
                                                        break;
                                                default:
                                                        System.out.println(">>>>>>>>>>>>>desole>>>>>>>>>>>>>");
                                                        break;
                                        }
                                        break;
                                case 4:
                                        System.out.println("\t quelle operation voulez-vous faire sur les ventes?");
                                        System.out.println();
                                        System.out.println("============faire un choix entre 1 et 2==============");
                                        System.out.println();
                                        System.out.println("1.Enregistrer les ventes ");
                                        System.out.println();
                                        System.out.println("2. afficher les ventes.");
                                        System.out.println();
                                        operation5 = sc.nextInt();
                                        switch (operation5) {
                                                case 1:
                                                        break;
                                                case 2:
                                                        break;
                                                default:
                                                        System.out.println(">>>>>>>>>>>>>desole>>>>>>>>>>>>>");
                                                        break;
                                        }
                                        break;
                                default:
                                        System.out.println("ce choix n'est malheureusement pas dans le menu");
                                        break;
                        }
                        System.out.println();
                }

        }

        public static void enregistrer() {
                String Nom;
                int capacite;
                int gallons_diesel;
                int gallons_gazoline;
                double pourcent;
                int nombre_stations;
                // Contrainte pour la saisie des noms du stations
                ArrayList<String> postes = new ArrayList<String>();
                postes.add("Tabarre");
                postes.add("Gressier");
                postes.add("Petion-Ville");
                postes.add("Mirebalais");
                System.out.println("Entrez le nombre de stations: ");
                nombre_stations = sc.nextInt();
                do {
                        do {
                                System.out.print("\t entrer le nom de la station a enregistrer:");
                                Nom = sc.next();
                                System.out.println();
                        } while (!postes.contains(Nom));
                        System.out.print("\t Entrer la capacite de gallons a enregistrer:");
                        capacite = sc.nextInt();
                        System.out.println();
                        System.out.print("\t Entrer le nombre de gallon diesel a enregistrer:");
                        gallons_diesel = sc.nextInt();
                        System.out.println();
                        System.out.print("\t Entrer le nombre de gallon gazoline a enregistrer:");
                        gallons_gazoline = sc.nextInt();
                        System.out.println();
                        System.out.print("\t Entrez le pourcentage:");
                        pourcent = sc.nextDouble();
                        Station.stat.add(new Station(Nom, capacite, gallons_diesel, gallons_gazoline, pourcent));
                        System.out.println(" On a fini  denregistrer cette station ");
                        System.out.println();

                } while (Station.nombreStations < nombre_stations);
        }

        // La methode enregistrer station
        public static void ModifierStat() {
                System.out.print("\tEntrez le nom de la station a modifier: ");
                String Nom = sc.next();
                System.out.println();
                int quantite;
                int choix;
                System.out.println();
                for (Station element : Station.stat) {
                        if (element.getNom().equals(Nom)) {
                                System.out.print(
                                                "1) Gazoline uniquement? \n2) Diesel uniquement? \n3)Les deux a la fois\n> ");
                                choix = sc.nextInt();
                                System.out.print("Entrez la nouvelle quantite: ");
                                quantite = sc.nextInt();
                                System.out.println();
                                switch (choix) {
                                        case 1:
                                                element.setGallonsGazoline(quantite);
                                                break;
                                        case 2:
                                                element.setGallonsDiesel(quantite);
                                                break;
                                        case 3:
                                                element.setGallonsDiesel(quantite);
                                                element.setGallonsGazoline(quantite);
                                                break;

                                }
                                System.out.println("\t Modification  effectuee");
                        }
                }
        }

        // La methode Afficher
        public static void afficher() {
                for (Station element : Station.stat) {
                        System.out.println(element.getNom());
                        System.out.println(element.getCapacite());
                        System.out.println(element.getGallonDiesel());
                        System.out.println(element.getGallonGazoline());
                }
        }

        // La methode permettant d'Afficher la station ayant le moins et le plus de
        // réserve de diesel et/ou gazoline
        public static void stationPluspetit() {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (Station element : Station.stat) {
                        if (element.getCapacite() < min) {
                                min = element.getCapacite();
                        } else if (element.getCapacite() > max) {
                                max = element.getCapacite();
                        }
                }
                for (Station Element : Station.stat) {
                        if (Element.getCapacite() == min) {
                                System.out.printf("la satation ayant la plus petite quantite de reserves est %d "
                                                + Element.getNom() + " avec %s " + min + " gallons\n");
                        }
                }
                for (Station Element : Station.stat) {
                        if (Element.getCapacite() == max) {
                                System.out.printf("la satation ayant la plus forte quantite de reserves est %d "
                                                + Element.getNom() + " avec %s " + max + " gallons\n");

                        }
                }

        }

        // 2eme partie,operations sur la commande
        public static void enregistrerCommandes() {
                String etat;
                String type;
                int quantiteDiesel;
                int quantiteGazoline;
                int maxApprovisionnement;
                int nombreApprovisionnement = 0;
                System.out.print("Entrez le nombre d'approvisionnement: ");
                maxApprovisionnement = sc.nextInt();
                do {
                        System.out.print("Entrez l'etat(Approvisionnement ou Vente): ");
                        etat = sc.next();
                        System.out.print("Entrez le type de carburant(Diesel,Gazoline): ");
                        type = sc.next();
                        System.out.print("Entrez la quantite de Diesel : ");
                        quantiteDiesel = sc.nextInt();
                        System.out.print("Entrez la quantite de Gazoline: ");
                        quantiteGazoline = sc.nextInt();
                        Commandes.commandes.add(new Commandes(etat, type, quantiteDiesel, quantiteGazoline));
                        System.out.print("===Fin d'approvisionnement===");
                        nombreApprovisionnement++;
                } while (nombreApprovisionnement < maxApprovisionnement);
                for (Commandes commande : Commandes.commandes) {
                        Commandes.lancerCommande(commande);
                }
        }

        public static void afficherCommandes() {
                for (Commandes commande : Commandes.commandes) {
                        System.out.printf("%s\t| %s\t| %s\t| %d\t| %d\t| %s\n", commande.getId(), commande.getEtat(),
                                        commande.getType(), commande.getQuantiteDiesel(),
                                        commande.getQuantiteGazoline(), commande.getDate());
                }
        }

        public static void supprimerCommandes() {
                String id;
                System.out.print("Entrez l'id de la commande a supprimer: ");
                id = sc.next();
                int found = 0;
                Commandes tempCommande = new Commandes("", "", 0, 0);
                for (Commandes commande : Commandes.commandes) {
                        if (id.equals(commande.getId())) {
                                tempCommande = commande;
                                found = 1;
                        }
                }
                if (found == 0) {
                        System.out.println("L'id ne correspond a aucune commande");
                } else if (found == 1) {
                        Commandes.commandes.remove(tempCommande);
                        System.out.println("Suppression parfaite ");

                }

        }

        public static void setTotalGazoline() {
                for (Station element : Station.stat) {
                        Station.totalGazoline += element.getGallonGazoline();
                }
        }

        public static void setTotalDiesel() {
                for (Station element : Station.stat) {
                        Station.totalDiesel += element.getGallonDiesel();
                }
        }

        // 3eme partie,operations sur les approvisionnements
        public static void enregistrerApprovisionnement() {

        }

        public static void afficherApprovisionnement() {

        }

        public static void main(String[] args) {
                menu();
        }
}
