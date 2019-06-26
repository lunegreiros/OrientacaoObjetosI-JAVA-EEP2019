/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author Visitante
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n = null;
        double x = Math.log(256)/Math.log(2);
        if (n != null && !n.equals("")) {
        System.out.println(n.substring(0,0));
        }
        System.out.println("Soma = " +1+1);
        System.out.println("Soma = " +(1+1));
        
        String nome = "Luciano";
        System.out.println(nome.substring(0,7));
        String nome2 = "Luciano";
        
        /*
        if (nome == nome2) { // jeito igual ao C
            System.out.println("Sao iguais");
        } 
        */
        
        if (nome.equals(nome2)) { // jeito correto de comparar
            System.out.println("Sao iguais");
        }
        
        // array
        /*
        int a[] = new int[10]; // array a recebe 10 elementos
        int[] a = new int[9], b = new int[10]; // todos depois do int sao arrays
        int a[] = new int[9]; // aqui somente o a eh um array
        */
int a[] = new int[9];
for (int i = 0 ; i<a.length ; i++) {
    System.out.print(a[i] + "\t");
}

int b[] = new int[9];
int m[][] = new int[9][9];
    for(int j = 0 ; j<m[0].length ; j++ ) {
        for( int i = 0 ; i<m[0].length ; i++ ) {
            System.out.print(m[i][j] + "\t");
        }
        System.out.println("");
    }

                
                
    }
    
}