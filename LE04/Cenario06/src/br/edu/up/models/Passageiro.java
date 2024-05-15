package br.edu.up.models;

public class Passageiro extends Pessoa{
    private String identificadorBagagem;
    private Passagem passagem;

    public Passageiro(String nome, String rg, String identificadorBagagem, Passagem passagem) {
        super(nome, rg);
        this.identificadorBagagem = identificadorBagagem;
        this.passagem = passagem;
    }

    public String getIdentificadorBagagem() {
        return identificadorBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }
}
