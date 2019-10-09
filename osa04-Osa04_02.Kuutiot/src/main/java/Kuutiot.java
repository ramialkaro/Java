
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String entered = lukija.nextLine();
            if (entered.equals("loppu")) {
                break;
            }

            int luku = Integer.valueOf(entered);
             System.out.println(luku * luku * luku);
        }

    }
}
