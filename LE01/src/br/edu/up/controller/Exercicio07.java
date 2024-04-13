package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio07 {
    // 7. Escreva um algoritmo que leia um número e diga, através de uma mensagem,
    // se este número está no intervalo entre 100 e 200. Caso o número esteja fora
    // do intervalo o usuário também deverá ser informado.

    public static void IntervaloDeValores() {
        PrintController.ExibirNaTela(7);

        System.out.println("7. Escreva um algoritmo que leia um número e diga, através de uma mensagem,\n" +
                "se este número está no intervalo entre 100 e 200. Caso o número esteja fora do\n" +
                "intervalo o usuário também deverá ser informado.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Insira um valor para validação: ");

        int valor = scanner.nextInt();

        if ((valor > 100) && (valor < 200)) {
            System.out.print("O valor " + valor + " esta entre 100 e 200!");
        } else {
            System.out.print("O valor " + valor + " esta fora do intervalo de 100 a 200!");
        }
    }
}
