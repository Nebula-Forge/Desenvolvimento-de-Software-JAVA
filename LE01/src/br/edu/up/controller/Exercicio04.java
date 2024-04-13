package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio04 {
    // 4. Escreva um algoritmo que leia dois números e ao final mostre a soma,
    // subtração,multiplicação e a divisão dos números lidos.

    public static void Calculos() {
        PrintController.ExibirNaTela(04);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");

        int valor1 = scanner.nextInt();

        System.out.println("Digite outro valor: ");

        int valor2 = scanner.nextInt();

        int sub = valor1 - valor2;

        int sum = valor1 + valor2;

        int div = valor1 / valor2;

        int mult = valor1 * valor2;

        System.out.println("\nSoma: " + sum + "\nSubtração: " + sub + "\nDivisão: " + div + "\nMultiplicação: " + mult);
    }
}
