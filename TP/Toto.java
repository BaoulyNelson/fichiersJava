

public class Toto {
    public static void main(String[] args) {
        int toto[] = {2, 9, 6, 1, 0, 5, 4, 3};
        int max = toto[0];
        int min = toto[0];

        for (int i = 1; i < toto.length; i++) {
            if (toto[i] > max) {
                max = toto[i];
            }

            if (toto[i] < min) {
                min = toto[i];
            }
        }

        System.out.println("Valeur maximale : " + max);
        System.out.println("Valeur minimale : " + min);
    }
}
