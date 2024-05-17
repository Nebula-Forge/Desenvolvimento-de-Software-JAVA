package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Compromisso> compromissos;

    // Construtor
    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    // Método para adicionar um compromisso na agenda
    public void adicionarCompromisso(Compromisso compromisso) {
        compromissos.add(compromisso);
    }

    // Método para listar todos os compromissos
    public void listarCompromissos() {
        for (Compromisso compromisso : compromissos) {
            System.out.println("Assunto: " + compromisso.getAssunto());
            System.out.println("Pessoa: " + compromisso.getPessoa());
            System.out.println("Local: " + compromisso.getLocal());
            System.out.println("Data: " + compromisso.getDia() + "/" + compromisso.getMes() + "/" + compromisso.getAno());
            System.out.println("Hora: " + compromisso.getHora() + "h");
            System.out.println("-------------------------------------------");
        }
    }
}
