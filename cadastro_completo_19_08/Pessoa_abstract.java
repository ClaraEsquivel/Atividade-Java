/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro_completo_19_08;

/**
 *
 * @author aluno.den
 */
public abstract class Pessoa_abstract {
    protected int id;
    protected String nome;
    protected String telefone;
    protected Endereço endereço;

    public Pessoa_abstract(int id, String nome, String telefone, Endereço endereço) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return  "\nID: " + id + 
                "\nNome: " + nome +
                "\nTelefone: " + telefone + 
                "\n= = Endereço = =" + endereço;
    }
    
    
    
}
