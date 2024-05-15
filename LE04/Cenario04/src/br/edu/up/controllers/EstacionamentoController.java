package br.edu.up.controllers;

import java.util.*;
import br.edu.up.models.*;

public class EstacionamentoController {
    private List<Veiculo> vagas;
    private int capacidade;
    private double valorPorPeriodo;
    private int entrada;
    private int saida;

    public EstacionamentoController(int capacidade, double valorPorPeriodo) {
        this.capacidade = capacidade;
        this.valorPorPeriodo = valorPorPeriodo;
        this.vagas = new ArrayList<>();
    }

    public boolean entradaVeiculo(Veiculo veiculo) {
        if (vagas.size() < capacidade) {
            vagas.add(veiculo);
            entrada++;
            return true;
        }
        return false;
    }

    public Veiculo saidaVeiculo(String placa) {
        for (Veiculo veiculo : vagas) {
            if (veiculo.getPlaca().equals(placa)) {
                vagas.remove(veiculo);
                saida++;
                return veiculo;
            }
        }
        return null;
    }

    public int getTotalSaidas() {
        return saida;
    }
    
    public int getTotalEntradas() {
        return entrada;
    }

    public double calcularPagamento() {
        return getTotalSaidas() * valorPorPeriodo;
    }
}
