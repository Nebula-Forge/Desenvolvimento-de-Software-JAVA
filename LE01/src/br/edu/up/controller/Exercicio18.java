package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio18 {
    // 18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua
    // média harmônica. Média harmônica =31 + 1 + 1. nota1 + nota2 + nota3. Exemplo:
    // nota1 = 10, nota2 = 5.5, nota3 = 8Média: 7.37

    public static void MediaHarmonica() {
        PrintController.ExibirNaTela(18);

        System.out.println("18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua\n" +
                "média harmônica. Média harmônica =31 + 1 + 1. nota1 + nota2 + nota3. Exemplo:\n" +
                "nota1 = 10, nota2 = 5.5, nota3 = 8Média: 7.37.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média harmônica
        double mediaHamonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

        System.out.println("Média harmônica: " + String.format("%.2f", mediaHamonica));
    }
}
