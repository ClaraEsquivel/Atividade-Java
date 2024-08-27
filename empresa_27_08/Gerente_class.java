/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_27_08;

/**
 *
 * @author aluno.den
 */
public class Gerente_class extends CargoDeConfiança_abstract{

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario * super.bonificacao.GERENTE.getValor();
        salarioFinal += super.salario;
        return salarioFinal;
    }
    
    public Bonificacao_enum getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao_enum bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Gerente_class(Bonificacao_enum bonificacao, String nome, String cpf, String rg, Endereço_class endereco, Setor_Enum setor, Sexo_enum sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    @Override
    public String toString() {
        return "\n==Gerente ==" +
                super.toString();
    }

}
