/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.privado;

/**
 *
 * @author aluno.den
 */
public class Privado
{
    public static void main(String[] args) {
        
        //instanciando um objeto.
        //classe | objeto
        Clientes cliente = new Clientes("Clara", 21);
        Funcionarios funcionario = new Funcionarios("Maria", "Caixa", 1400);
       
        //usado para atualizar/trocar alguma informação
        //cliente.setNome("Clara");
        //cliente.setIdade(21);
        
        //set = inserir valores
        //get = trazer valores
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        
        System.out.println("\n Dados do funcionário: ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Função: " + funcionario.getFuncao());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}
