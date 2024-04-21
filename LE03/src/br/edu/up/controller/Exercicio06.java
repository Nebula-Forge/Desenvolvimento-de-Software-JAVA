package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio06 {
    // 6. Faça um programa que receba o preço de custo de um produto e mostre o
    // valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo
    // com um percentual informado pelo usuário.

    public static void Executar() {
        PrintController.ExibirNaTela(6);

        System.out.println("6. Faça um programa que receba o preço de custo de um produto e mostre o\n"
                + "valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo\n"
                + "com um percentual informado pelo usuário.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita o preço de custo do produto
        System.out.print("Digite o preço de custo do produto: R$");
        double precoCusto = scanner.nextDouble();

        // Solicita o percentual de acréscimo
        System.out.print("Digite o percentual de acréscimo (em %): ");
        double percentualAcrescimo = scanner.nextDouble();

        // Calcula o valor do acréscimo
        double acrescimo = (percentualAcrescimo / 100) * precoCusto;

        // Calcula o preço de venda
        double precoVenda = precoCusto + acrescimo;

        // Apresenta o preço de venda
        System.out.println("O preço de venda do produto é: R$" + precoVenda);
    }
}
