/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente_prestadorservico_20_08;

/**
 *
 * @author aluno.den
 */
public abstract class Física_abstract extends Pessoa_abstract{
    protected Sexo_enum sexo;
    protected Estado_Civil_enum estadoCivi;
    protected String dataNascimento;

    public Física_abstract(Sexo_enum sexo, Estado_Civil_enum estadoCivi, String dataNascimento, String nome, String telefone, String email, Endereço_class endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivi = estadoCivi;
        this.dataNascimento = dataNascimento;
    }

    public Sexo_enum getSexo() {
        return sexo;
    }

    public void setSexo(Sexo_enum sexo) {
        this.sexo = sexo;
    }

    public Estado_Civil_enum getEstadoCivi() {
        return estadoCivi;
    }

    public void setEstadoCivi(Estado_Civil_enum estadoCivi) {
        this.estadoCivi = estadoCivi;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nSexo: " + sexo.texto + 
                "\nEstado Civil: " + estadoCivi.texto +
                "\nData Nascimento: " + dataNascimento;
    }

   
    
}
