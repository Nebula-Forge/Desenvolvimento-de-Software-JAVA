package br.edu.up.models;
import br.edu.up.*;

public class Professor extends Pessoa {
    private String lattes;
    private Titulacao titulacao;

    public Professor(String nome, String rg, String matricula, String lattes, Titulacao titulacao) {
        super(nome, rg, matricula);
        this.lattes = lattes;
        this.titulacao = titulacao;
    }
    
}
