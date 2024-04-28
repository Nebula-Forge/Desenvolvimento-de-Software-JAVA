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

    private enum GrupoRisco {
        BAIXO, MÉDIO, ALTO
    }

    public static void Executar() {
        PrintController.ExibirNaTela(26);

        System.out.println("26. Uma seguradora possui nove categorias de seguro baseadas na idade e\n"
                + "ocupação do segurado. Somente pessoas com pelo menos 17 anos e não mais que\n"
                + "70 anos podem adquirir apólices de seguro. Quanto às classes de ocupações,\n"
                + "foram definidos três grupos de risco: baixo, médio e alto. A tabela abaixo\n"
                + "fornece as categorias em função da faixa etária e do grupo de risco. Dados\n"
                + "nome, idade e grupo de risco de um pretendente, determinar e imprimir seus\n"
                + "dados e categoria. Caso a idade não esteja na faixa necessária, imprimir uma\n"
                + "mensagem informando que ele não se enquadra em nenhuma das categorias\n"
                + "ofertadas.\n"
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

        // Valida se a idade está na faixa necessária
        if (idade < 17 || idade > 70) {
            System.out.println("O pretendente não se enquadra na faixa etária permitida.");
            scanner.close();
            return;
        }

        // Solicita o grupo de risco do pretendente
        GrupoRisco grupoRisco;
        do {
            System.out.println("Digite o grupo de risco do pretendente (baixo, médio ou alto): ");
            String grupoRiscoInput = scanner.next().toUpperCase();
            grupoRisco = GrupoRisco.valueOf(grupoRiscoInput);
        } while (grupoRisco == null);

        // Determina a categoria de seguro do pretendente
        int categoria = determinarCategoria(idade, grupoRisco);

        // Exibe os dados do pretendente e sua categoria de seguro
        System.out.println("\nDados do pretendente:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Grupo de risco: " + grupoRisco);
        System.out.println("Categoria de seguro: " + categoria);

        scanner.close();
    }

    // Método para determinar a categoria de seguro do pretendente
    public static int determinarCategoria(int idade, GrupoRisco grupoRisco) {
        switch (idade) {
            case 17, 18, 19, 20 -> {
                return switch (grupoRisco) {
                    case BAIXO -> 1;
                    case MÉDIO -> 2;
                    case ALTO -> 3;
                };
            }
            case 21, 22, 23, 24 -> {
                return switch (grupoRisco) {
                    case BAIXO -> 2;
                    case MÉDIO -> 3;
                    case ALTO -> 4;
                };
            }
            case 25, 26, 27, 28, 29, 30, 31, 32, 33, 34 -> {
                return switch (grupoRisco) {
                    case BAIXO -> 3;
                    case MÉDIO -> 4;
                    case ALTO -> 5;
                };
            }
            case 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                    61, 62, 63, 64 -> {
                return switch (grupoRisco) {
                    case BAIXO -> 4;
                    case MÉDIO -> 5;
                    case ALTO -> 6;
                };
            }
            case 65, 66, 67, 68, 69, 70 -> {
                return switch (grupoRisco) {
                    case BAIXO -> 7;
                    case MÉDIO -> 8;
                    case ALTO -> 9;
                };
            }
        }
        // Retorna 0 se a idade estiver fora da faixa necessária
        return 0;
    }
}
