/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario_19_08;

/**
 *
 * @author aluno.den
 */
public class Engenheiro extends DadosFuncionario{
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\nDados do Engenheiro: " + 
               super.toString() +
               "\nCREA: " + crea;
    }

   
    
}
