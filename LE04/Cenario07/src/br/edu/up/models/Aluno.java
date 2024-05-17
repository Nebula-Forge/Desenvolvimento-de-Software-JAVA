package br.edu.up.models;
import br.edu.up.*;

public class Aluno extends Pessoa {
    private int anoIngresso;
    private String nomeCurso;
    private String turno;

    public Aluno(String nome, String rg, String matricula, int anoIngresso, String nomeCurso, String turno) {
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.nomeCurso = nomeCurso;
        this.turno = turno;
    }
    
}
