package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio16 {
    // 16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua
    // médiaaritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83

    public static void MediaAritmetica() {
        PrintController.ExibirNaTela(16);

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média aritmética
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média: " + String.format("%.2f", media));
    }
}
