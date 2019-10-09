
import java.util.Scanner;

public class Jakolasku {

    public static void main(String[] args) {
        // Kun olet toteuttanut metodin jakolasku, voit testata
        // sen toimintaa täällä. Esimerkiksi kutsun jakolasku(3,5);
        // pitäisi tulostaa "0.6"

        // jakolasku(3, 5);
        jakolasku(3, 5);
    }

    // luo metodi tänne
    public static void jakolasku(int osoittaja, int nimittaja) {
        if (nimittaja != 0 ||(osoittaja != 0 && nimittaja != 0)) {
            
            
        
            double jako = (double) osoittaja / nimittaja;
            System.out.println(jako);
        }
    }
}
