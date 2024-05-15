package br.edu.up.models;

import java.util.Date;

public class Passagem {
    private int numeroAssento;
    private String classeAssento;
    private Date dataVoo;

    public Passagem(int numeroAssento, String classeAssento, Date dataVoo) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public Date getDataVoo() {
        return dataVoo;
    }
}
