package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio15 {
    // 15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com
    // desconto. Faça um programa que calcule e exiba o valor do desconto e o valor
    // a ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do
    // veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
    // –14%). Com valor do veículo zero encerra entrada de dados. Informe total de
    // desconto e total pago pelos clientes.

    public static void Executar() {
        PrintController.ExibirNaTela(15);

        System.out.println("15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com\n"
                + "desconto. Faça um programa que calcule e exiba o valor do desconto e o valor\n"
                + "a ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do\n"
                + "veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel\n"
                + "–14%). Com valor do veículo zero encerra entrada de dados. Informe total de\n"
                + "desconto e total pago pelos clientes.\n");

        Scanner scanner = ScannerUtil.getScanner();

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            // Solicita o tipo de combustível do veículo
            System.out.println("Tipos de combustível: ");
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("0. Encerrar entrada de dados");
            System.out.print("Escolha o tipo de combustível (1, 2, 3 ou 0 para encerrar): ");
            int tipoCombustivel = scanner.nextInt();

            if (tipoCombustivel == 0) {
                break; // Encerra a entrada de dados se o usuário escolher 0
            }

            // Solicita o valor do veículo
            System.out.print("Digite o valor do veículo: R$");
            double valorVeiculo = scanner.nextDouble();

            // Calcula o desconto de acordo com o tipo de combustível
            double desconto;
            if (tipoCombustivel == 1) {
                desconto = 0.25; // 25% de desconto para álcool
            } else if (tipoCombustivel == 2) {
                desconto = 0.21; // 21% de desconto para gasolina
            } else if (tipoCombustivel == 3) {
                desconto = 0.14; // 14% de desconto para diesel
            } else {
                System.out.println("Opção inválida!");
                continue; // Volta ao início do loop se a opção for inválida
            }

            // Calcula o valor do desconto e o valor a ser pago pelo cliente
            double valorDesconto = valorVeiculo * desconto;
            double valorPago = valorVeiculo - valorDesconto;

            // Adiciona ao total de desconto e total pago pelos clientes
            totalDesconto += valorDesconto;
            totalPago += valorPago;

            // Apresenta o valor do desconto e o valor pago pelo cliente
            System.out.println("Desconto: R$" + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorPago);
        }

        // Apresenta o total de desconto e total pago pelos clientes
        System.out.println("\nTotal de desconto: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);
    }
}
