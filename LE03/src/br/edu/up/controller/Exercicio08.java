package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio08 {
    // 8. Escrever um programa que leia o nome e as três notas obtidas por um aluno
    // durante o semestre. Calcular a sua média (aritmética), informar o nome e sua
    // menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media
    // entre 5.1 a 6.9).

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

        // Calcula a média aritmética
        double media = (nota1 + nota2 + nota3) / 3;

        // Determina a menção do aluno
        String mencao;
        if (media >= 7) {
            mencao = "Aprovado";
        } else if (media <= 5) {
            mencao = "Reprovado";
        } else {
            mencao = "Recuperação";
        }

        // Apresenta o nome do aluno, sua média e sua menção
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Média: " + media);
        System.out.println("Menção: " + mencao);
    }
}
