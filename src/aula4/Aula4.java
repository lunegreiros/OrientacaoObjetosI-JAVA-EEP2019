/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Jose", new Date(), 1.8, 80.0); // no main eu acesso a classe Pessoa.java pelo metodo
        System.out.println("IMC: " + p.calcularIMC());
        
        Aula4 a = new Aula4();
        a.saudacao();
        
        saudacao2();
    }
    
    public void saudacao() {
        System.out.println("Ola, eu sou uma saudacao!");
    }
    public static void saudacao2() {
        System.out.println("Ola eu sou uma segunda saudacao!!!");
    }
    
}
