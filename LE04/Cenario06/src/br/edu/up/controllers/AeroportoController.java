package br.edu.up.controllers;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.Aeronave;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Tripulacao;

public class AeroportoController {
    private List<Passageiro> passageiros;
    private List<Tripulacao> tripulacao;
    private List<Aeronave> aeronaves;
    // private Aeronave aeronave;

    public AeroportoController() {
        passageiros = new ArrayList<>();
        tripulacao = new ArrayList<>();
        aeronaves = new ArrayList<>();
        // Inicializar aeronave
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void adicionarTripulacao(Tripulacao tripulacao) {
        this.tripulacao.add(tripulacao);
    }

    public void adicionarAeronave(Aeronave aeronave) {
        this.aeronaves.add(aeronave);
    }

    public void listarPassageiros() {
        System.out.println("### Lista de Passageiros ###");
        for (Passageiro passageiro : passageiros) {
            System.out.println(passageiro.toString());
        }
    }

    public void listarTripulacao() {
        System.out.println("### Lista de Tripulação ###");
        for (Tripulacao tripulante : tripulacao) {
            System.out.println(tripulante.toString());
        }
    }

    public void listarAeronaves() {
        System.out.println("### Lista de Aeronaves ###");
        for (Aeronave aeronave : aeronaves) {
            System.out.println(aeronave.toString());
        }
    }
}
