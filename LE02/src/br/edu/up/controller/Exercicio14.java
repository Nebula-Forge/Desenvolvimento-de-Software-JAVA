package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio14 {
    // 14. Faça um programa que leia um vetor de 5 elementos e, após a leitura,
    // posicione o maior elemento na última posição do vetor. Nenhum número do vetor
    // pode ser apagado ou duplicado. Apresente o vetor atualizado na tela.

    public static void Executar() {
        PrintController.ExibirNaTela(14);

        System.out.println("14. Faça um programa que leia um vetor de 5 elementos e, após a leitura,\n" +
                "posicione o maior elemento na última posição do vetor. Nenhum número do vetor\n" +
                "pode ser apagado ou duplicado. Apresente o vetor atualizado na tela.\n");

        Scanner scanner = ScannerUtil.getScanner();
        int tamanho = 5;

        // Lendo o vetor
        System.out.println("Digite os elementos do vetor:");
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Encontrando o maior elemento
        int indiceMaior = 0;
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        // Movendo o maior elemento para a última posição
        int maiorElemento = vetor[indiceMaior];
        for (int i = indiceMaior; i < tamanho - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        vetor[tamanho - 1] = maiorElemento;

        // Apresentando o vetor atualizado
        System.out.println("O vetor atualizado com o maior elemento na última posição é:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
