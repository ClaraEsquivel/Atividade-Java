package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // declarando variáveis
        String nomeUsuario = "Clara";
        int senha = 123;

        // comparação de strings e inteiros
        // boolean - armazena um valor verdadeiro ou falso
        // equals - determina se dois objetos são iguais
        boolean resultadoNome = nomeUsuario.equals("Clara");
        boolean resultadoSenha = (senha == 456 );

        // exibindo resultados
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
