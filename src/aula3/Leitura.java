/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Visitante
 */
public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dgite uma frase");
        String frase = scanner.nextLine(); // nextline le ateh o enter
        StringTokenizer tok = new StringTokenizer(frase, " ");
        while(tok.hasMoreTokens()) {
            System.out.println(tok.nextToken());
        }
                
    }
}
