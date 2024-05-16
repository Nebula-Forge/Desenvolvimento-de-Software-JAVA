package br.edu.up.models;

public class SeguroVida extends Seguro {
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    public boolean getCobreDoenca() {
        return cobreDoenca;
    }

    public boolean getCobreAcidente() {
        return cobreAcidente;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    public String getDados() {
        return super.getDados() + "\n" +
                "Cobre Doença: " + this.cobreDoenca + "\n" +
                "Cobre Acidente: " + this.cobreAcidente;
    }

}
