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
public class Exercicio5 {

    public static void main(String[] args) {
        double[][] m1 = new double[3][3],
                m2 = new double[3][3],
        m3 = new double[3][3];
        double min = 0, max = 10;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = Math.random() * (max - min) + min; // random para double
                m2[i][j] = Math.random() * (max - min) + min;
            }
        }

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.print(m1[i][j] + "\t");

            }
        }

    }
}
