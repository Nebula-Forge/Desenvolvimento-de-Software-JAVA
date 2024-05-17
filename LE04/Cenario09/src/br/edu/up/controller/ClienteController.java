package br.edu.up.controller;
import br.edu.up.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClienteController {
    private Map<Integer, Cliente> clientes;
    private Scanner scanner;

    public ClienteController() {
        clientes = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void incluirClientePessoa() {
        System.out.println("Digite o código do cliente pessoa:");
        int codigo = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o nome do cliente pessoa:");
        String nome = scanner.nextLine();
        Cliente cliente = new ClientePessoa(codigo, nome);
        clientes.put(codigo, cliente);
        System.out.println("Cliente pessoa adicionado com sucesso.");
    }

    public void incluirClienteEmpresa() {
        System.out.println("Digite o código do cliente empresa:");
        int codigo = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o nome do cliente empresa:");
        String nome = scanner.nextLine();
        Cliente cliente = new ClienteEmpresa(codigo, nome);
        clientes.put(codigo, cliente);
        System.out.println("Cliente empresa adicionado com sucesso.");
    }

    public void mostrarDadosClientePessoa() {
        System.out.println("Digite o código do cliente pessoa:");
        int codigo = Integer.parseInt(scanner.nextLine());
        Cliente cliente = clientes.get(codigo);
        if (cliente instanceof ClientePessoa) {
            System.out.println(cliente);
        } else {
            System.out.println("Cliente não encontrado ou não é uma pessoa.");
        }
    }

    public void mostrarDadosClienteEmpresa() {
        System.out.println("Digite o código do cliente empresa:");
        int codigo = Integer.parseInt(scanner.nextLine());
        Cliente cliente = clientes.get(codigo);
        if (cliente instanceof ClienteEmpresa) {
            System.out.println(cliente);
        } else {
            System.out.println("Cliente não encontrado ou não é uma empresa.");
        }
    }

    public void emprestarParaClientePessoa() {
        System.out.println("Digite o código do cliente pessoa:");
        int codigo = Integer.parseInt(scanner.nextLine());
        Cliente cliente = clientes.get(codigo);
        if (cliente instanceof ClientePessoa) {
            System.out.println("Digite o valor para empréstimo:");
            double valor = Double.parseDouble(scanner.nextLine());
            cliente.emprestar(valor);
        } else {
            System.out.println("Cliente não encontrado ou não é uma pessoa.");
        }
    }

    public void emprestarParaClienteEmpresa() {
        System.out.println("Digite o código do cliente empresa:");
        int codigo = Integer.parseInt(scanner.nextLine());
        Cliente cliente = clientes.get(codigo);
        if (cliente instanceof ClienteEmpresa) {
            System.out.println("Digite o valor para empréstimo:");
            double valor = Double.parseDouble(scanner.nextLine());
            cliente.emprestar(valor);
        } else {
            System.out.println("Cliente não encontrado ou não é uma empresa.");
        }
    }

    public void devolucaoParaClientePessoa() {
        System.out.println("Digite o código do cliente pessoa:");
        int codigo = Integer.parseInt(scanner.nextLine());
        Cliente cliente = clientes.get(codigo);
        if (cliente instanceof ClientePessoa) {
            System.out.println("Digite o valor para devolução:");
            double valor = Double.parseDouble(scanner.nextLine());
            cliente.devolver(valor);
        } else {
            System.out.println("Cliente não encontrado ou não é uma pessoa.");
        }
    }

    public void devolucaoParaClienteEmpresa() {
        System.out.println("Digite o código do cliente empresa:");
        int codigo = Integer.parseInt(scanner.nextLine());
        Cliente cliente = clientes.get(codigo);
        if (cliente instanceof ClienteEmpresa) {
            System.out.println("Digite o valor para devolução:");
            double valor = Double.parseDouble(scanner.nextLine());
            cliente.devolver(valor);
        } else {
            System.out.println("Cliente não encontrado ou não é uma empresa.");
        }
    }
}
