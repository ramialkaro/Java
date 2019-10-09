
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int count = 100;
        int luku = Integer.valueOf(lukija.nextLine());
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
