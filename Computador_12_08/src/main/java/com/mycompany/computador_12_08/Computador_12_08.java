/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computador_12_08;

/**
 *
 * @author aluno.den
 */
public class Computador_12_08 {

    public static void main(String[] args) {
        Processador processador = new Processador("AMD", "Ryzen 7", "3.8Ghz");
        Memoria memoria = new Memoria("12", "3.8", "A", "B");
        PlacaMae placamae = new PlacaMae(".", ";", ".");
        DispositivoArmazenamento dispositivo = new DispositivoArmazenamento("l", "po", "", "w");
                
                
       
        
        System.out.println("= = PROCESSADOR = =");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frequência: " + processador.getFrequencia());
        
        System.out.println("\n= = MEMÓRIA = =");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Capacidade de Armazenamento: " + memoria.getCapacidadeArmazenamento());
    }
}
