
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int karkausvuos = Integer.valueOf(lukija.nextLine());

        if (karkausvuos % 4 == 0 && karkausvuos%100 !=0) {
            
            System.out.println("Vuosi on karkausvuosi.");
        } 
        else if (karkausvuos % 100 == 0&& karkausvuos % 400 == 0) {
            System.out.println("Vuosi on karkausvuosi.");

        }
        else {
            System.out.println("Vuosi ei ole karkausvuosi.");
        }
    }
}
