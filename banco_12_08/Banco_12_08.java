/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco_12_08;

/**
 *
 * @author aluno.den
 */
public class Banco_12_08 {

    public static void main(String[] args) {
        Conta_bancaria contaDoFuncionario = new Conta_bancaria("Nubank", 1234, "123456", "Corrente", "1000", "5000");
        Funcionario funcionario1 = new Funcionario("00258", "Júlia", "Ribeira", "(71)996698857", "julia@gmail.com", contaDoFuncionario);
        
        Funcionario funcionario2 = new Funcionario("00260", "Maria", "Uruguai", "(71)996698888", "maria@gmail.com", 
        new Conta_bancaria("Inter", 5678, "654321", "Corrente", "2000", "7000"));
        
        
        
        System.out.println(" = = = Dados do funcionário = = = ");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Dados da conta");
        System.out.println("Banco: " + funcionario1.getContaBanco().getBanco());
        System.out.println("Agência: " + funcionario1.getContaBanco().getAgencia());
        
        System.out.println("\n= = = Dados do funcionário = = =");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Dados da conta");
        System.out.println("Banco: " + funcionario2.getContaBanco().getBanco());
        System.out.println("Agência: " + funcionario2.getContaBanco().getAgencia());
    }
    
}
