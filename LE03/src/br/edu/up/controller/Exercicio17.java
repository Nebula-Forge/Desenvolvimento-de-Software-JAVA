package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio17 {
    // 17. Leia o nome do funcionário, seu salário e o valor do salário mínimo.
    // Calcule o seu novo salário reajustado. Escrever o nome do funcionário, o
    // reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha
    // de pagamento.

    private static Scanner scanner = ScannerUtil.getScanner();

    public static void Executar() {
        PrintController.ExibirNaTela(17);

        System.out.println("17. Leia o nome do funcionário, seu salário e o valor do salário mínimo.\n"
                + "Calcule o seu novo salário reajustado. Escrever o nome do funcionário, o\n"
                + "reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha\n"
                + "de pagamento.\n");

        // Solicita o nome do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        // Solicita o salário do funcionário
        System.out.print("Digite o salário do funcionário: R$");
        double salarioFuncionario = scanner.nextDouble();

        // Solicita o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: R$");
        double salarioMinimo = scanner.nextDouble();

        // Calcula o novo salário reajustado
        double novoSalario = calcularNovoSalario(salarioFuncionario, salarioMinimo);

        // Calcula o valor do reajuste
        double reajuste = novoSalario - salarioFuncionario;

        // Apresenta o nome do funcionário, o reajuste e o novo salário
        System.out.println("\nNome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: R$" + reajuste);
        System.out.println("Novo salário: R$" + novoSalario);

        // Calcula quanto a empresa vai aumentar sua folha de pagamento
        double aumentoFolha = novoSalario - salarioFuncionario;

        // Apresenta quanto a empresa vai aumentar sua folha de pagamento
        System.out.println("\nAumento na folha de pagamento da empresa: R$" + aumentoFolha);
    }

    // Método privado para calcular o novo salário reajustado
    private static double calcularNovoSalario(double salario, double salarioMinimo) {
        double percentualReajuste;

        // Determina o percentual de reajuste com base no salário atual
        if (salario < 3 * salarioMinimo) {
            percentualReajuste = 0.5; // 50%
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            percentualReajuste = 0.2; // 20%
        } else {
            percentualReajuste = 0.1; // 10%
        }

        // Calcula o novo salário reajustado
        return salario * (1 + percentualReajuste);
    }
}
