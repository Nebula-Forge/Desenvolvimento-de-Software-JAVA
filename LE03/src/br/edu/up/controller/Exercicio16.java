package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio16 {
    // 16. Escrever um programa para uma empresa que decide dar um reajuste a seus
    // 584 funcionários de acordo com os seguintes critérios:
    // a) 50% para aqueles que ganham menos do que três salários mínimos;
    // b) 20% para aqueles que ganham entre três até dez salários mínimos;
    // c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
    // d) 10% para os demais funcionários.

    public static void Executar() {
        PrintController.ExibirNaTela(16);

        System.out.println("16. Escrever um programa para uma empresa que decide dar um reajuste a seus\n"
                + "584 funcionários de acordo com os seguintes critérios:\n"
                + "a) 50% para aqueles que ganham menos do que três salários mínimos;\n"
                + "b) 20% para aqueles que ganham entre três até dez salários mínimos;\n"
                + "c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;\n"
                + "d) 10% para os demais funcionários.\n");

        Scanner scanner = ScannerUtil.getScanner();

        double salarioMinimo = 1100.00;

        for (int i = 0; i < 584; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + " em reais: ");
            double salario = scanner.nextDouble();
            double reajuste = calcularReajuste(salario, salarioMinimo);
            double novoSalario = salario * (1 + reajuste);
            System.out.println("O novo salário do funcionário " + (i + 1) + " é: R$" + novoSalario);
        }
    }

    private static double calcularReajuste(double salario, double salarioMinimo) {
        double reajuste;

        if (salario < 3 * salarioMinimo) {
            reajuste = 0.5;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            reajuste = 0.2;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            reajuste = 0.15;
        } else {
            reajuste = 0.1;
        }

        return reajuste;
    }
}
