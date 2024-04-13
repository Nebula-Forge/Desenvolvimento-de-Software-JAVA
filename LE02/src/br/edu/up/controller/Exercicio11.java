package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio11 {
    // 11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de
    // inteiros de tamanho igual a 5. Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} =
    // 0*1 + 2*3 + 4*5 + 6*7 +8*9 = 140

    public static void Executar(){
        PrintController.ExibirNaTela(11);

        Scanner scanner = ScannerUtil.getScanner();
        int tamanho = 5;

        // Lendo o vetor A
        System.out.println("Digite os elementos do vetor A:");
        int[] vetorA = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = scanner.nextInt();
        }

        // Lendo o vetor B
        System.out.println("Digite os elementos do vetor B:");
        int[] vetorB = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = scanner.nextInt();
        }

        // Calculando o produto escalar
        int produtoEscalar = 0;
        for (int i = 0; i < tamanho; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }

        // Apresentando o resultado
        System.out.println("O produto escalar entre os vetores A e B é: " + produtoEscalar);
    }
}
