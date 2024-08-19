/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fisica_juridica_19_08;

/**
 *
 * @author aluno.den
 */
public class Fisica_juridica_19_08 {

    public static void main(String[] args) {
        Física fisica = new Física("000.000.000-00", "20.000.000", "18/07/2003", "Clara", "(71)98888-7777");
        Juridica juridica = new Juridica("0000-000000", "00321", "Cerise", "(71)98888-6666");
        
       /* System.out.println("= = Pessoa Física = =");
        System.out.println("Nome: " + fisica.getNome());
        System.out.println("Telefone: " + fisica.getTelefone());    
        System.out.println("CPF: " + fisica.getCpf());
        System.out.println("RG: " + fisica.getRg());
        System.out.println("Data de nascimento: " + fisica.getDataNascimento());
        
        System.out.println("\n= = Pessoa Jurídica = =");
        System.out.println("Nome: " + juridica.getNome());
        System.out.println("Telefone: " + juridica.getTelefone());
        System.out.println("CNPJ: " + juridica.getCnpj());
        System.out.println("Inscrição Estadual: " + juridica.getInscricaoEstadual());*/
       
       
       //puxa pelo toString
        System.out.println(fisica.toString());    
        System.out.println(juridica);
              
    }
}
