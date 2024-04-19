package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio01 {
    // 1. Escrever um programa que leia o nome de um aluno e as notas das três
    // provas que ele obteve no semestre. No final informar o nome do aluno e a sua
    // média (aritmética).

    public static void Executar() {
        PrintController.ExibirNaTela(1);

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("1. Escrever um programa que leia o nome de um aluno e as notas das três\n"
                + "provas que ele obteve no semestre. No final informar o nome do aluno e a sua\n"
                + "média (aritmética).\n");

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scanner.next();

        System.out.println("Digite a primeira nota da prova: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota da prova: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota da prova: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("O aluno " + nomeAluno + " obteve a média " + media);
    }
}
