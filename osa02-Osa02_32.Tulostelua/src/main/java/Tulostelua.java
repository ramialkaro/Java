
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        int tulostettu = 0;
        while (tulostettu < maara) {
            System.out.print("*");
            tulostettu = tulostettu + 1;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        // tehtävän toinen osa
        int tulostettu = 0;
        while (tulostettu < sivunpituus) {
            tulostaTahtia(sivunpituus);
            tulostettu = tulostettu + 1;
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        int tulostettu = 0;
        while (tulostettu < korkeus) {
            tulostaTahtia(leveys);
            tulostettu = tulostettu + 1;
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän neljäs osa
        int rivi = 1;
        while (rivi <= koko) {
            tulostaTahtia(rivi);
            rivi = rivi + 1;
        }
    }
}
