package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio15 {
    // 15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e
    // P2(x2,y2), calcule e retorne a distância entre eles. A fórmula que efetua tal
    // cálculo é: d = raiz(((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10,
    // 20). Distancia: 18,03

    public static void DistanciaPs() {
        PrintController.ExibirNaTela(15);

        System.out.println("15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e\n" +
                "P2(x2,y2), calcule e retorne a distância entre eles. A fórmula que efetua tal\n" +
                "cálculo é: d = raiz(((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10,\n" +
                "20). Distancia: 18,03.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite as coordenadas do primeiro ponto (P1 x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Digite as coordenadas do segundo ponto (P2 x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calcula a distância entre os pontos
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distância entre os pontos: " + distancia);
    }
}
