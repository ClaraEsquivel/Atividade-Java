/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notacaoponto;

/**
 *
 * @author aluno.den
 */
public class Notacaoponto {

    public static void main(String[] args) {
        String nome = "Clara";
        String sobrenome = "Esquivel";

        // Exibindo a quantidade de caracteres
        // length - contar a quantidade determinada de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        // Concetenando (juntando) nome + sobrenome
        // concat - juntar 
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo nome completo maiúsculo
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());

        // Exibindo nome complleto minúsculo
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());

    }
}
