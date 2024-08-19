/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro_completo_19_08;

/**
 *
 * @author aluno.den
 */
public class Endereço {
    private String lagradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private Unidade_Federativa uf;

    public Endereço(String lagradouro, String numero, String complemento, String cep, String cidade, Unidade_Federativa uf) {
        this.lagradouro = lagradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Unidade_Federativa getUf() {
        return uf;
    }

    public void setUf(Unidade_Federativa uf) {
        this.uf = uf;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.lagradouro = lagradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return  "\nLagradouro: " + lagradouro + 
                "\nNúmero: " + numero + 
                "\nComplemento: " + complemento + 
                "\nCEP: " + cep + 
                "\nCidade: " + cidade + 
                "\nUF: " + uf.nome +
                "\nSigla: " + uf.sigla;
    }
    
    
}
