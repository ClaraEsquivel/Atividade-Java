/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoes_26_08;

/**
 *
 * @author aluno.den
 */
public class Operacoes_26_08 {

    public static void main(String[] args) {
       Soma_class soma = new Soma_class();
       Subtração_class subtracao = new Subtração_class();
       Multiplicação_class multiplicacao = new Multiplicação_class();
       Divisão_class divisao = new Divisão_class();
       
       
        System.out.println("Soma: " + soma.calcular(5, 6));
        System.out.println("Subtração: " + subtracao.calcular(5, 6));
        System.out.println("Multiplicação: " + multiplicacao.calcular(5, 6));
        System.out.println("Divisão: " + divisao.calcular(5, 6));
    }
}
