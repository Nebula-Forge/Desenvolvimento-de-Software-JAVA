package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio03 {
    // 3. Faça um programa que leia em um vetor uma sequência finita de números
    // digitados pelo usuário. Crie um segundo vetor que armazene o dobro de cada
    // número do primeiro vetor e depois apresente os valores deste vetor.

    public static void Executar() {
        PrintController.ExibirNaTela(03);

        System.out.println("3. Faça um programa que leia em um vetor uma sequência finita de números" +
                "\ndigitados pelo usuário. Crie um segundo vetor que armazene o dobro de cada" +
                "\nnúmero do primeiro vetor e depois apresente os valores deste vetor.\n");

        Scanner scanner = ScannerUtil.getScanner();
        int tamanho;

        // Solicitando ao usuário o tamanho do vetor
        System.out.println("Digite o tamanho do vetor:");
        tamanho = scanner.nextInt();

        // Criando o primeiro vetor com o tamanho especificado pelo usuário
        int[] vetorOriginal = new int[tamanho];

        // Lendo os números digitados pelo usuário e armazenando no vetor
        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }

        // Criando o segundo vetor com o dobro dos números do primeiro vetor
        int[] vetorDobro = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        // Apresentando os valores do segundo vetor
        System.out.println("Valores do vetor com o dobro dos números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorDobro[i]);
        }
    }
}
