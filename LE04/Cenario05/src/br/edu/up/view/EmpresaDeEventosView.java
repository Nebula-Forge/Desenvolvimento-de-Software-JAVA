package br.edu.up.view;
import br.edu.up.*;
import java.util.Scanner;

public class EmpresaDeEventosView {
    private Scanner scanner;

    public EmpresaDeEventosView() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Adicionar evento");
        System.out.println("2. Listar eventos");
        System.out.println("3. Adicionar reserva");
        System.out.println("4. Listar reservas");
        System.out.println("5. Sair");
        return scanner.nextInt();
    }

    // Métodos para receber dados do usuário, como adicionar evento, adicionar reserva, etc.
}
