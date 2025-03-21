/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author gustawz
 */
// Classe Aluno que herda de Pessoa
class Aluno extends Pessoa {
    private String ra; // Registro do Aluno
    private String curso; // Curso matriculado

    // Construtor da classe Aluno
    public Aluno(String nome, String cpf, String dataNascimento, String ra, String curso) {
        super(nome, cpf, dataNascimento); // Chama o construtor da superclasse
        this.ra = ra;
        this.curso = curso;
    }

    // Sobrescrita do método exibirInfo
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da superclasse
        System.out.println("RA: " + ra);
        System.out.println("Curso: " + curso);
    }
}

