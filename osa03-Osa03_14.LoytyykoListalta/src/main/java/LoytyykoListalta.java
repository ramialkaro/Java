
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }

        // show message to user.
        System.out.print("Ketä etsitään? ");
        String founder = lukija.nextLine();

        // the value of the found person had been ready to compare in the next step
        boolean found_it = false;
        for (int i = 0; i < lista.size(); i++) {
            if (founder.equals(lista.get(i))) {
                System.out.println(founder + " löytyi!");
                found_it = true;
            }

        }
        if (found_it == false) {
                System.out.println(founder + " ei löytynyt!");
        }
    }
}
