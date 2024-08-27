/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animais_26_08;

/**
 *
 * @author aluno.den
 */
public class Animais_26_08 {

    public static void main(String[] args) {
        Cachorro_class cachorro = new Cachorro_class();
        Gato_class gato = new Gato_class();
        Pato_Class pato = new Pato_Class();
        Galo_class galo = new Galo_class();
        
        System.out.println("\nSom cachorro: " + cachorro.emitirSom());
        System.out.println("Comida cachorro: " + cachorro.comer());
        
        System.out.println("\nSom gato: " + gato.emitirSom());
        System.out.println("Comida gato: " + gato.comer());
        
        System.out.println("\nSom pato: " + pato.emitirSom());
        System.out.println("Comida pato: " + pato.comer());
        
        System.out.println("\nSom galo: " + galo.emitirSom());
        System.out.println("Comida galo: " + galo.comer());
                
    }
}
