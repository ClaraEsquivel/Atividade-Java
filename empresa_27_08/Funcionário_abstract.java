/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_27_08;

/**
 *
 * @author aluno.den
 */
public abstract class Funcionário_abstract implements Salario_final_interface{
    
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereço_class endereco;
    protected Setor_Enum setor;
    protected Sexo_enum sexo;
    protected double salario;
    protected String dataNascimento;

    public Funcionário_abstract(String nome, String cpf, String rg, Endereço_class endereco, Setor_Enum setor, Sexo_enum sexo, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.sexo = sexo;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Endereço_class getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço_class endereco) {
        this.endereco = endereco;
    }

    public Setor_Enum getSetor() {
        return setor;
    }

    public void setSetor(Setor_Enum setor) {
        this.setor = setor;
    }

    public Sexo_enum getSexo() {
        return sexo;
    }

    public void setSexo(Sexo_enum sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\n== Dados do Funcionário ==" + 
                "\nNome: " + nome + 
                "\nCPF: " + cpf + 
                "\nRG: " + rg + 
                "\nSetor: " + setor + 
                "\nSexo: " + sexo + 
                "\nSalário: " + salario + 
                "\nData de Nascimento: " + dataNascimento +
                "\n== Endereço ==" + endereco;
    }
    
    
   }
  