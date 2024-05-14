package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Ano {
    private int ano;
    private List<Mes> meses;
    private boolean bissexto;

    // Construtor
    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new ArrayList<>();
    }

    // Getters e Setters
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Mes> getMeses() {
        return meses;
    }

    public void setMeses(List<Mes> meses) {
        this.meses = meses;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }

    // Método para adicionar um mês ao ano
    public void adicionarMes(Mes mes) {
        meses.add(mes);
        mes.setAno(this);
    }

    // Método para excluir compromisso em um mês e dia específicos
    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                mes.excluirCompromisso(diaMes, hora);
                break;
            }
        }
    }

    // Método para listar compromissos de um mês e dia específicos
    public String listarCompromissos(String nomeMes, int diaMes, int hora) {
        for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                return mes.listarCompromissos(diaMes);
            }
        }
        return "Nenhum compromisso encontrado para o mês " + nomeMes + ", dia " + diaMes;
    }

    // Método para listar todos os compromissos do ano
    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Compromissos do ano ").append(ano).append(":\n");
        for (Mes mes : meses) {
            sb.append(mes.listarCompromissos());
        }
        return sb.toString();
    }
}