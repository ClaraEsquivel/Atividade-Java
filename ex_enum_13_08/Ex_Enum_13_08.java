/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_enum_13_08;

/**
 *
 * @author aluno.den
 */
public class Ex_Enum_13_08 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Clara", Sexo.FEMININO);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Sexo: " + cliente.getSexo().getTexto());
    }
}
