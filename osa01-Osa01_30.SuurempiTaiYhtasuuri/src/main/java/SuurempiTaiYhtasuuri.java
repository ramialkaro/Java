
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna ensimmäinen luku:");
        int ensi_luku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Anna toinen luku:");
        int toinen_luku = Integer.valueOf(lukija.nextLine());
        
        if(ensi_luku > toinen_luku){
            System.out.println("Suurempi luku: " + ensi_luku);
        }
        else if (ensi_luku < toinen_luku){
            System.out.println("Suurempi luku: " + toinen_luku);
        }
        else {
            System.out.println("Luvut ovat yhtä suuret!");
        }
    }
}
