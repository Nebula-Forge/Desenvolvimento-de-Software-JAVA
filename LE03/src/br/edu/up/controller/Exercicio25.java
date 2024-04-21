package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio25 {
    // 25. Dado o nome de um estudante, com o respectivo número de matrícula e as
    // três notas acima mencionadas, desenvolva um programa para calcular a nota
    // final e a classificação de cada estudante. A classificação é dada conforme a
    // lista abaixo:
    // Nota Final Classificação
    // [8,10] A
    // [7,8] B
    // [6,7] C
    // [5,6] D
    // [0,5] R
    // Imprima o nome do estudante, com o seu número, nota final e classificação.

    public static void Executar() {
        PrintController.ExibirNaTela(25);

        System.out
                .println("25. Dado o nome de um estudante, com o respectivo número de matrícula e as\n"
                        + "três notas acima mencionadas, desenvolva um programa para calcular a nota\n"
                        + "final e a classificação de cada estudante. A classificação é dada conforme a\n"
                        + "lista abaixo:\n"
                        + "Nota Final Classificação\n"
                        + "[8,10] A\n"
                        + "[7,8] B\n"
                        + "[6,7] C\n"
                        + "[5,6] D\n"
                        + "[0,5] R\n"
                        + "Imprima o nome do estudante, com o seu número, nota final e classificação.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita os dados do estudante
        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.next();

        System.out.print("Digite o número de matrícula do estudante: ");
        int matricula = scanner.nextInt();

        System.out.println("Digite as três notas do estudante:");
        System.out.print("Nota do trabalho de laboratório (de 0 a 10): ");
        double notaLaboratorio = scanner.nextDouble();

        System.out.print("Nota da avaliação semestral (de 0 a 10): ");
        double notaSemestral = scanner.nextDouble();

        System.out.print("Nota do exame final (de 0 a 10): ");
        double notaExameFinal = scanner.nextDouble();

        // Calcula a nota final do estudante
        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);

        // Determina a classificação do estudante
        char classificacao = determinarClassificacao(notaFinal);

        // Exibe os dados do estudante e sua classificação
        System.out.println("\nDados do estudante:");
        System.out.println("Nome: " + nome);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);
    }

    // Método para calcular a nota final ponderada
    public static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        // Define os pesos
        final double PESO_LABORATORIO = 2;
        final double PESO_SEMESTRAL = 3;
        final double PESO_EXAME_FINAL = 5;

        // Calcula a média ponderada das notas
        double notaFinal = ((notaLaboratorio * PESO_LABORATORIO) + (notaSemestral * PESO_SEMESTRAL)
                + (notaExameFinal * PESO_EXAME_FINAL)) / (PESO_LABORATORIO + PESO_SEMESTRAL + PESO_EXAME_FINAL);

        return notaFinal;
    }

    // Método para determinar a classificação do estudante
    public static char determinarClassificacao(double notaFinal) {
        if (notaFinal >= 8 && notaFinal <= 10) {
            return 'A';
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return 'B';
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return 'C';
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return 'D';
        } else {
            return 'R';
        }
    }
}
