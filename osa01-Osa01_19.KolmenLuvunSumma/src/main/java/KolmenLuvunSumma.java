
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
                System.out.println("Syötä ensimmäinen luku!");
        int ensi_luku = Integer.valueOf(lukija.nextLine());
  
        System.out.println("Syötä toinen luku!");
        int toi_luku = Integer.valueOf(lukija.nextLine());  
        
        System.out.println("Syötä kolmas luku!");
        int kol_luku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Lukujen summa on " + (ensi_luku + toi_luku + kol_luku));

    }
}
