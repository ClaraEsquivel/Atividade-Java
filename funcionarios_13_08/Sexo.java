/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.funcionarios_13_08;

/**
 *
 * @author aluno.den
 */
public enum Sexo {
    FEMININO("Feminino"),
    MASCULINO("Masculino");
    
    String descriçaoSexo;

    private Sexo(String descriçaoSexo) {
        this.descriçaoSexo = descriçaoSexo;
    }

    public String getDescriçaoSexo() {
        return descriçaoSexo;
    }
    
    
}
