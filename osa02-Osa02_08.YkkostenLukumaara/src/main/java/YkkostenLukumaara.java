
import java.util.Scanner;

public class YkkostenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int luku=0;
        
        while (true){
            luku =Integer.valueOf(lukija.nextLine());
            
            if(luku == 1){
                ++summa;
                
            }
            else if(luku == 0){
                System.out.println(summa);
                break;
            }
            
    }
    }
}
