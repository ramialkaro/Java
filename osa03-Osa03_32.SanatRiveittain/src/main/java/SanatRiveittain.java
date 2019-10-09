
import java.util.ArrayList;
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> nimet = new ArrayList<>();

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(" ");
            nimet.add(palat[0]);
        }

        for (String nimi : nimet) {
            System.out.println(nimi);
        }
    }
}
