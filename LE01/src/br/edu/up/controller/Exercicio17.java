package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio17 {
    // 17. Elabore um algoritmo que receba três notas de um aluno os pesos
    // referentes acada nota e retorne a sua média ponderada. Veja o cálculo da
    // média ponderada: Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 *
    // peso3 / peso1 + peso2 + peso3 Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1
    // = 5, peso2 = 3, peso3 = 2. Média ponderada = 8.25

    public static void MediaPonderada() {
        PrintController.ExibirNaTela(17);

        System.out.println("17. Elabore um algoritmo que receba três notas de um aluno os pesos\n" +
                "referentes acada nota e retorne a sua média ponderada. Veja o cálculo da\n" +
                "média ponderada: Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 *\n" +
                "peso3 / peso1 + peso2 + peso3. Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1\n" +
                "= 5, peso2 = 3, peso3 = 2. Média ponderada = 8.25.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        // Calcula a média ponderada
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("Média ponderada: " + String.format("%.2f", mediaPonderada));

    }
}
