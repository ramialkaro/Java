
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int ensi = Integer.valueOf(lukija.nextLine());
        int toin = Integer.valueOf(lukija.nextLine());
        
        System.out.println(Math.sqrt(ensi+toin));
    }
}
