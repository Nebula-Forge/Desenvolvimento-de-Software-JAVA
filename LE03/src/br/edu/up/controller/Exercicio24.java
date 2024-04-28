package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio24 {
    // 24. Em um curso de Ciência da Computação a nota do estudante é calculada a
    // partir de três notas atribuídas, respectivamente, a um trabalho de
    // laboratório, a uma avaliação semestral e a um exame final. As notas variam,
    // de 0 a 10 e a nota final é a média ponderada das três notas mencionadas. A
    // lista abaixo fornece os pesos:
    // a. Laboratório: peso 2
    // b. Avaliação semestral: peso 3
    // c. Exame final: peso 5

    private static Scanner scanner = ScannerUtil.getScanner();

    public static void Executar() {
        PrintController.ExibirNaTela(24);

        System.out.println("24. Em um curso de Ciência da Computação a nota do estudante é calculada a\n"
                + "partir de três notas atribuídas, respectivamente, a um trabalho de\n"
                + "laboratório, a uma avaliação semestral e a um exame final. As notas variam,\n"
                + "de 0 a 10 e a nota final é a média ponderada das três notas mencionadas. A\n"
                + "lista abaixo fornece os pesos:\n"
                + "a. Laboratório: peso 2;\n"
                + "b. Avaliação semestral: peso 3;\n"
                + "c. Exame final: peso 5.\n");

        // Solicita as notas do estudante
        System.out.println("Digite a nota do trabalho de laboratório (de 0 a 10): ");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (de 0 a 10): ");
        double notaSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final (de 0 a 10): ");
        double notaExameFinal = scanner.nextDouble();

        // Calcula a nota final ponderada
        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);

        // Exibe a nota final
        System.out.println("A nota final do estudante é: " + notaFinal);

        // Fechar o scanner após o uso
        scanner.close();
    }

    // Método para calcular a nota final ponderada
    private static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        // Define os pesos
        final double PESO_LABORATORIO = 2;
        final double PESO_SEMESTRAL = 3;
        final double PESO_EXAME_FINAL = 5;

        // Calcula a média ponderada das notas
        return ((notaLaboratorio * PESO_LABORATORIO) + (notaSemestral * PESO_SEMESTRAL)
                + (notaExameFinal * PESO_EXAME_FINAL)) / (PESO_LABORATORIO + PESO_SEMESTRAL + PESO_EXAME_FINAL);
    }
}
