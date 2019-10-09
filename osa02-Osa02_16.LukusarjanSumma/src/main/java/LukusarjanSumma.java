
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti?");
        int luku = 1;
        int count = Integer.valueOf(lukija.nextLine());
        int summa = 0;

        while (true) {
            if (count >= luku) {

                summa += luku;
                ++luku;
            }
            else{
            System.out.println("Summa on " + summa);
            break;
            }
        }
        

    }
}
