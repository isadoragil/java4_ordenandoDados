import java.util.ArrayList;
import java.util.Collections;

public class exercicio1 {
    public static void main(String[] args) {
            ArrayList<Integer> lista = new ArrayList<Integer>();

            lista.add(7);
            lista.add(4);
            lista.add(6);
            lista.add(1);
        Collections.sort(lista);
        //Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);
    }
}
