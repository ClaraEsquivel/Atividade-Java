/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativi_12_08;

/**
 *
 * @author aluno.den
 */
public class VeiculoCliente_12_08 {

    public static void main(String[] args) {
        Veiculo veiculos = new Veiculo("SJ1M123", "Preto", 5, 30, 220, 12);
        
        Cliente clientes = new Cliente("Marcus", 50, "123.456.789-00", "Rio Sena", "(71)9 88886666");
        
        System.out.println("\n= = = VEÍCULO = = =");
        System.out.println("Placa" + veiculos.getPlaca());
        System.out.println("Cor" + veiculos.getCor());
        System.out.println("Número de Passageiros" + veiculos.getNumeroPassageiros());
        System.out.println("Capacidade do Tanque: " + veiculos.getCapacidadeTanque());
        System.out.println("Velocidade Máxima:" + veiculos.getVelocidadeMax());
        System.out.println("Consumo Médio:" + veiculos.getConsumoMedio());
        
        System.out.println("\n= = = CLIENTE  = = =");
        System.out.println("Nome:" + clientes.getNome());
        System.out.println("Idade:" + clientes.getIdade());
        System.out.println("CPF:" + clientes.getCpf());
        System.out.println("Endereço:" + clientes.getEndereco());
        System.out.println("Telefone:" + clientes.getTelefone());
    }
}
