package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio05 {
    // 5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma
    // que o valorda variável A passe a ser o valor da variável B e o valor da
    // variável B passe a ser o valor da variável A. Apresentar uma mensagem com o
    // valor original de cada variávele outra com os valores trocados.

    public static void TrocaDeValores() {
        PrintController.ExibirNaTela(05);

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Informe um número: ");

        int A = scanner.nextInt();

        System.out.println("Informe o segundo número: ");

        int B = scanner.nextInt();

        System.out.println("Valores Originais:\nA: " + A + "\nB: " + B);

        int C = A;

        A = B;

        B = C;

        System.out.println("Valores Trocados:\nA: " + A + "\nB: " + B);
    }
}

