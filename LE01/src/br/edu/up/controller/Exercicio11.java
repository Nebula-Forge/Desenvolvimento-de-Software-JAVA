package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio11 {
    // 11. Escreva um algoritmo que leia três valores inteiros distintos e
    // escreva-os emordem crescente.

    public static void ordenarNumeros() {
        PrintController.ExibirNaTela(11);

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int c = scanner.nextInt();

        if (a <= b && b <= c) {
            System.out.println("Os números em ordem crescente são: " + a + ", " + b + ", " + c);
        } else if (a <= c && c <= b) {
            System.out.println("Os números em ordem crescente são: " + a + ", " + c + ", " + b);
        } else if (b <= a && a <= c) {
            System.out.println("Os números em ordem crescente são: " + b + ", " + a + ", " + c);
        } else if (b <= c && c <= a) {
            System.out.println("Os números em ordem crescente são: " + b + ", " + c + ", " + a);
        } else if (c <= a && a <= b) {
            System.out.println("Os números em ordem crescente são: " + c + ", " + a + ", " + b);
        } else {
            System.out.println("Os números em ordem crescente são: " + c + ", " + b + ", " + a);
        }
    }
}
