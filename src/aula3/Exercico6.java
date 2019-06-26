/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author Visitante
 */
public class Exercico6 {

    private static void imprimeMenu() {
        System.out.println("---------------");
        System.out.println("escolha uma opcao");
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        int op = 0;
        Scanner scanner = new Scanner(System.in);
        while (op != 3) {
            imprimeMenu();
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ola");
                    break;
                case 2:
                    System.out.println("tchau");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("opcao invalida");
            }
        }
    }
}
