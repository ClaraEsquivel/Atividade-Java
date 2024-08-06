/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login_senha;

/**
 *
 * @author aluno.den
 */
public class Login_senha {

    public static void main(String[] args) {
        // declarando variáveis
        String nomeUsuario = "Clara";
        int senha = 123;

        //comparação de strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Clara");
        boolean resultadoSenha = (senha == 456 );

        //exibindo resultados
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
