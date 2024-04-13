package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio19 {
    // 19. Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o
    // seu volume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2
    // * altura; Exemplo: raio = 10, altura = 15. Volume = 4710

    public static void VolumeCilindro() {
        PrintController.ExibirNaTela(19);

        System.out.println("19. Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o\n" +
                "seu volume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2\n" +
                "* altura; Exemplo: raio = 10, altura = 15. Volume = 4710.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();

        System.out.println("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();

        // Calcula o volume do cilindro
        double volume = 3.14 * Math.pow(raio, 2) * altura;

        System.out.println("Volume do cilindro: " + volume);
    }
}
