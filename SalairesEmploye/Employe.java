import java.util.Random;
import java.util.Scanner;

public abstract class Employe {
    private int code;
    private String nom;
    private String prenom;
    private String sexe;
    private String poste;
    private double prixParHeure;
    private double nombreHeures;

    public Employe(int code, String nom, String prenom, String sexe, String poste, double prixParHeure,
            double nombreHeures) {
        this.code = new Random().nextInt(100);
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.poste = poste;
        this.prixParHeure = prixParHeure;
        this.nombreHeures = nombreHeures;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the poste
     */ 
    public String getPoste() {
        return poste;
    }

    /**
     * @param poste the poste to set
     */
    public void setPoste(String poste) {
        this.poste = poste;
    }

    /**
     * @return the prixParHeure
     */
    public double getPrixParHeure() {
        return prixParHeure;
    }

    /**
     * @param prixParHeure the prixParHeure to set
     */
    public void setPrixParHeure(double prixParHeure) {
        this.prixParHeure = prixParHeure;
    }

    /**
     * @return the nombreHeures
     */
    public double getNombreHeures() {
        return nombreHeures;
    }

    /**
     * @param nombreHeures the nombreHeures to set
     */
    public void setNombreHeures(double nombreHeures) {
        this.nombreHeures = nombreHeures;
    }

    public  double calculerSalaireBrut(){
        double salaireBrut = getPrixParHeure() * getNombreHeures();
        return salaireBrut;
    }

    public abstract double calculerAugmentation();

    public double calculerSalaireNet() {
        Scanner sc=new Scanner(System.in);
        double salaireBrut = calculerAugmentation();
        System.out.print("entrer le taux sur le revenu: ");
        double taux=sc.nextDouble();
        return salaireBrut - (taux/100) * (salaireBrut); 
    }

    public double valeurAjoute(){
        double valeurAugmente=calculerAugmentation()-calculerSalaireBrut();
        return valeurAugmente ;
    }
    
    public double valeurCotisations(){
       double valeurRetiree=calculerAugmentation()-calculerSalaireNet();
        return valeurRetiree;

    }

    public void afficher() {
        System.out.println("Code: " + code);
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Sexe: " + sexe);
        System.out.println("Poste: " + poste);
        System.out.println("Nombre d'heures: " + nombreHeures+ " Heures");
        System.out.println("Prix par heure: " + prixParHeure+ " Gourdes");
        System.out.println("Salaire brut: " + calculerSalaireBrut()+ " Gourdes");
        System.out.println("on a ajoute: " + valeurAjoute()+ " Gourdes");
        System.out.println("Salaire apres l'augmentation: " + calculerAugmentation()+ " Gourdes");
        System.out.println("Salaire net: " + calculerSalaireNet()+ " Gourdes");
        System.out.println("----------------------------------");
    }

}
