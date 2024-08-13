/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_13_08;

/**
 *
 * @author aluno.den
 */
public class Exercicio_13_08 {

    public static void main(String[] args) {
        Clientes cliente = new Clientes(001, "Clara", 21, "(71)98529-6315", "clara@gmail.com", Sexo.FEMININO, 
        new Endereço("Pajussara", "970E", "Casa", "40.700.000", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println("= = = Cliente = = =");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Sexo: " + cliente.getSexo().getDescricaoSexo());
        
        System.out.println("Endereço: " + cliente.getEndereço());
        //System.out.println("Endereço: " + cliente.getEndereço().getUf().getNome() + " " + cliente.getEndereço().getUf().getSigla());
        
     
    }
}
