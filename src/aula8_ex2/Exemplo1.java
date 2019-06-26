package aula8_ex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        int opcao;
        do {
            printScreen();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    insertHash();
                    break;
                case 2:
                    searchHash();
                    break;
                case 3:
                    removeHash();
                    break;
                case 4:
                    listAllHash();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opcao != 9);
        scanner.close();
    }

    public static void printScreen() {
        System.out.println("\n==========================================");
        System.out.println("Programacao Oritentada a Objetos");
        System.out.println("Exemplo - Utilizando Hash Map");
        System.out.println("==========================================");
        System.out.println("1 - Inserir dados");
        System.out.println("2 - Consultar");
        System.out.println("3 - Remover elemento");
        System.out.println("4 - Listar todas as entradas");
        System.out.println("9 - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    public static void insertHash() {
        System.out.print("\nEntre com o RA do aluno: ");
        ra = scanner.next();
        System.out.print("\nEntre com o nome do aluno: ");
        nome = scanner.next();
        h.put(ra, nome);
    }

    public static void searchHash() {
        System.out.print("\nForneca o RA a ser pesquisado: ");
        ra = scanner.next();
        if ((nome = h.get(ra)) != null) {
            System.out.println("\nNome do aluno: " + nome);
        } else {
            System.out.println("\nRA inexistente");
        }
    }

    public static void removeHash() {
        System.out.print("\nForneca o RA da entrada a ser removida: ");
        ra = scanner.next();
        if ((nome = h.remove(ra)) != null) {
            System.out.println("\nElemento removido: " + nome);
        } else {
            System.out.println("\nElemento nao encontrado na tabela");
        }
    }

    public static void listAllHash() {
        Iterator<String> i = h.keySet().iterator();
        while (i.hasNext()) {
            ra = i.next();
            nome = h.get(ra);
            System.out.println(ra + " - " + nome);
        }
    }
    public static HashMap<String, String> h = new HashMap();
    public static String ra = "";
    public static String nome = "";
    private static Scanner scanner = new Scanner(System.in);
}
