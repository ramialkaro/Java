
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku: ");
        int count = Integer.valueOf(lukija.nextLine());
        
        int luku = 1;
        
        int summa = 1;

        while (true) {
            if (count >= luku) {

                summa = summa * luku;
                ++luku;
            } else {
                System.out.println("Kertoma on " + summa);
                break;
            }
        }

    }
}
