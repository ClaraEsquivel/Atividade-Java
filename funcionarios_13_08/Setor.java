/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.funcionarios_13_08;

/**
 *
 * @author aluno.den
 */
public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");
    
    String descricaoSetor;

    private Setor(String descricaoSetor) {
        this.descricaoSetor = descricaoSetor;
    }

    public String getDescricaoSetor() {
        return descricaoSetor;
    }
    
    
}
