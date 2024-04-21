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
        PrintController.ExibirNaTela(15);

        System.out.println("16. Escrever um programa para uma empresa que decide dar um reajuste a seus\n"
                + "584 funcionários de acordo com os seguintes critérios:\n"
                + "a) 50% para aqueles que ganham menos do que três salários mínimos;\n"
                + "b) 20% para aqueles que ganham entre três até dez salários mínimos;\n"
                + "c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;\n"
                + "d) 10% para os demais funcionários.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Define o valor do salário mínimo
        double salarioMinimo = 1100.00; // Valor fictício para exemplo

        // Solicita o salário de cada funcionário
        double[] salarios = new double[584];
        for (int i = 0; i < 584; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + " em reais: ");
            salarios[i] = scanner.nextDouble();
        }

        // Calcula o reajuste para cada funcionário de acordo com os critérios
        for (int i = 0; i < 584; i++) {
            double reajuste = 0;

            if (salarios[i] < 3 * salarioMinimo) {
                reajuste = 0.5;
            } else if (salarios[i] >= 3 * salarioMinimo && salarios[i] <= 10 * salarioMinimo) {
                reajuste = 0.2;
            } else if (salarios[i] > 10 * salarioMinimo && salarios[i] <= 20 * salarioMinimo) {
                reajuste = 0.15;
            } else {
                reajuste = 0.1;
            }

            double novoSalario = salarios[i] * (1 + reajuste);

            System.out.println("O novo salário do funcionário " + (i + 1) + " é: R$" + novoSalario);
        }
    }
}
