package br.edu.up.view;
import br.edu.up.*;

public class ClienteView {
    private ClienteController controller;
    private Scanner scanner;

    public ClienteView(ClienteController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Mostrar dados cliente pessoa");
        System.out.println("4. Mostrar dados cliente empresa");
        System.out.println("5. Emprestar para cliente pessoa");
        System.out.println("6. Emprestar para cliente empresa");
        System.out.println("7. Devolução de cliente pessoa");
        System.out.println("8. Devolução de cliente empresa");
        System.out.println("9. Sair");
    }

    public void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                controller.incluirClientePessoa();
                break;
            case 2:
                controller.incluirClienteEmpresa();
                break;
            case 3:
                controller.mostrarDadosClientePessoa();
                break;
            case 4:
                controller.mostrarDadosClienteEmpresa();
                break;
            case 5:
                controller.emprestarParaClientePessoa();
                break;
            case 6:
                controller.emprestarParaClienteEmpresa();
                break;
            case 7:
                controller.devolucaoParaClientePessoa();
                break;
            case 8:
                controller.devolucaoParaClienteEmpresa();
                break;
            case 9:
                System.out.println("Encerrando o programa.");
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
        }
    }
}
