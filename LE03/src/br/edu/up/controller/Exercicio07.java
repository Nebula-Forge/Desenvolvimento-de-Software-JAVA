package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio07 {
    // 7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
    // percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos
    // sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o
    // resultado). Supondo que a percentagem do distribuidor seja de 28% e os
    // impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e
    // informe o custo ao consumidor do mesmo.

    private double custoFabrica;

    // Construtor vazio
    public Exercicio07() {
    }

    // Construtor com parâmetro
    public Exercicio07(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    // Método para acessar e modificar a variável privada
    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    // Método para calcular o custo ao consumidor
    public double calcularCustoConsumidor() {
        // Define a percentagem do distribuidor e os impostos
        double percentagemDistribuidor = 0.28; // 28%
        double impostos = 0.45; // 45%

        // Calcula os impostos sobre o custo de fábrica
        double valorImpostos = impostos * custoFabrica;

        // Calcula o custo ao distribuidor
        double custoDistribuidor = custoFabrica + valorImpostos;

        // Calcula a percentagem do distribuidor sobre o custo ao distribuidor
        double valorDistribuidor = percentagemDistribuidor * custoDistribuidor;

        // Calcula o custo ao consumidor
        return custoDistribuidor + valorDistribuidor;
    }

    // Método para executar o programa
    public static void Executar() {
        PrintController.ExibirNaTela(7);

        System.out.println("7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a\n"
                + "percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos\n"
                + "sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o.\n"
                + "resultado). Supondo que a percentagem do distribuidor seja de 28% e os\n"
                + "impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e\n"
                + "informe o custo ao consumidor do mesmo.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita o custo de fábrica do carro
        System.out.print("Digite o custo de fábrica do carro: R$");
        double custoFabrica = scanner.nextDouble();

        // Criando uma instância da classe Exercicio07 usando o construtor com parâmetro
        Exercicio07 exercicio = new Exercicio07(custoFabrica);

        // Utilizando o método de acesso para obter o custo de fábrica e calcular o
        // custo ao consumidor
        double custoConsumidor = exercicio.calcularCustoConsumidor();

        // Apresenta o custo ao consumidor
        System.out.println("O custo ao consumidor do carro é: R$" + custoConsumidor);
    }
}
