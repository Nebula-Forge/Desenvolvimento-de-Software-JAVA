package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio18 {
    // 18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um
    // funcionário. Mostre o nome e o salário líquido acrescido do abono conforme o
    // sexo e a idade:
    // Sexo Idade Abono
    // M >= 30 100,00
    // < 30 50,00
    // F >= 30 200,00
    // < 30 80,00

    private static Scanner scanner = ScannerUtil.getScanner();

    public static void Executar() {
        PrintController.ExibirNaTela(18);

        System.out.println("18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um\n"
                + "funcionário. Mostre o nome e o salário líquido acrescido do abono conforme o\n"
                + "sexo e a idade:\n"
                + "Sexo Idade Abono\n"
                + "M >= 30 100,00\n"
                + "< 30 50,00\n"
                + "F >= 30 200,00\n"
                + "< 30 80,00\n");

        // Solicita o nome do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();

        // Solicita a idade do funcionário
        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();

        // Solicita o sexo do funcionário
        System.out.print("Digite o sexo do funcionário (M/F): ");
        char sexo = scanner.next().charAt(0);

        // Solicita o salário fixo do funcionário
        System.out.print("Digite o salário fixo do funcionário: R$");
        double salarioFixo = scanner.nextDouble();

        // Calcula o abono de acordo com o sexo e idade
        double abono = calcularAbono(sexo, idade);

        // Calcula o salário líquido acrescido do abono
        double salarioLiquido = salarioFixo + abono;

        // Apresenta o nome do funcionário e o salário líquido acrescido do abono
        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Salário líquido acrescido do abono: R$" + salarioLiquido);
    }

    // Método privado para calcular o abono de acordo com o sexo e idade
    private static double calcularAbono(char sexo, int idade) {
        double abono;

        if (sexo == 'M' || sexo == 'm') {
            if (idade >= 30) {
                abono = 100.00;
            } else {
                abono = 50.00;
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (idade >= 30) {
                abono = 200.00;
            } else {
                abono = 80.00;
            }
        } else {
            abono = 0.00;
            System.out.println("Sexo inválido!");
        }

        return abono;
    }
}
