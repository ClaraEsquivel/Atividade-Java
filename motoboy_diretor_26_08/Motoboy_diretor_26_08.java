/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motoboy_diretor_26_08;

/**
 *
 * @author aluno.den
 */
public class Motoboy_diretor_26_08 {

    public static void main(String[] args) {
        Motoboy_class motoboy = new Motoboy_class("A", "João", "12/05/1997", Sexo_enum.MASCULINO, Setor_enum.OPERACOES, 2000.0);
        Diretor_class diretor = new Diretor_class("Matheus", "25/01/1984", Sexo_enum.MASCULINO, Setor_enum.FINANCEIRO, 5000.0);
        
        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());
        diretor.demitir(motoboy);
    }
}
