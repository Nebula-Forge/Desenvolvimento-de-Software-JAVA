package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio12 {
    // 12. Elabore um programa que leia um vetor de 12 elementos apresente na tela o
    // produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5,
    // 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840

    public static void Executar() {
        PrintController.ExibirNaTela(12);

        System.out.println("12. Elabore um programa que leia um vetor de 12 elementos apresente na tela o" +
                "\nproduto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5," +
                "\n8, 1, -6, 4, -7, 9, 10, -14, 3, 12}=8*4*10*12=3840\n");

        Scanner scanner = ScannerUtil.getScanner();
        int tamanho = 12;

        // Lendo o vetor
        System.out.println("Digite os elementos do vetor:");
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Calculando o produto dos elementos pares positivos
        int produto = 1;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) { // Verifica se é positivo e par
                produto *= vetor[i];
            }
        }

        // Apresentando o resultado
        System.out.println("O produto dos elementos pares positivos é: " + produto);
    }
}
