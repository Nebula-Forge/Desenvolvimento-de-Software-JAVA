package br.edu.up.models;

import java.time.LocalDate;

public abstract class Seguro {
    private String apolice;
    private String seguradora;
    private double vlrApolice;
    private LocalDate dtaInicio;
    private LocalDate dtaFim;

    public String getApolice() {
        return apolice;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public double getVlrApolice() {
        return vlrApolice;
    }

    public LocalDate getDtaInicio() {
        return dtaInicio;
    }

    public LocalDate getDtaFim() {
        return dtaFim;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    public void setVlrApolice(double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }

    public void setDtaInicio(LocalDate dtaInicio) {
        this.dtaInicio = dtaInicio;
    }

    public void setDtaFim(LocalDate dtaFim) {
        this.dtaFim = dtaFim;
    }

    public String getDados() {
        return "Apólice: " + this.apolice + "\n" +
                "Seguradora: " + this.seguradora + "\n" +
                "Valor da Apólice: " + this.vlrApolice + "\n" +
                "Data de Início: " + this.dtaInicio + "\n" +
                "Data de Fim: " + this.dtaFim;
    }
}
