package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio05 {
    // 5. Elabore um programa que leia 5 números do teclado e os armazene em um
    // vetor.Em seguida, leia um número n qualquer e apresente na tela a quantidade
    // de vezes que o número n aparece no vetor

    public static void Executar() {
        PrintController.ExibirNaTela(05);

        System.out.println("5. Elabore um programa que leia 5 números do teclado e os armazene em um" +
                "\nvetor.Em seguida, leia um número n qualquer e apresente na tela a quantidade" +
                "\nde vezes que o número n aparece no vetor.\n");

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

        // Contando a quantidade de vezes que o número n aparece no vetor
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == n) {
                contador++;
            }
        }

        // Apresentando na tela a quantidade de vezes que o número n aparece no vetor
        System.out.println("O número " + n + " aparece " + contador + " vezes no vetor.");
    }
}
