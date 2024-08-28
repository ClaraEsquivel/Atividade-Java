/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motoboy_diretor_26_08;

/**
 *
 * @author aluno.den
 */
public class Motoboy_class extends Funcionário_abstract{
    
    private String carteiraHabilitacao;

    public Motoboy_class(String carteiraHabilitacao, String nome, String dataNascimento, Sexo_enum sexo, Setor_enum setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    
    public double getSalarioFinal(){
        return this.getSalarioBase();
    }

    @Override
    public String toString() {
        return "\n= Motoboy =" + 
                super.toString() +
                "\nSalário Final: " + this.getSalarioFinal() +
                "\nCarteira de Habilitacao: " + carteiraHabilitacao;
    }

    
    
    
    
    

    
    
}
