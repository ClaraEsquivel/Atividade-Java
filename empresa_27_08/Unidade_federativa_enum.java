/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.empresa_27_08;

/**
 *
 * @author aluno.den
 */
public enum Unidade_federativa_enum {
    BAHIA("Bahia" , "BA"),
    SAO_PAULO("São Paulo" , "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro" , "RJ");
    
    String texto;
    String sigla;

    private Unidade_federativa_enum(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
