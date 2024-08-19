/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario_19_08;

/**
 *
 * @author aluno.den
 */
public class Médico extends DadosFuncionario{
    private String crm;

    public Médico(String crm, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nDados do Médico: " + 
               super.toString() + 
               "\nCRM: " + crm;
    }
    
    
   
    
}
