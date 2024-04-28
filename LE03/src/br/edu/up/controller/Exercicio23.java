package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio23 {
    // 23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma
    // pessoa. Calcule e mostre nome e o seu peso ideal de acordo com as seguintes
    // características da pessoa: Sexo Altura Idade Peso Ideal

    private static Scanner scanner = ScannerUtil.getScanner();

    public static void Executar() {
        PrintController.ExibirNaTela(23);

        System.out.println("23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma\n"
                + "pessoa. Calcule e mostre nome e o seu peso ideal de acordo com as seguintes\n"
                + "características da pessoa: Sexo Altura Idade Peso Ideal.\n");

        // Solicita o nome da pessoa
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.next();

        // Solicita o sexo da pessoa (M ou F)
        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = scanner.next().charAt(0);

        // Solicita a altura da pessoa
        System.out.print("Digite a altura da pessoa em metros: ");
        double altura = scanner.nextDouble();

        // Solicita a idade da pessoa
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        // Calcula e exibe o peso ideal
        double pesoIdeal = calcularPesoIdeal(sexo, altura, idade);
        System.out.println("Nome: " + nome);
        System.out.println("Peso ideal: " + pesoIdeal + " kg");
    }

    private static double calcularPesoIdeal(char sexo, double altura, int idade) {
        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade >= 21 && idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.7 * altura) - 58;
                }
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (altura > 1.50) {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            } else {
                pesoIdeal = (62.1 * altura) - 44.7;
            }
        } else {
            System.out.println("Sexo inválido!");
            pesoIdeal = 0;
        }
        return pesoIdeal;
    }
}
