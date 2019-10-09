
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String word;
        
        String[] sentance = null;
        while (true) {
            word = lukija.nextLine();
            sentance = word.split("\\s+");
            if (word.isEmpty()) {

                break;

            } else {
                int indeksi = 1;
                
                
                while (indeksi < sentance.length) {
                    System.out.println(sentance[indeksi]);
                    indeksi = indeksi + 2;
                }

            }

        }

    }
}
