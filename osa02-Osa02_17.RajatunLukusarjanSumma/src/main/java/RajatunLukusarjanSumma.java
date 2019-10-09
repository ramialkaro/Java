
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Ensimmäinen: ");

        int count = Integer.valueOf(lukija.nextLine());

        System.out.println("Viimeinen: ");
        int luku = Integer.valueOf(lukija.nextLine());
        
        
        int summa = 0;

        while (true) {
            if (count <= luku) {

                summa += count;
                ++count;
            } else {
                System.out.println("Summa on " + summa);
                break;
            }
        }
    }
}
