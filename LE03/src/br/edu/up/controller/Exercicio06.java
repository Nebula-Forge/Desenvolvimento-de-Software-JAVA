package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio06 {
    // 6. Faça um programa que receba o preço de custo de um produto e mostre o
    // valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo
    // com um percentual informado pelo usuário.

    private double precoCusto;
    private double percentualAcrescimo;

    // Construtor vazio
    public Exercicio06() {
    }

    // Construtor com parâmetros
    public Exercicio06(double precoCusto, double percentualAcrescimo) {
        this.precoCusto = precoCusto;
        this.percentualAcrescimo = percentualAcrescimo;
    }

    // Métodos para acessar e modificar as variáveis privadas
    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPercentualAcrescimo() {
        return percentualAcrescimo;
    }

    public void setPercentualAcrescimo(double percentualAcrescimo) {
        this.percentualAcrescimo = percentualAcrescimo;
    }

    // Método para calcular o preço de venda
    public double calcularPrecoVenda() {
        double acrescimo = (percentualAcrescimo / 100) * precoCusto;
        return precoCusto + acrescimo;
    }

    // Método para executar o programa
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

        // Criando uma instância da classe Exercicio06 usando o construtor com
        // parâmetros
        Exercicio06 exercicio = new Exercicio06(precoCusto, percentualAcrescimo);

        // Utilizando os métodos de acesso para obter os valores e calcular o preço de
        // venda
        System.out.println("O preço de venda do produto é: R$" + exercicio.calcularPrecoVenda());
    }
}
