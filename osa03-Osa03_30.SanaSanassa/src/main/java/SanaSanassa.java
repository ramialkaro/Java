
import java.util.Scanner;

public class SanaSanassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna 1. sana: ");
        String sana_yksi = lukija.nextLine();
        
        System.out.print("Anna 2. sana: ");
        String sana_kaksi = lukija.nextLine();
        
        
        if(sana_yksi.indexOf(sana_kaksi) >0){
            System.out.println("Sana \'" +sana_kaksi + "\' on sanan \'" + sana_yksi+"\' osana." );
        }
        else{
            System.out.print("Sana \'" +sana_kaksi + "\' ei ole sanan \'" + sana_yksi+"\' osana." );
        }
    }
}
