package aula_05_08;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner notas = new Scanner(System.in);

        String resultado;
        double primeiraNota, segundaNota, terceiraNota, media;

        System.out.println("Digite sua primeira nota: ");
        primeiraNota = notas.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        segundaNota = notas.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        terceiraNota = notas.nextDouble();

        media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (media >= 7){
            resultado = "Aprovado";
        } else if (media >= 5){
            resultado = "Verificação Suplementar";
        } else {
            resultado = "Reprovado";
        }

        System.out.println("Primeira nota:" + primeiraNota);
        System.out.println("Segunda nota: " + segundaNota);
        System.out.println("Terceira nota: " + terceiraNota);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
    }
}
