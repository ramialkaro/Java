
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLuvustaYhteen(3);
    }

    public static void tulostaLuvustaYhteen(int luku){
        
        
        while (luku > 0){
            if(luku >=1){
                System.out.println(luku);
                --luku;
            }
        }
    }
}
