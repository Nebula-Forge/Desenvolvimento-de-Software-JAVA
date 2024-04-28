package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio14 {
    // 14. Faça um programa que receba o preço de custo e o preço de venda de 40
    // produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada
    // produto. Informe média de preço de custo e do preço de venda.

    private static class Produto {
        private double precoCusto;
        private double precoVenda;

        public Produto(double precoCusto, double precoVenda) {
            this.precoCusto = precoCusto;
            this.precoVenda = precoVenda;
        }

        public double getPrecoCusto() {
            return precoCusto;
        }

        public double getPrecoVenda() {
            return precoVenda;
        }
    }

    private static class CalculadoraLucroPrejuizo {
        public static String calcularLucroPrejuizo(Produto produto) {
            double lucroOuPrejuizo = produto.getPrecoVenda() - produto.getPrecoCusto();
            if (lucroOuPrejuizo > 0) {
                return "Lucro";
            } else if (lucroOuPrejuizo < 0) {
                return "Prejuízo";
            } else {
                return "Empate";
            }
        }
    }

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

            // Cria um objeto Produto com os preços informados
            Produto produto = new Produto(precoCusto, precoVenda);

            // Calcula lucro, prejuízo ou empate para o produto
            String resultado = CalculadoraLucroPrejuizo.calcularLucroPrejuizo(produto);
            System.out.println("Produto " + i + ": " + resultado);

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
