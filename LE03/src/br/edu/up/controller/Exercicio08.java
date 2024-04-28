package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio08 {
    // 8. Escrever um programa que leia o nome e as três notas obtidas por um aluno
    // durante o semestre. Calcular a sua média (aritmética), informar o nome e sua
    // menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media
    // entre 5.1 a 6.9).

    private String nomeAluno;
    private double nota1;
    private double nota2;
    private double nota3;

    // Construtor vazio
    public Exercicio08() {
    }

    // Construtor com parâmetros
    public Exercicio08(String nomeAluno, double nota1, double nota2, double nota3) {
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

    // Método para calcular a média aritmética
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para determinar a menção do aluno
    public String determinarMencao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else if (media <= 5) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }

    // Método para executar o programa
    public static void Executar() {
        PrintController.ExibirNaTela(8);

        System.out.println("8. Escrever um programa que leia o nome e as três notas obtidas por um aluno\n"
                + "durante o semestre. Calcular a sua média (aritmética), informar o nome e sua\n"
                + "menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media\n"
                + "entre 5.1 a 6.9).\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        // Solicita as três notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Criando uma instância da classe Exercicio08 usando o construtor com
        // parâmetros
        Exercicio08 exercicio = new Exercicio08(nomeAluno, nota1, nota2, nota3);

        // Utilizando os métodos de acesso para obter os valores e determinar a menção
        // do aluno
        double media = exercicio.calcularMedia();
        String mencao = exercicio.determinarMencao();

        // Apresenta o nome do aluno, sua média e sua menção
        System.out.println("Nome do aluno: " + exercicio.getNomeAluno());
        System.out.println("Média: " + media);
        System.out.println("Menção: " + mencao);
    }
}
