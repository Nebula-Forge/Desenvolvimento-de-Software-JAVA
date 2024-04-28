package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio22 {
    // 22. Faça um programa que calcule o valor da conta de luz de uma pessoa.
    // Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
    // Tipo de Cliente Valor do KW/h
    // 1 (Residência) 0,60
    // 2 (Comércio) 0,48
    // 3 (Indústria) 1,29

    private static Scanner scanner = ScannerUtil.getScanner();

    public static void Executar() {
        PrintController.ExibirNaTela(22);

        System.out.println("22. Faça um programa que calcule o valor da conta de luz de uma pessoa.\n"
                + "Sabe-se que o cálculo da conta de luz segue a tabela abaixo:\n"
                + "Tipo de Cliente Valor do KW/h\n"
                + "1 (Residência) 0,60\n"
                + "2 (Comércio) 0,48\n"
                + "3 (Indústria) 1,29\n");

        // Solicita o tipo de cliente
        System.out.println("Digite o tipo de cliente (1 para residência, 2 para comércio, 3 para indústria): ");
        int tipoCliente = scanner.nextInt();

        // Solicita o consumo de energia em kW/h
        System.out.println("Digite o consumo de energia em kW/h: ");
        double consumo = scanner.nextDouble();

        // Calcula o valor da conta de luz
        double valorConta = calcularValorConta(tipoCliente, consumo);

        // Exibe o valor da conta de luz
        System.out.println("O valor da conta de luz é: R$" + valorConta);
    }

    // Método privado para calcular o valor da conta de luz
    private static double calcularValorConta(int tipoCliente, double consumo) {
        double valorKWh;
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.60;
                break;
            case 2:
                valorKWh = 0.48;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
                return 0;
        }
        return valorKWh * consumo;
    }
}
