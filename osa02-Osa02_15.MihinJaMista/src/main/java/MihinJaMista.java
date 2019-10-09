
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        
        // osa 1
//        System.out.println("Mihin asti?");
//        int asti = Integer.valueOf(lukija.nextLine());
//        int luku = 1;
//        while(asti >= luku){
//            System.out.println(luku);
//            ++luku;
//        }
//        
//        System.out.println();
//        
//        
        
        
        // osa 2
        System.out.println("Mihin asti?");      //  get end value

        int asti = Integer.valueOf(lukija.nextLine());  //Save value to mista

        System.out.println("Mistä lähtien?");   // from where i have to start

        int lahtien =Integer.valueOf(lukija.nextLine());  //Save value to lahitien

        while (lahtien <= asti) {
            System.out.println(lahtien);
            ++lahtien;

        }
    }
}
