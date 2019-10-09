
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> etunimi = new ArrayList<>();
        int syntymapaiva;
        String word;

        while (true) {
            word = lukija.nextLine();
            if (word.isEmpty()) {

                break;
            }

            String[] palat = word.split(",");
            etunimi.add(palat[0]);

        }

    }
}
