import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.models.*;
import br.edu.up.views.ApoliceView;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        List<Seguro> seguros = new ArrayList<>(); // Criando uma instância da Agenda

        do {
            ApoliceView.exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    incluirSeguro(seguros, scanner);
                    break;
                case 2:
                    localizarSeguro(seguros, scanner);
                    break;
                case 3:
                    excluirSeguro(seguros, scanner);
                    break;
                case 4:
                    excluirTodosSeguros(seguros, scanner);
                    break;
                case 5:
                    listarSeguros(seguros);
                    break;
                case 6:
                    qtdSeguros(seguros);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 7);

        scanner.close();
    }

    private static void incluirSeguro(List<Seguro> seguros, Scanner scanner) {
        int opcao;

        System.out.println("1 - Seguro de Vida");
        System.out.println("2 - Seguro de Veículo");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                SeguroVida seguroVida = new SeguroVida();
                System.out.print("Apólice: ");
                String apolice = scanner.next();
                for (Seguro seguro : seguros) {
                    if (seguro.getApolice().equals(apolice)) {
                        System.out.println("Seguro com essa apólice já existe.");
                        return;
                    }
                }
                System.out.print("Seguradora: ");
                seguroVida.setSeguradora(scanner.next());
                System.out.print("Valor da Apólice: ");
                seguroVida.setVlrApolice(scanner.nextDouble());
                System.out.print("Data de Início (yyyy-MM-dd): ");
                seguroVida.setDtaInicio(LocalDate.parse(scanner.next()));
                System.out.print("Data de Fim (yyyy-MM-dd): ");
                seguroVida.setDtaFim(LocalDate.parse(scanner.next()));
                System.out.print("Cobre Doença: ");
                seguroVida.setCobreDoenca(scanner.nextBoolean());
                System.out.print("Cobre Acidente: ");
                seguroVida.setCobreAcidente(scanner.nextBoolean());
                seguros.add(seguroVida);
                break;
            case 2:
                SeguroVeiculo seguroVeiculo = new SeguroVeiculo();
                System.out.print("Apólice: ");
                seguroVeiculo.setApolice(scanner.next());
                System.out.print("Seguradora: ");
                seguroVeiculo.setSeguradora(scanner.next());
                System.out.print("Valor da Apólice: ");
                seguroVeiculo.setVlrApolice(scanner.nextDouble());
                System.out.print("Data de Início (yyyy-MM-dd): ");
                seguroVeiculo.setDtaInicio(LocalDate.parse(scanner.next()));
                System.out.print("Data de Fim (yyyy-MM-dd): ");
                seguroVeiculo.setDtaFim(LocalDate.parse(scanner.next()));
                System.out.print("Valor da Franquia: ");
                seguroVeiculo.setVlrFranquia(scanner.nextDouble());
                System.out.print("Tem Carro Reserva: ");
                seguroVeiculo.setTemCarroReserva(scanner.nextBoolean());
                System.out.print("Cobre Vidros: ");
                seguroVeiculo.setCobreVidros(scanner.nextBoolean());
                seguros.add(seguroVeiculo);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
    }

    private static void localizarSeguro(List<Seguro> seguros, Scanner scanner) {
        System.out.print("Digite o número da apólice: ");
        String apolice = scanner.next();
    
        System.out.println("Número da apólice digitado: " + apolice);
    
        for (Seguro seguro : seguros) {
            System.out.println("Número da apólice do seguro: " + seguro.getApolice());
            if (seguro.getApolice() != null && seguro.getApolice().equals(apolice)) {
                System.out.println(seguro.getDados());
                return;
            }
        }
        System.out.println("Seguro não encontrado.");
    }

    private static void excluirSeguro(List<Seguro> seguros, Scanner scanner) {
        System.out.print("Digite o número da apólice: ");
        String apolice = scanner.next();

        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                seguros.remove(seguro);
                System.out.println("Seguro excluído com sucesso.");
                return;
            }
        }
        System.out.println("Seguro não encontrado.");
    }

    private static void excluirTodosSeguros(List<Seguro> seguros, Scanner scanner) {
        System.out.println("Deseja mesmo excluir todos os seguros? (S/N)");
        String resposta = scanner.next();

        if (!resposta.equalsIgnoreCase("S")) {
            System.out.println("Operação cancelada.");
            return;
        }
        seguros.clear();
        System.out.println("Todos os seguros foram excluídos.");
    }

    private static void listarSeguros(List<Seguro> seguros) {
        for (Seguro seguro : seguros) {
            System.out.println(seguro.getDados());
        }
    }

    private static void qtdSeguros(List<Seguro> seguros) {
        System.out.println("Quantidade de seguros: " + seguros.size());
    }
}
