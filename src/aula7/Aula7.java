/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author aluno
 */
public class Aula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Caminho completo do arquivo: ");
        String nomeArquivo = scan.nextLine();
        FileReader reader = null;
        BufferedReader buffer = null;
        int c = 0;
        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE, soma = 0, media;
        try {
            reader = new FileReader(nomeArquivo);
            buffer = new BufferedReader(reader);
            String linha = buffer.readLine();
            while (linha != null) {
                StringTokenizer tok
                        = new StringTokenizer(linha, "|");
                for (int i = 0; i < 3; i++) {
                    tok.nextToken();
                }
                double x = Double.parseDouble(tok.nextToken());
                c++;
                soma += x;
                if (x < menor) {
                    menor = x;
                }
                if (x > maior) {
                    maior = x;
                }
                linha = buffer.readLine();
            }
            System.out.println("Quantidade de valores: " + c);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Menor valor: " + menor);
            System.out.println("Maior valor: " + maior);
            System.out.println("Média dos valores: " + (soma / c));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                buffer.close();
                reader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
