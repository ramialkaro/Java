
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = 0;
        int count = Integer.valueOf(lukija.nextLine());
        while(true){
           if(count >= luku ){
               System.out.println(luku);
               ++luku;
           }
           else{
               break;
           }
        }
    }
}
