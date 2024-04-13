package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio20 {
    // 20. Elabore um algoritmo que calcule a quantidade de litros de combustível
    // gasta emuma viagem, utilizando um automóvel que faz 12km por litro e
    // considerando que sãofornecidos o tempo em hora e a velocidade média da
    // viagem.

    public static void GastoViagem(){
        PrintController.ExibirNaTela(20);

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite o tempo da viagem em horas: ");
        double tempo = scanner.nextDouble();

        System.out.println("Digite a velocidade média da viagem em km/h: ");
        double velocidadeMedia = scanner.nextDouble();

        // Calcula a distância em km
        double distancia = tempo * velocidadeMedia;

        // Calcula a quantidade de litros de combustível gasta
        double litros = distancia / 12;

        System.out.println("Quantidade de litros de combustível gasta: " + String.format("%.2f", litros));
    }
}

