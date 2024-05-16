import java.util.Scanner;
import br.edu.up.views.AgendaView;
import br.edu.up.models.Agenda;
import br.edu.up.models.Comercial;
import br.edu.up.models.Pessoal;

public class ProgramaAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Agenda agenda = new Agenda(); // Criando uma instância da Agenda

        do {
            AgendaView.exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarContatoPessoal(agenda, scanner);
                    break;
                case 2:
                    adicionarContatoComercial(agenda, scanner);
                    break;
                case 3:
                    agenda.listarContatos();
                    break;
                case 4:
                    excluirContato(agenda, scanner);
                    break;
                case 5:
                    buscarContato(agenda, scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 6);

        scanner.close();
    }

    private static void adicionarContatoPessoal(Agenda agenda, Scanner scanner) {
        System.out.println("Digite o codigo do contato pessoal:");
        int codigo = scanner.nextInt();
        
        System.out.println("Digite o nome do contato pessoal:");
        String nome = scanner.next();

        System.out.println("Digite o telefone do contato pessoal:");
        String telefone = scanner.next();
        
        System.out.println("Digite o aniversario do contato pessoal:");
        String aniversario = scanner.next();

        Pessoal contato = new Pessoal(codigo, nome, telefone, aniversario);
        agenda.adicionar(contato);
        System.out.println("Contato pessoal adicionado com sucesso!");
    }

    private static void adicionarContatoComercial(Agenda agenda, Scanner scanner) {
        System.out.println("Digite o codigo do contato comercial:");
        int codigo = scanner.nextInt();
        
        System.out.println("Digite o nome do contato comercial:");
        String nome = scanner.next();

        System.out.println("Digite o telefone do contato comercial:");
        String telefone = scanner.next();

        System.out.println("Digite o cnpj do contato comercial:");
        String cnpj = scanner.next();

        Comercial contato = new Comercial(codigo, nome, telefone, cnpj);
        agenda.adicionar(contato);
        System.out.println("Contato comercial adicionado com sucesso!");
    }

    private static void excluirContato(Agenda agenda, Scanner scanner) {
        System.out.println("Digite o código do contato a ser excluído:");
        int codigo = scanner.nextInt();
        agenda.excluirContato(codigo);
        System.out.println("Contato excluído com sucesso!");
    }

    private static void buscarContato(Agenda agenda, Scanner scanner) {
        System.out.println("Digite o código do contato a ser buscado:");
        int codigo = scanner.nextInt();
        agenda.getContato(codigo);
    }
}