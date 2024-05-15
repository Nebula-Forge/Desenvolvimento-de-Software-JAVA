package br.edu.up.controllers;

import java.util.ArrayList;
import java.util.List;
// import br.edu.up.models.*;

// import br.edu.up.models.Aeronave;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Tripulacao;

public class AeroportoController {
    private List<Passageiro> passageiros;
    private List<Tripulacao> tripulacao;
    // private Aeronave aeronave;

    public AeroportoController() {
        passageiros = new ArrayList<>();
        tripulacao = new ArrayList<>();
        // Inicializar aeronave
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void adicionarTripulacao(Tripulacao tripulacao) {
        this.tripulacao.add(tripulacao);
    }

}
