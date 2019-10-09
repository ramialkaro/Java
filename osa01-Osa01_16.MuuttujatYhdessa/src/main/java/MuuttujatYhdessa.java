
import java.util.Scanner;

public class MuuttujatYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
         
        System.out.println("Syötä merkkijono!");
        String teskti = lukija.nextLine();
        
        System.out.println("Syötä kokonaisluku!");
        int luku_int = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä liukuluku!");
        double luku_double = Double.valueOf(lukija.nextLine());
        
        System.out.println("Syötä totuusarvo!");
        boolean arvo = Boolean.valueOf(lukija.nextLine());
        
        System.out.println("Syötit merkkijonon " + teskti);
        System.out.println("Syötit kokonaisluvun " + luku_int);
        System.out.println("Syötit liukuluvun " + luku_double);
        System.out.println("Syötit totuusarvon " + arvo);
        
    }
}
