/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motoboy_diretor_26_08;

/**
 *
 * @author aluno.den
 */
public class Diretor_class extends Funcionário_abstract implements Contratação_interface{
    
    private final double PREMIO = 0.2;

    public Diretor_class(String nome, String dataNascimento, Sexo_enum sexo, Setor_enum setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }
    
    public double getPREMIO(){
        return PREMIO;
    }

    
    public double getSalarioFinal(){
        double salarioFinal = 0;
        salarioFinal = super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
    }
    
    
    @Override
    public void admitir(Funcionário_abstract funcionario) {
        System.out.println("\n= Admitindo Funcionário =");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionário_abstract funcionario) {
        System.out.println("\n= Demitindo Funcionário =");
        System.out.println(funcionario.toString());
        
    }

    @Override
    public String toString() {
        return "\n= Diretor =" + 
                super.toString() +
                "\nPRÊMIO: " + PREMIO + 
                "\nSalárrio final: " + this.getSalarioFinal();
    }
    
    
    
}
