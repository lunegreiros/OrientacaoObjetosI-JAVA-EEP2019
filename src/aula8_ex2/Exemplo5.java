package aula8_ex2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo5 {

    public static void main(String[] args) {
        Set elementos = new TreeSet();
        elementos.add((double) 2);
        elementos.add((double) 1);
        elementos.add((double) 3);
        if (elementos.contains((double) 2)) {
            System.out.println("Contém o elemento");
        }
        for (Iterator it = elementos.iterator(); it.hasNext();) {
            System.out.println(it.next().toString());
        }
    }
}
