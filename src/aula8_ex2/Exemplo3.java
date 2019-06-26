package aula8_ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exemplo3 {

    public static void main(String[] args) {
        List<String> listaStrings = new ArrayList();
        List lista = new ArrayList();
        listaStrings.add("Um");
        listaStrings.add("Dois");
        listaStrings.add("Três");
        lista.add(1);
        lista.add((double) 2);
        lista.add("Três");
        for (String item : listaStrings) {
            System.out.println(item);
        }
        for (Iterator it = lista.iterator(); it.hasNext();) {
            Object object = it.next();
            System.out.println(object.getClass().getSimpleName()
                    + " - " + object.toString());
        }
    }
}
