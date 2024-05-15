import java.util.Scanner;

import br.edu.up.controllers.AeroportoController;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Tripulacao;
import br.edu.up.view.AeroportoView;

public class Programa {
    public static void main(String[] args) {
        AeroportoController controller = new AeroportoController();
        AeroportoView view = new AeroportoView();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            view.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarPassageiro(controller, scanner);
                    break;
                case 2:
                    adicionarTripulacao(controller, scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarPassageiro(AeroportoController controller, Scanner scanner) {
        System.out.println("### Adicionar Passageiro ###");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Identificador de Bagagem: ");
        String identificadorBagagem = scanner.nextLine();
        // Lógica para adicionar passagem
        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, null);
        controller.adicionarPassageiro(passageiro);
        System.out.println("Passageiro adicionado com sucesso!");
    }

    private static void adicionarTripulacao(AeroportoController controller, Scanner scanner) {
        System.out.println("### Adicionar Tripulação ###");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Identificação Aeronáutica: ");
        String identificacaoAeronautica = scanner.nextLine();
        System.out.print("Matrícula do Funcionário: ");
        String matriculaFuncionario = scanner.nextLine();
        // Lógica para adicionar tripulação
        Tripulacao tripulacao = new Tripulacao(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        controller.adicionarTripulacao(tripulacao);
        System.out.println("Tripulação adicionada com sucesso!");
    }
}
