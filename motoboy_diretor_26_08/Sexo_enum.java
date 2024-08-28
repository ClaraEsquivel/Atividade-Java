/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.motoboy_diretor_26_08;

import javax.print.DocFlavor;

/**
 *
 * @author aluno.den
 */
public enum Sexo_enum {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    String texto;

    private Sexo_enum(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
