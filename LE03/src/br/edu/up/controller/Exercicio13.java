package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio13 {
    // 13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade
    // e saúde) e informe se está apta ou não para cumprir o serviço militar
    // obrigatório. Informe os totais.

    private static class Pessoa {
        private String nome;
        private char sexo;
        private int idade;
        private char saude;

        public Pessoa(String nome, char sexo, int idade, char saude) {
            this.nome = nome;
            this.sexo = sexo;
            this.idade = idade;
            this.saude = saude;
        }

        public String getNome() {
            return nome;
        }

        public char getSexo() {
            return sexo;
        }

        public int getIdade() {
            return idade;
        }

        public char getSaude() {
            return saude;
        }
    }

    private static class ServicoMilitar {
        public static boolean estaApto(Pessoa pessoa) {
            return pessoa.getIdade() >= 18 && pessoa.getSaude() == 'A' && (pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm');
        }
    }

    public static void Executar() {
        PrintController.ExibirNaTela(13);

        System.out.println("13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade\n"
                + "e saúde) e informe se está apta ou não para cumprir o serviço militar\n"
                + "obrigatório. Informe os totais.\n");

        Scanner scanner = ScannerUtil.getScanner();

        int totalPessoas = 0;
        int totalAptas = 0;
        int totalInaptas = 0;

        System.out.print("Digite o número de pessoas (N): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        for (int i = 1; i <= n; i++) {
            System.out.println("Pessoa " + i + ":");

            // Solicita o nome da pessoa
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            // Solicita o sexo da pessoa
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Limpar o buffer do teclado

            // Solicita a idade da pessoa
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            // Solicita a saúde da pessoa (Aptidão ou Inaptidão)
            System.out.print("Saúde (A para apto, I para inapto): ");
            char saude = scanner.next().charAt(0);
            scanner.nextLine(); // Limpar o buffer do teclado

            Pessoa pessoa = new Pessoa(nome, sexo, idade, saude);

            // Verifica se a pessoa está apta ou não para o serviço militar
            if (ServicoMilitar.estaApto(pessoa)) {
                System.out.println(pessoa.getNome() + " está apto para cumprir o serviço militar obrigatório.");
                totalAptas++;
            } else {
                System.out.println(pessoa.getNome() + " não está apto para cumprir o serviço militar obrigatório.");
                totalInaptas++;
            }

            totalPessoas++;
        }

        // Apresenta os totais
        System.out.println("\nTotal de pessoas: " + totalPessoas);
        System.out.println("Total de aptos: " + totalAptas);
        System.out.println("Total de inaptos: " + totalInaptas);
    }
}
