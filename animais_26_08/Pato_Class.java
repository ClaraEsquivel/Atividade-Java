/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais_26_08;

/**
 *
 * @author aluno.den
 */
public class Pato_Class implements Animais_interface{

    @Override
    public String emitirSom() {
        return "Quack quack!";
    }

    @Override
    public String comer() {
        return "Pão";
    }
    
    
}
