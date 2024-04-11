import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exercicio4 {
    public static void main(String[] args) {
        List<String> listaArray = new ArrayList();
        listaArray.add("A");
        listaArray.add("B");
        listaArray.add("C");
        listaArray.add("D");
        System.out.println(listaArray);

        List<String> listaLinked = new LinkedList();
        listaLinked.add("A");
        listaLinked.add("B");
        listaLinked.add("C");
        listaLinked.add("D");
        System.out.println(listaLinked);
    }
}
