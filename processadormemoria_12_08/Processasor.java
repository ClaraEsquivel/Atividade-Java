/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.processadormemoria_12_08;

/**
 *
 * @author aluno.den
 */
public class Processasor  extends Produto{
    //extends - chamar o modelo
    private String frequencia;

    public Processasor(String frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

   
    
    
    
}
