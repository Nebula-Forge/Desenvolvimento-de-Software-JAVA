package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio13 {
    // 13. Elabore um algoritmo que receba um número n e retorne um vetor com os n
    // primeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2,
    // 3, 5, 8,13, 21}.

    public static void Executar() {
        PrintController.ExibirNaTela(13);

        System.out.println("13. Elabore um algoritmo que receba um número n e retorne um vetor com os n\n" +
                "primeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2,3, 5, 8,13, 21}.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicitando ao usuário o número de termos da sequência de Fibonacci
        System.out.println("Digite o número de termos da sequência de Fibonacci:");
        int n = scanner.nextInt();

        // Criando o vetor para armazenar os termos da sequência de Fibonacci
        int[] fibonacci = new int[n];

        // Calculando os termos da sequência de Fibonacci e armazenando-os no vetor
        fibonacci[0] = 1; // O primeiro termo é sempre 1
        if (n > 1) {
            fibonacci[1] = 1; // O segundo termo também é 1
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Os próximos termos são a soma dos dois anteriores
            }
        }

        // Apresentando os termos da sequência de Fibonacci
        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
