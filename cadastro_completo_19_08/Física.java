/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro_completo_19_08;

/**
 *
 * @author aluno.den
 */
public class Física extends Pessoa_abstract{
    
    private Sexo sexo;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private double salário;

    public Física(Sexo sexo, String cpf, String rg, String dataNascimento, double salário, int id, String nome, String telefone, Endereço endereço) {
        super(id, nome, telefone, endereço);
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salário = salário;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\nDados da Pessoa Física: " + 
                super.toString() +
                "\n= = Outros dados = =" +
                "\nSexo: " + sexo + 
                "\nCPF: " + cpf + 
                "\nRG: " + rg + 
                "\nData Nascimento: " + dataNascimento + 
                "\nSalário: " + salário;
    }
    
    
    
}
