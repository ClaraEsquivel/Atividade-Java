/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cliente_prestadorservico_20_08;

/**
 *
 * @author aluno.den
 */
public class Cliente_prestadorservico_20_08 {

    public static void main(String[] args) {
        Cliente_class cliente = new Cliente_class("123", Sexo_enum.FEMININO, Estado_Civil_enum.SOLTEIRO, "05/04/2001", "Maria", "(71)98888-5555", "maria@gmail.com",
        new Endereço_class("Penha", "56E", "Casa", "40.000.001", "Salvador", Unidade_Federativa_enum.BAHIA));
        
        Prestador_Serviço_class prestador = new Prestador_Serviço_class("20/07/2024", "20/07/2025", "565.656.565/6", "005", "José", "(71)98888-6666", "jose@gmail.com", 
        new Endereço_class("Liberdade", "025", "Apartamento", "40.000.006", "Guarulhos", Unidade_Federativa_enum.SAO_PAULO));
        
        System.out.println(cliente.toString());
        System.out.println(prestador.toString());
    }
}
