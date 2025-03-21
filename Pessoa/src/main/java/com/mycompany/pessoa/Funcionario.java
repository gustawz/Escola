/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author gustawz
 */
// Classe Funcionario que herda de Pessoa
class Funcionario extends Pessoa {
    private String cargo; // Cargo do funcionário
    private String rgm; // Registro Geral do Funcionário

    // Construtor da classe Funcionario
    public Funcionario(String nome, String cpf, String dataNascimento, String cargo, String rgm) {
        super(nome, cpf, dataNascimento); // Chama o construtor da superclasse
        this.cargo = cargo;
        this.rgm = rgm;
    }

    // Sobrescrita do método exibirInfo
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cargo: " + cargo);
        System.out.println("RGM: " + rgm);
    }
}
