
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();

                if (!rivi.equals("")) {
                    list.add(rivi);
                }
            }
        } catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto +" lukeminen epäonnistui.");
        }

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (etsittava.equals(list.get(i))) {
                System.out.println("Löytyi!");
                found = true;
            }
            
        }
        if (found == false) {
            System.out.println("Ei löytynyt.");
        }

    }
}
