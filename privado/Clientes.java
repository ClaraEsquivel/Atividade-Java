/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.privado;

/**
 *
 * @author aluno.den
 */
public class Clientes {
    private String  nome;
    private int idade;

    //Construtor
    public Clientes(String nome, int idade) {
        //variável local
        this.nome = nome;
        this.idade = idade;
    }
    
    
    //métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
