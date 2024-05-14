package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Mes {
    private String nome;
    private int qtdeDias;
    private List<Dia> dias;
    private Ano ano;

    // Construtor
    public Mes(int qtdeDias, String nome) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public List<Dia> getDias() {
        return dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }

    public Ano getAno() {
        return ano;
    }

    public void setAno(Ano ano) {
        this.ano = ano;
    }

    // Método para adicionar compromisso em um dia específico
    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        for (Dia dia : dias) {
            if (dia.getDiaMes() == diaMes) {
                dia.adicionarCompromisso(comp);
                break;
            }
        }
    }

    // Método para excluir compromisso em um dia específico
    public void excluirCompromisso(int diaMes, int hora) {
        for (Dia dia : dias) {
            if (dia.getDiaMes() == diaMes) {
                dia.excluirCompromisso(hora);
                break;
            }
        }
    }

    // Método para listar compromissos de um dia específico
    public String listarCompromissos(int diaMes) {
        for (Dia dia : dias) {
            if (dia.getDiaMes() == diaMes) {
                return dia.listarCompromissos();
            }
        }
        return "Nenhum compromisso encontrado para o dia " + diaMes;
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Compromissos do mês de ").append(nome).append(":\n");
        for (Dia dia : dias) {
            sb.append(dia.listarCompromissos());
        }
        return sb.toString();
    }
}