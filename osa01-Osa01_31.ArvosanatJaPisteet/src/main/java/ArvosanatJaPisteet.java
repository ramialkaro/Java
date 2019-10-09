
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]:");
        int pistemäärä = Integer.valueOf(lukija.nextLine());
        String arvosana = "";
        
        
        if (pistemäärä < 0) {
            arvosana = "mahdotonta!";
        } else if (pistemäärä >=0  && pistemäärä < 50) {
            arvosana = "hylätty";
        } else if (pistemäärä >= 50 && pistemäärä < 60) {// 50-59    1
            arvosana = "1";
        } else if (pistemäärä >= 60 && pistemäärä < 70) {// 60-69    2
            arvosana = "2";
        } else if (pistemäärä >= 70 && pistemäärä < 80) {// 70-79    3
            arvosana = "3";
        } else if (pistemäärä >= 80 && pistemäärä < 90) {// 80-89    4
            arvosana = "4";
        } else if (pistemäärä >= 90 && pistemäärä <= 100) {// 90-100   5
            arvosana = "5";
        } else if (pistemäärä > 100) {// >100     uskomatonta!
            arvosana = "uskomatonta!";
        }
        
        System.out.println(arvosana);
    }
}
