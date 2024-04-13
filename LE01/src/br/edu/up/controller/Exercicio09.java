package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio09 {
    // 9. Leia dois números nas variáveis A e B e identifique se os valores são
    // iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que
    // são iguais.Caso sejam diferentes, informe que são diferentes e qual número é
    // o maior.

    public static void ComparaçãoNumeros() {
        PrintController.ExibirNaTela(9);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");

        int A = scanner.nextInt();

        System.out.println("Informe um segundo número: ");

        int B = scanner.nextInt();

        if (A != B) {
            System.out.println("Os dois números são diferentes!");
            if (A > B) {
                System.out.println("O maior é o A: " + A);
            } else {
                System.out.println("O maior é o B: " + B);
            }
        } else {
            System.out.println("Os dois números são iguais!");
        }
    }
}

