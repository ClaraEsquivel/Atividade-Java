/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario_19_08;

/**
 *
 * @author aluno.den
 */
public class Motoboy extends DadosFuncionario{
    private String cnh;

    public Motoboy(String cnh, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "\nDados do Motoboy: " + 
               super.toString() +
               "\nCNH : " + cnh;
    }
    
    
}
