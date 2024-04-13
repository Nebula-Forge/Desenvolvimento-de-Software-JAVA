package br.edu.up.controller;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio08 {
    // 8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que
    // representa a concatenação de A e B, ou seja, C contém os elementos de A
    // seguidos dos elementos de B.

    public static void Executar() {
        PrintController.ExibirNaTela(8);

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

        // Criando o vetor C
        int[] vetorC = new int[tamanho * 2];

        // Copiando os elementos de A para C
        for (int i = 0; i < tamanho; i++) {
            vetorC[i] = vetorA[i];
        }

        // Copiando os elementos de B para C
        for (int i = 0; i < tamanho; i++) {
            vetorC[tamanho + i] = vetorB[i];
        }

        // Apresentando o vetor C
        System.out.println("O vetor C, resultante da concatenação de A e B, é:");
        System.out.println(Arrays.toString(vetorC));
    }
}
