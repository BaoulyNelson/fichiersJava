import java.util.Random;

public class Voiture {
    private int numero;
    private String marque;
    private String modele;
    private int nombreCylindre;
    private double prix;

    public Voiture(int numero, String marque, String modele, int nombreCylindre, double prix) {
        this.numero = new Random().nextInt(200);
        this.marque = marque;
        this.modele = modele;
        this.nombreCylindre = nombreCylindre;
        this.prix = prix;
    }

    // Getters et setters (non inclus pour plus de concision)

    @Override
    public String toString() {
        return "Voiture [numero=" + numero + ", marque=" + marque + ", modele=" + modele +
               ", cylindres=" + nombreCylindre + ", prix=" + prix + "]";
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * @param marque the marque to set
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * @return the modele
     */
    public String getModele() {
        return modele;
    }

    /**
     * @param modele the modele to set
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * @return the nombreCylindre
     */
    public int getNombreCylindre() {
        return nombreCylindre;
    }

    /**
     * @param nombreCylindre the nombreCylindre to set
     */
    public void setNombreCylindre(int nombreCylindre) {
        this.nombreCylindre = nombreCylindre;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }
}
