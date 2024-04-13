package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio03 {
    // 3. Escreva um algoritmo que leia os valores de dois números inteiros
    // distintos nas variáveis A e B e informe qual deles é o maior. Caso os números
    // sejam iguais informarao usuário que a sequência de números informados é
    // inválida.

    public static void CompararValores() {
        PrintController.ExibirNaTela(03);

        System.out.println("3. Escreva um algoritmo que leia os valores de dois números inteiros\n" +
                "distintos nas variáveis A e B e informe qual deles é o maior. Caso os números\n" +
                "sejam iguais informarao usuário que a sequência de números informados é\n" +
                "inválida.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Informe um número: ");

        int A = scanner.nextInt();

        System.out.println("Informe um segundo número: ");

        int B = scanner.nextInt();

        if (A == B) {
            System.out.println("\nValores inválidos!");
        } else if (A > B) {
            System.out.println("\nO primeiro valor '" + A + "' é maior que o segundo valor informado!");
        } else if (A < B) {
            System.out.println("\nO segundo valor '" + B + "' é maior que o primeiro valor informado!");
        }
    }
}
