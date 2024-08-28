/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.motoboy_diretor_26_08;

/**
 *
 * @author aluno.den
 */
public enum Setor_enum {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operações");
    
    String texto;

    private Setor_enum(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
