import java.util.Scanner;
import br.edu.up.controllers.*;
import br.edu.up.models.*;
import br.edu.up.view.*;

public class Programa {
    public static void main(String[] args) {
        EstacionamentoController controller = new EstacionamentoController(10, 5.0);
        EstacionamentoView view = new EstacionamentoView();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Entrada de veículo");
            System.out.println("2. Saída de veículo");
            System.out.println("3. Emitir relatório e sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Modelo do veículo: ");
                    String modelo = scanner.next();
                    System.out.print("Placa do veículo: ");
                    String placa = scanner.next();
                    System.out.print("Cor do veículo: ");
                    String cor = scanner.next();
                    Veiculo veiculo = new Veiculo(modelo, placa, cor);
                    if (controller.entradaVeiculo(veiculo)) {
                        System.out.println("Veículo estacionado com sucesso!");
                    } else {
                        System.out.println("Não há vagas disponíveis.");
                    }
                    break;
                case 2:
                    System.out.print("Placa do veículo a ser retirado: ");
                    String placaSaida = scanner.next();
                    Veiculo veiculoSaida = controller.saidaVeiculo(placaSaida);
                    if (veiculoSaida != null) {
                        System.out.println("Veículo " + veiculoSaida.getModelo() + " de placa " +
                                veiculoSaida.getPlaca() + " retirado com sucesso!");
                    } else {
                        System.out.println("Veículo não encontrado no estacionamento.");
                    }
                    break;
                case 3:
                    view.imprimirRelatorio(controller.getTotalEntradas(), controller.getTotalSaidas(),
                            controller.calcularPagamento());
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    scanner.close();
            }
        }
    }
}
