package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio09 {
    // 9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo
    // entre 10 (inclusive) e 150 (inclusive).

    private static class ContadorIntervalo {
        private int numerosNoIntervalo;

        public ContadorIntervalo() {
            this.numerosNoIntervalo = 0;
        }

        public void adicionarNumero(int numero) {
            // Verifica se o número está no intervalo entre 10 e 150 (inclusive)
            if (numero >= 10 && numero <= 150) {
                numerosNoIntervalo++;
            }
        }

        public int getNumerosNoIntervalo() {
            return numerosNoIntervalo;
        }
    }

    public static void Executar() {
        PrintController.ExibirNaTela(9);

        System.out.println("9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo\n"
                + "entre 10 (inclusive) e 150 (inclusive).\n");

        Scanner scanner = ScannerUtil.getScanner();

        int quantidadeNumeros = 80;

        ContadorIntervalo contador = new ContadorIntervalo();

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            contador.adicionarNumero(numero);
        }

        // Apresenta a quantidade de números no intervalo
        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + contador.getNumerosNoIntervalo());
    }
}
