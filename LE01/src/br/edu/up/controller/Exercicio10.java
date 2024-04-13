package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio10 {
    // 10. Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso.
    // Caso o usuário digite um valor que não esteja neste intervalo, exibir a
    // mensagem: “Númeroinválido!”.

    public static void ImprimirValores() {
        PrintController.ExibirNaTela(10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor de 1 a 5: ");

        int valor = scanner.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Você escolheu o número 'um'.");
                break;
            case 2:
                System.out.println("Você escolheu o número 'dois'.");
                break;
            case 3:
                System.out.println("Você escolheu o número 'três'.");
                break;
            case 4:
                System.out.println("Você escolheu o número 'quatro'.");
                break;
            case 5:
                System.out.println("Você escolheu o número 'cinco'.");
                break;

            default:
                System.out.println("Número inválido!");
                break;
        }
    }
}

