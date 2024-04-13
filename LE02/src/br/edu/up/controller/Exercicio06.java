package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio06 {
    // 6. Elabore um programa que leia um vetor com 5 notas de um aluno e um outro
    // vetorcom 5 pesos e calcule a média ponderada do aluno.Média ponderada =
    // (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3)
    // Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4)

    public static void Executar(){
        PrintController.ExibirNaTela(06);
        
        Scanner scanner = ScannerUtil.getScanner();
        int tamanho = 5;
        double[] notas = new double[tamanho];
        double[] pesos = new double[tamanho];

        // Lendo as notas do aluno
        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < tamanho; i++) {
            notas[i] = scanner.nextDouble();
        }

        // Lendo os pesos das notas
        System.out.println("Digite os 5 pesos das notas:");
        for (int i = 0; i < tamanho; i++) {
            pesos[i] = scanner.nextDouble();
        }

        // Calculando a média ponderada
        double somaProdutos = 0;
        double somaPesos = 0;
        for (int i = 0; i < tamanho; i++) {
            somaProdutos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = somaProdutos / somaPesos;

        // Apresentando a média ponderada
        System.out.println("Média ponderada: " + mediaPonderada);
    }
}
