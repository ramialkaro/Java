
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = Integer.valueOf(lukija.nextLine());
        
        if(luku < 0 ){
            luku = luku * -1;
            System.out.println(luku);
        }
        else {
            System.out.println(luku);
        }
        

    }
}
