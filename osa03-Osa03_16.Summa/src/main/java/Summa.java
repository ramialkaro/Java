
import java.util.ArrayList;

public class Summa {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(6);
        lista.add(-1);
        
        System.out.println(summa(lista));
        
        lista.add(5);
        lista.add(1);
        System.out.println(summa(lista));
    }
    
    
    public static int summa(ArrayList<Integer> luvut){
        int summa =0;
        for(int i = 0 ; i <luvut.size();i++){
            summa +=luvut.get(i);
        }
        return summa;
    }
}
