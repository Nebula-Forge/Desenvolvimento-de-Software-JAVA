package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio11 {
    // 11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o
    // nome e se ela é homem ou mulher. No final informe total de homens e de
    // mulheres.

    public static void Executar() {
        PrintController.ExibirNaTela(11);

        System.out.println("11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o\n"
                + "nome e se ela é homem ou mulher. No final informe total de homens e de\n"
                + "mulheres.\n");

        Scanner scanner = ScannerUtil.getScanner();

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            // Solicita o nome da pessoa
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.next();

            // Solicita o sexo da pessoa
            System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Limpa o buffer do teclado

            // Verifica se é homem ou mulher e atualiza o total
            if (sexo == 'M' || sexo == 'm') {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido para " + nome);
            }
        }

        // Apresenta o total de homens e mulheres
        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
    }
}
