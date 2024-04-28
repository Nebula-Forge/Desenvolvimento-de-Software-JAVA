package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio05 {
    // 5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
    // prestações sem juros. Faça um programa que receba um valor de uma compra e
    // mostre o valor das prestações.

    private double valorCompra;

    // Construtor vazio
    public Exercicio05() {
    }

    // Construtor com parâmetros
    public Exercicio05(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    // Métodos para acessar e modificar a variável privada
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    // Método para calcular o valor de cada prestação
    public double calcularValorPrestacao() {
        return valorCompra / 5; // Considerando 5 prestações sem juros
    }

    // Método para executar o programa
    public static void Executar() {
        PrintController.ExibirNaTela(5);

        System.out.println("5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)\n"
                + "prestações sem juros. Faça um programa que receba um valor de uma compra e\n"
                + "mostre o valor das prestações.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita o valor da compra
        System.out.print("Digite o valor da compra: R$");
        double valorCompra = scanner.nextDouble();

        // Criando uma instância da classe Exercicio05 usando o construtor com
        // parâmetros
        Exercicio05 exercicio = new Exercicio05(valorCompra);

        // Utilizando o método de acesso para obter o valor da compra e calcular o valor
        // de cada prestação
        System.out.println("O valor de cada prestação é: R$" + exercicio.calcularValorPrestacao());
    }
}
