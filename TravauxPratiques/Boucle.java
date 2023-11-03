// Les boucles
import java.util.Scanner;
class Boucle{
    public static void main(String args[])
    {
        int i=0;
        Scanner pratique=new Scanner(System.in);
        System.out.println("Entrer i");
        i=pratique.nextInt();
        while(i<5){
            // System.out.println("La boucle while");
            System.out.println("Reentrer");
        i=pratique.nextInt();

            i++;

        }
    }
}