/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente_prestadorservico_20_08;

/**
 *
 * @author aluno.den
 */
public abstract class Pessoa_abstract {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereço_class endereco;

    public Pessoa_abstract(String nome, String telefone, String email, Endereço_class endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereço_class getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço_class endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n = Dados pessoais = " +
                "\nNome: " + nome + 
                "\nTelefone: " + telefone + 
                "\nEmail: " + email + 
                "\n = Endereco =  " + endereco;
    }
    
    
}
