
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int counter = 0;
        while(true){
            System.out.println("Syötä luku");
            
            int luku = Integer.valueOf(lukija.nextLine());
            
            summa += luku;
            if(luku==0 ){
                System.out.println("Lukujen keskiarvo "+ (Double.valueOf(summa))/counter);
                break;
            }
            ++counter;
        }
    }
}
