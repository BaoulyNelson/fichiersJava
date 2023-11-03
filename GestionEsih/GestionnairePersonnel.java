import java.util.TreeSet;
import java.util.Scanner;

public class GestionnairePersonnel {
    TreeSet<Personne> dossierESIH = new TreeSet<>((p1, p2) -> p1.getNom().compareToIgnoreCase(p2.getNom()));

    public void ajouterPersonne(TreeSet<Personne> dossierESIH, Scanner scanner) {
        System.out.print("Entrez le type de personne (etudiant / professeur / personnel) : ");
        String typePersonne = scanner.nextLine();

        System.out.print("Entrez le nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez le sexe : ");
        String sexe = scanner.nextLine();

        System.out.print("Entrez l'adresse : ");
        String adresse = scanner.nextLine();

        System.out.print("Entrez le téléphone : ");
        int telephone = scanner.nextInt();

        System.out.print("Entrez l'email : ");
        String email = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Entrez la date de naissance : ");
        String dateNaissance = scanner.nextLine();

        System.out.print("Entrez le lieu de naissance : ");
        String lieuNaissance = scanner.nextLine();

        switch (typePersonne.toLowerCase()) {
            case "etudiant":
                Etudiant etudiant = new Etudiant(0, nom, prenom, sexe, adresse, telephone, email, dateNaissance,
                        lieuNaissance);
                dossierESIH.add(etudiant);
                System.out.println("etudiant ajoute\n");
                break;

            case "professeur":
                Professeur professeur = new Professeur(0, nom, prenom, sexe, adresse, telephone, email, dateNaissance,
                        lieuNaissance);
                dossierESIH.add(professeur);
                System.out.println("professeur ajoute\n");
                break;

            case "personnel":
                PersonnelAdministratif personnel = new PersonnelAdministratif(0, nom, prenom, sexe, adresse, telephone,
                        email, dateNaissance, lieuNaissance);
                dossierESIH.add(personnel);
                System.out.println("personnel ajoute\n");
                break;

            default:
                System.out.println("Type de personne invalide.");
                break;
        }
    }
    public void afficherPersonnes(){
        for (Personne personne : dossierESIH){
            System.out.println(personne.toString());
        }
    }

    public void rechercherPersonneParCode(TreeSet<Personne> dossierESIH, int codeRecherche) {
        for (Personne personne : dossierESIH) {
            if (personne.getCode() == (codeRecherche)) {
                System.out.println("Personne trouvee : " + personne.getNom() + " " + personne.getPrenom());
                return;
            }
        }
        System.out.println("Personne non trouvee.");
    }

    public void modifierPersonneParCode(TreeSet<Personne> dossierESIH, Scanner scanner, int codeModification) {
        for (Personne personne : dossierESIH) {
            if (personne.getCode() == (codeModification)) {
                System.out.print("Entrez le nouveau nom : ");
                String nouveauNom = scanner.nextLine();
                personne.setNom(nouveauNom);

                System.out.print("Entrez le nouveau prenom : ");
                String nouveauPrenom = scanner.nextLine();
                personne.setPrenom(nouveauPrenom);

                System.out.print("Entrez le nouveau sexe : ");
                String nouveauSexe = scanner.nextLine();
                personne.setSexe(nouveauSexe);

                System.out.print("Entrez la nouvelle adresse : ");
                String nouvelleAdresse = scanner.nextLine();
                personne.setAdresse(nouvelleAdresse);

                System.out.print("Entrez le nouveau telephone : ");
                int nouveauTelephone = scanner.nextInt();
                personne.setTelephone(nouveauTelephone);

                System.out.print("Entrez le nouvel email : ");
                String nouvelEmail = scanner.nextLine();
                personne.setEmail(nouvelEmail);

                System.out.print("Entrez la nouvelle date de naissance : ");
                String nouvelleDateNaissanceStr = scanner.nextLine();
                personne.setDateNaissance(nouvelleDateNaissanceStr);

                System.out.print("Entrez le nouveau lieu de naissance : ");
                String nouveauLieuNaissance = scanner.nextLine();
                personne.setLieuNaissance(nouveauLieuNaissance);

                System.out.println("Personne modifiee.");
                return;
            }
        }
        System.out.println("Personne non trouvee.");
    }

    public void supprimerPersonne(TreeSet<Personne> dossierESIH, int supprimerParNomOuCode,String n) {
        for (Personne personne : dossierESIH) {
            if (personne.getCode() == supprimerParNomOuCode
                    || personne.getNom().equals(Integer.toString(supprimerParNomOuCode))) {
                dossierESIH.remove(personne);
                System.out.println("Personne supprimee : " + personne.getNom() + " " + personne.getPrenom());
                return;
            }
        }
        System.out.println("Personne non trouvee.");
    }

    public void afficherPremierePersonne(TreeSet<Personne> dossierESIH) {
        if (!dossierESIH.isEmpty()) {
            Personne premierePersonne = dossierESIH.first();
            System.out.println("Premiere personne : "+premierePersonne.getCode() + " "+ premierePersonne.getNom() + " " + premierePersonne.getPrenom());
        } else {
            System.out.println("La collection est vide.");
        }
    }

    public void afficherAvantDernierePersonne(TreeSet<Personne> dossierESIH) {
        if (!dossierESIH.isEmpty() && dossierESIH.size() >= 2) {
            Personne avantDernierePersonne = (Personne) dossierESIH.toArray()[dossierESIH.size() - 2];
            System.out.println("Avant-derniere personne : " + avantDernierePersonne.getCode() +" "+ avantDernierePersonne.getNom() + " "
                    + avantDernierePersonne.getPrenom());
        } else {
            System.out.println("La collection ne contient pas suffisamment de personnes.");
        }
    }

    public void afficherAvantEtApresPersonne(TreeSet<Personne> dossierESIH, int codePersonneSaisie) {
        boolean trouve = false;
        Personne avantPersonne = null;
        Personne apresPersonne = null;

        for (Personne personne : dossierESIH) {
            if (personne.getCode() == (codePersonneSaisie)) {
                trouve = true;
                break;
            }
            avantPersonne = personne;
        }

        if (trouve) {
            for (Personne personne : dossierESIH.tailSet(avantPersonne, false)) {
                apresPersonne = personne;
                break;
            }

            System.out.println("Personne avant " + codePersonneSaisie + " : " + avantPersonne.getNom() + " "
                    + avantPersonne.getPrenom());
            System.out.println("Personne apres " + codePersonneSaisie + " : " + apresPersonne.getNom() + " "
                    + apresPersonne.getPrenom());
        } else {
            System.out.println("Personne non trouvee.");
        }
    }

    public void afficherDernierePersonne(TreeSet<Personne> dossierESIH) {
        if (!dossierESIH.isEmpty()) {
            Personne dernierePersonne = dossierESIH.last();
            System.out.println("Derniere personne : " +dernierePersonne.getCode() +" "+dernierePersonne.getNom() + " " + dernierePersonne.getPrenom());
        } else {
            System.out.println("La collection est vide.");
        }
    }

    public void afficherPositionPersonne(TreeSet<Personne> dossierESIH, int codePosition) {
        int position = 0;
        boolean trouve = false;

        for (Personne personne : dossierESIH) {
            if (personne.getCode() == (codePosition)) {
                trouve = true;
                break;
            }
            position++;
        }

        if (trouve) {
            System.out.println("La personne se trouve a la position " + position + ".");
        } else {
            System.out.println("Personne non trouvee.");
        }
    }

    public void afficherPersonnesOrdreCroissant(TreeSet<Personne> dossierESIH) {
        System.out.println("Personnes en Ordre Croissant de nom :");
        for (Personne personne : dossierESIH) {
            System.out.println( +personne.getCode() +" "+personne.getNom() + " " + personne.getPrenom());
        }
    }

    public void afficherPersonnesOrdreDecroissant(TreeSet<Personne> dossierESIH) {
        System.out.println("Personnes en Ordre Decroissant de nom :");
        for (Personne personne : dossierESIH.descendingSet()) {
            System.out.println(personne.getCode() +" "+personne.getNom() + " " + personne.getPrenom());
        }
    }

    public void supprimerToutesPersonnes(TreeSet<Personne> dossierESIH) {
        dossierESIH.clear();
        System.out.println("Toutes les personnes ont été supprimées.");
    }

}
