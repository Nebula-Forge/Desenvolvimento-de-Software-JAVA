package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio02 {
    // 2. Escrever um programa para determinar o consumo médio de um automóvel sendo
    // fornecida a distância total percorrida pelo automóvel e o total de
    // combustível gasto.

    public static void Executar() {
        PrintController.ExibirNaTela(2);

        System.out.println("2. Escrever um programa para determinar o consumo médio de um automóvel sendo\n"
                + "fornecida a distância total percorrida pelo automóvel e o total de\n"
                + "combustível gasto.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite a distância total percorrida (em km): ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("Digite o total de combustível gasto (em litros): ");
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.println("O consumo médio do automóvel é de " + consumoMedio + " km/l");
    }
}
