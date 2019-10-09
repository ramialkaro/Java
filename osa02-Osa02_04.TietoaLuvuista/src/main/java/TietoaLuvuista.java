
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int ensi = Integer.valueOf(lukija.nextLine());
        int toin = Integer.valueOf(lukija.nextLine());
        
        if(ensi > toin){
            System.out.println("Luku " + ensi + " on suurempi kuin luku " + toin);
        }
        else if(ensi < toin){
            System.out.println("Luku " + ensi + " on pienempi kuin luku " + toin);
        }
        else if(ensi == toin){
            System.out.println("Luku " + ensi+ " on yhtä suuri kuin luku "+ toin+".");
        }
    }
}
