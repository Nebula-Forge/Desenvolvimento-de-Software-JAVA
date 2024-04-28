package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio03 {
    // 3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e
    // o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
    // vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu
    // nome, o salário fixo e salário no final do mês.
    
    private String nomeVendedor;
    private double salarioFixo;
    private double totalVendas;

    // Construtor vazio
    public Exercicio03() {
    }

    // Construtor com parâmetros
    public Exercicio03(String nomeVendedor, double salarioFixo, double totalVendas) {
        this.nomeVendedor = nomeVendedor;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    // Métodos para acessar e modificar as variáveis privadas
    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    // Método para calcular o salário total
    public double calcularSalarioTotal() {
        double comissao = totalVendas * 0.15;
        return comissao + salarioFixo;
    }

    // Método para executar o programa
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
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas no mês (em dinheiro): ");
        double totalVendas = scanner.nextDouble();

        // Criando uma instância da classe Exercicio03 usando o construtor com
        // parâmetros
        Exercicio03 exercicio = new Exercicio03(nomeVendedor, salarioFixo, totalVendas);

        // Utilizando os métodos de acesso para obter os valores e calcular o salário
        // total
        System.out.println(
                "O salário fixo do vendedor " + exercicio.getNomeVendedor() + " é de " + exercicio.getSalarioFixo()
                        + " e o total é de " + exercicio.calcularSalarioTotal() + ".");
    }
}
