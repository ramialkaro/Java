
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luku = 0;       // variable to save the read value
        int count = 0;      // counter to save how many positiivinen number that has been entered
        int summa = 0;      // to save all positiivinen number that will help for find the average

        while (true) {        // reason to have while loop in this class because --> conditional loop 
            luku = Integer.valueOf(lukija.nextLine()); // value read from keyboard / screen --> to luku
            if (luku > 0) {
                ++count;
                summa += luku;
            } else if (luku == 0) {
                if (summa == 0 || count == 0) {
                    System.out.println("keskiarvon laskeminen ei ole mahdollista");
                } else {
                    double keskiarvo = Double.valueOf(summa) / count;
                    System.out.println(keskiarvo);
                }
                break;
            } else if (luku < 0) {
               continue;
            }
        }

    }
}
