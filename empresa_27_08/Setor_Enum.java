/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.empresa_27_08;

/**
 *
 * @author aluno.den
 */
public enum Setor_Enum {
    
    ENGENHARIA("Engenharia"),
    JURIDICO("Jurídico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    String texto;

    private Setor_Enum(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
