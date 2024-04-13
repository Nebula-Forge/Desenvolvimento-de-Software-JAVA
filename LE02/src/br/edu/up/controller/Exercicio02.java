package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio02 {
    // 2. Escreva um algoritmo que leia em um vetor uma sequência finita de números
    // digitados pelo usuário e, logo após, mostre o número de cada posição do vetor
    // e se ele é positivo, negativo ou zero.

    public static void Executar() {
        PrintController.ExibirNaTela(02);

        System.out.println("2. Escreva um algoritmo que leia em um vetor uma sequência finita de números" +
                "\ndigitados pelo usuário e, logo após, mostre o número de cada posição do vetor" +
                "\ne se ele é positivo, negativo ou zero.\n");

        Scanner scanner = ScannerUtil.getScanner();
        int tamanho;

        // Solicitando ao usuário o tamanho do vetor
        System.out.println("Digite o tamanho do vetor:");
        tamanho = scanner.nextInt();

        // Criando o vetor com o tamanho especificado pelo usuário
        int[] vetor = new int[tamanho];

        // Lendo os números digitados pelo usuário e armazenando no vetor
        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Verificando se cada número do vetor é positivo, negativo ou zero e exibindo o
        // resultado
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0) {
                System.out.println("O número na posição " + i + " é positivo.");
            } else if (vetor[i] < 0) {
                System.out.println("O número na posição " + i + " é negativo.");
            } else {
                System.out.println("O número na posição " + i + " é zero.");
            }
        }
    }

}
