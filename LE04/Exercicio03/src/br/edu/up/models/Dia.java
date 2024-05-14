package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Dia {
    private int diaMes;
    private List<Compromisso> compromissos;

    // Construtor
    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new ArrayList<>();
    }

    // Getters e Setters
    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public List<Compromisso> getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(List<Compromisso> compromissos) {
        this.compromissos = compromissos;
    }

    // Método para adicionar compromisso
    public void adicionarCompromisso(Compromisso comp) {
        compromissos.add(comp);
    }

    // Método para consultar compromisso por hora
    public Compromisso consultarCompromisso(int hora) {
        for (Compromisso comp : compromissos) {
            if (comp.getHora() == hora) {
                return comp;
            }
        }
        return null;
    }

    // Método para excluir compromisso por hora
    public void excluirCompromisso(int hora) {
        compromissos.removeIf(compromisso -> compromisso.getHora() == hora);
    }

    // Método para listar todos os compromissos do dia
    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Compromissos do dia ").append(diaMes).append(":\n");
        for (Compromisso comp : compromissos) {
            sb.append(comp.toString()).append("\n");
        }
        return sb.toString();
    }
}