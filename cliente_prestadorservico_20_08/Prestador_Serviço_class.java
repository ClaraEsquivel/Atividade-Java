/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente_prestadorservico_20_08;

/**
 *
 * @author aluno.den
 */
public class Prestador_Serviço_class extends Jurídica_abstract{
    private String contratoInicio;
    private String contratoFim;

    public Prestador_Serviço_class(String contratoInicio, String contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereço_class endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }


    public String getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(String contratoFim) {
        this.contratoFim = contratoFim;
    }

    public String getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(String contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    @Override
    public String toString() {
        return "\n= Prestador de Serviços = " + 
                "\nContrato Inicio: " + contratoInicio + 
                "\nContrato Fim: " + contratoFim +
                super.toString();    }
    
    
}
