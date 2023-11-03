package Commandespackage.Stationpackage;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

//creation de la classe 
public class Station {
    private String Nom;
    private int capacite;
    private double pourcentageDiesel = 0;
    private double pourcentageGazoline = 0;
    private int gallons_diesel;
    private int gallons_gazoline;
    public static int nombreStations;
    public static int totalGazoline;
    public static int totalDiesel;
    public static ArrayList<Station> stat = new ArrayList<Station>();

    // creation du constructeur
    public Station(String nom, int capacite, int gallons_diesel, int gallons_gazoline, double pourcentage) {
        this.Nom = nom;
        this.capacite = capacite;
        this.gallons_diesel = gallons_diesel;
        this.gallons_gazoline = gallons_gazoline;
        nombreStations++;
    }

    // methodes getters
    public String getNom() {
        return Nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public double getPourcentageDiesel() {
        return pourcentageDiesel;
    }

    public double getPourcentageGazoline() {
        return pourcentageGazoline;
    }

    public int getGallonDiesel() {
        return gallons_diesel;
    }

    public int getGallonGazoline() {
        return gallons_gazoline;
    }

    // methode setters
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setPourcentageDiesel(double pourcentage) {
    }

    public void setPourcentageGazoline(double pourcentage) {
    }

    public void setGallonsDiesel(int gallonsDiesel) {
        this.gallons_diesel = gallonsDiesel;
    }

    public void setGallonsGazoline(int gallonsGazoline) {
        this.gallons_gazoline = gallonsGazoline;
    }

    Scanner sc = new Scanner(System.in);

    // fonction main et array-liste
    public static void main(String[] args) {
    }
}
