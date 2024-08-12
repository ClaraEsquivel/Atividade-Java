/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computador_12_08;

/**
 *
 * @author aluno.den
 */
public class DispositivoArmazenamento extends Produto{
    private String capacidadeArmazenamento;
    private String tipoConexao;

    public DispositivoArmazenamento(String capacidadeArmazenamento, String tipoConexao, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoConexao = tipoConexao;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }
    
    
    
}
