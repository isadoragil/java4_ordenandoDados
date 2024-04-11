import java.util.ArrayList;
import java.util.Collections;

public class exercicio2Titulo {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();

        listaTitulos.add(new Titulo("A"));
        listaTitulos.add(new Titulo("C"));
        listaTitulos.add(new Titulo("G"));
        listaTitulos.add(new Titulo("B"));
        listaTitulos.add(new Titulo("D"));
        listaTitulos.add(new Titulo("X"));

        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);
    }
}
