/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ex_enum_13_08;

/**
 *
 * @author aluno.den
 */
public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino"); 
    //";" - Apenas na última definição
    
    String texto;
    //para acrescentar o texto

    private Sexo(String texto) {
        this.texto = texto;
    }

    //cria apenas o getter
    public String getTexto() {
        return texto;
    }
    
}
