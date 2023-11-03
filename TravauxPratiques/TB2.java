import java.util.Scanner;
public class TB2 {
    public static void main(String args[]){
        // Saisir 5 valeurs dans un tableau par l'utilisateur en les affichants.(int)
        Scanner pratique=new Scanner(System.in); 
        int tableau1[]=new int[5];
        // Stockage des valeurs par l'utilisateur
        System.out.println("Entrer un nombre");
        tableau1[0]=pratique.nextInt();
        System.out.println("Entrer un nombre");
        tableau1[1]=pratique.nextInt();
        System.out.println("Entrer un nombre");
        tableau1[2]=pratique.nextInt();
        System.out.println("Entrer un nombre");
        tableau1[3]=pratique.nextInt();
        System.out.println("Entrer un nombre");
        tableau1[4]=pratique.nextInt();
        // Parcours du tableau
        for(int varyabPakou=0;varyabPakou<tableau1.length;varyabPakou++){
        System.out.println(+tableau1[varyabPakou]);
    }


    }
}
