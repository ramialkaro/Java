
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä luvut: ");
        int luku;
        int summa = 0;
        int count = 0;
        double keskiarvo = 0;
        int parillinen = 0;
        while (true) {
            
            luku = Integer.valueOf(lukija.nextLine());

            
            if (luku == -1) {
                
                
                System.out.println("Kiitos ja näkemiin!"+"\nSumma: "+summa + 
                                    "\nLukuja: "+ count + "\nKeskiarvo: "+ 
                                    keskiarvo + "\nParillisia: " + parillinen
                                    + "\nParittomia: "+ (count-parillinen));
                break;
            }
            
            summa +=luku;
            ++count;
            keskiarvo = (double) summa/count;
            
            if(luku%2==0){
                ++parillinen;
            }
        }
    }
}
