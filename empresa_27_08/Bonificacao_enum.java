/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.empresa_27_08;

/**
 *
 * @author aluno.den
 */
public enum Bonificacao_enum {
    GERENTE(0.35),
    DIRETOR(0.45);
    
    private final double valor;

    private Bonificacao_enum(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    
}
