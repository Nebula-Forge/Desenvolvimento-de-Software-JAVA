package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio07 {
    // 7. Faça um programa que leia dois vetores de 5 elementos cada e verifique se
    // eles são iguais ou não. Para serem iguais, todos os elementos dos dois
    // vetores devem coincidir.

    public static void CompararVetores(){
        PrintController.ExibirNaTela(07);

        Scanner scanner = ScannerUtil.getScanner();
        int tamanho = 5;

        // Lendo o primeiro vetor
        System.out.println("Digite os elementos do primeiro vetor:");
        int[] vetor1 = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = scanner.nextInt();
        }

        // Lendo o segundo vetor
        System.out.println("Digite os elementos do segundo vetor:");
        int[] vetor2 = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = scanner.nextInt();
        }

        // Verificando se os vetores são iguais
        boolean saoIguais = true;
        for (int i = 0; i < tamanho; i++) {
            if (vetor1[i] != vetor2[i]) {
                saoIguais = false;
                break;
            }
        }

        // Apresentando o resultado
        if (saoIguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }
    }
}
