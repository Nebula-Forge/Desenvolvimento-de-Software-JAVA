package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio01 {
    // 1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre
    // amensagem “Número maior do que 10!”, caso este número seja maior, ou
    // “Númeromenor ou igual a 10!”, caso este número seja menor ou igual.

    public static void ReceberNumero() {

        PrintController.ExibirNaTela(01);

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite um número: ");

        int valor = scanner.nextInt();

        if (valor > 10) {
            System.out.println("\nNúmero maior do que 10!");
        } else {
            System.out.println("\nNúmero menor ou igual a 10!");
        }
    }
}
