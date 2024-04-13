package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio14 {
    // 14. A expressão an = a1 + (n – 1) * r é denominada termo geral da
    // Progressão Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n
    // (n-ésimo termo),r é a razão e a1 é o primeiro termo da Progressão Aritmética.
    // Escreva um algoritmo que encontre o n-ésimo termo de uma progressão
    // aritmética. Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28

    public static void ProgressaoAritimetica() {
        PrintController.ExibirNaTela(14);

        System.out.println("14. A expressão an = a1 + (n – 1) * r é denominada termo geral da\n" +
                "Progressão Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n\n" +
                "(n-ésimo termo),r é a razão e a1 é o primeiro termo da Progressão Aritmética.\n" +
                "Escreva um algoritmo que encontre o n-ésimo termo de uma progressão\n" +
                "aritmética. Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite o valor do primeiro termo (a1): ");
        int a1 = scanner.nextInt();

        System.out.println("Digite o valor de n (o termo de ordem que deseja encontrar): ");
        int n = scanner.nextInt();

        System.out.println("Digite o valor da razão (r): ");
        int r = scanner.nextInt();

        // Calcula o n-ésimo termo da PA
        int an = a1 + (n - 1) * r;

        System.out.println("O " + n + "-ésimo termo da progressão aritmética é: " + an);
    }
}
