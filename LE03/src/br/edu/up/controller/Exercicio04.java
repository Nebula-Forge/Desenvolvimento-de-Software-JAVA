package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio04 {
    // 4. Elaborar um programa que efetue a apresentação do valor da conversão em
    // real (R$) de um valor lido em dólar (US$). O programa deverá solicitar o
    // valor da cotação do dólar e também a quantidade de dólares disponíveis com o
    // usuário.

    private double cotacaoDolar;
    private double quantidadeDolares;

    // Construtor vazio
    public Exercicio04() {
    }

    // Construtor com parâmetros
    public Exercicio04(double cotacaoDolar, double quantidadeDolares) {
        this.cotacaoDolar = cotacaoDolar;
        this.quantidadeDolares = quantidadeDolares;
    }

    // Métodos para acessar e modificar as variáveis privadas
    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double getQuantidadeDolares() {
        return quantidadeDolares;
    }

    public void setQuantidadeDolares(double quantidadeDolares) {
        this.quantidadeDolares = quantidadeDolares;
    }

    // Método para calcular o valor em reais
    public double calcularValorEmReais() {
        return quantidadeDolares * cotacaoDolar;
    }

    // Método para executar o programa
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

        // Criando uma instância da classe Exercicio04 usando o construtor com
        // parâmetros
        Exercicio04 exercicio = new Exercicio04(cotacaoDolar, quantidadeDolares);

        // Utilizando os métodos de acesso para obter os valores e calcular o valor em
        // reais
        System.out.println("O valor em reais é: R$" + exercicio.calcularValorEmReais());
    }
}
