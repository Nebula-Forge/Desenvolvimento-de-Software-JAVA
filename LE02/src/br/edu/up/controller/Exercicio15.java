package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio15 {
    // 15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de
    // acordo com a seguinte regra: com exceção do 1º número, só é permitido
    // armazenar um número se ele for maior que o anterior. Ex.: se o primeiro valor
    // lido for 5, o próximo valor lido só poderá ser maior que 5.

    public static void Executar() {
        PrintController.ExibirNaTela(15);

        System.out.println("15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de\n" +
                "acordo com a seguinte regra: com exceção do 1º número, só é permitido\n" +
                "armazenar um número se ele for maior que o anterior. Ex.: se o primeiro valor\n" +
                "lido for 5, o próximo valor lido só poderá ser maior que 5.\n");

        Scanner scanner = ScannerUtil.getScanner();
        int tamanho = 5;

        // Criando o vetor
        int[] vetor = new int[tamanho];

        // Lendo o primeiro número
        System.out.println("Digite o primeiro número:");
        vetor[0] = scanner.nextInt();

        // Lendo e preenchendo o vetor de acordo com a regra
        for (int i = 1; i < tamanho; i++) {
            int numero;
            do {
                System.out.println("Digite o próximo número maior que " + vetor[i - 1] + ":");
                numero = scanner.nextInt();
            } while (numero <= vetor[i - 1]); // Verifica se o número é maior que o anterior
            vetor[i] = numero;
        }

        // Apresentando o vetor preenchido
        System.out.println("O vetor preenchido de acordo com a regra é:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
