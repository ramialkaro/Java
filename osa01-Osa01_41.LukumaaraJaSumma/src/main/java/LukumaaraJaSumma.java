
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 0, counter=0;

        while (true) {

            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());

            summa += luku;
            if (luku == 0) {
                System.out.println("Lukuja yhteensä " +counter+ "\nLukujen summa " + summa);
                break;
            }
            ++counter;
        }

    }
}
