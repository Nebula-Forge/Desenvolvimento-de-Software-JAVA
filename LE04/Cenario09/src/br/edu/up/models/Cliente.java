package br.edu.up.models;
import br.edu.up.*;

public abstract class Cliente {
    protected int codigo;
    protected String nome;
    protected double vlrEmprestado;
    protected double limiteCredito;

    public Cliente(int codigo, String nome, double limiteCredito) {
        this.codigo = codigo;
        this.nome = nome;
        this.limiteCredito = limiteCredito;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public abstract void emprestar(double valor);

    public abstract void devolver(double valor);
}

public class ClientePessoa extends Cliente {
    public ClientePessoa(int codigo, String nome) {
        super(codigo, nome, 10000.00);
    }

    @Override
    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= limiteCredito) {
            vlrEmprestado += valor;
            System.out.println("Empréstimo de R$ " + valor + " realizado para cliente pessoa " + nome);
        } else {
            System.out.println("Valor de empréstimo excede o limite de crédito para cliente pessoa.");
        }
    }

    @Override
    public void devolver(double valor) {
        vlrEmprestado -= valor;
        if (vlrEmprestado < 0) {
            vlrEmprestado = 0;
        }
        System.out.println("Devolução de R$ " + valor + " realizado para cliente pessoa " + nome);
    }
}

public class ClienteEmpresa extends Cliente {
    public ClienteEmpresa(int codigo, String nome) {
        super(codigo, nome, 25000.00);
    }

    @Override
    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= limiteCredito) {
            vlrEmprestado += valor;
            System.out.println("Empréstimo de R$ " + valor + " realizado para cliente empresa " + nome);
        } else {
            System.out.println("Valor de empréstimo excede o limite de crédito para cliente empresa.");
        }
    }

    @Override
    public void devolver(double valor) {
        vlrEmprestado -= valor;
        if (vlrEmprestado < 0) {
            vlrEmprestado = 0;
        }
        System.out.println("Devolução de R$ " + valor + " realizado para cliente empresa " + nome);
    }
}
