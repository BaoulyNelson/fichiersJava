import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clients clients = new Clients();

        String choix;

        do {
            System.out.println("\n---- Menu ----");
            System.out.println("a) Ajouter un client");
            System.out.println("b) Rechercher un client par son nom");
            System.out.println("c) Modifier le téléphone d'un client");
            System.out.println("d) Modifier le pourcentage de rabais d'un client");
            System.out.println("e) Supprimer un client par son nom");
            System.out.println("f) Supprimer un client par son code");
            System.out.println("g) Afficher le premier client");
            System.out.println("h) Afficher le dernier client");
            System.out.println("i) Afficher les clients par ordre croissant de nom");
            System.out.println("j) Afficher les clients par ordre décroissant de nom");
            System.out.println("k) Afficher le client avant et après un client spécifié");
            System.out.println("q) Quitter");

            System.out.print("Votre choix : ");
            choix = scanner.nextLine();

            switch (choix) {
                case "a":
                    System.out.print("Entrez le nom du client : ");
                    String nomClient = scanner.nextLine();
                    System.out.print("Entrez le prénom du client : ");
                    String prenomClient = scanner.nextLine();
                    System.out.print("Entrez le téléphone du client : ");
                    String telephoneClient = scanner.nextLine();
                    System.out.print("Entrez l'email du client : ");
                    String emailClient = scanner.nextLine();
                    System.out.print("Entrez l'adresse du client : ");
                    String adresseClient = scanner.nextLine();
                    System.out.print("Entrez le pourcentage de rabais du client : ");
                    double pourcentageRabaisClient = scanner.nextDouble();
                    scanner.nextLine();

                    Client nouveauClient = new Client(0, nomClient, prenomClient, telephoneClient, emailClient, adresseClient, pourcentageRabaisClient);
                    clients.ajouterClient(nouveauClient);
                    break;

                case "b":
                    System.out.print("Entrez le nom du client à rechercher : ");
                    String nomRecherche = scanner.nextLine();
                    boolean existe = clients.rechercherClientParNom(nomRecherche);
                    if (existe) {
                        System.out.println("Le client existe dans la collection.");
                    } else {
                        System.out.println("Le client n'existe pas dans la collection.");
                    }
                    break;

                case "c":
                    System.out.print("Entrez le code du client : ");
                    int codeClientC = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entrez le nouveau téléphone du client : ");
                    String nouveauTelephone = scanner.nextLine();
                    clients.modifierTelephoneClient(codeClientC, nouveauTelephone);
                    break;

                case "d":
                    System.out.print("Entrez le code du client : ");
                    int codeClientD = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entrez le nouveau pourcentage de rabais du client : ");
                    double nouveauPourcentageRabais = scanner.nextDouble();
                    scanner.nextLine();
                    clients.modifierPourcentageRabaisClient(codeClientD, nouveauPourcentageRabais);
                    break;

                case "e":
                    System.out.print("Entrez le nom du client à supprimer : ");
                    String nomClientASupprimer = scanner.nextLine();
                    clients.supprimerClientParNom(nomClientASupprimer);
                    break;

                case "f":
                    System.out.print("Entrez le code du client à supprimer : ");
                    int codeClientF = scanner.nextInt();
                    scanner.nextLine();
                    clients.supprimerClientParCode(codeClientF);
                    break;
                case "g":
                    clients.afficherPremierClient();
                    break;

                case "h":
                    clients.afficherDernierClient();
                    break;

                
                    case "i":
                    clients.afficherClientsOrdreCroissant();
                    break;

                case "j":
                    clients.afficherClientsOrdreDecroissant();
                    break;

                case "k":
                    System.out.print("Entrez le nom du client spécifié : ");
                    String nomClientSpecifie = scanner.nextLine();
                    Client clientSpecifie = rechercherClientParNom(nomClientSpecifie);
                    if (clientSpecifie != null) {
                        clients.afficherClientAvantEtApres(clientSpecifie);
                    } else {
                        System.out.println("Le client spécifié n'existe pas dans la collection.");
                    }
                    break;

                case "q":
                    System.out.println("Programme terminé.");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    break;
            }
        } while (!choix.equalsIgnoreCase("q"));
    }

    private static Client rechercherClientParNom(String nomClientSpecifie) {
        return null;
    }
}
