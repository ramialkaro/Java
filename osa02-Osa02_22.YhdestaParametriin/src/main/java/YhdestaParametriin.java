
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLukuunAsti(2);
    }

    public static void tulostaLukuunAsti(int luku) {

        int count = 1;

        while (luku > 0) {
            if (count <= luku) {
                System.out.println(count);
                ++count;
            }
            else{
                break;
            }
        }
    }

}
