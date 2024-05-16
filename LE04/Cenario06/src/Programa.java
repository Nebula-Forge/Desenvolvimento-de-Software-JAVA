import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

import br.edu.up.controllers.AeroportoController;
import br.edu.up.models.Aeronave;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Passagem;
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
                case 3:
                    adicionarAeronave(controller, scanner);
                    break;
                case 4:
                    controller.listarAeronaves();
                    break;
                case 5:
                    controller.listarPassageiros();
                    break;
                case 6:
                    controller.listarAeronaves();
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

        // Criar e adicionar passagem
        System.out.println("### Adicionar Passagem ###");
        System.out.print("Número do Assento: ");
        int numeroAssento = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Classe do Assento: ");
        String classeAssento = scanner.nextLine();
        System.out.println("Data do Voo (dia mês ano hora minuto): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();
        int hora = scanner.nextInt();
        int minuto = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes - 1, dia, hora, minuto);
        Date dataVoo = calendar.getTime();

        Passagem passagem = new Passagem(numeroAssento, classeAssento, dataVoo);

        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, passagem);
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

    private static void adicionarAeronave(AeroportoController controller, Scanner scanner) {
        System.out.println("### Adicionar Aeronave ###");

        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();

        System.out.print("Número de Assentos: ");
        int numeroAssentos = scanner.nextInt();

        Aeronave aeronave = new Aeronave(codigo, tipo, numeroAssentos);
        controller.adicionarAeronave(aeronave);

        System.out.println("Aeronave adicionada com sucesso!");
    }
}
