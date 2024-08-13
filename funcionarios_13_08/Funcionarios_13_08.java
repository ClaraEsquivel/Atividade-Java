/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionarios_13_08;

/**
 *
 * @author aluno.den
 */
public class Funcionarios_13_08 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("123", "Maria", 1450, Setor.FINANCEIRO, Sexo.FEMININO, 25);

        System.out.println("Id: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("Sexo: " + funcionario.getSexo());
        System.out.println("idade: " + funcionario.getIdade());
        
    }
}
