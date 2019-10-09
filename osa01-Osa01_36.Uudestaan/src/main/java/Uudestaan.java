
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        int syote;
        while (true){
           
            System.out.println("Syötä luku");
            
             syote = Integer.valueOf(lukija.nextLine());
            if(syote == 4){
            break;
            }
            
        }

    }
}
