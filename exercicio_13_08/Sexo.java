/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.exercicio_13_08;

/**
 *
 * @author aluno.den
 */
public enum Sexo {
    FEMININO("Feminino"),
    MASCULINO("Masculino");
    
    String descricaoSexo;

    private Sexo(String descricaoSexo) {
        this.descricaoSexo = descricaoSexo;
    }

    public String getDescricaoSexo() {
        return descricaoSexo;
    }
    
    
}
