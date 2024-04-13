package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio08 {
    // 8. Escreva um algoritmo que leia um número e mostre uma mensagem caso
    // este número seja maior ou igual a 50, outra se ele for menor que 50.

    public static void ValidarNumeros() {
        PrintController.ExibirNaTela(8);

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite um número: ");

        int n = scanner.nextInt();

        if (n >= 50) {
            System.out.println("O número informado eh maior ou igual a 50!");
        } else {
            System.out.println("O número informado é menor que 50!");
        }
    }
}
