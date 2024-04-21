package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio21 {
    // 21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma
    // das seguintes
    // categorias:
    // Infantil A = 5 - 7 anos
    // Infantil B = 8 - 10 anos
    // juvenil A = 11- 13 anos
    // juvenil B = 14 - 17 anos
    // Sênior = 18 - 25 anos
    // Apresentar mensagem “idade fora da faixa etária” quando for outro ano não
    // contemplado.

    public static void Executar() {
        PrintController.ExibirNaTela(21);

        System.out
                .println("21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes\n"
                        + "categorias:\n"
                        + "Infantil A = 5 - 7 anos\n"
                        + "Infantil B = 8 - 10 anos\n"
                        + "juvenil A = 11- 13 anos\n"
                        + "juvenil B = 14 - 17 anos\n"
                        + "Sênior = 18 - 25 anos\n"
                        + "Apresentar mensagem \"idade fora da faixa etária\" quando for outro ano não\n"
                        + "contemplado.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita a idade do nadador
        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        // Classifica o nadador em uma das categorias
        String categoria;
        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            categoria = "Sênior";
        } else {
            categoria = "Idade fora da faixa etária";
        }

        // Exibe a categoria do nadador
        System.out.println("Categoria do nadador: " + categoria);
    }
}
