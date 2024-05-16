package br.edu.up.models;

public class Tripulacao extends Pessoa {
    private String identificacaoAeronautica;
    private String matriculaFuncionario;

    public Tripulacao(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario) {
        super(nome, rg);
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getIdentificacaoAeronautica() {
        return identificacaoAeronautica;
    }

    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    @Override
    public String toString() {
        return "Tripulacao{" + "nome='" + getNome() + "'" + ", rg='" + getRg() + "'" + ", identificacaoAeronautica='"
                + identificacaoAeronautica + "'" + ", matriculaFuncionario='" + matriculaFuncionario + "'" + '}';
    }
}
