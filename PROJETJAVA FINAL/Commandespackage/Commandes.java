package Commandespackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Date;
import Commandespackage.Stationpackage.Station;

//creation de la classe commandes
public class Commandes {
    Scanner sc=new Scanner(System.in);
    private String date;
    private String etat;
    private String id;
    private String type;
    private int quantiteDiesel;
    private int quantiteGazoline;
    static int numbers;
    public static ArrayList<Commandes> commandes = new ArrayList<Commandes>();


//creation du constructeur 
public  Commandes(String etat, String type, int quantiteDiesel, int quantiteGazoline){
        this.date = new Date().toLocaleString();
        this.etat = etat;
        this.id = "A-" + (int)(Math.random() * 100);
        this.type = type;
        this.quantiteDiesel = quantiteDiesel;
        this.quantiteGazoline = quantiteGazoline;
    }
//methodes getters
    public String getId() {
        return id;
    }
    public String getEtat() {
        return etat;
    }

    public String getType() {
        return type;
    }
    public int getQuantiteDiesel() {
        return quantiteDiesel;
    }

    public int getQuantiteGazoline() {
        return quantiteGazoline;
    }
    public String getDate()    { 
                  return date; }
   
    public String getetat()    { 
                  return etat; }
   
    //methode setters
    public void setdate(String date){
                    this.date=date;
                                    }
    public void setEtat(String etat){
                    this.etat=etat;
                                 }
                                 
    public static void lancerCommande(Commandes command) {
        int tempQuantiteGazoline = 0;
        int tempQuantiteDiesel = 0;
        for(Station Element : Station.stat) {
            switch(command.etat) {
                case "Approvisionnement":
                    tempQuantiteDiesel = command.quantiteDiesel;
                    tempQuantiteGazoline = command.quantiteGazoline;
                    break;
                case "Vente":
                    tempQuantiteDiesel = -command.quantiteDiesel;
                    tempQuantiteGazoline = -command.quantiteGazoline;
                    break;
            }
            switch(command.type) {
                case "Gazoline":
                    Element.setGallonsGazoline(Element.getGallonGazoline() + tempQuantiteGazoline);
                    break;
                case "Diesel":
                    Element.setGallonsDiesel(Element.getGallonDiesel() + tempQuantiteDiesel);
                    break;
                case "Deux":
                    Element.setGallonsGazoline(Element.getGallonGazoline() + tempQuantiteGazoline);
                    Element.setGallonsDiesel(Element.getGallonDiesel() + tempQuantiteDiesel);
                    break;

            }
        }
    }
    public static void main(String[] args) {

    }
}