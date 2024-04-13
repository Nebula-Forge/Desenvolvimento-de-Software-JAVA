package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio13 {
    // 13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo
    // de operador em outra variável do tipo CARACTERE. Imprima o resultado da
    // operação de A por B se o operador aritmético for válido; caso contrário deve
    // ser impresso uma mensagem de operador não definido. Tratar erro de divisão
    // por zero.

    public static void Calculadora() {
        PrintController.ExibirNaTela(13);

        System.out.println("13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo\n" +
                "de operador em outra variável do tipo CARACTERE. Imprima o resultado da\n" +
                "operação de A por B se o operador aritmético for válido; caso contrário deve\n" +
                "ser impresso uma mensagem de operador não definido. Tratar erro de divisão\n" +
                "por zero.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;

        try {
            switch (operador) {
                case '+':
                    resultado = a + b;
                    break;
                case '-':
                    resultado = a - b;
                    break;
                case '*':
                    resultado = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        resultado = a / b;
                    } else {
                        System.out.println("Erro: divisão por zero!");
                        return; // Encerra o programa se houver divisão por zero
                    }
                    break;
                default:
                    System.out.println("Operador não definido!");
                    return; // Encerra o programa se o operador não for válido
            }

            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

}
