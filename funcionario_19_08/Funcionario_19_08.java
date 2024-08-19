/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionario_19_08;

/**
 *
 * @author aluno.den
 */
public class Funcionario_19_08 {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("A", "Miguel", "000.000.000-10", "00.000.010", 2000);
        Engenheiro engenheiro = new Engenheiro("Ad56", "Ediberto", "000.000.000-20", "00.000.020", 7000);
        Médico medico = new Médico("2345", "Gervásio", "000.000.000-30", "00.000.030", 10000);
        
        System.out.println(motoboy.toString());
        System.out.println(engenheiro.toString());
        System.out.println(medico.toString());
           
    }
}
