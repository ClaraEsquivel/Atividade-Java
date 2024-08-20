/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente_prestadorservico_20_08;

/**
 *
 * @author aluno.den
 */
public abstract class Jurídica_abstract extends Pessoa_abstract{
    protected String cnpj;
    protected String inscricaoEstadual;

    public Jurídica_abstract(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereço_class endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCNPJ: " + cnpj + 
                "\nInscrição Estadual: " + inscricaoEstadual;
    }

  
    
}
