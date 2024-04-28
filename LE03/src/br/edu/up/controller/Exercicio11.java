package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio11 {
    // 11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o
    // nome e se ela é homem ou mulher. No final informe total de homens e de
    // mulheres.

    private static class Pessoa {
        private String nome;
        private char sexo;

        public Pessoa(String nome, char sexo) {
            this.nome = nome;
            this.sexo = sexo;
        }

        public String getNome() {
            return nome;
        }

        public char getSexo() {
            return sexo;
        }
    }

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

            // Cria um objeto Pessoa com as informações lidas
            Pessoa pessoa = new Pessoa(nome, sexo);

            // Verifica se é homem ou mulher e atualiza o total
            if (pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm') {
                System.out.println(pessoa.getNome() + " é homem.");
                totalHomens++;
            } else if (pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f') {
                System.out.println(pessoa.getNome() + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido para " + pessoa.getNome());
            }
        }

        // Apresenta o total de homens e mulheres
        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
    }
}
