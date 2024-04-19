package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio03 {
    // 3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e
    // o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
    // vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu
    // nome, o salário fixo e salário no final do mês.
    public static void Executar() {
        PrintController.ExibirNaTela(3);

        System.out.println("3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e\n"
                + "o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este\n"
                + "vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu\n"
                + "nome, o salário fixo e salário no final do mês.\n");

        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Digite o nome de um vendedor: ");
        String nomeVendedor = scanner.next();

        System.out.println("Digite o salário fixo: ");
        Double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas no mês (em dinheiro): ");
        Double totalVendas = scanner.nextDouble();

        Double comissao = totalVendas * 0.15;

        Double salarioTotal = comissao + salarioFixo;

        System.out.println("O salário fixo do vendedor " + nomeVendedor + " é de " + salarioFixo + " e o total é de "
                + salarioTotal + ".");
    }

}
