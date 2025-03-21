/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author gustawz
 */
// Classe principal para testar as classes
public class Main {
    public static void main(String[] args) {
        // Criando uma pessoa genérica
        Pessoa pessoa = new Pessoa("Carlos Silva", "123.456.789-00", "01/01/1980");
        System.out.println("Informações da Pessoa:");
        pessoa.exibirInfo();
        System.out.println();

        // Criando um aluno
        Aluno aluno = new Aluno("Ana Souza", "987.654.321-00", "15/05/2002", "202310001", "Engenharia");
        System.out.println("Informações do Aluno:");
        aluno.exibirInfo();
        System.out.println();

        // Criando um professor
        Professor professor = new Professor("Marcos Oliveira", "789.123.456-00", "10/09/1975", "Matemática", "RF12345");
        System.out.println("Informações do Professor:");
        professor.exibirInfo();
        System.out.println();

        // Criando um funcionário
        Funcionario funcionario = new Funcionario("Joana Costa", "456.789.123-00", "20/07/1985", "Secretária", "RGM9876");
        System.out.println("Informações do Funcionário:");
        funcionario.exibirInfo();
    }
}

