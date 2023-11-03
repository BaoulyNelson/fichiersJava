
public interface GestionCompagnieVoitures {
    void enregistrerVoiture(Voiture voiture);
    void afficherToutesVoitures();
    Voiture rechercherVoitureParCode(int code);
    void modifierPrixVoiture(int code, double nouveauPrix);
    void supprimerVoitureParCode(int code);
}
