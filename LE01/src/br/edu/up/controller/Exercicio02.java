package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio02 {
    // 2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba
    // o resultado da sua soma.

    public static void SomaNumeros() {
        PrintController.ExibirNaTela(02);

        System.out.println("2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba\n" +
                "o resultado da sua soma.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite um número: ");

        int valor1 = scanner.nextInt();

        System.out.println("Digite outro número: ");

        int valor2 = scanner.nextInt();

        System.out.println("\nO valor somado é de: " + (valor1 + valor2));
    }
}
