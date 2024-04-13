package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio01 {
    // 1. Construa um programa que leia em um vetor uma sequência de 5 números
    // digitados pelo usuário,
    // calcule a média e apresente na tela quais valores são menores, iguais ou
    // superiores à média.

    public static void Executar() {
        PrintController.ExibirNaTela(01);

        System.out.println("1. Construa um programa que leia em um vetor uma sequência de 5 números" +
                "\ndigitados pelo usuário, calcule a média e apresente na tela quais valores são menores, iguais ou" +
                "\nsuperiores à média.\n");

        Scanner scanner = ScannerUtil.getScanner();
        double[] numeros = new double[5];
        double soma = 0;

        // Lendo os números digitados pelo usuário e armazenando no vetor
        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        // Calculando a média
        double media = soma / numeros.length;
        System.out.println("A média é: " + media);

        // Verificando quais valores são menores, iguais ou superiores à média
        System.out.println("Valores menores que a média:");
        for (double numero : numeros) {
            if (numero < media) {
                System.out.println(numero);
            }
        }

        System.out.println("Valores iguais à média:");
        for (double numero : numeros) {
            if (numero == media) {
                System.out.println(numero);
            }
        }

        System.out.println("Valores superiores à média:");
        for (double numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }
        }
    }
}
