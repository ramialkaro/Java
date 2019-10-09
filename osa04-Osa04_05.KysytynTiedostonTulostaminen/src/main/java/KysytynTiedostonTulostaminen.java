
import java.io.File;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String fileName = lukija.nextLine();
        
        try(Scanner tiedostonLukija = new Scanner( new File(fileName))){
            //luetaan tiedostoja kunnes kaikki rivit on luettu 
            while(tiedostonLukija.hasNextLine()){
                //luetaan yki rivi
                String rivi = tiedostonLukija.nextLine();
                //tulostetaan luettu rivi
                System.out.println(rivi);
            }
        }
        catch(Exception e){
            System.out.println("Vihre: " + e.getMessage());
        }

    }
}
