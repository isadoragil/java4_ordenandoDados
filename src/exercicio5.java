import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exercicio5 {
    public static void main(String[] args) {
        List<String> listaPolimorfa;
        listaPolimorfa = new ArrayList<>();
        listaPolimorfa.add("A");
        listaPolimorfa.add("B");
        listaPolimorfa.add("C");
        listaPolimorfa.add("D");
        System.out.println(listaPolimorfa);

        listaPolimorfa = new LinkedList<>();
        listaPolimorfa.add("A");
        listaPolimorfa.add("B");
        listaPolimorfa.add("C");
        listaPolimorfa.add("D");
        System.out.println(listaPolimorfa);
    }
}
