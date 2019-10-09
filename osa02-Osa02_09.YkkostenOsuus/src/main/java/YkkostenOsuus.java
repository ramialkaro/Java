
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
                
        int osuus = 0;      // who many ones, entered
        int count = 0;      // who many enteres...
        int luku=0;         // the enter number...
        
        while (true){
            luku =Integer.valueOf(lukija.nextLine());
            
            if(luku == 1){      // check for ones and increase counter for it.
                ++osuus;
                
            }
            else if(luku == 0){
                    if(osuus ==0) System.out.println("ykkösten osuutta ei voida laskea");
                System.out.println((Double.valueOf(osuus)/count));
                break;
            }
            
            ++count;        // always increase the counter...
            
    }

    }
}
