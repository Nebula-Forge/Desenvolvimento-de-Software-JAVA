package br.edu.up.controller;

import java.util.Scanner;

public class Exercicio26 {
    // 26. Uma seguradora possui nove categorias de seguro baseadas na idade e
    // ocupação do segurado. Somente pessoas com pelo menos 17 anos e não mais que
    // 70 anos podem adquirir apólices de seguro. Quanto às classes de ocupações,
    // foram definidos três grupos de risco: baixo, médio e alto. A tabela abaixo
    // fornece as categorias em função da faixa etária e do grupo de risco. Dados
    // nome, idade e grupo de risco de um pretendente, determinar e imprimir seus
    // dados e categoria. Caso a idade não esteja na faixa necessária, imprimir uma
    // mensagem informando que ele não se enquadra em nenhuma das categorias
    // ofertadas.
    // Grupo de Risco:
    // Idade Baixo Médio Alto
    // 17 a 20 1 2 3
    // 21 a 24 2 3 4
    // 25 a 34 3 4 5
    // 35 a 64 4 5 6
    // 65 a 70 7 8 9

    public static void Executar() {
        PrintController.ExibirNaTela(26);

        System.out
                .println("26. Uma seguradora possui nove categorias de seguro baseadas na idade e\n"
                        + "ocupação do segurado. Somente pessoas com pelo menos 17 anos e não mais que\n"
                        + "70 anos podem adquirir apólices de seguro. Quanto às classes de ocupações,\n"
                        + "foram definidos três grupos de risco: baixo, médio e alto. A tabela abaixo\n"
                        + "fornece as categorias em função da faixa etária e do grupo de risco. Dados\n"
                        + "nome, idade e grupo de risco de um pretendente, determinar e imprimir seus\n"
                        + "dados e categoria. Caso a idade não esteja na faixa necessária, imprimir uma\n"
                        + "mensagem informando que ele não se enquadra em nenhuma das categorias\n"
                        + "Grupo de Risco:\n"
                        + "Idade      Baixo  Médio   Alto\n"
                        + "17 a 20    1      2       3\n"
                        + "21 a 24    2      3       4\n"
                        + "25 a 34    3      4       5\n"
                        + "35 a 64    4      5       6\n"
                        + "65 a 70    7      8       9\n");

        Scanner scanner = ScannerUtil.getScanner();

        // Solicita o nome do pretendente
        System.out.print("Digite o nome do pretendente: ");
        String nome = scanner.next();

        // Solicita a idade do pretendente
        System.out.print("Digite a idade do pretendente: ");
        int idade = scanner.nextInt();

        // Solicita o grupo de risco do pretendente
        System.out.println("Digite o grupo de risco do pretendente (baixo, médio ou alto): ");
        String grupoRisco = scanner.next();

        // Determina a categoria de seguro do pretendente
        int categoria = determinarCategoria(idade, grupoRisco);

        // Exibe os dados do pretendente e sua categoria de seguro
        if (categoria != 0) {
            System.out.println("\nDados do pretendente:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Grupo de risco: " + grupoRisco);
            System.out.println("Categoria de seguro: " + categoria);
        } else {
            System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
        }

        scanner.close();
    }

    // Método para determinar a categoria de seguro do pretendente
    public static int determinarCategoria(int idade, String grupoRisco) {
        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case "baixo":
                    return 1;
                case "médio":
                    return 2;
                case "alto":
                    return 3;
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case "baixo":
                    return 2;
                case "médio":
                    return 3;
                case "alto":
                    return 4;
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case "baixo":
                    return 3;
                case "médio":
                    return 4;
                case "alto":
                    return 5;
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case "baixo":
                    return 4;
                case "médio":
                    return 5;
                case "alto":
                    return 6;
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case "baixo":
                    return 7;
                case "médio":
                    return 8;
                case "alto":
                    return 9;
            }
        }
        // Retorna 0 se a idade estiver fora da faixa necessária
        return 0;
    }
}
