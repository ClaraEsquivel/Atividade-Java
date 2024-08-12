/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livro_06_08;

/**
 *
 * @author aluno.den
 */
public class Livro_06_08 {

    public static void main(String[] args) {
        livros_caracteristicas primeiroLivro = new livros_caracteristicas("A Seleção", "Liera Cass", 220, 40) ;
        livros_caracteristicas segundoLivro = new livros_caracteristicas("Bruxaria Natural","DarkSide", 350, 70);  
         
        System.out.println("\n = = = Primeiro Livro = = =");
        System.out.println("Nome do livro: " + primeiroLivro.getTitulo());
        System.out.println("Autor: " + primeiroLivro.getAutor());
        System.out.println("Número de páginas: " + primeiroLivro.getPaginas());
        System.out.println("Preço: " + primeiroLivro.getPreco());
        
        System.out.println("\n= = = Segundo Livro = = =");
        System.out.println("Nome do livro: " + segundoLivro.getTitulo());
        System.out.println("Autor: " + segundoLivro.getAutor());
        System.out.println("Número de páginas: " + segundoLivro.getPaginas());
        System.out.println("Preço: " + segundoLivro.getPreco());
    }   
    
    

   
}
