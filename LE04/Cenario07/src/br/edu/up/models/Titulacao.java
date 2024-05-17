package br.edu.up.models;
import br.edu.up.*;

public class Titulacao {
    private String nomeInstituicao;
    private int anoConclusao;
    private String nomeTitulo;
    private String tituloTrabalho;

    public Titulacao (String nomeInstituicao, int anoConclusao, String nomeTitulo, String tituloTrabalho) {
        this.nomeInstituicao = nomeInstituicao;
        this.anoConclusao = anoConclusao;
        this.nomeTitulo = nomeTitulo;
        this.tituloTrabalho = tituloTrabalho;
    }

}
