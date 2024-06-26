package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio10 {
    // 10. Faça um programa que receba a idade de um número finito de pessoas e
    // mostre mensagem informando “maior de idade” e “menor de idade” para cada
    // pessoa. Considerar a pessoa com 18 anos como maior de idade.

    private static class VerificadorIdade {
        public static String verificarIdade(int idade) {
            // Verifica se a pessoa é maior ou menor de idade
            if (idade >= 18) {
                return "Maior de idade";
            } else {
                return "Menor de idade";
            }
        }
    }

    public static void Executar() {
        PrintController.ExibirNaTela(10);

        System.out.println("10. Faça um programa que receba a idade de um número finito de pessoas e\n"
                + "mostre mensagem informando “maior de idade” e “menor de idade” para cada\n"
                + "pessoa. Considerar a pessoa com 18 anos como maior de idade.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita o número de pessoas
        System.out.print("Digite o número de pessoas: ");
        int numeroPessoas = scanner.nextInt();

        // Loop para receber a idade de cada pessoa
        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            // Utiliza o verificador de idade para determinar se a pessoa é maior ou menor
            // de idade
            String mensagem = VerificadorIdade.verificarIdade(idade);
            System.out.println("Pessoa " + i + ": " + mensagem);
        }
    }
}
