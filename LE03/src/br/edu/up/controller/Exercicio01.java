package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio01 {
    // 1. Escrever um programa que leia o nome de um aluno e as notas das três
    // provas que ele obteve no semestre. No final informar o nome do aluno e a sua
    // média (aritmética).

    private String nomeAluno;
    private double nota1;
    private double nota2;
    private double nota3;

    // Construtor vazio
    public Exercicio01() {
    }

    // Construtor com parâmetros
    public Exercicio01(String nomeAluno, double nota1, double nota2, double nota3) {
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Métodos para acessar e modificar as variáveis privadas
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    // Método para calcular a média
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void Executar() {
        PrintController.ExibirNaTela(1);

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("1. Escrever um programa que leia o nome de um aluno e as notas das três\n"
                + "provas que ele obteve no semestre. No final informar o nome do aluno e a sua\n"
                + "média (aritmética).\n");

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scanner.next();

        System.out.println("Digite a primeira nota da prova: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota da prova: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota da prova: ");
        double nota3 = scanner.nextDouble();

        // Criando uma instância da classe Exercicio01 usando o construtor com
        // parâmetros
        Exercicio01 exercicio = new Exercicio01(nomeAluno, nota1, nota2, nota3);

        // Utilizando os métodos de acesso para obter o nome do aluno e calcular a média
        System.out.println("O aluno " + exercicio.getNomeAluno() + " obteve a média " + exercicio.calcularMedia());
    }
}
