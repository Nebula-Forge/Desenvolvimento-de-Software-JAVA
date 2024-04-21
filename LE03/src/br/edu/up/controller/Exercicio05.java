package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio05 {
    // 5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
    // prestações sem juros. Faça um programa que receba um valor de uma compra e
    // mostre o valor das prestações.

    public static void Executar() {
        PrintController.ExibirNaTela(4);

        System.out.println("5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)\n"
                + "prestações sem juros. Faça um programa que receba um valor de uma compra e\n"
                + "mostre o valor das prestações.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita o valor da compra
        System.out.print("Digite o valor da compra: R$");
        double valorCompra = scanner.nextDouble();

        // Calcula o valor de cada prestação (considerando 5 prestações sem juros)
        double valorPrestacao = valorCompra / 5;

        // Apresenta o valor de cada prestação
        System.out.println("O valor de cada prestação é: R$" + valorPrestacao);
    }
}
