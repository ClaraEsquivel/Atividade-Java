/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.cadastro_completo_19_08;

/**
 *
 * @author aluno.den
 */
public enum Unidade_Federativa {
    BAHIA("Bahia" , "BA"),
    SAO_PAULO("São Paulo" , "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro" , "RJ");
    
    String nome;
    String sigla;

    private Unidade_Federativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
