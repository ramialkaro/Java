
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                int index = luvut.size();
                int i =0;
                while( index > 0 ){
                    System.out.println(luvut.get(i));
                    ++i;
                    --index;
                }
                break;
            }

            luvut.add(luku);
        }

    }
}
