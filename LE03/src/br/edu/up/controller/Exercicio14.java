package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio14 {
    // 14. Faça um programa que receba o preço de custo e o preço de venda de 40
    // produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada
    // produto. Informe média de preço de custo e do preço de venda.

    public static void Executar() {
        PrintController.ExibirNaTela(14);

        System.out.println("14. Faça um programa que receba o preço de custo e o preço de venda de 40\n"
                + "produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada\n"
                + "produto. Informe média de preço de custo e do preço de venda.\n");

        Scanner scanner = ScannerUtil.getScanner();

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;
        int totalProdutos = 40;

        for (int i = 1; i <= totalProdutos; i++) {
            // Solicita o preço de custo do produto
            System.out.print("Digite o preço de custo do produto " + i + ": R$");
            double precoCusto = scanner.nextDouble();

            // Solicita o preço de venda do produto
            System.out.print("Digite o preço de venda do produto " + i + ": R$");
            double precoVenda = scanner.nextDouble();

            // Calcula o lucro ou prejuízo
            double lucroOuPrejuizo = precoVenda - precoCusto;

            // Verifica se houve lucro, prejuízo ou empate
            if (lucroOuPrejuizo > 0) {
                System.out.println("Produto " + i + ": Lucro");
            } else if (lucroOuPrejuizo < 0) {
                System.out.println("Produto " + i + ": Prejuízo");
            } else {
                System.out.println("Produto " + i + ": Empate");
            }

            // Adiciona ao somatório de preços de custo e de venda
            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;
        }

        // Calcula a média de preço de custo e preço de venda
        double mediaPrecoCusto = somaPrecoCusto / totalProdutos;
        double mediaPrecoVenda = somaPrecoVenda / totalProdutos;

        // Apresenta a média de preço de custo e preço de venda
        System.out.println("\nMédia de preço de custo: R$" + mediaPrecoCusto);
        System.out.println("Média de preço de venda: R$" + mediaPrecoVenda);
    }
}
