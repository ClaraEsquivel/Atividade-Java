/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente_prestadorservico_20_08;

/**
 *
 * @author aluno.den
 */
public class Cliente_class extends Física_abstract{
    private String protocoloAtendimento;

    public Cliente_class(String protocoloAtendimento, Sexo_enum sexo, Estado_Civil_enum estadoCivi, String dataNascimento, String nome, String telefone, String email, Endereço_class endereco) {
        super(sexo, estadoCivi, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }


    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\n = Dados do Cliente = " + 
                "\nProtocolo de Atendimento: " + protocoloAtendimento +
                super.toString();
    }

   
}
