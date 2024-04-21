package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio20 {
    // 20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula.
    // Faça um programa que calcule e exiba o salário de um professor. Sabe-se que o
    // valor da hora/aula segue a tabela abaixo:
    // Professor Nível 1 R$12,00 por hora/aula
    // Professor Nível 2 R$17,00 por hora/aula
    // Professor Nível 3 R$25,00 por hora/aula

    public static void Executar() {
        PrintController.ExibirNaTela(20);

        System.out.println("20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula.\n"
                + "Faça um programa que calcule e exiba o salário de um professor. Sabe-se que o\n"
                + "valor da hora/aula segue a tabela abaixo:\n"
                + "Professor Nível 1 R$12,00 por hora/aula\n"
                + "Professor Nível 2 R$17,00 por hora/aula\n"
                + "Professor Nível 3 R$25,00 por hora/aula\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita o nível do professor
        System.out.println("Digite o nível do professor (1, 2 ou 3): ");
        int nivel = scanner.nextInt();

        // Solicita o número de horas-aula ministradas
        System.out.println("Digite o número de horas-aula ministradas: ");
        int horasAula = scanner.nextInt();

        // Calcula o salário do professor de acordo com o nível
        double salarioHoraAula;
        switch (nivel) {
            case 1:
                salarioHoraAula = 12.00;
                break;
            case 2:
                salarioHoraAula = 17.00;
                break;
            case 3:
                salarioHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível de professor inválido!");
                return;
        }

        double salarioTotal = salarioHoraAula * horasAula;

        // Exibe o salário do professor
        System.out.println("O salário do professor é: R$" + salarioTotal);
    }
}
