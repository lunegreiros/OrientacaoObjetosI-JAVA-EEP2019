package aula8_ex2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Exemplo2 {

    public static void main(String[] args) {
        int opcao;
        do {
            printScreen();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    insertTreeMap();
                    break;
                case 2:
                    searchTreeMap();
                    break;
                case 3:
                    removeTreeMap();
                    break;
                case 4:
                    listAllTreeMap();
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
        System.out.println("Programacao Orientada a Objetos");
        System.out.println("Exemplo - Utilizando TreeMap");
        System.out.println(" ==========================================");
        System.out.println("1 - Inserir dados");
        System.out.println("2 - Consultar");
        System.out.println("3 - Remover elemento");
        System.out.println("4 - Listar todas as entradas");
        System.out.println("9 - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    public static void insertTreeMap() {
        System.out.print("\nEntre com o RA do aluno: ");
        ra = scanner.next();
        System.out.print("\nEntre com o nome do aluno: ");
        nome = scanner.next();
        sm.put(ra, nome);
    }

    public static void searchTreeMap() {
        System.out.print("\nForneca o RA a ser pesquisado: ");
        ra = scanner.next();
        if ((nome = sm.get(ra)) != null) {
            System.out.println("\nNome do aluno: " + nome);
        } else {
            System.out.println("\nRA inexistente");
        }
    }

    public static void removeTreeMap() {
        System.out.print("\nForneca o RA da entrada a ser removida: ");
        ra = scanner.next();
        if ((nome = sm.remove(ra)) != null) {
            System.out.println("\nElemento removido: " + nome);
        } else {
            System.out.println("\nElemento nao encontrado na estrutura");
        }
    }

    public static void listAllTreeMap() {
        Iterator i = sm.entrySet().iterator();
        String result;
        while (i.hasNext()) {
            result = i.next().toString();
            System.out.println(result.substring(0, result.lastIndexOf("="))
                    + " - " + result.substring(result.lastIndexOf("=") + 1,
                            result.length()));
        }
    }

    public static SortedMap<String, String> sm = new TreeMap();
    public static String ra = "";
    public static String nome = "";
    public static Scanner scanner = new Scanner(System.in);
}
