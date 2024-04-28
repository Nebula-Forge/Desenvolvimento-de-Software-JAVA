package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio12 {
    // 12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus
    // veículos com desconto. Faça um programa que calcule e exiba o valor do
    // desconto e o valor a ser pago pelo cliente de vários carros. O desconto
    // deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima
    // de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando
    // desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano
    // até 2000 e total geral.

    private static class Carro {
        private int ano;
        private double valor;

        public Carro(int ano, double valor) {
            this.ano = ano;
            this.valor = valor;
        }

        public int getAno() {
            return ano;
        }

        public double getValor() {
            return valor;
        }
    }

    private static class CalculadoraDesconto {
        public static double calcularDesconto(int ano) {
            return (ano <= 2000) ? 0.12 : 0.07;
        }
    }

    public static void Executar() {
        PrintController.ExibirNaTela(12);

        System.out.println("12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus\n"
                + "veículos com desconto. Faça um programa que calcule e exiba o valor do\n"
                + "desconto e o valor a ser pago pelo cliente de vários carros. O desconto\n"
                + "deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima\n"
                + "de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando\n"
                + "desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano\n"
                + "até 2000 e total geral.\n");

        Scanner scanner = ScannerUtil.getScanner();

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar;
        do {
            // Solicita o ano do veículo
            System.out.print("Digite o ano do veículo: ");
            int anoVeiculo = scanner.nextInt();

            // Solicita o valor do veículo
            System.out.print("Digite o valor do veículo: R$");
            double valorVeiculo = scanner.nextDouble();

            // Cria um objeto Carro com as informações lidas
            Carro carro = new Carro(anoVeiculo, valorVeiculo);

            // Calcula o desconto de acordo com o ano do veículo
            double desconto = CalculadoraDesconto.calcularDesconto(carro.getAno());

            // Calcula o valor do desconto
            double valorDesconto = carro.getValor() * desconto;

            // Calcula o valor a ser pago pelo cliente
            double valorAPagar = carro.getValor() - valorDesconto;

            // Apresenta o valor do desconto e o valor a ser pago pelo cliente
            System.out.println("Desconto: R$" + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorAPagar);

            // Incrementa o total geral de carros
            totalGeral++;

            // Incrementa o total de carros com ano até 2000, se aplicável
            if (carro.getAno() <= 2000) {
                totalCarrosAte2000++;
            }

            // Pergunta se deseja continuar calculando desconto para mais carros
            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        // Apresenta o total de carros com ano até 2000 e o total geral
        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);
    }
}
