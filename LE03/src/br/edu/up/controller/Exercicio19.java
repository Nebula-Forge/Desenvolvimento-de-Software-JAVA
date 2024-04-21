package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio19 {
    // 19. Escrever um programa que leia três valores inteiros e verifique se eles
    // podem ser os lados de um triângulo. Se forem, informar qual o tipo de
    // triângulo que eles formam: equilátero, isóscele ou escaleno. Propriedade: o
    // comprimento de cada lado de um triângulo é menor do que a soma dos
    // comprimentos dos outros dois lados. Triângulo Equilátero: aquele que tem os
    // comprimentos dos três lados iguais; Triângulo Isóscele: aquele que tem os
    // comprimentos de dois lados iguais. Portanto, todo triângulo equilátero é
    // também isóscele; Triângulo Escaleno: aquele que tem os comprimentos de seus
    // três lados diferentes.

    public static void Executar() {
        PrintController.ExibirNaTela(19);

        System.out.println("19. Escrever um programa que leia três valores inteiros e verifique se eles\n"
                + "podem ser os lados de um triângulo. Se forem, informar qual o tipo de\n"
                + "triângulo que eles formam: equilátero, isóscele ou escaleno. Propriedade: o\n"
                + "comprimento de cada lado de um triângulo é menor do que a soma dos\n"
                + "comprimentos dos outros dois lados. Triângulo Equilátero: aquele que tem os\n"
                + "comprimentos dos três lados iguais; Triângulo Isóscele: aquele que tem os\n"
                + "comprimentos de dois lados iguais. Portanto, todo triângulo equilátero é\n"
                + "também isóscele; Triângulo Escaleno: aquele que tem os comprimentos de seus\n"
                + "três lados diferentes.\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita os três valores inteiros que representam os lados do triângulo
        System.out.println("Digite os três valores inteiros que representam os lados do triângulo:");
        int lado1 = scanner.nextInt();
        int lado2 = scanner.nextInt();
        int lado3 = scanner.nextInt();

        // Verifica se os valores podem formar um triângulo
        if (verificarTriangulo(lado1, lado2, lado3)) {
            // Determina o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isóscele.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores fornecidos não podem formar um triângulo.");
        }
    }

    // Método para verificar se os valores podem formar um triângulo
    public static boolean verificarTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}
