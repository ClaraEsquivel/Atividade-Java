/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motoboy_diretor_26_08;

/**
 *
 * @author aluno.den
 */
public abstract class Funcionário_abstract {
    protected String nome;
    protected String dataNascimento;
    protected Sexo_enum sexo;
    protected Setor_enum setor;
    protected double salarioBase;

    public Funcionário_abstract(String nome, String dataNascimento, Sexo_enum sexo, Setor_enum setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo_enum getSexo() {
        return sexo;
    }

    public void setSexo(Sexo_enum sexo) {
        this.sexo = sexo;
    }

    public Setor_enum getSetor() {
        return setor;
    }

    public void setSetor(Setor_enum setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + 
                "\nData de Nascimento: " + dataNascimento + 
                "\nSexo: " + sexo + 
                "\nSetor: " + setor + 
                "\nSalário Base: " + salarioBase;
    }
    
    
    
  
}
