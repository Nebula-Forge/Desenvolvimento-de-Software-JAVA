package br.edu.up.models;

public class Passageiro extends Pessoa {
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

    @Override
    public String toString() {
        return "Passageiro{nome='" + getNome() + "', rg='" + getRg() + "', identificadorBagagem='"
                + identificadorBagagem + "', passagem={numeroAssento='" + passagem.getNumeroAssento() + "', classeAssento='" + passagem.getClasseAssento() + "', dataVoo='" + passagem.getDataVoo() + "'}}";
    }
}
