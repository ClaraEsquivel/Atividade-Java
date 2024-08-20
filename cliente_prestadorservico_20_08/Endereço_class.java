/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente_prestadorservico_20_08;

/**
 *
 * @author aluno.den
 */
public class Endereço_class {
    private String lagradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private Unidade_Federativa_enum uf;

    public Endereço_class(String lagradouro, String numero, String complemento, String cep, String cidade, Unidade_Federativa_enum uf) {
        this.lagradouro = lagradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
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

    public Unidade_Federativa_enum getUf() {
        return uf;
    }

    public void setUf(Unidade_Federativa_enum uf) {
        this.uf = uf;
    }
    
    @Override
    public String toString() {
        return  
                "\nLagradouro: " + lagradouro + 
                "\nNúmero: " + numero + 
                "\nComplemento: " + complemento + 
                "\nCEP: " + cep + 
                "\nCidade: " + cidade + 
                "\nUF: " + uf.nome +
                "\nSigla: " + uf.sigla;
    }
    
    
}
