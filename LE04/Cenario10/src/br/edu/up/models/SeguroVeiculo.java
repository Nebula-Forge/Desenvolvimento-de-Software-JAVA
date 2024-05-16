package br.edu.up.models;

public class SeguroVeiculo extends Seguro {
    private double vlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public double getVlrFranquia() {
        return vlrFranquia;
    }

    public boolean getTemCarroReserva() {
        return temCarroReserva;
    }

    public boolean getCobreVidros() {
        return cobreVidros;
    }

    public void setVlrFranquia(double vlrFranquia) {
        this.vlrFranquia = vlrFranquia;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    public String getDados() {
        return super.getDados() + "\n" +
                "Valor da Franquia: " + this.vlrFranquia + "\n" +
                "Tem Carro Reserva: " + this.temCarroReserva + "\n" +
                "Cobre Vidros: " + this.cobreVidros;
    }

}
