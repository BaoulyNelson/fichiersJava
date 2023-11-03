import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Clients {
    private HashMap<Integer, Client> clients;

    public Clients() {
        clients = new HashMap<>();
    }

    public void ajouterClient(Client client) {
        clients.put(client.getId(), client);
    }

    public boolean rechercherClientParNom(String nom) {
        for (Client client : clients.values()) {
            if (client.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    public void modifierTelephoneClient(int idClient, String nouveauTelephone) {
        Client client = clients.get(idClient);
        if (client != null) {
            client.setTelephone(nouveauTelephone);
            System.out.println("Téléphone du client mis à jour.");
        } else {
            System.out.println("Le client n'existe pas dans la collection.");
        }
    }

    public void modifierPourcentageRabaisClient(int idClient, double nouveauPourcentageRabais) {
        Client client = clients.get(idClient);
        if (client != null) {
            client.setPourcentageRabais(nouveauPourcentageRabais);
            System.out.println("Pourcentage de rabais du client mis à jour.");
        } else {
            System.out.println("Le client n'existe pas dans la collection.");
        }
    }

    public void supprimerClientParNom(String nom) {
        for (Client client : clients.values()) {
            if (client.getNom().equalsIgnoreCase(nom)) {
                clients.remove(client.getId());
                System.out.println("Client supprimé : " + client.getNom());
                return;
            }
        }
        System.out.println("Le client n'existe pas dans la collection.");
    }

    public void supprimerClientParCode(int codeClient) {
        if (clients.containsKey(codeClient)) {
            Client clientSupprime = clients.remove(codeClient);
            System.out.println("Client supprimé : " + clientSupprime.getNom());
        } else {
            System.out.println("Le client n'existe pas dans la collection.");
        }
    }

    public void afficherPremierClient() {
        if (!clients.isEmpty()) {
            Client premierClient = clients.get(clients.keySet().iterator().next());
            System.out.println("Premier client : " + premierClient.getNom());
        } else {
            System.out.println("Aucun client dans la collection.");
        }
    }

    public void afficherDernierClient() {
        if (!clients.isEmpty()) {
            Client dernierClient = clients.get(clients.keySet().iterator().next());
            for (int idClient : clients.keySet()) {
                dernierClient = clients.get(idClient);
            }
            System.out.println("Dernier client : " + dernierClient.getNom());
        } else {
            System.out.println("Aucun client dans la collection.");
        }
    }

 // Méthode pour afficher les clients par ordre croissant de nom
 public void afficherClientsOrdreCroissant() {
    List<Client> listeClients = new ArrayList<>(clients.values());
    Collections.sort(listeClients, Comparator.comparing(Client::getNom));

    System.out.println("Liste des clients par ordre croissant de nom :");
    for (Client client : listeClients) {
        System.out.println("Nom : " + client.getNom() + ", Prénom : " + client.getPrenom());
    }
}

// Méthode pour afficher les clients par ordre décroissant de nom
public void afficherClientsOrdreDecroissant() {
    List<Client> listeClients = new ArrayList<>(clients.values());
    Collections.sort(listeClients, Comparator.comparing(Client::getNom).reversed());

    System.out.println("Liste des clients par ordre décroissant de nom :");
    for (Client client : listeClients) {
        System.out.println("Nom : " + client.getNom() + ", Prénom : " + client.getPrenom());
    }
}

// Méthode pour afficher le client avant et après un client spécifié
public void afficherClientAvantEtApres(Client clientSpecifie) {
    List<Client> listeClients = new ArrayList<>(clients.values());
    Collections.sort(listeClients, Comparator.comparing(Client::getNom));

    int index = listeClients.indexOf(clientSpecifie);
    if (index >= 0) {
        System.out.println("Client avant le client spécifié :");
        if (index > 0) {
            Client clientAvant = listeClients.get(index - 1);
            System.out.println("Nom : " + clientAvant.getNom() + ", Prénom : " + clientAvant.getPrenom());
        } else {
            System.out.println("Aucun client avant le client spécifié.");
        }

        System.out.println("Client après le client spécifié :");
        if (index < listeClients.size() - 1) {
            Client clientApres = listeClients.get(index + 1);
            System.out.println("Nom : " + clientApres.getNom() + ", Prénom : " + clientApres.getPrenom());
        } else {
            System.out.println("Aucun client après le client spécifié.");
        }
    } else {
        System.out.println("Le client spécifié n'existe pas dans la collection.");
    }
}
}
