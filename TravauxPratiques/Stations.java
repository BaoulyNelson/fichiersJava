import java.util.ArrayList;

public class Stations {
    private String nom;
    private int capaciteGazoline;
    private int pourcentageUtilGazoline;
    private int capaciteDiesel;
    private int pourcentageUtilDiesel;
    private int quantiteDieselDispo;
    private int quantiteGazolineDispo;
    
    public Stations(String nom, int capaciteGazoline, int capaciteDiesel) {
        this.nom = nom;
        this.capaciteGazoline = capaciteGazoline;
        this.pourcentageUtilGazoline = 100;
        this.capaciteDiesel = capaciteDiesel;
        this.pourcentageUtilDiesel = 100;
        this.quantiteDieselDispo = 0;
        this.quantiteGazolineDispo = 0;
    }
    
    // getters and setters
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getCapaciteGazoline() {
        return capaciteGazoline;
    }
    
    public void setCapaciteGazoline(int capaciteGazoline) {
        this.capaciteGazoline = capaciteGazoline;
    }
    
    public int getPourcentageUtilGazoline() {
        return pourcentageUtilGazoline;
    }
    
    public int getCapaciteDiesel() {
        return capaciteDiesel;
    }
    
    public void setCapaciteDiesel(int capaciteDiesel) {
        this.capaciteDiesel = capaciteDiesel;
    }
    
    public int getPourcentageUtilDiesel() {
        return pourcentageUtilDiesel;
    }
    
    public int getQuantiteDieselDispo() {
        return quantiteDieselDispo;
    }
    
    public void setQuantiteDieselDispo(int quantiteDieselDispo) {
        this.quantiteDieselDispo = quantiteDieselDispo;
    }
    
    public int getQuantiteGazolineDispo() {
        return quantiteGazolineDispo;
    }
    
    public void setQuantiteGazolineDispo(int quantiteGazolineDispo) {
        this.quantiteGazolineDispo = quantiteGazolineDispo;
    }
    
    // methods
    
    public void approvisionner(int quantiteGazoline, int quantiteDiesel) {
        this.quantiteGazolineDispo += quantiteGazoline;
        this.quantiteDieselDispo += quantiteDiesel;
        this.pourcentageUtilGazoline = 0;
        this.pourcentageUtilDiesel = 0;
    }
    
    public void vendre(int quantiteGazoline, int quantiteDiesel) {
        this.quantiteGazolineDispo -= quantiteGazoline;
        this.quantiteDieselDispo -= quantiteDiesel;
        this.pourcentageUtilGazoline = (int) (100 - ((float) quantiteGazoline / (float) capaciteGazoline) * 100);
        this.pourcentageUtilDiesel = (int) (100 - ((float) quantiteDiesel / (float) capaciteDiesel) * 100);
    }
}

public class GestionPompes {
    private ArrayList<Station> stations;
    
    public GestionPompes() {
        this.stations = new ArrayList<Stations>();
       
