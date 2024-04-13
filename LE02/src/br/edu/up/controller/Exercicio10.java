package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio10 {
    // 10. Crie um programa que leia um vetor A de 5 posições e, ao final da
    // leitura, copie os elementos de A em B de forma invertida. Ou seja, o primeiro
    // elemento de A é o último elemento de B, o segundo elemento de A é o penúltimo
    // elemento de B, e assim por diante.

    public static void Executar(){
        PrintController.ExibirNaTela(10);

        Scanner scanner = ScannerUtil.getScanner();
        int tamanho = 5;

        // Lendo o vetor A
        System.out.println("Digite os elementos do vetor A:");
        int[] vetorA = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = scanner.nextInt();
        }

        // Criando o vetor B
        int[] vetorB = new int[tamanho];

        // Copiando os elementos de A para B de forma invertida
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = vetorA[tamanho - 1 - i];
        }

        // Apresentando o vetor B
        System.out.println("O vetor B, com os elementos de A invertidos, é:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
