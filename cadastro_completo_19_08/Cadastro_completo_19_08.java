/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastro_completo_19_08;

/**
 *
 * @author aluno.den
 */
public class Cadastro_completo_19_08 {

    public static void main(String[] args) {
        Física fisica = new Física(Sexo.FEMININO, "000", "000", "10/02/05", 2000, 02, "Maria", "(71)98756-3215",
        new Endereço("Avenida 01", "564E", "Casa", "40.666.025", "Salvador", Unidade_Federativa.BAHIA));
        
        Jurídica juridica = new Jurídica("555669989878", "123", "18/02/22", "18/02/25", 5000, 01, "João", "(71)95684-1236",
        new Endereço("Avenida 02", "054", "Apartamento", "40.698.658", "Guarulhos", Unidade_Federativa.SAO_PAULO));
        
        System.out.println(fisica.toString());
        System.out.println(juridica.toString());
    }
}
