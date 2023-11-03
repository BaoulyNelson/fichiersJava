import java.io.*;
import java.util.HashMap;

public class CompagnieVoitures implements GestionCompagnieVoitures {
    private HashMap<Integer, Voiture> voitures;

    public CompagnieVoitures() {
        voitures = new HashMap<>();
        chargerDonneesDepuisFichier();
    }

    private void chargerDonneesDepuisFichier() {
        try (BufferedReader br = new BufferedReader(new FileReader("voitures.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int numero = Integer.parseInt(data[0]);
                String marque = data[1];
                String modele = data[2];
                int nombreCylindre = Integer.parseInt(data[3]);
                double prix = Double.parseDouble(data[4]);

                Voiture voiture = new Voiture(numero, marque, modele, nombreCylindre, prix);
                voitures.put(numero, voiture);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sauvegarderDonneesDansFichier() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("voitures.txt"))) {
            for (Voiture voiture : voitures.values()) {
                bw.write(voiture.getNumero() + "," + voiture.getMarque() + "," +
                         voiture.getModele() + "," + voiture.getNombreCylindre() + "," +
                         voiture.getPrix());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enregistrerVoiture(Voiture voiture) {
        voitures.put(voiture.getNumero(), voiture);
        sauvegarderDonneesDansFichier();
    }

    @Override
    public void afficherToutesVoitures() {
        for (Voiture voiture : voitures.values()) {
            System.out.println(voiture);
        }
    }

    @Override
    public Voiture rechercherVoitureParCode(int code) {
        return voitures.get(code);
    }

    @Override
    public void modifierPrixVoiture(int code, double nouveauPrix) {
        Voiture voiture = voitures.get(code);
        if (voiture != null) {
            voiture.setPrix(nouveauPrix);
            sauvegarderDonneesDansFichier();
        } else {
            System.out.println("Voiture non trouvée avec le code " + code);
        }
    }

    @Override
    public void supprimerVoitureParCode(int code) {
        voitures.remove(code);
        sauvegarderDonneesDansFichier();
    }
}
