package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio04 {
    // 4. Elabore um programa que leia um vetor de 5 números digitados pelo usuário
    // e uma variável de um número n qualquer, depois mostre na tela o índice dos
    // elementos quesão inferiores a n.

    public static void Executar() {
        PrintController.ExibirNaTela(04);

        Scanner scanner = ScannerUtil.getScanner();
        int tamanho = 5;
        int[] vetor = new int[tamanho];

        // Lendo os números digitados pelo usuário e armazenando no vetor
        System.out.println("Digite 5 números:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Solicitando ao usuário um número n
        System.out.println("Digite um número n:");
        int n = scanner.nextInt();

        // Mostrando na tela o índice dos elementos que são inferiores a n
        System.out.println("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] < n) {
                System.out.println(i);
            }
        }
    }
}
