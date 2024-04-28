package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio02 {
    // 2. Escrever um programa para determinar o consumo médio de um automóvel sendo
    // fornecida a distância total percorrida pelo automóvel e o total de
    // combustível gasto.

    private double distanciaPercorrida;
    private double combustivelGasto;

    // Construtor vazio
    public Exercicio02() {
    }

    // Construtor com parâmetros
    public Exercicio02(double distanciaPercorrida, double combustivelGasto) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    // Métodos para acessar e modificar as variáveis privadas
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    // Método para calcular o consumo médio
    public double calcularConsumoMedio() {
        return distanciaPercorrida / combustivelGasto;
    }

    // Método para executar o programa
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

        // Criando uma instância da classe Exercicio02 usando o construtor com
        // parâmetros
        Exercicio02 exercicio = new Exercicio02(distanciaPercorrida, combustivelGasto);

        // Utilizando os métodos de acesso para obter os valores e calcular o consumo
        // médio
        System.out.println("O consumo médio do automóvel é de " + exercicio.calcularConsumoMedio() + " km/l");
    }
}
