/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_27_08;

/**
 *
 * @author aluno.den
 */
public class Diretor_class extends CargoDeConfiança_abstract implements Contratação_interface{
    
   public final double PREMIO = 0.5;
    
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario * PREMIO * super.bonificacao.DIRETOR.getValor();
        salarioFinal += super.salario;
        return salarioFinal;
    }
    
   
    public Diretor_class(Bonificacao_enum bonificacao, String nome, String cpf, String rg, Endereço_class endereco, Setor_Enum setor, Sexo_enum sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    public Bonificacao_enum getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao_enum bonificacao) {
        this.bonificacao = bonificacao;
    }

    
    @Override
    public String toString() {
        return "\n== Diretor ==" + 
               "\nPrêmio: " + PREMIO +
                super.toString();
                
    }

    @Override
    public void admitir(Funcionário_abstract funcionario) {
       
    }

    @Override
    public void demitir(Funcionário_abstract funcionario) {
        
    }



    

   
   
    
}
