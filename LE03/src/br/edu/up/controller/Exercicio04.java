package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio04 {
    // 4. Elaborar um programa que efetue a apresentação do valor da conversão em
    // real (R$) de um valor lido em dólar (US$). O programa deverá solicitar o
    // valor da cotação do dólar e também a quantidade de dólares disponíveis com o
    // usuário.

    public static void Executar() {
        PrintController.ExibirNaTela(4);

        System.out.println("4. Elaborar um programa que efetue a apresentação do valor da conversão em\n"
                + "real (R$) de um valor lido em dólar (US$). O programa deverá solicitar o\n"
                + "valor da cotação do dólar e também a quantidade de dólares disponíveis com o\n"
                + "usuário.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita o valor da cotação do dólar
        System.out.print("Digite a cotação do dólar (em reais): ");
        double cotacaoDolar = scanner.nextDouble();

        // Solicita a quantidade de dólares disponíveis com o usuário
        System.out.print("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();

        // Calcula o valor em reais
        double valorEmReais = quantidadeDolares * cotacaoDolar;

        // Apresenta o valor da conversão
        System.out.println("O valor em reais é: R$" + valorEmReais);
    }
}
