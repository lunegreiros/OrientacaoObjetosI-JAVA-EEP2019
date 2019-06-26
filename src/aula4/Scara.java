/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author aluno
 */
public class Scara extends Robo {
    
    // sobrescrita de metodo
    @Override
    public String getNome() {
        return "Robo Scara";
    }
    
    @Override
    public int getTotalGDL() {
        return 4;
    }
    
    public int getTranslPos() {
        return 200;
    }
    
    // sobrecarga de metodo
    public int getTranslPos(int escala) { // parametro de ENTRADA
        return getTranslPos()*escala;
    }
}
