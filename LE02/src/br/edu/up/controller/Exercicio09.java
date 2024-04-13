package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio09 {
    // 9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um
    // vetor C de acordo com as seguintes regras:
    // a. Os elementos das posições pares de C são os elementos das posições pares
    // de A;
    // b. Os elementos das posições ímpares de C são os elementos das posições
    // ímpares de B;

    public static void Executar() {
        PrintController.ExibirNaTela(9);

        System.out.println("9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um" +
                "\nvetor C de acordo com as seguintes regras:" +
                "\na. Os elementos das posições pares de C são os elementos das posições pares de A;" +
                "\nb. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;\n");

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

        // Criando e preenchendo o vetor C de acordo com as regras
        int[] vetorC = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) { // Se a posição for par
                vetorC[i] = vetorA[i];
            } else { // Se a posição for ímpar
                vetorC[i] = vetorB[i];
            }
        }

        // Apresentando o vetor C
        System.out.println("O vetor C, gerado de acordo com as regras, é:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
