
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int count = 0;
        String teksti="";
        
        while (true){
            teksti =lukija.nextLine();
            if(teksti.equals("loppu")){
                System.out.println(count);
                break;
            }
            ++count;
        }
    }
}
