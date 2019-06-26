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
public class Pessoa {

    private String nome;
    private Date dataDeNascimento;
    private Double altura; //Double com D maiusculo eh OBJETO
    private Double peso;

    public Pessoa() { // isso eh um construtor PADRAO -> eh o metodo
        nome = "";
        dataDeNascimento = new Date();
        altura = 0.0;
    }

    public Pessoa(String nome) { // isso eh um construtor eh o metodo com ENTRADA de parametro
        this.nome = nome; // this.nome eh referente a variavel da classe - lá em cima
    }

    public Pessoa(String nome, Date dataDeNascimento, Double altura) { // esse construtor recebe os 3 parametros
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDatadeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    } 

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
//construtor com todos parametros de ENTRADA do main em outro arquivo Aula4.java
    public Pessoa(String nome, Date dataDeNascimento, Double altura, Double peso) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
        this.peso = peso;
    }
    
    
    
    // metodo de acesso -> get
    public String getNome() {
        return nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Double getAltura() {
        return altura;
    }
    
    // criar metodo finalize

    @Override
    protected void finalize() throws Throwable {
         //codigo para encerrar o aqrquivo
    }
    
    
    // metodo que calcula imc com variaveis dessa classe...
    public Double calcularIMC () {
        Double imc; // pode inicializar null pq Double com 'D' maiusculo eh objeto
        imc = peso / Math.pow(altura,2);
        return imc;
    }
    
}
