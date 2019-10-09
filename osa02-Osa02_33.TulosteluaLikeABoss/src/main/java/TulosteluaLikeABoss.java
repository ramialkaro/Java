
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        while (maara > 0) {
            System.out.print("*");
            --maara;
        }
        System.out.println();
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        while (maara > 0) {
            System.out.print(" ");
            --maara;
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2

        int i, j, k;
        for (i = koko; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (k = koko; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3

        int i, j, k;
        for (i = 1; i <= korkeus; i++) {
            for (j = (korkeus - 1); j >= i; j--) {
                System.out.print(" ");
            }

            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        //beginning of lower part
        for ( i = 1; i <= 2; i++) {
            System.out.print(" ");
            for ( j = korkeus - 3; j > 0; j--) {
                System.out.print(" ");
            }
            for ( k = 3; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }// end of lower part

    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);

        System.out.println("---");
        tulostaTyhjaa(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
