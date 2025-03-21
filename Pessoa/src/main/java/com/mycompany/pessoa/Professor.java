/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author gustawz
 */
// Classe Professor que herda de Pessoa
class Professor extends Pessoa {
    private String disciplina; // Disciplina ministrada
    private String rf; // Registro Funcional

    // Construtor da classe Professor
    public Professor(String nome, String cpf, String dataNascimento, String disciplina, String rf) {
        super(nome, cpf, dataNascimento); // Chama o construtor da superclasse
        this.disciplina = disciplina;
        this.rf = rf;
    }

    // Sobrescrita do método exibirInfo
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Registro Funcional: " + rf);
    }
}
