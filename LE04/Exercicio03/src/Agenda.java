import java.util.Scanner;

import br.edu.up.models.Ano;
import br.edu.up.models.Compromisso;
import br.edu.up.models.Mes;

public class Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um ano
        Ano ano2024 = new Ano(2024, true);

        // Criando os meses do ano
        for (int i = 1; i <= 12; i++) {
            Mes mes = new Mes(obterDiasNoMes(i), obterNomeMes(i));
            ano2024.adicionarMes(mes);
        }

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar compromisso");
            System.out.println("2. Listar compromissos de um dia");
            System.out.println("3. Excluir compromisso");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o dia do compromisso:");
                    int dia = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    System.out.println("Digite o nome do mês:");
                    String nomeMes = scanner.nextLine();

                    Mes mes = obterMesPeloNome(ano2024, nomeMes);

                    if (mes != null) {
                        System.out.println("Digite o nome da pessoa:");
                        String pessoa = scanner.nextLine();

                        System.out.println("Digite o local:");
                        String local = scanner.nextLine();

                        System.out.println("Digite o assunto:");
                        String assunto = scanner.nextLine();

                        System.out.println("Digite a hora:");
                        int hora = scanner.nextInt();

                        Compromisso novoCompromisso = new Compromisso(pessoa, local, assunto, hora);
                        mes.adicionarCompromisso(novoCompromisso, dia);
                    } else {
                        System.out.println("Mês não encontrado!");
                    }
                    break;
                case 2:
                    System.out.println("Digite o dia para listar os compromissos:");
                    int diaListar = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    System.out.println("Digite o nome do mês:");
                    String nomeMesListar = scanner.nextLine();

                    Mes mesListar = obterMesPeloNome(ano2024, nomeMesListar);

                    if (mesListar != null) {
                        System.out.println(mesListar.listarCompromissos(diaListar));
                    } else {
                        System.out.println("Mês não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o dia do compromisso a ser excluído:");
                    int diaExcluir = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    System.out.println("Digite o nome do mês:");
                    String nomeMesExcluir = scanner.nextLine();

                    Mes mesExcluir = obterMesPeloNome(ano2024, nomeMesExcluir);

                    if (mesExcluir != null) {
                        System.out.println("Digite a hora do compromisso a ser excluído:");
                        int horaExcluir = scanner.nextInt();

                        mesExcluir.excluirCompromisso(diaExcluir, horaExcluir);
                    } else {
                        System.out.println("Mês não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // Método para obter o nome do mês pelo número do mês
    private static String obterNomeMes(int numeroMes) {
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        return meses[numeroMes - 1];
    }

    // Método para obter a quantidade de dias em um determinado mês
    private static int obterDiasNoMes(int numeroMes) {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return diasPorMes[numeroMes - 1];
    }

    // Método para obter o objeto Mes pelo nome do mês
    private static Mes obterMesPeloNome(Ano ano, String nomeMes) {
        for (Mes mes : ano.getMeses()) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                return mes;
            }
        }
        return null;
    }
}
