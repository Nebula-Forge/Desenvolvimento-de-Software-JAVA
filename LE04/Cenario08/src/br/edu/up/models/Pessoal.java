package br.edu.up.models;

public class Pessoal extends Contato {
    private String aniversario;

    public Pessoal(int codigo, String nome, String telefone, String aniversario) {
        super(codigo, nome, telefone);
        this.aniversario = aniversario;
    }

    public void setEmail(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getEmail() {
        return this.aniversario;
    }

    @Override
    public String toString() {
        return "Pessoal [aniversario=" + aniversario + ", " + super.toString() + "]";
    }
}
