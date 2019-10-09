
import java.util.Scanner;

public class Alkuosa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna sana: ");
        String word  = lukija.nextLine();
        
        System.out.print("Alkousana pituus: ");
        int len = Integer.valueOf(lukija.nextLine());
        
        
        System.out.println("Tulos: "+ word.substring(0,len));
        
    }
}
